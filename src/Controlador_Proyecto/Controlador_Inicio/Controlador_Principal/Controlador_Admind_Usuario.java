/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador_Proyecto.Controlador_Inicio.Controlador_Principal;

//Modelos
import Modelo.ConexionBD;
import Modelo.DAO_Usuario;
import Modelo.Dao_Admin;
import Modelo.Usuario_BD;
//Fin de modelos

//Controladores
import Controlador_Proyecto.Controlador_Inicio.Controlador_Admin.Controlador_Admin;
import Controlador_Proyecto.Controlador_Inicio.Controlador_Usuario.Controlador_Actualizar_Usuario;
//Fin de controladores

//Vistas a trabajar
import Vista.Admin.Principal;
import Vista.Admin.Usuario;
import Vista.Usuario.Usuario_Actualizar;
//Fin de vistas

//Libreria
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Date;
import javax.swing.JOptionPane;
//Fin de Liberia
/**
 *
 * @author José Luis López
 */


public class Controlador_Admind_Usuario implements ActionListener {
    private Usuario usuario;    
    
    public static String usuario_principal; 
    
    //Instancia
        DAO_Usuario du= new DAO_Usuario();
        ConexionBD co= new ConexionBD();
        Dao_Admin da= new Dao_Admin();    
    //Fin de instanciar
    
    public void iniciar (){
        usuario.setTitle("CRUD de usuario Admin"); //El titulo que tendra en la ventana
        usuario.setLocationRelativeTo(null); //Para que se inicie la ventana en el centro
    }
    
    public Controlador_Admind_Usuario(Usuario usuario,String usua) {
        this.usuario = usuario;
        
        Controlador_Admind_Usuario.usuario_principal= usua;
        //botones
            this.usuario.Buscar.addActionListener(this);
            this.usuario.Actualizar.addActionListener(this);
            this.usuario.Regresar.addActionListener(this);
            this.usuario.Eliminar.addActionListener(this);
        //fin de botones
    }
    
    /*
        Pais_Genero= Obtiene el numero asociado al Jcombo_Box para que cuando el admin vaya actualiza
        visualice los datos pasados
    */
    public void Pais_Genero(Usuario_Actualizar au,String aux, int caso){
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
            
            default:
              JOptionPane.showMessageDialog(null,"Error en el procedimiento Pais_Genero");  
            break;
            
        }
    }
    
    /*
        Limpiar= Limpia los valores de los Jlabel en la interfaz para buscar y eliminar los usuario
        y escribe el N/A
    */
    public void Limpiar(Usuario usuario){
        usuario.Nombre.setText("N/A");
        usuario.apellido.setText("N/A");
        usuario.pais.setText("N/A");
        usuario.Nro_Tarjeta.setText("N/A");
        usuario.genero.setText("N/A");
        usuario.contraseña.setText("N/A");
        usuario.fecha_nacimiento.setText("N/A");
        usuario.correo.setText("N/A");
        usuario.usuario.setText("N/A");
        JOptionPane.showMessageDialog(null,"El usuario ha sido eliminada exitosamente ");
    }
    
    /*
        En la interfaz para actualizar el usuario, imprime los valores del usuario que se busco con
        antipacion, para actualizarlo
    */
    public void Imprimir_Datos_Actualiza(Usuario_Actualizar au){
        au.Nro_Tarjeta.setText(usuario.Nro_Tarjeta.getText());
        au.Primer_Nombre.setText(usuario.Nombre.getText());
        au.Primer_Apellido.setText(usuario.apellido.getText());
        au.contraseña.setText(usuario.contraseña.getText());
        au.correo.setText(usuario.correo.getText());
        au.usuario.setText(usuario.usuario.getText());
        Pais_Genero(au,usuario.pais.getText(),1);
        Pais_Genero(au,usuario.genero.getText(),2);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        
        if(ae.getSource()== usuario.Actualizar){
            Usuario_Actualizar au= new Usuario_Actualizar();
            Controlador_Actualizar_Usuario cau= new Controlador_Actualizar_Usuario(au, usuario_principal);
            cau.iniciar_Usu();
            Imprimir_Datos_Actualiza(au);          
            au.setVisible(true);
            usuario.setVisible(false);     
        }
        
        if(ae.getSource()== usuario.Eliminar){
            if(!usuario_principal.equals(usuario.Nombre.getText())){
                if(du.Existencia(usuario.Nombre.getText(), 1)){
                   du.Borrar_Usuario(usuario.Nombre.getText());
                   Limpiar(usuario);               
                } else {
                    JOptionPane.showMessageDialog(null,"No pudes borrar lo que no existe");
                }
            } else{
                JOptionPane.showMessageDialog(null,"No pudes borrar el administrador");
            }
            
        }
        
        if(ae.getSource()== usuario.Buscar){
            if(!usuario.Buscar_Usuario.getText().isEmpty()){
                if(co.verificarConexion() ){ //Verificar la conexion con la BD
                    if(du.Existencia(usuario.Buscar_Usuario.getText(), 1)){
                        du.Imprimir_Usuario(usuario.Buscar_Usuario.getText(),usuario,1);                        
                    }else{ 
                        if(du.Existencia(usuario.Buscar_Usuario.getText(), 2)){//Verificar si existe
                            du.Imprimir_Usuario(usuario.Buscar_Usuario.getText(),usuario,2);                            
                        }else {
                            JOptionPane.showMessageDialog(null,"Error: Usuario no existe");
                        }//Fin de verificar existencia}
                    }//Fin de verificar la conexion con la base de datos :p
                } else {
                    JOptionPane.showMessageDialog(null,"Error: Fallo la conexion");   
                }//Fin de verificar conexion
            }else {
                JOptionPane.showMessageDialog(null,"Error: Campo vacio");
            }
        }
        
        if(ae.getSource()== usuario.Regresar){
            Principal principal= new Principal();
            Controlador_Admin ca= new Controlador_Admin(principal,Controlador_Admind_Usuario.usuario_principal);
            ca.iniciar();
            principal.setVisible(true);
            usuario.setVisible(false);  
        }
        
    }
}
