/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador_Proyecto.Controlador_Inicio.Controlador_Usuario;

//Controladores
    import Controlador_Proyecto.Controlador_Inicio.Controlador_Login;
    import Controlador_Proyecto.Controlador_Inicio.Controlador_Registrar;
    import static Controlador_Proyecto.Controlador_Inicio.Controlador_Registrar.genero;
    import static Controlador_Proyecto.Controlador_Inicio.Controlador_Registrar.membresia;
    import Controlador_Proyecto.Controlador_Inicio.Controlador_Usuario.Controlador_Usuario;
    import Controlador_Proyecto.Controlador_Inicio.Controlador_Principal.Controlador_Admind_Usuario;
//Fin de controladores
//Vistas
    import Vista.Usuario.Usuario_Actualizar;
    import Vista.Usuario.Usuario_us;
    import Vista.Admin.Usuario;
//Fin de Vistas
//Comienzo de modelo
    import Modelo.DAO_Usuario;
    import Modelo.ConexionBD;
//Librerias
    import java.awt.event.ActionEvent;
    import java.time.LocalDate;
    import java.time.Period;
    import java.time.format.DateTimeFormatter;
    import java.util.Calendar;
    import javax.swing.JOptionPane;
    import java.awt.event.ActionListener;

//Fin de librerias
/**
 *
 * @author José Luis López
 */
public class Controlador_Actualizar_Usuario implements ActionListener{
    private Usuario_Actualizar usuario_actualiza;
    public static String usuarioa_principal;
    //Instanciar
        DAO_Usuario du= new DAO_Usuario();
        ConexionBD co= new ConexionBD();
    //Fin de instancia
        
    public Controlador_Actualizar_Usuario(Usuario_Actualizar usuario_actualiza, String usu){
        this.usuario_actualiza=usuario_actualiza;
        Controlador_Actualizar_Usuario.usuarioa_principal=usu;
        //Botones
            this.usuario_actualiza.Regresar.addActionListener(this);
            this.usuario_actualiza.Actualizar.addActionListener(this);
        //Fin de botnoes
    }
    
    public boolean validarEdad(String dia, String mes, String anio) {
    LocalDate fechaNacimiento = LocalDate.of(Integer.parseInt(anio), Integer.parseInt(mes), Integer.parseInt(dia));
    LocalDate fechaActual = LocalDate.now();
    int edad = Period.between(fechaNacimiento, fechaActual).getYears();
    if (edad < 18) {
        JOptionPane.showMessageDialog(null, "Error: Debe ser mayor de 18 años");
        return false;
    }
    return true;
}
    
       public boolean Fecha_Usuario(String d, String m, String a) {
       int aux= Calendar.getInstance().get(Calendar.YEAR),
           aux2=Calendar.getInstance().get(Calendar.DAY_OF_MONTH),
           aux3=Calendar.getInstance().get(Calendar.MONTH),
           dia = Integer.parseInt(d),
           mes = Integer.parseInt(m),
           anio = Integer.parseInt(a);

       if( d.isEmpty() || m.isEmpty() || a.isEmpty()){
            JOptionPane.showMessageDialog(null,"Error: Fecha incompleta");
            return false;
      
       } else {
            if(validarEdad(d,m,a)==false ){
                return false;
            } else {
                if ((dia>=1 && dia<=31) && (mes<=12 && mes>=1)){
                    if (anio % 2 == 0 ){
                        int[] diasPorMes = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; 
                        if(diasPorMes[mes-1]>=dia){
                            return true; 
                        }else{
                            JOptionPane.showMessageDialog(null,"Error: Dia del mes supera lo permitido");
                            return false;
                        }
                    } else {
                        int[] diasPorMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
                    
                        if(diasPorMes[mes-1]>=dia){
                            return true;
                        }else{
                            JOptionPane.showMessageDialog(null,"Error: Dia del mes supera lo permitido");
                            return false;
                        }
                    }            
                } else {
                    JOptionPane.showMessageDialog(null,"Error campo: Fecha erronea (dia, mes o año)");
                    return false;
                }
            }
       }
}
       
