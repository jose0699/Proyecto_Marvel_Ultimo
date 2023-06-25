/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

/**
 *
 * @author José Luis López
 */
public class Cambiar_Contrasena extends javax.swing.JFrame {

    /**
     * Creates new form Cambiar_Contrasena
     */
    public Cambiar_Contrasena() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Correo_Usuario = new javax.swing.JTextField();
        Codigo = new javax.swing.JTextField();
        Obtener = new javax.swing.JButton();
        Regresar = new javax.swing.JButton();
        Informacion_Personal1 = new javax.swing.JLabel();
        Informacion_Personal = new javax.swing.JLabel();
        Marvel = new javax.swing.JLabel();
        Continuar = new javax.swing.JButton();
        Borde_Menu = new javax.swing.JLabel();
        Fondologin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1360, 770));
        setPreferredSize(new java.awt.Dimension(1360, 770));
        getContentPane().setLayout(null);

        Correo_Usuario.setFont(new java.awt.Font("Lucida Fax", 1, 12)); // NOI18N
        Correo_Usuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Correo_Usuario.setText("Correo electronico / Usuario");
        getContentPane().add(Correo_Usuario);
        Correo_Usuario.setBounds(110, 330, 260, 30);

        Codigo.setFont(new java.awt.Font("Lucida Fax", 1, 12)); // NOI18N
        Codigo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Codigo.setText("Código de verificación");
        getContentPane().add(Codigo);
        Codigo.setBounds(110, 380, 160, 30);

        Obtener.setBackground(new java.awt.Color(255, 153, 153));
        Obtener.setFont(new java.awt.Font("Lucida Fax", 1, 12)); // NOI18N
        Obtener.setForeground(new java.awt.Color(255, 0, 0));
        Obtener.setText("Obtener");
        getContentPane().add(Obtener);
        Obtener.setBounds(280, 380, 87, 30);

        Regresar.setFont(new java.awt.Font("Lucida Fax", 1, 12)); // NOI18N
        Regresar.setText("Regresar");
        getContentPane().add(Regresar);
        Regresar.setBounds(110, 500, 120, 30);

        Informacion_Personal1.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        Informacion_Personal1.setForeground(new java.awt.Color(255, 0, 0));
        Informacion_Personal1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Informacion_Personal1.setText("¿Olvidaste la contraseña?");
        getContentPane().add(Informacion_Personal1);
        Informacion_Personal1.setBounds(140, 220, 210, 30);

        Informacion_Personal.setFont(new java.awt.Font("Lucida Fax", 1, 12)); // NOI18N
        Informacion_Personal.setForeground(new java.awt.Color(255, 0, 0));
        Informacion_Personal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Informacion_Personal.setText("Ingrese su usuario o correo :");
        getContentPane().add(Informacion_Personal);
        Informacion_Personal.setBounds(110, 300, 190, 30);

        Marvel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/marvel.png"))); // NOI18N
        getContentPane().add(Marvel);
        Marvel.setBounds(100, 120, 290, 80);

        Continuar.setBackground(new java.awt.Color(255, 153, 153));
        Continuar.setFont(new java.awt.Font("Lucida Fax", 1, 12)); // NOI18N
        Continuar.setForeground(new java.awt.Color(255, 0, 0));
        Continuar.setText("Continuar");
        getContentPane().add(Continuar);
        Continuar.setBounds(250, 500, 120, 30);

        Borde_Menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/Cuadrado_Bo.jpg"))); // NOI18N
        getContentPane().add(Borde_Menu);
        Borde_Menu.setBounds(70, 80, 350, 520);

        Fondologin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/guardianes_fondo_1.jpg"))); // NOI18N
        Fondologin.setMaximumSize(new java.awt.Dimension(1380, 768));
        Fondologin.setMinimumSize(new java.awt.Dimension(1380, 768));
        getContentPane().add(Fondologin);
        Fondologin.setBounds(0, 0, 1360, 770);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Cambiar_Contrasena.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cambiar_Contrasena.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cambiar_Contrasena.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cambiar_Contrasena.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cambiar_Contrasena().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Borde_Menu;
    public javax.swing.JTextField Codigo;
    public javax.swing.JButton Continuar;
    public javax.swing.JTextField Correo_Usuario;
    public javax.swing.JLabel Fondologin;
    private javax.swing.JLabel Informacion_Personal;
    private javax.swing.JLabel Informacion_Personal1;
    private javax.swing.JLabel Marvel;
    public javax.swing.JButton Obtener;
    public javax.swing.JButton Regresar;
    // End of variables declaration//GEN-END:variables
}
