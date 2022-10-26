/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hefesto.hefestocomponentes.HFTable.exporters;

import com.hefesto.hefestocomponentes.HFTable.HFTable;
import com.hefesto.hefestocomponentes.HFTable.HFTableModel;
import com.lowagie.text.Document;
import com.lowagie.text.Element;
import com.lowagie.text.Font;
import com.lowagie.text.FontFactory;
import com.lowagie.text.PageSize;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfPCell;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;
import java.awt.Color;
import java.io.FileOutputStream;
import java.io.OutputStream;
import javax.swing.JFileChooser;

/**
 *
 * @author jr
 */
public class HFPDFExporter {

    public void exportarTabela(HFTableModel model, String title, HFTable hft) {
        if (model.getRowCount() > 0) {
            try {
                Document doc = new com.lowagie.text.Document(PageSize.A4.rotate(), 20, 20, 20, 20);
                if (doc.getPageSize().getWidth() > hft.getWidth()) {
                    doc.setPageSize(PageSize.A4);
                }
                JFileChooser jf = new JFileChooser();
                jf.showSaveDialog(jf);
                OutputStream out = new FileOutputStream((jf.getSelectedFile().getAbsolutePath() + ".pdf"));
                PdfWriter.getInstance(doc, out);
                doc.open();
                Font f = new Font(Font.NORMAL, 5f);
                f.setFamily(FontFactory.HELVETICA);
                Paragraph p = new Paragraph("Tabela Exportada - Hefesto", f);
                p.setSpacingAfter(40f);
                p.setAlignment(Element.ALIGN_LEFT);
                doc.add(p);
                p.setAlignment(Element.ALIGN_CENTER);
                //  HeaderFooter hf = new HeaderFooter(p, false);   

                
                float ac = 0;
                float[] w = new float[hft.getColumnCount() - 1];
                for (int i = 0; i < w.length; i++) {
                    ac = hft.getColumnModel().getColumn(i).getWidth();
                    w[i] = ac / hft.getWidth() * doc.getPageSize().getWidth();
                }

                PdfPTable table = new PdfPTable(w);

                if (!title.isEmpty()) {
                    f.setColor(new Color(255, 255, 255));
                    f.setSize(12.0f);
                    p = new Paragraph(title, f);
                    p.setAlignment(Element.ALIGN_CENTER);
                    PdfPCell header = new PdfPCell(p);
                    header.setColspan(model.getColumnCount() - 1);
                    header.setBackgroundColor(new Color(0, 38, 77));
                    header.setHorizontalAlignment(Element.ALIGN_CENTER);
                    header.setVerticalAlignment(Element.ALIGN_CENTER);
                    header.setFixedHeight(hft.getRowHeight());
                    table.addCell(header);
                }
                for (int i = 0; i < model.getColumnCount() - 1; i++) {
                    PdfPCell cell = new PdfPCell();
                    f = new Font(Font.BOLD, 10f);
                    f.setFamily(FontFactory.HELVETICA);
                    f.setColor(new Color(255, 255, 255));
                    p = new Paragraph(model.getColumnName(i), f);
                    p.setAlignment(Element.ALIGN_CENTER);
                    cell.addElement(p);
                    cell.setVerticalAlignment(Element.ALIGN_TOP);
                    cell.setBackgroundColor(new Color(0, 57, 115));
                    cell.setFixedHeight(hft.getRowHeight() + 2);
                    table.addCell(cell);
                }

                for (int i = 0; i < model.getRowCount(); i++) {
                    for (int j = 0; j < model.getColumnCount() - 1; j++) {

                        PdfPCell cell = new PdfPCell();

                        if ((i % 2) == 1) {
                            f = new Font(Font.NORMAL, 8f);
                            f.setFamily(FontFactory.HELVETICA);
                            f.setColor(new Color(0, 0, 0));
                            p = new Paragraph(model.getValueAt(i, j).toString(), f);
                            p.setAlignment(Element.ALIGN_LEFT);
                            cell.addElement(p);
                            cell.setVerticalAlignment(Element.ALIGN_CENTER);
                            cell.setBackgroundColor(new Color(224, 237, 255));
                        } else {
                            f = new Font(Font.NORMAL, 8f);
                            f.setFamily(FontFactory.HELVETICA);
                            f.setColor(new Color(0, 0, 0));
                            p = new Paragraph(model.getValueAt(i, j).toString(), f);
                            p.setAlignment(Element.ALIGN_LEFT);
                            cell.addElement(p);
                            cell.setVerticalAlignment(Element.ALIGN_CENTER);
                            cell.setBackgroundColor(new Color(208, 231, 255));
                        }
                        cell.setFixedHeight(hft.getRowHeight());

                        table.addCell(cell);
                    }
                }
                //     table.setTotalWidth(doc.getPageSize().getWidth());
                table.setWidthPercentage(w, doc.getPageSize());
                table.setHorizontalAlignment(Element.ALIGN_CENTER);

                doc.add(table);
                doc.close();

                out.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
}