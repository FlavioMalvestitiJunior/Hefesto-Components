/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hefesto.hefestocomponentes.HFTable;

import com.hefesto.hefestocomponentes.HFTable.editors.HFCellRenderTextEditor;
import com.hefesto.hefestocomponentes.HFTable.utils.HFTableUtil;
import com.hefesto.hefestocomponentes.HFTable.exporters.HFPDFExporter;
import com.hefesto.hefestocomponentes.HFTable.exporters.HFExcelExporter;
import com.hefesto.hefestocomponentes.HFTable.renders.HFCellRender;
import com.hefesto.hefestocomponentes.HFTextField.HFTextField;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.print.PrinterException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;

/**
 *
 * @author jr
 */
public class HFTable extends JTable {

    /**
     * Creates new form HFTesteTable
     */
    private String title;
    private String[] colunas = new String[]{"Coluna1", "Coluna2"};
    private String[] tooltips = new String[]{"Coluna1", "Coluna2"};
    private List<Boolean> editavel = new LinkedList<Boolean>(Arrays.asList(false, false));
    private List<Boolean> selAll = new ArrayList<>();

    public String[] getColunas() {
        return colunas;
    }

    public void setColunas(String[] colunas) {
        this.colunas = colunas;
        this.tooltips = colunas;
        editavel = new ArrayList<>();
        for (String string : colunas) {
            editavel.add(false);
            selAll.add(false);
        }
        setModel();
        atualizaTable();
    }

    public void atualizaTable() {
        if (colunas != null) {
            Integer col = colunas.length;
            for (Integer i = 0; i < col; i++) {
                setEditorTexto(new HFTextField(), i);
                //col1.setCellEditor(new DefaultCellEditor(new SrhJTextField()));
                //col1.setCellRenderer(new RowColorRenderer());
                //editavel.get(i)[i] = false;
                editavel.set(i, false);
            }
        }
    }

    public final void setModel() {
        HFTableModel model = new HFTableModel(getColunas());
        try {
            super.setModel(model);
        } finally {
            model = null;
        }
    }

