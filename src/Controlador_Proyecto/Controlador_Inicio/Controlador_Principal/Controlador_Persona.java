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
import Vista.Admin.Persona;
//Fin de vista

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author José Luis López
 */
public class Controlador_Persona implements ActionListener{
    private Persona persona;
    public static String usuario_principal;
    public Controlador_Persona (Persona persona, String usu){
        
        this.persona=persona;
        Controlador_Persona.usuario_principal=usu;
        
        //Botones
            this.persona.Regresar.addActionListener(this);
        //Fin de botones
    }
    
    public void iniciar (){
        persona.setTitle("CRUD de Persona"); //El titulo que tendra en la ventana
        persona.setLocationRelativeTo(null); //Para que se inicie la ventana en el centro
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==persona.Regresar){
            Principal p= new Principal();
            Controlador_Admin ca= new Controlador_Admin(p, usuario_principal);
            ca.iniciar();
            p.setVisible(true);
            persona.setVisible(false);
            
        }
    }
}
