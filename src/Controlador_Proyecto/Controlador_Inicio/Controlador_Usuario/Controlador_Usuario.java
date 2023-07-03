/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador_Proyecto.Controlador_Inicio.Controlador_Usuario;

//Vistas
    import Vista.Usuario.Principal_us;
    import Vista.Usuario.Usuario_us;
    import Vista.Usuario.Usuario_Actualizar;
//Fin de Vistas
//Modelo
    import Modelo.DAO_Usuario;
//Fin de Modelo
//Controladores
    import Controlador_Proyecto.Controlador_Inicio.Controlador_Login;
    import Controlador_Proyecto.Controlador_Inicio.Controlador_Usuario.Controlador_Principal;
//Fin de Controladores

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author José Luis López
 */
public class Controlador_Usuario implements ActionListener {
    private Usuario_us usuario;
    public static String usuario_principal;
    
    //Instancia
        DAO_Usuario du= new DAO_Usuario();
    //Fin de instancia
    public Controlador_Usuario (Usuario_us usuario, String usu){
        this.usuario=usuario;
        Controlador_Usuario.usuario_principal=usu;
        
        //botones
            this.usuario.Actualizar.addActionListener(this);
            this.usuario.Salir.addActionListener(this);
        //fin de botones
    }
    
   
      public void iniciar_admin (){
        usuario.setTitle("Usuario"); //El titulo que tendra en la ventana
        usuario.setLocationRelativeTo(null); //Para que se inicie la ventana en el centro
    }
    
    /*
        Prepara la impresion de los datos del usuario para el siguiente interfaz.
        Carga y visualiza todos los datos para la interfaz  para actualizar el
        usuario, el administrador no puede cambiar
    */
    
    public void Pais_Genero(String aux, int caso, Usuario_Actualizar au ){

        switch (caso){
            case 1:
               switch (aux){
                    case "Canada":
                        au.Pais.setSelectedIndex(1);
                    break;
                
                    case "Estados Unidos" :
                         au.Pais.setSelectedIndex(2);
                    break;
                
                    case "Italia":
                        au.Pais.setSelectedIndex(3);
                    break;
                
                    case "Japon":
                         au.Pais.setSelectedIndex(5);
                    break;
                    
                    case "Venezuela":
                        au.Pais.setSelectedIndex(5);
                    break;
                }  
            break; 
            
            case 2:
                switch(aux){
                    case "Femenino":
                        au.Genero.setSelectedIndex(1);
                    break;
                    
                    case "CanaMasculinoda":
                        au.Genero.setSelectedIndex(2);
                    break;
                
                    case "Desconocido Unidos" :
                        au.Genero.setSelectedIndex(3);
                    break;
                
                    case "Otros":
                        au.Genero.setSelectedIndex(4);
                    break;      
                }
            break;
            
            case 3:
                au.Nro_Tarjeta.setText(du.Toma_Tu_Valor_String(usuario_principal,10));
                au.Primer_Nombre.setText(usuario.Nombre1.getText());
                au.Primer_Apellido.setText(usuario.apellido.getText());
                au.contraseña.setText(du.Toma_Tu_Valor_String(usuario_principal,7));
                au.correo.setText(usuario.correo.getText());
                au.usuario.setText(usuario.usuario.getText());  
            break;    
        }
    }
    
    public void cargar(Usuario_Actualizar au){
        Pais_Genero(null,3, au);                   
        Pais_Genero(usuario.pais.getText(),1, au);       
        Pais_Genero(usuario.genero.getText(),2,au);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()== usuario.Actualizar){
            if (usuario_principal.equals("admin")){
                JOptionPane.showMessageDialog(null,"Opcion no validad, no puedes actualizar administrador");
            }else{
                Usuario_Actualizar au= new Usuario_Actualizar();
                Controlador_Actualizar_Usuario cua= new Controlador_Actualizar_Usuario(au, usuario_principal);
                cua.iniciar_Usu();
                au.setVisible(true);
                usuario.setVisible(false);
            }            
        }
        
        if(ae.getSource()== usuario.Salir){
            Principal_us p=new Principal_us();
            Controlador_Principal cp= new Controlador_Principal(p,usuario_principal);
            p.setVisible(true);
            usuario.setVisible(false);
        }
    }
 
}