    public HFTable() {
        initComponents();
        setModel();
        new HFTableUtil(this).colorize().apply();
        this.getSelectionModel().setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
//        this.getColumnModel().getSelectionModel().setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        this.addFocusListener(new FocusListener() {

            @Override
            public void focusGained(FocusEvent e) {

            }

            @Override
            public void focusLost(FocusEvent e) {
                menu1.setVisible(false);
            }
        });
        exportarexcel.setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/imagens/excel.png"))
                .getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH)));
        Procurar.setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/imagens/zoom.png"))
                .getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH)));
        exportarpdf.setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/imagens/docpdf.png"))
                .getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH)));
        imprimir.setIcon(new ImageIcon(new ImageIcon(getClass().getResource("/imagens/print.png"))
                .getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH)));
        title = "";
        headerclick();
    }

    public void setEditable(int col, boolean isEdit) {
        editavel.set(col, isEdit);
        ((HFTableModel) this.getModel()).setCellColumnditable(col, isEdit);
    }

    public HFTable(TableModel dm) {
        super(dm);
    }

    public void addRow(List<?> row) {
        ((HFTableModel) this.getModel()).add(row);
    }

    public void addListRows(List<?> list) {
        ((HFTableModel) this.getModel()).addListaDeObjeto(list);
        this.revalidate();
        this.repaint();
    }

    public void addNewTableListRows(List<List<?>> list) {
        ((HFTableModel) this.getModel()).removeTable();
        ((HFTableModel) this.getModel()).addListaDeObjeto(list);
        this.revalidate();
        this.repaint();
    }

    public Object getValues(int linha) {
        return ((HFTableModel) this.getModel()).getValues(linha);
    }

    public int getModelColumnCount() {
        return ((HFTableModel) this.getModel()).getColumnCount();
    }

    public int getModelRoWCount() {
        return ((HFTableModel) this.getModel()).getRowCount();
    }

    public String getColumnName(int coluna) {
        return ((HFTableModel) this.getModel()).getColumnName(coluna);
    }

    public Object getValueAT(int linhas, int colunas) {
        return ((HFTableModel) this.getModel()).getValueAt(this.convertRowIndexToModel(linhas), colunas);
    }

    public void setValueAT(Object ob, int linhas, int colunas) {
        ((HFTableModel) this.getModel()).setValueAt(ob, this.convertRowIndexToModel(linhas), this.convertColumnIndexToModel(colunas));
    }

    @Override
    public boolean isCellEditable(int linha, int coluna) {
        return ((HFTableModel) this.getModel()).isCellEditable(this.convertRowIndexToModel(linha), coluna);
    }

    public void removeAllValues() {
        ((HFTableModel) this.getModel()).removeTable();
    }

    public void removeRow(int linha) {
        ((HFTableModel) this.getModel()).removeRow(this.convertRowIndexToModel(linha));
    }

    public boolean isEmpty() {
        return ((HFTableModel) this.getModel()).isEmpty();
    }

    public Object[][] getMatrix() {
        return ((HFTableModel) this.getModel()).getMatrix();
    }

    public void setColumnClass(Class<?> clas, int column) {
        ((HFTableModel) this.getModel()).setColumnClass(clas, column);
    }

    /**
     *
     */
    public void removeTable() {
        ((HFTableModel) this.getModel()).removeTable();
    }

    public Object getValorSelecionado() {
        return ((HFTableModel) this.getModel()).getValueAt(this.convertRowIndexToModel(this.getSelectedRow()), this.getSelectedColumn());
    }

    public Object getValorColunaDaLinhaSelecionada(int column) {
        return ((HFTableModel) this.getModel()).getValueAt(this.convertRowIndexToModel(this.getSelectedRow()), column);
    }

    private void headerclick() {
        this.getTableHeader().addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2) {
                    Integer colum = HFTable.this.getTableHeader().columnAtPoint(new Point(e.getX(), e.getY()));
                    System.out.println("Coluna: " + colum);
                    if ((HFTable.this.getModel().getColumnClass(colum) == Boolean.class
                            || HFTable.this.getModel().getColumnClass(colum) == boolean.class)
                            && HFTable.this.getRowCount() > 0) {
                        selAll.set(colum, !selAll.get(colum));
                        for (int i = 0; i < HFTable.this.getRowCount(); i++) {
                            HFTable.this.setValueAT(selAll.get(colum), i, colum);
                        }
                        HFTable.this.repaint();
                        HFTable.this.revalidate();

                    }

                }
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menu1 = new javax.swing.JPopupMenu();
        Procurar = new javax.swing.JMenuItem();
        exportarexcel = new javax.swing.JMenuItem();
        exportarpdf = new javax.swing.JMenuItem();
        imprimir = new javax.swing.JMenuItem();

        menu1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                menu1FocusLost(evt);
            }
        });

        Procurar.setText("Pesquisar");
        Procurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProcurarActionPerformed(evt);
            }
        });
        menu1.add(Procurar);

        exportarexcel.setText("Exportar Excel");
        exportarexcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportarexcelActionPerformed(evt);
            }
        });
        menu1.add(exportarexcel);

        exportarpdf.setText("Exportar PDF");
        exportarpdf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exportarpdfMouseClicked(evt);
            }
        });
        menu1.add(exportarpdf);

        imprimir.setText("Imprimir");
        imprimir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imprimirMouseClicked(evt);
            }
        });
        imprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imprimirActionPerformed(evt);
            }
        });
        menu1.add(imprimir);

        setAutoCreateRowSorter(true);
        setRowHeight(28);
        setShowHorizontalLines(false);
        setShowVerticalLines(false);
        getTableHeader().setReorderingAllowed(false);
        setVerifyInputWhenFocusTarget(false);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                formMouseMoved(evt);
            }
        });
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                formFocusLost(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved

    }//GEN-LAST:event_formMouseMoved

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
    }//GEN-LAST:event_formKeyPressed

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        if (evt.getButton() == MouseEvent.BUTTON3) {
            menu1.setLocation(evt.getXOnScreen(), evt.getYOnScreen());
            menu1.setVisible(true);
        } else {
            menu1.setVisible(false);
            //       jPopupMenu1.setVisible(false);
        }
    }//GEN-LAST:event_formMouseClicked

    private void ProcurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProcurarActionPerformed
        menu1.setVisible(false);
        Boolean salvar = false;
        List<Object> temp = new ArrayList<>();
        String s = JOptionPane.showInputDialog(this, "Procurar");
        if (!s.isEmpty()) {
            for (int i = 0; i < this.getRowCount(); i++) {
                salvar = false;
                for (int j = 0; j < getColumnCount() - 1; j++) {
                    if (this.getValueAT(i, j).toString().toUpperCase().contains(s.toUpperCase())) {
                        salvar = true;
                    }
                }
                if (salvar) {
                    temp.add(this.getValues(i));
                }
            }
            if (!temp.isEmpty()) {
                this.removeAllValues();
                this.addListRows(temp);
            } else {
                JOptionPane.showMessageDialog(this, "O termo desejado não foi encontrado", "Erro ", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_ProcurarActionPerformed

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    private void formFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusLost
    }//GEN-LAST:event_formFocusLost

    private void menu1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_menu1FocusLost
    }//GEN-LAST:event_menu1FocusLost

    private void exportarexcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportarexcelActionPerformed
        menu1.setVisible(false);
        final HFExcelExporter exp = new HFExcelExporter();
        new Thread("Exporta Excel") {
            @Override
            public void run() {
                exp.excelExporterTable((HFTableModel) HFTable.this.getModel());
            }
        }.start();
        exp.excelExporterTable((HFTableModel) this.getModel());
    }//GEN-LAST:event_exportarexcelActionPerformed

    private void exportarpdfMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exportarpdfMouseClicked
        menu1.setVisible(false);
        final HFPDFExporter hfpdfe = new HFPDFExporter();
        new Thread("Exporta PDF") {
            @Override
            public void run() {
                hfpdfe.exportarTabela((HFTableModel) HFTable.this.getModel(), title, HFTable.this);
            }
        }.start();

    }//GEN-LAST:event_exportarpdfMouseClicked

    private void imprimirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imprimirMouseClicked
        menu1.setVisible(false);
        try {
            this.print();
        } catch (PrinterException ex) {

            ex.printStackTrace();
        }
    }//GEN-LAST:event_imprimirMouseClicked


    private void imprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imprimirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_imprimirActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Procurar;
    private javax.swing.JMenuItem exportarexcel;
    private javax.swing.JMenuItem exportarpdf;
    private javax.swing.JMenuItem imprimir;
    private javax.swing.JPopupMenu menu1;
    // End of variables declaration//GEN-END:variables
 /**
     * MÃ©todo que compara se Existe um valor passado dentro de uma coluna
     *
     * @param valor
     * @param coluna
     * @param usaModelo - Se setado ele Buscará o indice dentro do modelo da
     * tabela e não da linha da tabela
     * @return se Existir retorna a primeira linha encontrada senÃ£o retorna
     * null
     * @since 1.0
     * @see NullPointerException
     */
    public Integer ComparaValoresInt(String valor, Integer coluna, Boolean usaModelo) throws NullPointerException {
        Integer linhas = getRowCount();
        Integer acho = null;
        HFTableModel dm = (HFTableModel) this.getModel();
        for (Integer i = 0; i < linhas; i++) {
            String val;
            if (usaModelo) {
                val = (String) dm.getValueAt(i, coluna);
            } else {
                val = (String) getValueAt(i, coluna);
            }
            if (val.equalsIgnoreCase(valor)) {
                acho = i;
            }
        }
        dm = null;
        return acho;
    }

    public void setEditorTexto(HFTextField text, Integer col) {

        TableColumn col1 = this.getColumnModel().getColumn(col);
        try {
            col1.setCellEditor(new HFCellRenderTextEditor(text));
        } finally {
            col = null;
            col1 = null;
            text = null;
        }
    }
}
