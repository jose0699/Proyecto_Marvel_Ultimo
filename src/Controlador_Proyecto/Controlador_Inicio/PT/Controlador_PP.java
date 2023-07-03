/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador_Proyecto.Controlador_Inicio.PT;

//Controladores
    import Controlador_Proyecto.Controlador_Inicio.Controlador_Login;
    import Controlador_Proyecto.Controlador_Inicio.Controlador_Usuario.Controlador_Principal;
    import Controlador_Proyecto.Controlador_Inicio.Controlador_Admin.Controlador_Admin;
//Fin de controladores
//Vistas
    import Vista.Principal.Perfil_Premium;
    import Vista.Usuario.Principal_us;
    import Vista.Admin.Principal;    
    import Vista.Login;
//Fin de vistas
//Librerias
    import java.awt.event.ActionEvent;
    import java.awt.event.ActionListener;

//fin de librerias

/**
 *
 * @author José Luis López
 */
public class Controlador_PP implements ActionListener {
    private Perfil_Premium pp;

    public static String usuario_principal;
    public Controlador_PP(Perfil_Premium pp, String us){
       this.pp= pp;
       usuario_principal=us;

       //Botones de Premium
            this.pp.AC_P.addActionListener(this);
            this.pp.PP.addActionListener(this);
            this.pp.PP_2.addActionListener(this);
            this.pp.PP_3.addActionListener(this);
            this.pp.S_P.addActionListener(this);
       //Fin de Botones de Premium

    }
        /*
        iniciar= simplemente hace que no se pueda ni agrandar la imagen y la centra en el medio de la pantaña
    */
    public void iniciar (){
        pp.setTitle("Perfil"); //El titulo que tendra en la ventana
        pp.setLocationRelativeTo(null); //Para que se inicie la ventana en el centro
        pp.setResizable(false);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        //Botones de Premium
            if(ae.getSource()==pp.AC_P){
                if(usuario_principal.equals("admin") || usuario_principal.equals("admin@gmail.com")){
                    Principal p= new Principal();
                    Controlador_Admin ca= new Controlador_Admin (p, usuario_principal);
                    ca.iniciar();
                    p.setVisible(true);
                    pp.setVisible(false);
                } else {
                    Principal_us p= new Principal_us ();
                    Controlador_Principal ca= new Controlador_Principal (p, usuario_principal);
                    ca.iniciar_Usu();
                    p.setVisible(true);
                    pp.setVisible(false);
                }
                
            }   
            
            if(ae.getSource()==pp.PP){
                
            }
            
            if(ae.getSource()==pp.PP_2){
                
            }
            
            if(ae.getSource()==pp.PP_3){
                
            }
            
            if(ae.getSource()==pp.S_P){
                Login l= new Login();
                Controlador_Login cl= new Controlador_Login(l);
                cl.iniciar();
                l.setVisible(true);
                pp.setVisible(false);
            }
        //Fin de Botones de premium

    }    
}
