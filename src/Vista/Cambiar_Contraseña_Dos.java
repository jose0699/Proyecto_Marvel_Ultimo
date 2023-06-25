/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

/**
 *
 * @author José Luis López
 */
public class Cambiar_Contraseña_Dos extends javax.swing.JFrame {

    /**
     * Creates new form Cambiar_Contraseña_Dos
     */
    public Cambiar_Contraseña_Dos() {
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

        Regresar = new javax.swing.JButton();
        Cambiar_Contraseña = new javax.swing.JButton();
        Contraseña = new javax.swing.JTextField();
        Confirma_Contraseña = new javax.swing.JTextField();
        Informacion_Personal3 = new javax.swing.JLabel();
        Informacion_Personal2 = new javax.swing.JLabel();
        Marvel = new javax.swing.JLabel();
        Informacion_Personal1 = new javax.swing.JLabel();
        Informacion_Personal = new javax.swing.JLabel();
        Borde_Menu = new javax.swing.JLabel();
        Fondologin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        Regresar.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        Regresar.setText("Regresar");
        getContentPane().add(Regresar);
        Regresar.setBounds(110, 500, 120, 30);

        Cambiar_Contraseña.setBackground(new java.awt.Color(255, 153, 153));
        Cambiar_Contraseña.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        Cambiar_Contraseña.setForeground(new java.awt.Color(255, 0, 0));
        Cambiar_Contraseña.setText("Confirmar");
        getContentPane().add(Cambiar_Contraseña);
        Cambiar_Contraseña.setBounds(250, 500, 120, 30);

        Contraseña.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        Contraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContraseñaActionPerformed(evt);
            }
        });
        getContentPane().add(Contraseña);
        Contraseña.setBounds(110, 340, 260, 21);

        Confirma_Contraseña.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        getContentPane().add(Confirma_Contraseña);
        Confirma_Contraseña.setBounds(110, 400, 260, 21);

        Informacion_Personal3.setFont(new java.awt.Font("Lucida Fax", 1, 12)); // NOI18N
        Informacion_Personal3.setForeground(new java.awt.Color(255, 0, 0));
        Informacion_Personal3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Informacion_Personal3.setText("Contraseña:");
        getContentPane().add(Informacion_Personal3);
        Informacion_Personal3.setBounds(110, 310, 80, 30);

        Informacion_Personal2.setFont(new java.awt.Font("Lucida Fax", 1, 12)); // NOI18N
        Informacion_Personal2.setForeground(new java.awt.Color(255, 0, 0));
        Informacion_Personal2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Informacion_Personal2.setText("Confirmar contraseña:");
        getContentPane().add(Informacion_Personal2);
        Informacion_Personal2.setBounds(110, 370, 150, 30);

        Marvel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/marvel.png"))); // NOI18N
        getContentPane().add(Marvel);
        Marvel.setBounds(100, 120, 290, 80);

        Informacion_Personal1.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        Informacion_Personal1.setForeground(new java.awt.Color(255, 0, 0));
        Informacion_Personal1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Informacion_Personal1.setText("¿Olvidaste la contraseña?");
        getContentPane().add(Informacion_Personal1);
        Informacion_Personal1.setBounds(140, 220, 210, 30);

        Informacion_Personal.setFont(new java.awt.Font("Lucida Fax", 1, 12)); // NOI18N
        Informacion_Personal.setForeground(new java.awt.Color(255, 0, 0));
        Informacion_Personal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Informacion_Personal.setText("Ingrese su nueva contraseña");
        getContentPane().add(Informacion_Personal);
        Informacion_Personal.setBounds(150, 270, 190, 30);

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

    private void ContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ContraseñaActionPerformed

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
            java.util.logging.Logger.getLogger(Cambiar_Contraseña_Dos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cambiar_Contraseña_Dos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cambiar_Contraseña_Dos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cambiar_Contraseña_Dos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cambiar_Contraseña_Dos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Borde_Menu;
    public javax.swing.JButton Cambiar_Contraseña;
    public javax.swing.JTextField Confirma_Contraseña;
    public javax.swing.JTextField Contraseña;
    public javax.swing.JLabel Fondologin;
    private javax.swing.JLabel Informacion_Personal;
    private javax.swing.JLabel Informacion_Personal1;
    private javax.swing.JLabel Informacion_Personal2;
    private javax.swing.JLabel Informacion_Personal3;
    private javax.swing.JLabel Marvel;
    public javax.swing.JButton Regresar;
    // End of variables declaration//GEN-END:variables
}
