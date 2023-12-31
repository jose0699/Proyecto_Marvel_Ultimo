/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista.Principal;

/**
 *
 * @author José Luis López
 */
public class Perfil_Free extends javax.swing.JFrame {

    /**
     * Creates new form Perfil_Free
     */
    public Perfil_Free() {
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

        Perfil = new javax.swing.JLabel();
        AC_F = new javax.swing.JButton();
        S_F = new javax.swing.JButton();
        PF = new javax.swing.JButton();
        FONDO = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Perfil.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        Perfil.setForeground(new java.awt.Color(255, 255, 255));
        Perfil.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(Perfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 480, 150, 35));

        AC_F.setBackground(new java.awt.Color(0, 0, 0));
        AC_F.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        AC_F.setForeground(new java.awt.Color(255, 255, 255));
        AC_F.setText("Administrar cuenta");
        AC_F.setBorder(null);
        getContentPane().add(AC_F, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 570, -1, -1));

        S_F.setBackground(new java.awt.Color(0, 0, 0));
        S_F.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        S_F.setForeground(new java.awt.Color(255, 255, 255));
        S_F.setText("Salir");
        S_F.setBorder(null);
        getContentPane().add(S_F, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 620, -1, -1));

        PF.setBackground(new java.awt.Color(0, 0, 0, 0));
        PF.setBorder(null);
        PF.setContentAreaFilled(false);
        getContentPane().add(PF, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 310, 150, 150));

        FONDO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/FREE.jpg"))); // NOI18N
        getContentPane().add(FONDO, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 770));

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
            java.util.logging.Logger.getLogger(Perfil_Free.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Perfil_Free.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Perfil_Free.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Perfil_Free.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Perfil_Free().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton AC_F;
    private javax.swing.JLabel FONDO;
    public javax.swing.JButton PF;
    public javax.swing.JLabel Perfil;
    public javax.swing.JButton S_F;
    // End of variables declaration//GEN-END:variables
}
