/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hefesto.hefestocomponentes.HFTable.exporters;

import com.hefesto.hefestocomponentes.HFTable.HFTableModel;
import java.io.File;
import java.lang.reflect.Field;
import java.util.List;
import java.util.Locale;
import javax.swing.JFileChooser;
import javax.swing.JInternalFrame;
import jxl.Workbook;
import jxl.WorkbookSettings;
import jxl.write.WritableCellFormat;
import jxl.write.WritableFont;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

/**
 *
 * @author jr
 */
public class HFExcelExporter {

    public void excelExporterTable(HFTableModel hft) {

        try {
            JFileChooser jf = new JFileChooser();
            jf.showSaveDialog(jf);
            String s = jf.getSelectedFile().getAbsolutePath() + ".xls";
            if (s != null) {
                WorkbookSettings ws = new WorkbookSettings();
                ws.setLocale(new Locale("en", "EN"));
                WritableWorkbook workbook = Workbook.createWorkbook(new File(s), ws);
                WritableSheet s0 = workbook.createSheet("Folha1", 0);
                writeDataSheet(s0, hft);
                workbook.write();
                workbook.close();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    private void writeDataSheet(WritableSheet s, HFTableModel tbm) throws Exception {
        WritableFont wf = new WritableFont(WritableFont.ARIAL, 12, WritableFont.BOLD);
        WritableCellFormat cf = new WritableCellFormat(wf);
        cf.setWrap(true);
        String[] columns = tbm.getAllColumnNames();
        for (int i = 0; i < columns.length - 1; i++) {
            jxl.write.Label l = new jxl.write.Label(i, 0, columns[i], cf);
            s.addCell(l);
        }
        wf = new WritableFont(WritableFont.ARIAL, 10, WritableFont.NO_BOLD);
        cf = new WritableCellFormat(wf);
        int cont = 1;

        for (List<Object> c : tbm.getAllRows()) {
            for (int i = 0; i < c.size() - 1; i++) {
                jxl.write.Label l = new jxl.write.Label(i, cont, c.get(i).toString(), cf);
                s.addCell(l);
            }
            cont++;
        }

    }

    public void listToExcel(List<Object> lst, List<String> columns, JInternalFrame frame) {
        try {
            JFileChooser jf = new JFileChooser();
            jf.showSaveDialog(jf);
            String s = jf.getSelectedFile() != null ? jf.getSelectedFile().getAbsolutePath() + ".xls" : null;
            boolean header = false;
            int spreadSheet = 0;
            int count = 1;
            if (s != null) {
                WorkbookSettings ws = new WorkbookSettings();
                ws.setLocale(new Locale("en", "EN"));
                WritableWorkbook workbook = Workbook.createWorkbook(new File(s), ws);
                WritableSheet wb;

                wb = workbook.createSheet("Folha " + (spreadSheet + 1), spreadSheet);
                creatHeader(wb, columns);
                for (Object data : lst) {
                    if (header) {
                        wb = workbook.createSheet("Folha " + (spreadSheet + 1), spreadSheet);
                        creatHeader(wb, columns);

                    }
                    createRow(count, data, wb, columns);
                    count++;
                    if (count == 65530) {
                        spreadSheet++;
                        header = true;
                        count = 1;
                    }
                }
                workbook.write();
                workbook.close();
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private void createRow(int row, Object o, WritableSheet wb, List<String> fields) throws Exception {
        Object value;
        WritableFont wf = new WritableFont(WritableFont.ARIAL, 10, WritableFont.NO_BOLD);
        WritableCellFormat cf = new WritableCellFormat(wf);
        cf.setWrap(true);
        int col = 0;

        for (String f : fields) {
            Class c = o.getClass();
            Field field = c.getDeclaredField(f);
            field.setAccessible(true);
            value = field.get(o);
            jxl.write.Label l = new jxl.write.Label(col, row, value.toString(), cf);
            wb.addCell(l);
            col++;
        }
    }

    private void creatHeader(WritableSheet wb, List<String> columns) throws Exception {
        int count = 0;
        WritableFont wf = new WritableFont(WritableFont.ARIAL, 12, WritableFont.BOLD);
        WritableCellFormat cf = new WritableCellFormat(wf);
        cf.setWrap(true);

        for (String col : columns) {
            jxl.write.Label l = new jxl.write.Label(count, 0, col, cf);
            wb.addCell(l);
            count++;
        }
    }
}
