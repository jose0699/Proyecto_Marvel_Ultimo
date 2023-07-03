/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador_Proyecto.Controlador_Inicio.Controlador_Usuario;

//Modelos
    import Modelo.DAO_Usuario;
//Fin de modelos
//Controladores
    import Controlador_Proyecto.Controlador_Inicio.Controlador_Usuario.Controlador_Principal;
    import Controlador_Proyecto.Controlador_Inicio.Controlador_Usuario.Controlador_Actualizar_Membresia;
    import Controlador_Proyecto.Controlador_Inicio.Controlador_Login;
//fin de controladores
//Vista
    import Vista.Usuario.Membresia;
    import Vista.Usuario.Membresia_Actualizar;
    import Vista.Usuario.Principal_us;
    import Vista.Login;
//fin de vista
//Librerias
    import java.awt.event.ActionListener;
    import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

//fin de librerias

/**
 *
 * @author José Luis López
 */
public class Controlador_Membresia implements ActionListener {
    private Membresia membresia;
    public static String usuario_principal;
    
    //intancia
        DAO_Usuario du= new DAO_Usuario();
    //fin de instancia
    
    public Controlador_Membresia(Membresia membresia, String usa){
        Controlador_Membresia.usuario_principal=usa;
        this.membresia=membresia;
        
        //Botones
            this.membresia.Salir.addActionListener(this);
            this.membresia.Actualizar.addActionListener(this);
            this.membresia.Eliminar.addActionListener(this);
        //fin de botones
    }
    
    public void mostrar_membresia(String valor_buscador){
        int aux2= du.Toma_Tu_Valor( valor_buscador, 2);
        switch(aux2){
            case 1:
                membresia.Tipo.setText("Free");
                membresia.Precio.setText("0");
                break;
                
            case 2:
                membresia.Tipo.setText("Gold");
                membresia.Precio.setText("4.99");
                break;
            case 3:
                membresia.Tipo.setText("Premium");
                membresia.Precio.setText("9.99");
                break;
                
            case 4:
                membresia.Tipo.setText("VIP");
                membresia.Precio.setText("14.99");
                break;
        }
    }
 
    
    public void iniciar_Usua (){
        membresia.setTitle("Membresia"); //El titulo que tendra en la ventana
        membresia.setLocationRelativeTo(null); //Para que se inicie la ventana en el centro
    }
   
       
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()== membresia.Eliminar){
            du.Borrar_Usuario(usuario_principal);
            Login l= new Login();
            Controlador_Login cl= new Controlador_Login(l);
            l.setVisible(true);
            membresia.setVisible(false);
            JOptionPane.showMessageDialog(null,"Muchas gracias por usar nuestros servicios. PD: Te queremos :)");
        }
        
        if(ae.getSource()== membresia.Actualizar){
             if(usuario_principal.equals("admin")){
               JOptionPane.showMessageDialog(null,"Error: Eres administrador no necesitas cambiar membresia");
            } else {
                Membresia_Actualizar  ma= new Membresia_Actualizar();
                Controlador_Actualizar_Membresia cm= new Controlador_Actualizar_Membresia(ma, usuario_principal);
                cm.tarjeta(usuario_principal);
                cm.iniciar_Usu();
                ma.setVisible(true);
                membresia.setVisible(false);
            }   
        }
        
        if(ae.getSource()== membresia.Salir){
            if(usuario_principal.equals("admin")){
                Principal_us pu= new Principal_us();
                Controlador_Principal cp= new Controlador_Principal(pu, Controlador_Membresia.usuario_principal);
                cp.iniciar_Admin();
                pu.setVisible(true);
                membresia.setVisible(false);
            }else{
                Principal_us pu= new Principal_us();
                Controlador_Principal cp= new Controlador_Principal(pu, Controlador_Membresia.usuario_principal);
                cp.iniciar_Usu();
                pu.setVisible(true);
                membresia.setVisible(false);
            }
        }
    }
 
}
