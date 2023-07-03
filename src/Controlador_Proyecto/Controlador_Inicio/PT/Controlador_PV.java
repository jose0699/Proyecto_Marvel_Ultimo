/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador_Proyecto.Controlador_Inicio.PT;

//Controladores
    import Controlador_Proyecto.Controlador_Inicio.Controlador_Usuario.Controlador_Principal;
    import Controlador_Proyecto.Controlador_Inicio.Controlador_Admin.Controlador_Admin;
    import Controlador_Proyecto.Controlador_Inicio.Controlador_Login;
   
//Fin de los controladores
//Vistas
    import Vista.Login;
    import Vista.Principal.Perfil_Vip;
    import Vista.Principal.Principal_Principal;
    import Vista.Usuario.Principal_us;
    import Vista.Admin.Principal;
//Fin de Vistas
//Librerias
    import java.awt.event.ActionEvent;
    import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
//Fin de librerias

/**
 *
 * @author José Luis López
 */

public class Controlador_PV implements ActionListener {
    private Perfil_Vip pv;
    public static String usuario_principal;
    public Controlador_PV(Perfil_Vip pv, String usu){
        this.pv=pv;
        usuario_principal=usu;
        
        //inicio de botones
            this.pv.AC_V.addActionListener(this);
            this.pv.PV_1.addActionListener(this);
            this.pv.PV_2.addActionListener(this);
            this.pv.PV_3.addActionListener(this);
            this.pv.PV_4.addActionListener(this);
            this.pv.PV_5.addActionListener(this);
            this.pv.S_V.addActionListener(this);
        //Fin de botones
    }

    public void Voy_principal(String usuario_principal){
        JOptionPane.showMessageDialog(null,"En proceso");
    }
    
     /*
        iniciar= simplemente hace que no se pueda ni agrandar la imagen y la centra en el medio de la pantaña
    */
    public void iniciar (){
        pv.setTitle("Perfil"); //El titulo que tendra en la ventana
        pv.setLocationRelativeTo(null); //Para que se inicie la ventana en el centro
        pv.setResizable(false);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()== pv.AC_V){
            if(usuario_principal.equals("admin") || usuario_principal.equals("admin@gmail.com")){
                Principal p= new Principal();
                Controlador_Admin ca= new Controlador_Admin(p, usuario_principal);
                ca.iniciar();
                p.setVisible(true);
                pv.setVisible(false);
            }else{
                Principal_us pu= new Principal_us();
                Controlador_Principal cp= new Controlador_Principal(pu,usuario_principal);
                cp.iniciar_Usu();
                pu.setVisible(true);
                pv.setVisible(false);
            }
        }
        
        if(ae.getSource()==pv.PV_1){
            Voy_principal(usuario_principal);
        }
        
        if(ae.getSource()==pv.PV_2){
            Voy_principal(usuario_principal);
        }
        
        if(ae.getSource()==pv.PV_3){
            Voy_principal(usuario_principal);
        }
         
        if(ae.getSource()==pv.PV_4){
            Voy_principal(usuario_principal);
        }
         
        if(ae.getSource()==pv.PV_5){
            Voy_principal(usuario_principal);
        }
        
        if(ae.getSource()==pv.S_V){
            Login l= new Login();
            Controlador_Login cl= new Controlador_Login(l);
            cl.iniciar();
            l.setVisible(true);
            pv.setVisible(false);            
        }
    }
}
