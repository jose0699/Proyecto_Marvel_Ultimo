/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador_Proyecto.Controlador_Inicio.Controlador_Principal;

//Controladores
    import Controlador_Proyecto.Controlador_Inicio.Controlador_Admin.Controlador_Admin;
//Fin de controladores
//Vistas 
    import Vista.Admin.Principal;
    import Vista.Admin.Medio;
//fin de Vistas
import java.awt.event.ActionEvent;
//Fin de vista
//Librerias
import java.awt.event.ActionListener;

//Finde librerias
//Fin de vistas
/**
 *
 * @author José Luis López
 */
public class Controlador_Medio implements ActionListener {
    private Medio medio;
    public static String usuario_principal;
    
    public Controlador_Medio (Medio medio, String usu){
        this.medio=medio;
        Controlador_Medio.usuario_principal=usu;
        
        //Botones
            this.medio.Regresar.addActionListener(this);
        //Fin de botones
    }
    
    public void iniciar (){
        medio.setTitle("CRUD de Medio"); //El titulo que tendra en la ventana
        medio.setLocationRelativeTo(null); //Para que se inicie la ventana en el centro
    }
      
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==medio.Regresar){
            Principal p= new Principal();
            Controlador_Admin ca= new Controlador_Admin(p, usuario_principal);
            ca.iniciar();
            p.setVisible(true);
            medio.setVisible(false);            
        }
    }
}