    public boolean Comprobacion_Actualizar (String comprobar, String campo, int caso){
   
    if((comprobar == null || comprobar.isEmpty())){ //Comprobar vacio caso 
        JOptionPane.showMessageDialog(null,"Error de campo: Falto llenar "+campo);
        return false;
    }else {
      switch(caso) { //Comienzo del switch
            
            case 1: //Caso valido solo para usuario, Primer_Nomrbre, Segundo_Nombre,Primer Appellido, Segundo_Apellido y contraseña
                if(comprobar.length() > 60) { //Comprueba el tamaño maximo del usuario, nombre y contraseña
                    JOptionPane.showMessageDialog(null, "Error de campo: Supero el MAX permito en " + campo);
                    return false;
                } else {
                    return true;
                }
                
            case 2: //Caso valido para correo_electronico
                if(comprobar.length() > 256) { //Comprueba el tamaño maximo del correo electronico
                    JOptionPane.showMessageDialog(null,"Error de campo: Supero el MAX permito en " + campo);
                    return false;
                } else {
                    if (comprobar.endsWith("@gmail.com") || comprobar.endsWith("@hotmail.com") || comprobar.endsWith("@outlook.com")) {
                        return true;
                    } else {
                        JOptionPane.showMessageDialog(null, "Error: Correo electrónico debe ser de tipo: gmail.com, Outlook.com o hotmail.com");
                        return false;
                    }     
                }
                
            case 3: //Caso para validar si el genero es el indicado
                if(comprobar.equals("None") || comprobar.equals("Femenino") || comprobar.equals("Masculino")
                   || comprobar.equals("Otros") || comprobar.equals("Desnocido")) {
               
                    /*Nota se usara una variable global para asi aprovechar la funcion
                    Femenino=F, Masculino= M, Desconocido=D
                    Otros=O y None=Error*/
                                 
                    if(comprobar.equals("Femenino")) {
                        Controlador_Registrar.genero = "F";
                        return true;
                    }
                    
                    if(comprobar.equals("Masculino")) {
                        Controlador_Registrar.genero = "M";
                        return true;
                    }
                    
                    if(comprobar.equals("Otros")) {
                        Controlador_Registrar.genero = "O";
                        return true;
                    }
                    
                    if(comprobar.equals("Desnocido")) {
                        Controlador_Registrar.genero = "D";
                        return true;
                    }
                    JOptionPane.showMessageDialog(null,"Error: Seleccionar un genero");
                    return false;
                } else {
                    JOptionPane.showMessageDialog(null,"Error de campo: Genero invalido ");
                    return false;
                }
            
            case 4: //Comrpobar si el numero de tarjeta cumple con los correquisitos del mercado
                if ((comprobar.length()>=13 && comprobar.length()<=18) && (comprobar.matches("\\d+"))){
                    return true;
                }else{
                    JOptionPane.showMessageDialog(null,"Error: Numero de tarjeta invalido");
                    return false;
                }
            
            case 5: //Verifica el tipo de membresia para luego utilizarlo en el insert
                if(comprobar.equals("Free")) {
                        Controlador_Registrar.membresia = "F";
                        return true;
                    }
                    
                    if(comprobar.equals("Gold")) {
                        Controlador_Registrar.membresia = "G";
                        return true;
                    }
                    
                    if(comprobar.equals("Premium")) {
                        Controlador_Registrar.membresia = "P";
                        return true;
                    }
                    
                    if(comprobar.equals("Vip")) {
                        Controlador_Registrar.membresia = "V";
                        return true;
                    }
            break;    
        default:
            JOptionPane.showMessageDialog(null,"Error Fatal");
            return false;
        } //Fin de switch       
    }//Fin de comprobar vacio     
        return false;
}

     
    public void iniciar_Usu (){
        usuario_actualiza.setTitle("CRUD actualizar usuario"); //El titulo que tendra en la ventana
        usuario_actualiza.setLocationRelativeTo(null); //Para que se inicie la ventana en el centro
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        
        if(ae.getSource()== usuario_actualiza.Actualizar){
            if(Comprobacion_Actualizar(usuario_actualiza.Primer_Nombre.getText(),"Primer nombre",1) &&
               Comprobacion_Actualizar(usuario_actualiza.Primer_Apellido.getText(),"Segundo nombre",1)){// comienzo de comprobar nombre y apellido
                if(usuario_actualiza.dia.getText().isEmpty()||
                   usuario_actualiza.mes.getText().isEmpty()||
                   usuario_actualiza.año.getText().isEmpty()){ //Comprobar que fecha no este vacio
                    JOptionPane.showMessageDialog(null,"Error campo: Fecha no puede estar vacia");
                } else {
                    if(!usuario_actualiza.dia.getText().matches("\\d+") ||
                        !usuario_actualiza.mes.getText().matches("\\d+") ||
                        !usuario_actualiza.año.getText().matches("\\d+")){ //comprobar que fecha tenga valores numericos
                        JOptionPane.showMessageDialog(null,"Error campo: Fecha solo puede contener valores numericos");
                    }else {
                        if (Fecha_Usuario(usuario_actualiza.dia.getText(),usuario_actualiza.mes.getText(),usuario_actualiza.año.getText())){ //Manejar que la fecha sea correcta segun el calendario greco-romano
                            if (du.Existencia ((String) usuario_actualiza.Pais.getSelectedItem(), 3) &&
                                Comprobacion_Actualizar((String) usuario_actualiza.Genero.getSelectedItem(),"Genero", 3)){//Verificar si el usuario seleccino una opcion
                                if(du.Existencia(usuario_actualiza.usuario.getText(), 1)){ //comprobar existencia de usuario
                                    JOptionPane.showMessageDialog(null,"Error: Usuario ya existe");
                                }else{
                                    if(du.Existencia(usuario_actualiza.correo.getText(), 2)){//comprobar si existe correo
                                        JOptionPane.showMessageDialog(null,"Error: Usuario ya existe");   
                                    }else{
                                        if(Comprobacion_Actualizar(usuario_actualiza.usuario.getText(),"Usuario",1) &&
                                        Comprobacion_Actualizar(usuario_actualiza.correo.getText(),"correo electronico",2) &&
                                        Comprobacion_Actualizar(usuario_actualiza.contraseña.getText(),"contraseña",1) &&
                                        Comprobacion_Actualizar(usuario_actualiza.Nro_Tarjeta.getText(),"el numero tarjeta de credito invalido",4)){
                                            // Obtener la fecha actual
                                                LocalDate fechaActual = LocalDate.now();

                                            // Formatear la fecha en formato aaaa/mm/dd
                                                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
                                                String fechaActualFormateada = fechaActual.format(formatter);
                                                String fecha_nac= usuario_actualiza.dia.getText()+"/"+
                                                                  usuario_actualiza.mes.getText()+"/"+
                                                                  usuario_actualiza.año.getText();
    
                                            if(usuarioa_principal.equals("admin")){
                                                String pais_insert= (String) usuario_actualiza.Pais.getSelectedItem();
                                                String aux= (String) usuario_actualiza.Genero.getSelectedItem();
                                                String fecha = usuario_actualiza.año.getText()+"/"+usuario_actualiza.mes.getText()+"/"+usuario_actualiza.dia.getText();
                                                
                                                Usuario us= new Usuario();
                                                Controlador_Admind_Usuario cau= new Controlador_Admind_Usuario(us, usuarioa_principal);
                                                cau.iniciar();
                                                du.Actualizar_Usuario(usuario_actualiza.usuario.getText(), usuario_actualiza.correo.getText(),
                                                        usuario_actualiza.Primer_Nombre.getText(),"",usuario_actualiza.Primer_Apellido.getText(),
                                                        "", usuario_actualiza.contraseña.getText(),  fecha      , aux, usuario_actualiza.Nro_Tarjeta.getText(),
                                                        du.Toma_Tu_Valor(pais_insert, 1)); 
                                                
                                            } else{
                                                String pais_insert= (String) usuario_actualiza.Pais.getSelectedItem();
                                                String aux= (String) usuario_actualiza.Genero.getSelectedItem();
                                                String fecha = usuario_actualiza.año.getText()+"/"+usuario_actualiza.mes.getText()+"/"+usuario_actualiza.dia.getText();
                                                        
                                                Usuario_us us= new Usuario_us();                                             
                                                Controlador_Usuario cu= new Controlador_Usuario(us, usuario_actualiza.usuario.getText());
                                                cu.iniciar_admin();
                                                
                                                du.Actualizar_Usuario(usuario_actualiza.usuario.getText(), usuario_actualiza.correo.getText(),
                                                        usuario_actualiza.Primer_Nombre.getText(),"",usuario_actualiza.Primer_Apellido.getText(),
                                                        "", usuario_actualiza.contraseña.getText(),  fecha      , aux, usuario_actualiza.Nro_Tarjeta.getText(),
                                                        du.Toma_Tu_Valor(pais_insert, 1));                                                        
                                                us.setVisible(true);
                                                usuario_actualiza.setVisible(false); 
                                            }
                                        }
                                    }//comprobar si existe correo
                                }//comprobar existencia del usuario                                
                            }//Verificar si el usuario seleccino una opcion
                        }//Fin de manejar que la fecha sea correcta segun el calendario greco-romano
                    }//comprobar que fecha solo tenga valores numericos
                }//Comprobar que fecha no este vacio
            }//Fin de comprobar nombre y apellido    
        } 
        
        if(ae.getSource()== usuario_actualiza.Regresar){
            if(usuarioa_principal.equals("admin")){
                Usuario us= new Usuario();
                Controlador_Admind_Usuario cau= new Controlador_Admind_Usuario(us, usuarioa_principal);
                cau.iniciar();
                us.setVisible(true);
                usuario_actualiza.setVisible(false);
            }else {
                Usuario_us us= new Usuario_us();
                Controlador_Usuario cu= new Controlador_Usuario(us, usuarioa_principal);
                du.Imprimir_Usuario_2(usuarioa_principal, us, 1);                
                cu.iniciar_admin();
                us.setVisible(true);            
                usuario_actualiza.setVisible(false); 
            }        
        }
    }
}
