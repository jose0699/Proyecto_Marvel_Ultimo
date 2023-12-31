/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista.Usuario;

 //Controlador
        import Modelo.DAO_Usuario;
    //fin de Controlador
/**
 *
 * @author José Luis López
 */
public class Perfil extends javax.swing.JFrame {
    public static int aux;
   
    /**
     * Creates new form Perfil
     */
    public Perfil() {
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

        perfiles = new javax.swing.JComboBox<>();
        Regresar = new javax.swing.JButton();
        Actualizar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Nombre = new javax.swing.JLabel();
        correo = new javax.swing.JLabel();
        usuario = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        perfiles.setFont(new java.awt.Font("Lucida Fax", 1, 16)); // NOI18N
        perfiles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                perfilesActionPerformed(evt);
            }
        });
        getContentPane().add(perfiles, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 200, 35));

        Regresar.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        Regresar.setText("Regresar");
        getContentPane().add(Regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 360, 150, 30));

        Actualizar.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        Actualizar.setText("Actualizar");
        getContentPane().add(Actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, 150, 30));

        jLabel2.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        jLabel2.setText("Nombre");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 80, 30));

        jLabel3.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        jLabel3.setText("Correo electronico");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, -1, -1));

        jLabel4.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        jLabel4.setText("Usuario");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, -1, -1));

        Nombre.setFont(new java.awt.Font("Lucida Fax", 1, 14)); // NOI18N
        Nombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, 300, 35));

        correo.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        correo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, 300, 35));

        usuario.setFont(new java.awt.Font("Lucida Fax", 1, 18)); // NOI18N
        usuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 270, 250, 35));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/Login Cruds.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void perfilesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_perfilesActionPerformed
      
        DAO_Usuario du= new DAO_Usuario();            
        String usuario_principal= usuario.getText();
            
        switch (perfiles.getSelectedIndex()){
            case 0:
                Nombre.setText("N/A");
                correo.setText("N/A");
            break;
            
            case 1:
                du.Perfil_Usuario(this, usuario_principal, 1);
            break;
                    
            case 2:
                du.Perfil_Usuario(this, usuario_principal, 2);
            break;
                
            case 3:
                du.Perfil_Usuario(this, usuario_principal, 3);
            break;
                
            case 4:
                du.Perfil_Usuario(this, usuario_principal, 4);
            break;
            
            case 5:
                du.Perfil_Usuario(this, usuario_principal, 5);
            break;
                
        }
    }//GEN-LAST:event_perfilesActionPerformed
    
    public void agregaritem(String item){
        perfiles.addItem(item);
    }
    
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
            java.util.logging.Logger.getLogger(Perfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Perfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Perfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Perfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Perfil().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton Actualizar;
    public javax.swing.JLabel Nombre;
    public javax.swing.JButton Regresar;
    public javax.swing.JLabel correo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    public javax.swing.JComboBox<String> perfiles;
    public javax.swing.JLabel usuario;
    // End of variables declaration//GEN-END:variables
}
