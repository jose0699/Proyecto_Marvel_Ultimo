/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador_Proyecto.Controlador_Inicio;

//Vista a Utilizar
    import Vista.Login;
    import Vista.Registrar_Usuario_Dos;
    import Vista.Cambiar_Contrasena;
    import Vista.Admin.Principal;
    import Vista.Usuario.Principal_us;
    import Vista.Principal.Perfil_Free;
    import Vista.Principal.Perfil_Gold;
    import Vista.Principal.Perfil_Premium;
    import Vista.Principal.Perfil_Vip;
//Fin de las Vistas

//Controladores
    import Controlador_Proyecto.Controlador_Inicio.Controlador_Registrar;
    import Controlador_Proyecto.Controlador_Inicio.Controlador_Admin.Controlador_Admin;
    import Controlador_Proyecto.Controlador_Inicio.Controlador_Contrasena;
    import Controlador_Proyecto.Controlador_Inicio.Controlador_Usuario.Controlador_Principal;
    import Controlador_Proyecto.Controlador_Inicio.PT.Controlador_PP;
    import Controlador_Proyecto.Controlador_Inicio.PT.Controlador_PG;
    import Controlador_Proyecto.Controlador_Inicio.PT.Controlador_PF;
    import Controlador_Proyecto.Controlador_Inicio.PT.Controlador_PV;
//Fin de controladores

//Comienzo de modelos
import Modelo.ConexionBD;
import Modelo.DAO_Usuario;
//Fin de modelos

//Librerias
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
//Fin de librerias
/**
 *
 * @author José Luis López
 */
public class Controlador_Login implements ActionListener{
    private Login login;
    //Variables auxiliares
        public static String aux;
    //variables auxiliares
        
    //Intenacias
    ConexionBD co= new ConexionBD();
    DAO_Usuario du= new DAO_Usuario();
    //Fin de las instancias
    
    
    public Controlador_Login(Login login) {
        this.login = login;
        
        //Inicio de bototes de login
        this.login.Crear_Usuario.addActionListener(this);
        this.login.Iniciar_Sesion.addActionListener(this);
        this.login.Olvido_Contrasena.addActionListener(this);
        ///fin de botones de login
        //inicio de botones de registrar
        
        //fin de botones de registrar
        //Inicio de botones de Cambiar_Contraseña
        
        //Fin de botones de cambiar contradesña
    }
  
    public void iniciar (){
        login.setTitle("Login"); //El titulo que tendra en la ventana
        login.setLocationRelativeTo(null); //Para que se inicie la ventana en el centro
        login.setResizable(false);
        login.setVisible(true);
    }

    public String dame_usuario(){
        return Controlador_Login.aux;
    }
 
    public String toma_tu_valor(){
        return Controlador_Login.aux;
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {

    if(ae.getSource()==login.Crear_Usuario){
        Registrar_Usuario_Dos rud= new Registrar_Usuario_Dos();
         Controlador_Registrar cr=new Controlador_Registrar(rud);
         cr.iniciar();
         rud.setVisible(true);  
         login.setVisible(false);
    }
    if(ae.getSource() == login.Iniciar_Sesion) {
        if(login.Usuario.getText().isEmpty()) {// Verifica si el campo de usuario está vacío
            JOptionPane.showMessageDialog(null,"Error de campo: Usuario vacio");   
        } else {
            if(login.Contrasena.getText().isEmpty()) {// Verifica si el campo de contraseña está vacío, Mensaje
                JOptionPane.showMessageDialog(null,"Error de campo:Contraseña vacia");
            } else {
                if (co.verificarConexion()){ //Verifica si esta abierta la conexion con la BD
                    if (du.Existencia(login.Usuario.getText(), 1) || du.Existencia(login.Usuario.getText(), 2)) { //verifica existencia del usuario
                        if(du.existe_Usuario_Y_Contraseña(login.Usuario.getText(), 
                        login.Contrasena.getText(),1) || du.existe_Usuario_Y_Contraseña(login.Usuario.getText(), 
                        login.Contrasena.getText(),2)){  //Verificar si el usuario introdujo la contraseña correcta
                           if(login.Usuario.getText().equals("admin") || login.Usuario.getText().equals("admin@gmail.com")){ 
                                Principal p = new Principal();
                                Controlador_Admin cp = new Controlador_Admin(p,login.Usuario.getText());
                                cp.iniciar();
                                p.setVisible(true);
                                login.setVisible(false);
                           }else {
                               if(du.Toma_Tu_Valor(login.Usuario.getText(), 6)==1){

                                   switch(du.Toma_Tu_Valor_String(login.Usuario.getText(), 14)){
                                       case "F":
                                           Perfil_Free pf= new Perfil_Free();
                                           Controlador_PF cpf= new Controlador_PF(pf, login.Usuario.getText());
                                           cpf.iniciar();
                                           pf.setVisible(true);
                                           login.setVisible(false);
                                           break;
                                        
                                       case "G":
                                           Perfil_Gold pg= new Perfil_Gold();
                                           Controlador_PG cpg= new Controlador_PG(pg, login.Usuario.getText());
                                           cpg.iniciar();
                                           pg.setVisible(true);
                                           login.setVisible(false);
                                           break;
                                           
                                       case "P":
                                           Perfil_Premium pp= new Perfil_Premium();
                                           Controlador_PP cpp= new Controlador_PP(pp, login.Usuario.getText());
                                           cpp.iniciar();
                                           pp.setVisible(true);
                                           login.setVisible(false);
                                           break;
                                           
                                       case "V":
                                           Perfil_Vip pv= new Perfil_Vip();
                                           Controlador_PV cpv= new Controlador_PV(pv, login.Usuario.getText());
                                           cpv.iniciar();
                                           pv.setVisible(true);
                                           login.setVisible(false);
                                           break;                                           
                                   }
                                } else {
                                   JOptionPane.showMessageDialog(null,"Error: Por favor renovar suscripción.");
                               }
                           }
                        }else {
                            JOptionPane.showMessageDialog(null,"Error: Contraseña incorrecta");
                        }//Fin de verificar si el usuario introdujo la contraseña correcta   
                    }else {
                        JOptionPane.showMessageDialog(null,"Error de Existencia: Usuario no existe");
                    }//fin de verifica existencia del usuario    
                } else{
                    JOptionPane.showMessageDialog(null,"Error de conexion con la BD");
                }//Fin de verifica si esta abierta la conexion con la BD
            }// El campo de contraseña está vacío, Mensaje
        }// Verifica si el campo de contraseña está vacío, Mensaje
    }
   
    
        
    if(ae.getSource()==login.Olvido_Contrasena){
         Cambiar_Contrasena cc= new Cambiar_Contrasena();
         Controlador_Contrasena ccon=new Controlador_Contrasena(cc);
         ccon.iniciar();
         cc.setVisible(true);       
         login.setVisible(false);         
    }
}
}