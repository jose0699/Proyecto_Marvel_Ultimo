/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista.Usuario;

/**
 *
 * @author PC
 */
public class Membresia extends javax.swing.JFrame {

    /**
     * Creates new form Membresia
     */
    public Membresia() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Salir = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        Informacion_Personal1 = new javax.swing.JLabel();
        Nro_Tarjeta = new javax.swing.JLabel();
        Actualizar = new javax.swing.JButton();
        Precio = new javax.swing.JLabel();
        Tipo = new javax.swing.JLabel();
        Eliminar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1050, 700));
        setPreferredSize(new java.awt.Dimension(1050, 700));
        getContentPane().setLayout(null);

        Salir.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        getContentPane().add(Salir);
        Salir.setBounds(190, 410, 180, 35);

        jLabel10.setFont(new java.awt.Font("Lucida Fax", 1, 24)); // NOI18N
        jLabel10.setText("Membresia");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(220, 80, 150, 30);

        jLabel12.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        jLabel12.setText("Tipo:");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(180, 220, 50, 30);

        jLabel13.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        jLabel13.setText("Precio:");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(160, 270, 70, 30);

        jLabel14.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        jLabel14.setText("Fecha de corte:");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(110, 180, 130, 30);

        Informacion_Personal1.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        Informacion_Personal1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Informacion_Personal1.setText("Informacion Membresia");
        getContentPane().add(Informacion_Personal1);
        Informacion_Personal1.setBounds(110, 150, 180, 17);

        Nro_Tarjeta.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Nro_Tarjeta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(Nro_Tarjeta);
        Nro_Tarjeta.setBounds(250, 180, 210, 30);

        Actualizar.setBackground(new java.awt.Color(153, 204, 255));
        Actualizar.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        Actualizar.setText("Actualizar");
        getContentPane().add(Actualizar);
        Actualizar.setBounds(290, 350, 180, 35);

        Precio.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Precio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(Precio);
        Precio.setBounds(240, 270, 200, 30);

        Tipo.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Tipo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(Tipo);
        Tipo.setBounds(240, 220, 200, 30);

        Eliminar.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        Eliminar.setText("Eliminar supcripción");
        getContentPane().add(Eliminar);
        Eliminar.setBounds(70, 350, 180, 35);

        jLabel8.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 0));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/Login Cruds.png"))); // NOI18N
        getContentPane().add(jLabel8);
        jLabel8.setBounds(0, 0, 1050, 650);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SalirActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Membresia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Membresia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Membresia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Membresia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Membresia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton Actualizar;
    public javax.swing.JButton Eliminar;
    private javax.swing.JLabel Informacion_Personal1;
    public javax.swing.JLabel Nro_Tarjeta;
    public javax.swing.JLabel Precio;
    public javax.swing.JButton Salir;
    public javax.swing.JLabel Tipo;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}
