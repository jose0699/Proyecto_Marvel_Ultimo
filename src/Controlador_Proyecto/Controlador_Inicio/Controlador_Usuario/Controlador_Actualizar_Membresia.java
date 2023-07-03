/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador_Proyecto.Controlador_Inicio.Controlador_Usuario;

//Controladores
    import Controlador_Proyecto.Controlador_Inicio.Controlador_Usuario.Controlador_Membresia;
//Fin de Controladores
//Modelo
    import Modelo.DAO_Usuario;
//Fin de modelo
//Vistas
    import Vista.Usuario.Membresia_Actualizar;
    import Vista.Usuario.Membresia;

//Fin de vistas
//Librerias
    import java.awt.event.ActionListener;
    import javax.swing.JOptionPane;
    import java.awt.event.ActionEvent;
//Fin de Librerias


//Fin de vistas
/**
 * @author José Luis López
 */

public class Controlador_Actualizar_Membresia implements ActionListener{
    
    private Membresia_Actualizar ma;
    public static String usuario_principal;
    
    //Instanciar
        DAO_Usuario du= new DAO_Usuario();
    //Fin de instanciar
    
    public Controlador_Actualizar_Membresia (Membresia_Actualizar ma, String usu){
        this.ma= ma;
        Controlador_Actualizar_Membresia.usuario_principal=usu;
        
        //Botones
            this.ma.Regresar.addActionListener(this);
            this.ma.Actualizar.addActionListener(this);
        //Fin de botones
    }
    
    public void iniciar_Usu (){
        ma.setTitle("Cambiar membresia"); //El titulo que tendra en la ventana
        ma.setLocationRelativeTo(null); //Para que se inicie la ventana en el centro
    }
    
    /*Aui llama una funcion para que te imprima el numero de tarjeta de credito para
    para pagar la membresia*/
    
    public void tarjeta(String valor){
        String aux;
        aux=du.Toma_Tu_Valor_String(valor, 10);
        ma.Nro_Tarjeta.setText(aux);
    }
    
    /*En la siguiente funcion sera necesarop para insertar perfiles extras segun el plan
    buscara el perfil y crear cuantos perfiles sea necesario se necesitara el usuario, la rep
    es una variable global static para saber cuantas veces necesita repetirse y hasta es dado 
    a la cantidad de perfiles que posee el usuario
     */
    public void perfil(String usuario, int rep, int hasta){
        while(hasta > rep){
            rep++;
            String aux= String.valueOf(rep);
            String nombre_perfil = "Perfil "+aux;
            du.crearperfil(nombre_perfil, usuario);
        }              
    }

/*  Aqui simplemente separo segun el tipo de membresia, entonces llama la funcion de perfil
    para poder crear la cantidad adecuada de perfiles segun el tipo de membreisa 
    (termina la mensualidad dado que cambio la membresia, entonces cambia la fecha_fin
    y coloca la fecha actual y levanta otra mensualidad). 
    ActualizarFechaFin= Actualiza tabla mensualida en fecha_fin null a fecha la fecha actual
    Insertar_Mensualidad=Crea una nueva mensualidad
*/
    
    public void ayudante(String aux){
        switch(aux) {          
            case "Free":
                du.actualizarFechaFin(usuario_principal);
                du.insertar_mensaulidad(usuario_principal, 1);
            break;
                    
            case "Gold":
                du.actualizarFechaFin(usuario_principal);
                du.insertar_mensaulidad(usuario_principal, 2);                
                perfil(usuario_principal, du.Toma_Tu_Valor(usuario_principal, 5), 2);            
            break;
                    
            case "Premium":
                du.actualizarFechaFin(usuario_principal);
                du.insertar_mensaulidad(usuario_principal, 3);               
                perfil(usuario_principal, du.Toma_Tu_Valor(usuario_principal, 5), 3);                    
            break;
                    
            case "VIP":
                du.actualizarFechaFin(usuario_principal);
                du.insertar_mensaulidad(usuario_principal, 4);                
                perfil(usuario_principal, du.Toma_Tu_Valor(usuario_principal, 5), 5);
            break;
                    
            case "None":
                JOptionPane.showMessageDialog(null, "Error: Seleccionar un tipo de membresia");
            break;
        }
    }
     
    @Override
    public void actionPerformed(ActionEvent ae) {  
        if(ae.getSource()== ma.Actualizar){
            if(ma.Tipo_membresia.getSelectedItem().equals("None")){
                JOptionPane.showMessageDialog(null,"Error: Seleccionar un tipo de membresia");
            }else {
                String aux=(String) ma.Tipo_membresia.getSelectedItem();
                ayudante(aux);
                Membresia me= new Membresia();
                Controlador_Membresia cm= new Controlador_Membresia(me, usuario_principal);
                cm.mostrar_membresia(usuario_principal);
                cm.iniciar_Usua();
                me.setVisible(true);
                ma.setVisible(false);
            }
        }
        
        if(ae.getSource()== ma.Regresar){
                Membresia me= new Membresia();
                Controlador_Membresia cm= new Controlador_Membresia(me, usuario_principal);
                cm.mostrar_membresia(usuario_principal);
                cm.iniciar_Usua();
                me.setVisible(true);
                ma.setVisible(false);  
        }
    }
}
