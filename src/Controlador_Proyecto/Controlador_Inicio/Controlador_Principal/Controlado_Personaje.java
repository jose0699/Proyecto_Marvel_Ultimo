/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador_Proyecto.Controlador_Inicio.Controlador_Principal;

//Controladores
    import Controlador_Proyecto.Controlador_Inicio.Controlador_Admin.Controlador_Admin;
//Fin de controladores
//Vistas
    import Vista.Admin.Personaje;
    import Vista.Admin.Principal;

//Fin de vistas
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author José Luis López
 */
public class Controlado_Personaje implements ActionListener{
    private Personaje personaje;
    public static String usuario_principal;
    public Controlado_Personaje (Personaje personaje, String usu){
        this.personaje = personaje;
        Controlado_Personaje.usuario_principal=usu;
            //Botones
                this.personaje.Regresar.addActionListener(this);
            //fin de botones
    }
    
    public void iniciar (){
        personaje.setTitle("CRUD de Personaje"); //El titulo que tendra en la ventana
        personaje.setLocationRelativeTo(null); //Para que se inicie la ventana en el centro
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()== personaje.Regresar){
            Principal p= new Principal();
            Controlador_Admin ca= new Controlador_Admin(p, usuario_principal);
            ca.iniciar();
            p.setVisible(true);
            personaje.setVisible(false);   
        }  
    }
}
