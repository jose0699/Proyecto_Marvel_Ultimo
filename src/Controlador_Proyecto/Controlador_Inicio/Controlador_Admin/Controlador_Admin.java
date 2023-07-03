/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador_Proyecto.Controlador_Inicio.Controlador_Admin;

//Controladores
    import Controlador_Proyecto.Controlador_Inicio.Controlador_Login;
    import Controlador_Proyecto.Controlador_Inicio.Controlador_Principal.Controlado_Personaje;
    import Controlador_Proyecto.Controlador_Inicio.Controlador_Principal.Controlador_Admind_Usuario;
    import Controlador_Proyecto.Controlador_Inicio.Controlador_Principal.Controlador_Medio;
    import Controlador_Proyecto.Controlador_Inicio.Controlador_Usuario.Controlador_Principal;
    import Controlador_Proyecto.Controlador_Inicio.Controlador_Principal.Controlador_Persona;
//Fin de controladores

//Modelos
import Modelo.ConexionBD;
import Modelo.DAO_Usuario;
import Modelo.Dao_Admin;
//Fin de Modelos

//Vistas
import Vista.Login;
//Vista para los principales CRUD
import Vista.Admin.Principal;
import Vista.Admin.Medio;
import Vista.Admin.Persona;
import Vista.Admin.Personaje;
import Vista.Admin.Principal;
import Vista.Admin.Usuario;
import Vista.Usuario.Principal_us;
//Vista para los principales CRUD
//Fin de Vistas

//Librerias
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

//Fin de Librerias
/**
 *
 * @author José Luis López
 */
public class Controlador_Admin implements ActionListener {
    private Principal principal;
    public static String us;
    //Instanciar los modelos
        ConexionBD co= new ConexionBD();
        DAO_Usuario du= new DAO_Usuario();
        Dao_Admin da= new Dao_Admin();
    //Fin de instanciar los modelos
        
    public Controlador_Admin(Principal principal, String usuario) {
        this.principal = principal;
        Controlador_Admin.us=usuario;
        
        //Botones
        this.principal.Medio.addActionListener(this);
        this.principal.Persona.addActionListener(this);
        this.principal.Personaje.addActionListener(this);
        this.principal.Usuario.addActionListener(this);
        this.principal.Salir.addActionListener(this);
        this.principal.Salir2.addActionListener(this);
    }
    
    public void iniciar (){
        principal.setTitle("Menu de configuraciones Admin"); //El titulo que tendra en la ventana
        principal.setLocationRelativeTo(null); //Para que se inicie la ventana en el centro
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==principal.Medio){
            Medio me= new Medio();
            Controlador_Medio cm= new Controlador_Medio(me, us);
            cm.iniciar();
            me.setVisible(true);
            principal.setVisible(false);
        }
        
        if(ae.getSource()==principal.Persona){
            Persona per= new Persona();
            Controlador_Persona cper= new Controlador_Persona(per, us);
            cper.iniciar();
            per.setVisible(true);
            principal.setVisible(false);
        }
        
        if(ae.getSource()==principal.Personaje){
            Personaje pe= new Personaje();
            Controlado_Personaje cp= new Controlado_Personaje(pe, us);
            cp.iniciar();
            pe.setVisible(true);
            principal.setVisible(false);
        }
        
        if(ae.getSource()==principal.Usuario){
            Usuario usa= new Usuario();
            Controlador_Admind_Usuario cdu = new Controlador_Admind_Usuario(usa, Controlador_Admin.us);
            cdu.iniciar();
            usa.setVisible(true);
            principal.setVisible(false);
        }
        
        if(ae.getSource()==principal.Salir2){
            Principal_us pu= new Principal_us();
            Controlador_Principal cp= new Controlador_Principal(pu, Controlador_Admin.us );
            pu.Salir.setText("Regresar");
            pu.setVisible(true);
            principal.setVisible(false);
        }
        
        if(ae.getSource()== principal.Salir){
            Login login=new Login();
            Controlador_Login cl= new Controlador_Login(login);
            cl.iniciar();
            login.setVisible(true);
            principal.setVisible(false);
        }
    
    }
}
