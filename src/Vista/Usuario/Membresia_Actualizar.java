/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista.Usuario;

/**
 *
 * @author PC
 */
public class Membresia_Actualizar extends javax.swing.JFrame {

    /**
     * Creates new form Membresia_Actualizar
     */
    public Membresia_Actualizar() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel10 = new javax.swing.JLabel();
        Informacion_Personal1 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        Regresar = new javax.swing.JButton();
        Actualizar = new javax.swing.JButton();
        Tipo_membresia = new javax.swing.JComboBox<>();
        Nro_Tarjeta = new javax.swing.JLabel();
        costo = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1050, 700));
        getContentPane().setLayout(null);

        jLabel10.setFont(new java.awt.Font("Lucida Fax", 1, 24)); // NOI18N
        jLabel10.setText("Membresia");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(220, 80, 150, 30);

        Informacion_Personal1.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        Informacion_Personal1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Informacion_Personal1.setText("Informacion Membresia");
        getContentPane().add(Informacion_Personal1);
        Informacion_Personal1.setBounds(110, 150, 180, 17);

        jLabel14.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        jLabel14.setText("Nro Tarjeta:");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(120, 180, 100, 30);

        jLabel12.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        jLabel12.setText("Tipo:");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(170, 230, 50, 30);

        jLabel13.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        jLabel13.setText("Precio:");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(150, 280, 70, 30);

        Regresar.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        Regresar.setText("Regresar");
        Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarActionPerformed(evt);
            }
        });
        getContentPane().add(Regresar);
        Regresar.setBounds(60, 350, 180, 35);

        Actualizar.setBackground(new java.awt.Color(153, 204, 255));
        Actualizar.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        Actualizar.setText("Actualizar");
        getContentPane().add(Actualizar);
        Actualizar.setBounds(280, 350, 180, 35);

        Tipo_membresia.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Tipo_membresia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Free", "Gold", "Premium", "VIP" }));
        Tipo_membresia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tipo_membresiaActionPerformed(evt);
            }
        });
        getContentPane().add(Tipo_membresia);
        Tipo_membresia.setBounds(220, 230, 210, 30);

        Nro_Tarjeta.setFont(new java.awt.Font("Lucida Fax", 1, 12)); // NOI18N
        Nro_Tarjeta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(Nro_Tarjeta);
        Nro_Tarjeta.setBounds(220, 180, 210, 30);

        costo.setFont(new java.awt.Font("Lucida Fax", 1, 12)); // NOI18N
        costo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(costo);
        costo.setBounds(220, 280, 210, 30);

        jLabel8.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 0));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/Login Cruds.png"))); // NOI18N
        getContentPane().add(jLabel8);
        jLabel8.setBounds(0, 0, 1050, 650);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RegresarActionPerformed

    private void Tipo_membresiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tipo_membresiaActionPerformed
        String opcionSeleccionada = (String) Tipo_membresia.getSelectedItem();
        
        switch (opcionSeleccionada) {
            case "Free":
                costo.setText("0.00");
                break;
            case "Gold":
                costo.setText("4.99");
                break;
            case "Premium":
                costo.setText("9.99");
                break;
            case "VIP":
                costo.setText("14.99");
                break;    
            default:
                break;
        }
    }//GEN-LAST:event_Tipo_membresiaActionPerformed

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
            java.util.logging.Logger.getLogger(Membresia_Actualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Membresia_Actualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Membresia_Actualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Membresia_Actualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Membresia_Actualizar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton Actualizar;
    private javax.swing.JLabel Informacion_Personal1;
    public javax.swing.JLabel Nro_Tarjeta;
    public javax.swing.JButton Regresar;
    public javax.swing.JComboBox<String> Tipo_membresia;
    public javax.swing.JLabel costo;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}
