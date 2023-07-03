/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador_Proyecto.Controlador_Inicio.PT;

//Controladores
    import Controlador_Proyecto.Controlador_Inicio.Controlador_Admin.Controlador_Admin;
    import Controlador_Proyecto.Controlador_Inicio.Controlador_Login;
    import Controlador_Proyecto.Controlador_Inicio.Controlador_Usuario.Controlador_Principal;
//Fin de controladores
//Vistas
    import Vista.Login;
    import Vista.Usuario.Principal_us;
    import Vista.Admin.Principal;
    import Vista.Principal.Principal_Principal;
    import Vista.Principal.Perfil_Gold;
//Fin de Vistas
//Librerias
    import java.awt.event.ActionEvent;
    import java.awt.event.ActionListener;
//Fin de librerias
/**
 *
 * @author José Luis López
 */
public class Controlador_PG implements ActionListener {
    private Perfil_Gold pg;
    public static String usuario_principal;
    
    public Controlador_PG(Perfil_Gold pg, String usu){
        this.pg=pg;
        usuario_principal=usu;
        //Inicio de botones
            this.pg.AC_G.addActionListener(this);
            this.pg.PG_1.addActionListener(this);
            this.pg.PG_2.addActionListener(this);
            this.pg.S_G.addActionListener(this);
        //Fin de botones
    }
    
        /*
        iniciar= simplemente hace que no se pueda ni agrandar la imagen y la centra en el medio de la pantaña
    */
    public void iniciar (){
        pg.setTitle("Perfil"); //El titulo que tendra en la ventana
        pg.setLocationRelativeTo(null); //Para que se inicie la ventana en el centro
        pg.setResizable(false);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==pg.AC_G){
            if(usuario_principal.equals("admin") || usuario_principal.equals("admin@gmail.com")){
                Principal p= new Principal();
                Controlador_Admin ca= new Controlador_Admin(p, usuario_principal);
                ca.iniciar();
                p.setVisible(true);
                pg.setVisible(false);
            }else{
                Principal_us pu= new Principal_us();
                Controlador_Principal cp= new Controlador_Principal(pu,usuario_principal);
                cp.iniciar_Usu();
                pu.setVisible(true);
                pg.setVisible(false);
            }            
        }
        
        if(ae.getSource()==pg.PG_1){
            
        }
        
        if(ae.getSource()==pg.PG_2){
            
        }
        
        if(ae.getSource()==pg.S_G){
            Login l= new Login();
            Controlador_Login cl= new Controlador_Login(l);
            cl.iniciar();
            l.setVisible(true);
            pg.setVisible(false);            
        }
    }
    
}
