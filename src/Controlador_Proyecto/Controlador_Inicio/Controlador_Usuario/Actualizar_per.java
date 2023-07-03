/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador_Proyecto.Controlador_Inicio.Controlador_Usuario;

//Controladores
    import Controlador_Proyecto.Controlador_Inicio.Controlador_Usuario.Controlador_Perfiles;
//Fin de Controladores
//Modelos
    import Modelo.DAO_Usuario;
//Fin de Modelos
//Vistas
    import Vista.Usuario.Actualizar_Perfil;
    import Vista.Usuario.Perfil;
//Fin de Vistas

//Libreria
    import java.awt.event.ActionEvent;
    import java.awt.event.ActionListener;
//Fin de libreria
/**
 *
 * @author José Luis López
 */
public class Actualizar_per  implements ActionListener {
    private Actualizar_Perfil ap;
    public static String usuario_principal;
    public static int aux2;
    
    //Instancia
    DAO_Usuario du= new DAO_Usuario();
    //Fin de instanciar
    public Actualizar_per (Actualizar_Perfil ap, String usu, int fila){
    Actualizar_per.usuario_principal= usu;    
    Actualizar_per.aux2=fila;   
        this.ap=ap;
       
       //Botones
        this.ap.Actualizar.addActionListener(this);
        this.ap.Regresar.addActionListener(this);
       //fin de botones
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
    
    /*
        Acualizar_Perfil= Actualiza el perfil
    */
    
    public void Actualizar_Perfil (){
        String aux= du.Toma_Tu_Valor_String_En_Fila_uid(usuario_principal, aux2);  
        int aux3= Integer.parseInt(aux);  
        du.actualizarperfil(ap.nombre.getText(), ap.correo.getText() , aux3);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()== ap.Regresar){
            Perfil p= new Perfil();
            Controlador_Perfiles cp= new Controlador_Perfiles(p, usuario_principal);
            Perfil_Listo(usuario_principal,p);
            p.usuario.setText(usuario_principal);
            p.setVisible(true);
            ap.setVisible(false);
        }
        
        if(ae.getSource()== ap.Actualizar){
            Perfil p= new Perfil();
            Controlador_Perfiles cp= new Controlador_Perfiles(p, Actualizar_per.usuario_principal);
            Actualizar_Perfil();            
            Perfil_Listo(usuario_principal,p);            
            p.usuario.setText(usuario_principal);            
            p.setVisible(true);
            ap.setVisible(false); 
        }
    } 
}
