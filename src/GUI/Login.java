package GUI;

import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
        this.setResizable(false);
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/icon.png")).getImage());
        this.setLocationRelativeTo(null);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jXTable1 = new org.jdesktop.swingx.JXTable();
        panel1 = new org.edisoncor.gui.panel.Panel();
        panelCurves2 = new org.edisoncor.gui.panel.PanelCurves();
        TEXTONAME = new javax.swing.JTextField();
        TEXTOPASSW = new javax.swing.JPasswordField();
        ENTRADA = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/419381-abstract-blue-matrix-numbers-symbols.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");

        jXTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jXTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOGIN");
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelCurves2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TEXTONAME.setBackground(new java.awt.Color(0, 0, 0));
        TEXTONAME.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        TEXTONAME.setForeground(new java.awt.Color(255, 255, 255));
        TEXTONAME.setBorder(null);
        panelCurves2.add(TEXTONAME, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, 253, 40));

        TEXTOPASSW.setBackground(new java.awt.Color(0, 0, 0));
        TEXTOPASSW.setForeground(new java.awt.Color(255, 255, 255));
        TEXTOPASSW.setBorder(null);
        TEXTOPASSW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TEXTOPASSWActionPerformed(evt);
            }
        });
        TEXTOPASSW.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TEXTOPASSWKeyPressed(evt);
            }
        });
        panelCurves2.add(TEXTOPASSW, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 250, 40));

        ENTRADA.setBackground(new java.awt.Color(0, 0, 0));
        ENTRADA.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ENTRADA.setText("LOGIN");
        ENTRADA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ENTRADAActionPerformed(evt);
            }
        });
        panelCurves2.add(ENTRADA, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 250, 30));

        jLabel3.setFont(new java.awt.Font("Traditional Arabic", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Name ");
        panelCurves2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        jLabel2.setFont(new java.awt.Font("Traditional Arabic", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Password ");
        panelCurves2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        panel1.add(panelCurves2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 240));

        getContentPane().add(panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 240));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ENTRADAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ENTRADAActionPerformed
        // TODO add your handling code here:
        String NAME = "gsoa1707";
        String PASSW = "1707";
        if(TEXTONAME.getText().equals(NAME) && TEXTOPASSW.getText().equals(PASSW))
        {
         dispose();
         MenuPrincipal INSIDE = new MenuPrincipal();
         INSIDE.setVisible(true);
         INSIDE.setLocationRelativeTo(null);
        }
        else{
            JOptionPane.showMessageDialog(null,"USUARIO NO REGISTRADO","ERROR",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_ENTRADAActionPerformed

    private void TEXTOPASSWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TEXTOPASSWActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TEXTOPASSWActionPerformed

    private void TEXTOPASSWKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TEXTOPASSWKeyPressed
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(c==KeyEvent.VK_ENTER){
             String NAME = "gsoa1707";
        String PASSW = "1707";
        if(TEXTONAME.getText().equals(NAME) && TEXTOPASSW.getText().equals(PASSW))
        {
         dispose();
         MenuPrincipal INSIDE = new MenuPrincipal();
         INSIDE.setVisible(true);
         INSIDE.setLocationRelativeTo(null);
        }
        else{
            JOptionPane.showMessageDialog(null,"USUARIO NO REGISTRADO","ERROR",JOptionPane.ERROR_MESSAGE);
        }
        }
        
    }//GEN-LAST:event_TEXTOPASSWKeyPressed

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
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ENTRADA;
    private javax.swing.JTextField TEXTONAME;
    private javax.swing.JPasswordField TEXTOPASSW;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private org.jdesktop.swingx.JXTable jXTable1;
    private org.edisoncor.gui.panel.Panel panel1;
    private org.edisoncor.gui.panel.PanelCurves panelCurves2;
    // End of variables declaration//GEN-END:variables
}
