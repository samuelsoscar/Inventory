package inv;

import java.io.*;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ProcesoCargaExcel {
    public String[][] procesoXLSX (){
          String data[][] = null;
    
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        
        ///crea el filtro
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("*.XLSX","xlsx");
        fileChooser.setFileFilter(filtro);
        
        
        int seleccUsuario = fileChooser.showOpenDialog(null);
        if (seleccUsuario == JFileChooser.APPROVE_OPTION) {
            
        File archivoSeleccionado = fileChooser.getSelectedFile();
          
        FileInputStream ArchivoRuta = null;
       
            try {
                ArchivoRuta = new FileInputStream(new File(archivoSeleccionado.getAbsolutePath()));
            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(null, "ERROR AL OBTENER RUTA\n"+ex,"ERROR",JOptionPane.ERROR_MESSAGE);
            }
        
     
        XSSFWorkbook workbook = null;
            try {
                workbook = new XSSFWorkbook(ArchivoRuta);
            } catch (IOException ex) {
               JOptionPane.showMessageDialog(null, "ERROR AL OBTENER RUTA\n"+ex,"ERROR",JOptionPane.ERROR_MESSAGE);
                ex.printStackTrace();
            }
            
        XSSFSheet sheet = workbook.getSheetAt(0);
       
        int tamanioArch = sheet.getPhysicalNumberOfRows();
        
        data = new String[tamanioArch][3];
        DataFormatter formatter = new DataFormatter();
        
        Cell celda;
        
       for (int i = 0; i < tamanioArch; i++) {
            for (int j = 0; j < 3; j++) {
             celda = sheet.getRow(i).getCell(j);
             String p = formatter.formatCellValue(celda);
             data[i][j]=p;
             
            }}}
         return data;
    }
    public String[][] procesoXLS(){
        String data[][] = null;
    
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        
        ///crea el filtro
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("*.XLS","xls");
        fileChooser.setFileFilter(filtro);
        
        
        int seleccUsuario = fileChooser.showOpenDialog(null);
        if (seleccUsuario == JFileChooser.APPROVE_OPTION) {
            
        File archivoSeleccionado = fileChooser.getSelectedFile();
          
        FileInputStream ArchivoRuta = null;
       
            try {
                ArchivoRuta = new FileInputStream(new File(archivoSeleccionado.getAbsolutePath()));
            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(null, "ERROR AL OBTENER RUTA\n"+ex,"ERROR",JOptionPane.ERROR_MESSAGE);
            }
        
     
            HSSFWorkbook workbook = null;
            try {
                workbook = new HSSFWorkbook(ArchivoRuta);
            } catch (IOException ex) {
               JOptionPane.showMessageDialog(null, "ERROR AL OBTENER RUTA\n"+ex,"ERROR",JOptionPane.ERROR_MESSAGE);
                ex.printStackTrace();
            }
            
       HSSFSheet sheet = workbook.getSheetAt(0);
       
        int tamanioArch = sheet.getPhysicalNumberOfRows();
        
        data = new String[tamanioArch][3];
        DataFormatter formatter = new DataFormatter();
        
        Cell celda;
        
       for (int i = 0; i < tamanioArch; i++) {
            for (int j = 0; j < 3; j++) {
             celda = sheet.getRow(i).getCell(j);
             String p = formatter.formatCellValue(celda);
             data[i][j]=p;
             
            }}}
         return data;
    }
}
