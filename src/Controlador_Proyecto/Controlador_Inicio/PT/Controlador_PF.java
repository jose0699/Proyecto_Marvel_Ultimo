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
//Comienzo de Vistas
    import Vista.Login;
    import Vista.Usuario.Principal_us;
    import Vista.Admin.Principal;
    import Vista.Principal.Principal_Principal;
    import Vista.Principal.Perfil_Free;
//Fin de Vistas
//Librerias
    import java.awt.event.ActionEvent;
    import java.awt.event.ActionListener;
//Fin de librerias
/**
 *
 * @author José Luis López
 */
public class Controlador_PF implements ActionListener{
    private Perfil_Free pf;
    public static String usuario_principal;
    
    public Controlador_PF(Perfil_Free pf, String usu){
        this.pf=pf;
        
        //inicio de botones
            this.pf.AC_F.addActionListener(this);
            this.pf.PF.addActionListener(this);
            this.pf.S_F.addActionListener(this);
        //Fin de botones
    }
    
    /*
        iniciar= simplemente hace que no se pueda ni agrandar la imagen y la centra en el medio de la pantaña
    */
    public void iniciar (){
        pf.setTitle("Perfil"); //El titulo que tendra en la ventana
        pf.setLocationRelativeTo(null); //Para que se inicie la ventana en el centro
        pf.setResizable(false);
    }
        
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()== pf.AC_F){
            if(usuario_principal.equals("admin") || usuario_principal.equals("admin@gmail.com")){
                Principal p= new Principal();
                Controlador_Admin ca= new Controlador_Admin(p, usuario_principal);
                ca.iniciar();
                p.setVisible(true);
                pf.setVisible(false);
            }else{
                Principal_us pu= new Principal_us();
                Controlador_Principal cp= new Controlador_Principal(pu,usuario_principal);
                cp.iniciar_Usu();
                pu.setVisible(true);
                pf.setVisible(false);
            }
        }
        
        if(ae.getSource()== pf.PF){
            
        }
        
        if(ae.getSource()== pf.S_F){
            Login l= new Login();
            Controlador_Login cl= new Controlador_Login(l);
            cl.iniciar();
            l.setVisible(true);
            pf.setVisible(false);
        }
    } 
}
