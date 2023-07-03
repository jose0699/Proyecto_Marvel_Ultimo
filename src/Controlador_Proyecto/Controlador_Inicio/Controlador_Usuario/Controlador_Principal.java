/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador_Proyecto.Controlador_Inicio.Controlador_Usuario;

//modelo
    import Modelo.DAO_Usuario;
//fin de modelo

//Controladores
    import Controlador_Proyecto.Controlador_Inicio.Controlador_Admin.Controlador_Admin;
    import Controlador_Proyecto.Controlador_Inicio.Controlador_Usuario.Controlador_Usuario;
    import Controlador_Proyecto.Controlador_Inicio.Controlador_Usuario.Controlador_Membresia;
    import Controlador_Proyecto.Controlador_Inicio.Controlador_Usuario.Controlador_Perfiles;
    import Controlador_Proyecto.Controlador_Inicio.Controlador_Login;
//Fin de controladores
//Vistas
    import Vista.Usuario.Principal_us;
    import Vista.Usuario.Usuario_us;
    import Vista.Usuario.Perfil;
    import Vista.Usuario.Membresia;
    import Vista.Admin.Principal;
    import Vista.Login;
//Fin de vistas
//Librerias
    import java.awt.event.ActionEvent;
    import java.awt.event.ActionListener;
    import javax.swing.JOptionPane;
//fin de librerias

/**
 *
 * @author José Luis López
 */

public class Controlador_Principal implements ActionListener {
    private Principal_us principal;
    
    //intanciar
      DAO_Usuario du= new DAO_Usuario();  
    //fin de instanciar
    
    public static String usuario_principal;
    
    public Controlador_Principal (Principal_us principal, String usu){
        this.principal=principal;
        Controlador_Principal.usuario_principal=usu;
        
        //Botones
            this.principal.Membresia.addActionListener(this);
            this.principal.Perfil.addActionListener(this);
            this.principal.Salir.addActionListener(this);
            this.principal.Usuario.addActionListener(this);
        // Fin de botones
    }
    
    public void iniciar_Admin (){
        principal.setTitle("Menu de perfil de Admin"); //El titulo que tendra en la ventana
        principal.setLocationRelativeTo(null); //Para que se inicie la ventana en el centro
    }
     
    public void iniciar_Usu (){
        principal.setTitle("Menu de perfil de usuario"); //El titulo que tendra en la ventana
        principal.setLocationRelativeTo(null); //Para que se inicie la ventana en el centro
    }
    
    /*
        Perfil_Listo= Toma todo los perfiles del usuario, segun la membresia y lo imperime
        en el Jcombo_box en la interfaz de perfil
    */
    
    public void Perfil_Listo(String usuario, Perfil p){  
        int rep=0 , aux= du.Toma_Tu_Valor(usuario, 2);
        p.agregaritem("None");
        
        while(aux>=rep){
            rep++;
            p.agregaritem(du.Toma_Tu_Valor_String_En_Fila(usuario_principal, rep));
        }
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()== principal.Membresia){
            if(usuario_principal.equals("admin")){
                JOptionPane.showMessageDialog(null,"Error: Eres administrador tienes membresia infinita");
            }else {
                Membresia m= new Membresia();
                Controlador_Membresia cm= new Controlador_Membresia(m,Controlador_Principal.usuario_principal);
                cm.mostrar_membresia(Controlador_Principal.usuario_principal);
                cm.iniciar_Usua();
                m.setVisible(true);            
                principal.setVisible(false);
            }  
        } 
      
        if(ae.getSource()== principal.Perfil){
            Perfil p= new Perfil();
            Controlador_Perfiles cper= new Controlador_Perfiles(p, usuario_principal);
            p.usuario.setText(usuario_principal);
            Perfil_Listo(usuario_principal,p);
            p.setVisible(true);
            principal.setVisible(false); 
        } 
      
        if(ae.getSource()== principal.Salir){
            if(usuario_principal.equals("admin")){
                Principal p= new Principal();
                Controlador_Admin ca= new Controlador_Admin(p, usuario_principal);
                p.setVisible(true);
                principal.setVisible(false);
            } else{
                System.out.println(usuario_principal);
                Login l= new Login();
                Controlador_Login cl= new Controlador_Login(l);
                cl.iniciar();
                l.setVisible(true);
                principal.setVisible(false); 
            }
        }  
        
        if(ae.getSource()== principal.Usuario){  
            Usuario_us usua= new Usuario_us();
            Controlador_Usuario cu= new Controlador_Usuario(usua,usuario_principal);                       
            cu.iniciar_admin();
            du.Imprimir_Usuario_2(usuario_principal, usua, 1);
            usua.setVisible(true);
            principal.setVisible(false);
        }
    }   
}
