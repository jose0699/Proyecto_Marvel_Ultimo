/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista.Usuario;

/**
 *
 * @author PC
 */
public class Usuario_us extends javax.swing.JFrame {

    /**
     * Creates new form Usuario
     */
    public Usuario_us() {
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
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        Informacion_Personal = new javax.swing.JLabel();
        Informacion_Personal1 = new javax.swing.JLabel();
        Nombre1 = new javax.swing.JLabel();
        Actualizar = new javax.swing.JButton();
        pais = new javax.swing.JLabel();
        genero = new javax.swing.JLabel();
        fecha_nacimiento = new javax.swing.JLabel();
        usuario = new javax.swing.JLabel();
        correo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        apellido = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1050, 700));
        getContentPane().setLayout(null);

        Salir.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        getContentPane().add(Salir);
        Salir.setBounds(40, 510, 180, 35);

        jLabel9.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        jLabel9.setText("Genero:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(50, 260, 60, 30);

        jLabel10.setFont(new java.awt.Font("Lucida Fax", 1, 24)); // NOI18N
        jLabel10.setText("USUARIO");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(210, 30, 110, 30);

        jLabel11.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        jLabel11.setText("Correo Electronico:");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(60, 420, 150, 30);

        jLabel12.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        jLabel12.setText("Fecha de Nacimiento:");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(50, 190, 160, 30);

        jLabel13.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        jLabel13.setText("Pais:");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(50, 230, 40, 30);

        jLabel14.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        jLabel14.setText("Nombre:");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(50, 100, 70, 30);

        jLabel15.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        jLabel15.setText("Username:");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(60, 360, 90, 30);

        Informacion_Personal.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        Informacion_Personal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Informacion_Personal.setText("Informacion usuario");
        getContentPane().add(Informacion_Personal);
        Informacion_Personal.setBounds(40, 310, 180, 17);

        Informacion_Personal1.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        Informacion_Personal1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Informacion_Personal1.setText("Informacion personal");
        getContentPane().add(Informacion_Personal1);
        Informacion_Personal1.setBounds(40, 70, 180, 17);

        Nombre1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Nombre1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(Nombre1);
        Nombre1.setBounds(130, 100, 200, 30);

        Actualizar.setBackground(new java.awt.Color(153, 204, 255));
        Actualizar.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        Actualizar.setText("Actualizar");
        getContentPane().add(Actualizar);
        Actualizar.setBounds(250, 510, 180, 35);

        pais.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        pais.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(pais);
        pais.setBounds(120, 230, 200, 30);
        getContentPane().add(genero);
        genero.setBounds(120, 260, 200, 30);

        fecha_nacimiento.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        fecha_nacimiento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(fecha_nacimiento);
        fecha_nacimiento.setBounds(230, 190, 200, 30);

        usuario.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        usuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(usuario);
        usuario.setBounds(170, 360, 200, 30);
        getContentPane().add(correo);
        correo.setBounds(220, 420, 200, 30);

        jLabel1.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Apellido");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(40, 150, 80, 17);

        apellido.setFont(new java.awt.Font("Lucida Fax", 1, 16)); // NOI18N
        getContentPane().add(apellido);
        apellido.setBounds(140, 140, 200, 30);

        jLabel8.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 0));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/Login Cruds.png"))); // NOI18N
        jLabel8.setMaximumSize(new java.awt.Dimension(1040, 680));
        jLabel8.setMinimumSize(new java.awt.Dimension(1040, 680));
        jLabel8.setPreferredSize(new java.awt.Dimension(1040, 680));
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
            java.util.logging.Logger.getLogger(Usuario_us.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Usuario_us.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Usuario_us.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Usuario_us.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Usuario_us().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton Actualizar;
    private javax.swing.JLabel Informacion_Personal;
    private javax.swing.JLabel Informacion_Personal1;
    public javax.swing.JLabel Nombre1;
    public javax.swing.JButton Salir;
    public javax.swing.JLabel apellido;
    public javax.swing.JLabel correo;
    public javax.swing.JLabel fecha_nacimiento;
    public javax.swing.JLabel genero;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public javax.swing.JLabel pais;
    public javax.swing.JLabel usuario;
    // End of variables declaration//GEN-END:variables
}
