/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hefesto.hefestocomponentes.HFGraph;

import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.text.NumberFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CategoryLabelPositions;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.DatasetRenderingOrder;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.LineAndShapeRenderer;
import org.jfree.data.DataUtilities;
import org.jfree.data.DefaultKeyedValues;
import org.jfree.data.KeyedValues;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DatasetUtilities;
import org.jfree.data.time.Day;
import org.jfree.data.time.Hour;
import org.jfree.data.time.Millisecond;
import org.jfree.data.time.Minute;
import org.jfree.data.time.Month;
import org.jfree.data.time.Quarter;
import org.jfree.data.time.RegularTimePeriod;
import org.jfree.data.time.Second;
import org.jfree.data.time.TimeSeries;
import org.jfree.data.time.TimeSeriesCollection;
import org.jfree.data.time.TimeSeriesDataItem;
import org.jfree.data.time.Week;
import org.jfree.data.time.Year;
import org.jfree.util.SortOrder;

/**
 *
 * @author Flavio
 */
public class HFParetoChart extends JPanel {

    /**
     * Creates new form HFLineGrafPainel
     */
    String titulo;
    String legenda;
    String eyxoY;
    boolean legendas = true;
    boolean tooltips = true;
    boolean urls = false;
    List<HFGrafDataSource> dataSource;
    TimeSeries timeSeries;
    TimeSeriesCollection timeSeriesCollection;
    ChartPanel GrafPanel;
    JFreeChart graf;
    Class period;

    public HFParetoChart() {
        initComponents();
        graf = ChartFactory.createBarChart(titulo, legenda, eyxoY, new DefaultCategoryDataset(), PlotOrientation.VERTICAL, legendas, tooltips, urls);
        GrafPanel = new ChartPanel(graf, true);
        GrafPanel.setSize(this.getWidth(), this.getHeight());
        GrafPanel.setVisible(true);
        GrafPanel.setAutoscrolls(true);

        this.removeAll();
        this.add(GrafPanel);
        this.revalidate();
        this.repaint();
        this.addComponentListener(resizeListner());
    }

    public void setDataSource(List<HFGrafDataSource> dataSource) {
        this.dataSource = dataSource;
        DefaultKeyedValues df = coverteHFGraphDataSourceToDefaultKeyedValues(dataSource);
        df.sortByValues(SortOrder.DESCENDING);
        KeyedValues cumulativo = DataUtilities.getCumulativePercentages(df);
        CategoryDataset dataset = DatasetUtilities.createCategoryDataset(legenda, df);
        graf = ChartFactory.createBarChart(titulo,
                legenda,
                eyxoY,
                dataset,
                PlotOrientation.VERTICAL,
                legendas,
                tooltips,
                urls);
        CategoryPlot plot = graf.getCategoryPlot();
        CategoryAxis domainAxis = plot.getDomainAxis();
        domainAxis.setLowerMargin(0.02);
        domainAxis.setUpperMargin(0.02);
        domainAxis.setCategoryLabelPositions(CategoryLabelPositions.UP_90);
        NumberAxis rangeAxis = (NumberAxis) plot.getRangeAxis();
        rangeAxis.setStandardTickUnits(NumberAxis.createIntegerTickUnits());
        LineAndShapeRenderer renderer2 = new LineAndShapeRenderer();

        CategoryDataset dataset2 = DatasetUtilities.createCategoryDataset("Cumulativo", cumulativo);
        NumberAxis axis2 = new NumberAxis("Percentual");
        axis2.setNumberFormatOverride(NumberFormat.getPercentInstance());
        plot.setRangeAxis(1, axis2);
        plot.setDataset(1, dataset2);
        plot.setRenderer(1, renderer2);
        plot.mapDatasetToRangeAxis(1, 1);

        plot.setDatasetRenderingOrder(DatasetRenderingOrder.FORWARD);
        // OPTIONAL CUSTOMISATION COMPLETED.
        // add the chart to a panel...
        GrafPanel.setChart(graf);
        this.removeAll();
        this.add(GrafPanel);
        this.revalidate();
        this.repaint();
    }

    private DefaultKeyedValues coverteHFGraphDataSourceToDefaultKeyedValues(List<HFGrafDataSource> dataSource) {
        DefaultKeyedValues dataSet = new DefaultKeyedValues();
        for (HFGrafDataSource graphData : dataSource) {
            dataSet.addValue(graphData.getEixoX().toString(), graphData.getValor());
        }
        return dataSet;
    }

