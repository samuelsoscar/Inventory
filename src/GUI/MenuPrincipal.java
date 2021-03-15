package GUI;

import de.javasoft.plaf.synthetica.SyntheticaBlackEyeLookAndFeel;
import inv.ProcesoCargaExcel;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class MenuPrincipal extends javax.swing.JFrame  {
    DefaultTableModel modeloBOD;
    DefaultTableModel modeloQB;
    DefaultTableModel modeloResultadoComparacionBD;
    DefaultTableModel modeloResultadoComparacionQB;
    
    public MenuPrincipal() {
        
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/icon.png")).getImage());
        
        //panelCurves1.isBackgroundSet();
        String []col = {"CODIGO","DESCRIPCION","CANTIDAD"};
        modeloBOD = new DefaultTableModel(col,0);
        modeloQB = new DefaultTableModel(col,0);
        modeloResultadoComparacionBD = new DefaultTableModel(col,0);
        modeloResultadoComparacionQB = new DefaultTableModel(col,0);
        
        TablaBodega.setModel(modeloBOD);
        TablaQB.setModel(modeloQB);
        tablaResultadoBD.setModel(modeloResultadoComparacionBD);
        tablaResultadoQB.setModel(modeloResultadoComparacionQB);
         
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        Fondo = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        TablaBodega = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        TablaQB = new javax.swing.JTable();
        btnBod = new javax.swing.JButton();
        btnQB = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaResultadoBD = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaResultadoQB = new javax.swing.JTable();
        checkXLS = new javax.swing.JCheckBox();
        checkXLSX = new javax.swing.JCheckBox();
        checkXLSXQB = new javax.swing.JCheckBox();
        checkXLSQB = new javax.swing.JCheckBox();
        jSeparator1 = new javax.swing.JSeparator();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/419381-abstract-blue-matrix-numbers-symbols.jpg"))); // NOI18N
        Fondo.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inventory");
        setIconImage(getIconImage());

        btnBuscar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnBuscar.setText("COMPARAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnSalir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSalir.setText("SALIR");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        TablaBodega.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        TablaBodega.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        TablaBodega.setEditingColumn(0);
        TablaBodega.setEditingRow(0);
        TablaBodega.setRowMargin(5);
        TablaBodega.setSelectionBackground(new java.awt.Color(0, 0, 255));
        TablaBodega.setSelectionForeground(new java.awt.Color(51, 102, 255));
        jScrollPane3.setViewportView(TablaBodega);

        TablaQB.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        TablaQB.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(TablaQB);
        if (TablaQB.getColumnModel().getColumnCount() > 0) {
            TablaQB.getColumnModel().getColumn(0).setHeaderValue("Title 1");
            TablaQB.getColumnModel().getColumn(1).setHeaderValue("Title 2");
            TablaQB.getColumnModel().getColumn(2).setHeaderValue("Title 3");
            TablaQB.getColumnModel().getColumn(3).setHeaderValue("Title 4");
        }

        btnBod.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnBod.setText("BOD");
        btnBod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBodActionPerformed(evt);
            }
        });

        btnQB.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnQB.setText("QB");
        btnQB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQBActionPerformed(evt);
            }
        });

        tablaResultadoBD.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tablaResultadoBD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tablaResultadoBD);

        tablaResultadoQB.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tablaResultadoQB.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tablaResultadoQB);

        checkXLS.setBackground(new java.awt.Color(255, 255, 255));
        checkXLS.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        checkXLS.setText("Excel 97 - 2007 (*xls)");

        checkXLSX.setBackground(new java.awt.Color(255, 255, 255));
        checkXLSX.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        checkXLSX.setSelected(true);
        checkXLSX.setText("Excel 2007 - 2016 (*xlsx)");
        checkXLSX.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                checkXLSXItemStateChanged(evt);
            }
        });

        checkXLSXQB.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        checkXLSXQB.setSelected(true);
        checkXLSXQB.setText("Excel 2007 - 2016 (*xlsx)");
        checkXLSXQB.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                checkXLSXQBItemStateChanged(evt);
            }
        });

        checkXLSQB.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        checkXLSQB.setText("Excel 97 - 2007 (*xls)");

        jMenu1.setText("Archivo");

        jMenuItem2.setText("Limpiar Tabla Resultado Bodega");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem4.setText("Limpiar Tabla Resultado Quick B");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuItem5.setText("Limpiar Todo");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Ayuda");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(630, 630, 630)
                            .addComponent(btnQB, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(20, 20, 20)
                            .addComponent(checkXLSQB, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(170, 170, 170)
                            .addComponent(checkXLS, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(310, 310, 310)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(780, 780, 780)
                            .addComponent(checkXLSXQB, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(630, 630, 630)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(1080, 1080, 1080)
                            .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(btnBod, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(170, 170, 170)
                            .addComponent(checkXLSX, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(4, 62, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnQB, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(checkXLSQB, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(320, 320, 320)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(checkXLS, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(checkXLSXQB, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(620, 620, 620)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(320, 320, 320)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(btnBod, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(checkXLSX, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        
           String rowFields   [] = new String[5000];
           String rowFieldsQB [] = new String[5000];
           int tamanioBD = modeloBOD.getRowCount();
           int tamanioQB = modeloQB.getRowCount();
          
           //determina el tamaño de la matriz de acuerdo a la cantidad de filas
           int tamanioMAtriz = 0; 
           if(tamanioBD>tamanioQB){
               tamanioMAtriz=tamanioBD;
           }
           else{
               tamanioMAtriz=tamanioQB;
           }
           
         try { 
          String [][]datosQb = new String[tamanioMAtriz][3];
          String [][]datosBod = new String[tamanioMAtriz][3];
          String [][]datosTempQb = new String[tamanioMAtriz][3];
          String [][]datosTempBod = new String[tamanioMAtriz][3];
          
                for (int i = 0; i < tamanioMAtriz; i++) {
                        for (int j = 0; j < 3; j++) {
                           datosQb[i][j]="";
                           datosBod[i][j]="";
                           datosTempQb[i][j]="";
                           datosTempBod[i][j]="";
                        } }
     
           Object a,b;
           
           for (int i = 0; i < tamanioBD; i++) {
                        for (int j = 0; j < 3; j++) {
                          a = modeloBOD.getValueAt(i, j);
                          
                           datosBod[i][j]=String.valueOf(a);
                           datosTempBod[i][j]=String.valueOf(a);
                        } }
           
           for (int i = 0; i < tamanioQB; i++) {
                        for (int j = 0; j < 3; j++) {
                          b = modeloQB.getValueAt(i, j);
                          
                           datosQb[i][j]=String.valueOf(b);
                           datosTempQb[i][j]=String.valueOf(b);
                        } }
           
              //comparacion 
            for (int i = 0; i <tamanioMAtriz; i++) 
            {
               for (int j=0;j<tamanioMAtriz;j++)
               {  
                
          if (datosQb[i][0].equals(datosBod[j][0]) && datosQb[i][2].equals(datosBod[j][2])){
          
          datosTempQb[i][0]="";
          datosTempQb[i][1]="";
          datosTempQb[i][2]="";
          
          datosTempBod[j][0]="";
          datosTempBod[j][1]="";
          datosTempBod[j][2]="";
          
            }}}
        //llenado de tabla
           for (int i = 0; i <= tamanioMAtriz-1;i++)
            { 
                for (int j = 0; j <= 2; j++)
                {
                    if(datosTempQb[i][j] != ""){
                        
                  if(j==2)
                  {
                          rowFieldsQB[0] = datosTempQb[i][0];
                          rowFieldsQB[1] = datosTempQb[i][1];
                          rowFieldsQB[2] = datosTempQb[i][2];
                         modeloResultadoComparacionQB.addRow(rowFieldsQB);   
                          }
                    }
                   
                    if (datosTempBod[i][j] != "")
                    {
                          if(j==2){
                          rowFields[0] = datosTempBod[i][0];
                          rowFields[1] = datosTempBod[i][1];
                          rowFields[2] = datosTempBod[i][2];
                          modeloResultadoComparacionBD.addRow(rowFields);   
                          } 
                      }}} 
        
        }  
        catch (Exception e)  {
            JOptionPane.showMessageDialog(null,"ERROR DE APERTURA DEL REGISTRO\n"+e,"ERROR",JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }       
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
    
        int salida = JOptionPane.showConfirmDialog(null,"Realmente Deseas Salir?");
        if(salida ==JOptionPane.OK_OPTION){
            dispose();    
        }
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnBodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBodActionPerformed
        // TODO add your handling code here:
        modeloBOD.setRowCount(0);
        ProcesoCargaExcel ejecucion = new ProcesoCargaExcel();
         boolean selectedXLS = checkXLS.isSelected();
         boolean selectedXLSX =checkXLSX.isSelected();
         
       if(selectedXLS && selectedXLSX){
        JOptionPane.showMessageDialog(null,"DEBES SELECCIONAR ÚNICAMENTE UNA OPCION DE EXCEL\n 97-2007 O 2007-2016");
    } if(selectedXLS == false && selectedXLSX == false) {
      JOptionPane.showMessageDialog(null,"DEBES SELECCIONAR  ALGUNA OPCION DE EXCEL\n 97-2007 O 2007-2016");
    }
      if(selectedXLS == true && selectedXLSX ==false){
        String data[][] = ejecucion.procesoXLS();
        int tamanio = data.length;
        String rowFieldsBD   [] = new String[tamanio];
        System.out.println("97-2003 "+tamanio);
       
        for (int i = 0; i < tamanio; i++) {
            for (int j = 0; j < 3; j++) {
                if(j==2){
                rowFieldsBD[0]=data[i][0];
                rowFieldsBD[1]=data[i][1];
                rowFieldsBD[2]=data[i][2];
                
               modeloBOD.addRow(rowFieldsBD);}
            } }
            }
      if(selectedXLSX ==true && selectedXLS == false){
        
        String data[][] = ejecucion.procesoXLSX();
        int tamanio = data.length;
        String rowFieldsBD   [] = new String[tamanio];
         System.out.println("tamanio matrix "+tamanio);
       
        for (int i = 0; i < tamanio; i++) {
            for (int j = 0; j < 3; j++) {
                if(j==2){
                rowFieldsBD[0]=data[i][0];
                rowFieldsBD[1]=data[i][1];
                rowFieldsBD[2]=data[i][2];
                
               modeloBOD.addRow(rowFieldsBD);}
            } }}
        
    }//GEN-LAST:event_btnBodActionPerformed

    private void btnQBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQBActionPerformed
        // TODO add your handling code here:
       modeloQB.setRowCount(0);
       ProcesoCargaExcel ejecucion = new ProcesoCargaExcel();
       boolean selectedXLS = checkXLSQB.isSelected(); //
       boolean selectedXLSX =checkXLSXQB.isSelected();
         
       if(selectedXLS && selectedXLSX){
        JOptionPane.showMessageDialog(null,"DEBES SELECCIONAR ÚNICAMENTE UNA OPCION DE EXCEL\n 97-2007 O 2007-2016");
    } if(selectedXLS == false && selectedXLSX == false) {
      JOptionPane.showMessageDialog(null,"DEBES SELECCIONAR  ALGUNA OPCION DE EXCEL\n 97-2007 O 2007-2016");
    }
      if(selectedXLS == true && selectedXLSX ==false){
        
        String data[][] = ejecucion.procesoXLS();
        int tamanio = data.length;
        String rowFieldsBD   [] = new String[tamanio];
         
        for (int i = 0; i < tamanio; i++) {
            for (int j = 0; j < 3; j++) {
                if(j==2){
                rowFieldsBD[0]=data[i][0];
                rowFieldsBD[1]=data[i][1];
                rowFieldsBD[2]=data[i][2];
                
               modeloQB.addRow(rowFieldsBD);}
            } }
            }
      if(selectedXLSX ==true && selectedXLS == false){
        
        String data[][] = ejecucion.procesoXLSX();
        int tamanio = data.length;
        String rowFieldsBD   [] = new String[tamanio];
         
       
        for (int i = 0; i < tamanio; i++) {
            for (int j = 0; j < 3; j++) {
                if(j==2){
                rowFieldsBD[0]=data[i][0];
                rowFieldsBD[1]=data[i][1];
                rowFieldsBD[2]=data[i][2];
                
               modeloQB.addRow(rowFieldsBD);}
            } }}
        
    }//GEN-LAST:event_btnQBActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        modeloResultadoComparacionBD.setRowCount(0);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        modeloResultadoComparacionQB.setRowCount(0);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
         modeloBOD.setRowCount(0);
         modeloQB.setRowCount(0);
         modeloResultadoComparacionBD.setRowCount(0);
         modeloResultadoComparacionQB.setRowCount(0);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        // TODO add your handling code here:
        Info info = new Info();
        info.setVisible(true);
    }//GEN-LAST:event_jMenu2MouseClicked

    private void checkXLSXItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_checkXLSXItemStateChanged
        // TODO add your handling code here:
        
    }//GEN-LAST:event_checkXLSXItemStateChanged

    private void checkXLSXQBItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_checkXLSXQBItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_checkXLSXQBItemStateChanged
    
   
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    try {
                        UIManager.setLookAndFeel(new SyntheticaBlackEyeLookAndFeel());
                    } catch (ParseException ex) {
                        Logger.getLogger(MenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
   
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JTable TablaBodega;
    private javax.swing.JTable TablaQB;
    private javax.swing.JButton btnBod;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnQB;
    private javax.swing.JButton btnSalir;
    private javax.swing.JCheckBox checkXLS;
    private javax.swing.JCheckBox checkXLSQB;
    private javax.swing.JCheckBox checkXLSX;
    private javax.swing.JCheckBox checkXLSXQB;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tablaResultadoBD;
    private javax.swing.JTable tablaResultadoQB;
    // End of variables declaration//GEN-END:variables
}
