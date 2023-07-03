/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador_Proyecto.Controlador_Inicio.Controlador_Usuario;

//Controladores
    import Controlador_Proyecto.Controlador_Inicio.Controlador_Usuario.Controlador_Principal;
    import Controlador_Proyecto.Controlador_Inicio.Controlador_Usuario.Actualizar_per;
//Fin de controladores
//Vistas
   import Vista.Usuario.Principal_us;
    import Vista.Usuario.Perfil;
    import Vista.Usuario.Actualizar_Perfil;

//Fin de vistas
    import java.awt.event.ActionEvent;
    import java.awt.event.ActionListener;
//librerias

//fin de librerias
/**
 *
 * @author José Luis López
 */
public class Controlador_Perfiles implements ActionListener {
    private Perfil perfil;
    public static String usuario_principal;
    
    public Controlador_Perfiles(Perfil perfil, String usu){
        this.perfil=perfil;
        Controlador_Perfiles.usuario_principal=usu;
        
        //Botones
            this.perfil.Regresar.addActionListener(this);
            this.perfil.Actualizar.addActionListener(this);
        //Fin de botones
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()== perfil.Regresar){
            Principal_us p= new Principal_us();
            Controlador_Principal cp= new Controlador_Principal(p, usuario_principal);
            cp.iniciar_Usu();
            p.setVisible(true);
            perfil.setVisible(false);
        }
        
        if(ae.getSource()== perfil.Actualizar){
            Actualizar_Perfil ap= new Actualizar_Perfil();
            Actualizar_per a= new Actualizar_per(ap, usuario_principal, perfil.perfiles.getSelectedIndex());
            ap.setVisible(true);
            perfil.setVisible(false);
        }
    }
}