    public void setRealtimedDataGraf(String tituloTimed, Class period) {
        this.period = period;
        timeSeries = new TimeSeries(tituloTimed, period);
        timeSeriesCollection = new TimeSeriesCollection(timeSeries);
        graf = ChartFactory.createTimeSeriesChart(titulo, legenda, eyxoY, timeSeriesCollection, true, true, true);
        GrafPanel.setChart(graf);
        this.removeAll();
        this.add(GrafPanel);
        this.revalidate();
        this.repaint();

    }

    public int getTotalRegistros() {
        return timeSeries.getItemCount();
    }

    public void removeIten(int item, int serie) {
        timeSeries = timeSeriesCollection.getSeries(serie);
        timeSeries.delete(item, item);
    }

    public void addSerieValue(HFGrafDataSource hFGrafDataSource, int serie) {
        RegularTimePeriod time;
        timeSeries = timeSeriesCollection.getSeries(serie);
        if (period == Millisecond.class) {
            time = new Millisecond((Date) hFGrafDataSource.getSerie());
        } else if (period == Second.class) {
            time = new Second((Date) hFGrafDataSource.getSerie());
        } else if (period == Minute.class) {
            time = new Minute((Date) hFGrafDataSource.getSerie());
        } else if (period == Quarter.class) {
            time = new Quarter((Date) hFGrafDataSource.getSerie());
        } else if (period == Hour.class) {
            time = new Hour((Date) hFGrafDataSource.getSerie());
        } else if (period == Day.class) {
            time = new Day((Date) hFGrafDataSource.getSerie());
        } else if (period == Month.class) {
            time = new Month((Date) hFGrafDataSource.getSerie());
        } else if (period == Week.class) {
            time = new Week((Date) hFGrafDataSource.getSerie());
        } else {
            time = new Year((Date) hFGrafDataSource.getSerie());
        }
        timeSeries.add(new TimeSeriesDataItem(time, hFGrafDataSource.getValor()));

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
        graf.setTitle(titulo);
    }

    public String getLegenda() {
        return legenda;
    }

    public void setLegenda(String legenda) {
        this.legenda = legenda;
    }

    public String getEyxoY() {
        return eyxoY;
    }

    public void setEyxoY(String eyxoY) {
        this.eyxoY = eyxoY;
    }

    public boolean isLegendas() {
        return legendas;
    }

    public void setLegendas(boolean legendas) {
        this.legendas = legendas;
    }

    public boolean isTooltips() {
        return tooltips;
    }

    public void setTooltips(boolean tooltips) {
        this.tooltips = tooltips;
    }

    public boolean isUrls() {
        return urls;
    }

    public void setUrls(boolean urls) {
        this.urls = urls;
    }

    public TimeSeries getTimeSeries() {
        return timeSeries;
    }

    public void setTimeSeries(TimeSeries timeSeries) {
        this.timeSeries = timeSeries;
    }

    public TimeSeriesCollection getTimeSeriesCollection() {
        return timeSeriesCollection;
    }

    public void setTimeSeriesCollection(TimeSeriesCollection timeSeriesCollection) {
        this.timeSeriesCollection = timeSeriesCollection;
    }

    public ChartPanel getGrafPanel() {
        return GrafPanel;
    }

    public void setGrafPanel(ChartPanel GrafPanel) {
        this.GrafPanel = GrafPanel;
    }

    public JFreeChart getGraf() {
        return graf;
    }

    public void setGraf(JFreeChart graf) {
        this.graf = graf;
    }

    public Class getPeriod() {
        return period;
    }

    public void setPeriod(Class period) {
        this.period = period;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setLayout(new java.awt.GridLayout(1, 0));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
    private ComponentListener resizeListner() {
        return new ComponentListener() {

            @Override
            public void componentResized(ComponentEvent e) {
                HFParetoChart.this.GrafPanel.setSize(HFParetoChart.this.getWidth(), HFParetoChart.this.getHeight());
                HFParetoChart.this.revalidate();
                HFParetoChart.this.repaint();
            }

            @Override
            public void componentMoved(ComponentEvent e) {
            }

            @Override
            public void componentShown(ComponentEvent e) {
            }

            @Override
            public void componentHidden(ComponentEvent e) {
            }
        };
    }
}
