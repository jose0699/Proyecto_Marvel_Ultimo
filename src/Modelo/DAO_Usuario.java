/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

//Conexion a la base de datos
import Vista.Admin.Usuario;
//Fin de la conexion a la base de datos

//Librerias a utilizar
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.sql.CallableStatement;

import java.text.SimpleDateFormat;
import java.text.ParseException;

import static java.time.Clock.system;
import java.time.LocalDateTime;

import java.util.Date;

import javax.swing.JOptionPane;
//fin de librerias a utilizar
/**
 *
 * @author José Luis López
 */
public class DAO_Usuario {
    Usuario us= new Usuario();

//Aqui empieza a buscar existencia
    
public void mostrarDatosUsuario(String nombreUsuario) {
    Connection conn = null;
    PreparedStatement stmt = null;
    ResultSet rs = null;
    try {
        int aux; 
        String pais_nom = "";      
        conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Proyecto_Marvel", "postgres", "joseluis0699");
        stmt = conn.prepareStatement("SELECT * FROM Usuario WHERE Usuario = ?");
        stmt.setString(1, nombreUsuario);
        rs = stmt.executeQuery();
        if (rs.next()) {
            String correoElectronico = rs.getString("Correo_Electronico");
            String nombreCompleto = rs.getString("Primer_Nombre") + " " + rs.getString("Segundo_Nombre") + " " + 
                                    rs.getString("Primer_Apellido") + " " + rs.getString("Segundo_Apellido");
            String fechaNacimiento = rs.getString("Fecha_Nacimiento");
            String genero = rs.getString("Genero");
            String nroTarjeta = rs.getString("Nro_Tarjeta");
            int uidPais = rs.getInt("UID_Pais");
            
            // Establecer los valores de los JLabel correspondientes
            us.correo.setText(correoElectronico);
            us.Nombre.setText(nombreCompleto);
            us.fecha_nacimiento.setText(fechaNacimiento);
            us.genero.setText(genero);
            us.Nro_Tarjeta.setText(nroTarjeta);
            aux= Toma_Tu_Valor(nombreUsuario,3);
            pais_nom= String.valueOf(aux);
            us.pais.setText(String.valueOf(pais_nom));
        } else {
            // Si no se encuentra el usuario, mostrar un mensaje de error
            JOptionPane.showMessageDialog(null, "El usuario no existe");
        }
    } catch (SQLException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error al obtener datos del usuario");
    } finally {
        // Cerrar los recursos
        try { rs.close(); } catch (Exception e) {}
        try { stmt.close(); } catch (Exception e) {}
        try { conn.close(); } catch (Exception e) {}
    }
}

public int Toma_Tu_Valor (String valorBuscado, int caso){ // aqui simplemente busca el valor de la pk y lo convierte a string
    Connection conexion = null;
    PreparedStatement consulta = null;
    ResultSet resultado = null;
    String sql = null;
    String valorEncontrado = null;
    String nombre="";
    int valor = 0;
    switch (caso){
        case 1:
            sql="Select UID_Pais from pais where nombre= ? ;";
            break;
        
        case 2:    
            sql="Select codigo from membresia where tipo_membresia=? and Fecha_fin is NULL";
            break;
        
        case 3:
            sql="Select Nombre from pais where uid_pais=?";
    }
    
    String url = "jdbc:postgresql://localhost:5432/Proyecto_Marvel";
    String usuario = "postgres";
    String contrasena = "joseluis0699";
    
    try{
        conexion = DriverManager.getConnection(url, usuario, contrasena);
        consulta = conexion.prepareStatement(sql);        
        consulta.setString(1, valorBuscado);
        resultado = consulta.executeQuery(); //ejecuta el select
        
        if(caso==3){
            if (resultado.next()) {
                nombre=resultado.getString(1);
                valor = Integer.parseInt(nombre); //Obtiene el valor 
                return valor;
            }
        }else{

            if (resultado.next()) {
                valor = resultado.getInt(1); //Obtiene el valor 
                return valor;
            }
        }
    } catch (SQLException e) {
        System.err.println("Error al ejecutar la consulta: " + e.getMessage());
    } finally{
        // Cerrar objetos ResultSet, PreparedStatement y Connection
    }
    
    return valor;
}//busca el valor de la pk y lo convierte a string

    public boolean Existencia(String valorBuscado, int caso) { //Fin de verifica si existe en la tabla Usuario (Usuario o Correo) Y Pais(Nombre)
    boolean existe = false;
    Connection conexion = null;
    PreparedStatement consulta = null;
    ResultSet resultado, result  = null;
    String sql = null;
    
    switch(caso){
        
        case 1: //usuario
            sql = "SELECT COUNT(*) FROM Usuario WHERE Usuario = ?";
        break;
        
        case 2: //usuario
             sql = "SELECT COUNT(*) FROM Usuario WHERE Correo_Electronico = ?";
        break;
        
        case 3: //pais
            if(valorBuscado.equals("None")){
                JOptionPane.showMessageDialog(null,"Error: Seleccionar un pais");
                return false;
            } else {
                sql = "SELECT COUNT(*) FROM Pais WHERE Nombre = ?";
            }
        break;
        
        case 4: //Color
            sql = "SELECT COUNT(*) FROM Color WHERE Nombre = ?";
            break;
            
        case 5:  //Poder
            sql = "SELECT COUNT(*) FROM Poder WHERE Nombre = ?";
            break;
            
        case 6: //Ocupacion
            sql = "SELECT COUNT(*) FROM ocupacion WHERE Nombre = ?";
            break;
            
        case 7:// Organizacion
            sql = "SELECT COUNT(*) FROM organizacion WHERE Nombre = ?";
            break;
            
        case 8: //Plataforma
            sql = "SELECT COUNT(*) FROM plataforma  WHERE Nombre = ?";
            break;
            
        /* case 9: //membresia
            sql = "SELECT Fecha_fin FROM Membresia WHERE Usuario = ? ORDER BY Fecha_inicio DESC LIMIT 1;";
            try (PreparedStatement statement = conexion.prepareStatement(sql)) {
                statement.setString(1, valorBuscado);
                result = statement.executeQuery();
                if (result.next()) {
                    Date fechaFin = result.getDate("Fecha_fin");
                    if (fechaFin == null) { 
                        return false;
                    }
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        break;*/
            
        default:
            return false;
    }
    
    String url = "jdbc:postgresql://localhost:5432/Proyecto_Marvel";
    String usuario = "postgres";
    String contrasena = "joseluis0699";
    
    try {
        // Establecer conexión con la base de datos
        conexion = DriverManager.getConnection(url, usuario, contrasena);
        
        // Preparar la consulta SQL
        consulta = conexion.prepareStatement(sql);
        consulta.setString(1, valorBuscado);
        
        // Ejecutar la consulta SQL
        resultado = consulta.executeQuery();
        

        // Obtener el resultado de la consulta
        if (resultado.next()) {
            int cantidad = resultado.getInt(1);
            existe = (cantidad > 0);
        }
    } catch (SQLException e) {
        e.printStackTrace();
    } finally {
        // Cerrar la conexión y los recursos
        if (consulta != null) {
            try {
                consulta.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (conexion != null) {
            try {
                conexion.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    return existe;  
}//Fin de verifica si existe en la tabla Usuario (Usuario o Correo) Y Pais(Nombre)
    
   
   public boolean existe_Usuario_Y_Contraseña(String usuario, String contraseña, int caso) { //Verifica la existencia del Usuario y su Contraseña en la tabla de Usuario 
    boolean existe = false;
    Connection conexion = null;
    PreparedStatement consulta = null;
    ResultSet resultado = null;
    String sql=null;
    switch(caso){
        case 1:
            sql = "SELECT Contrasena FROM Usuario WHERE Usuario = ?";
        break;
            
        case 2:
            sql = "SELECT Contrasena FROM Usuario WHERE Correo_Electronico = ?";
        break;
        
        default:
            return false;
    }
    
    String url = "jdbc:postgresql://localhost:5432/Proyecto_Marvel";
    String usuarioBD = "postgres";
    String contraseñaBD = "joseluis0699";
    
    try {
        conexion = DriverManager.getConnection(url, usuarioBD, contraseñaBD);
        consulta = conexion.prepareStatement(sql);
        consulta.setString(1, usuario);
        resultado = consulta.executeQuery();
        
        if (resultado.next()) {
            String contrasenaReal = resultado.getString("Contrasena");
            existe = contrasenaReal.equals(contraseña);
        }
    } catch (SQLException e) {
        e.printStackTrace();
    } finally {
        if (resultado != null) {
            try {
                resultado.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (consulta != null) {
            try {
                consulta.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (conexion != null) {
            try {
                conexion.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    
    return existe;
}//Fin de verifica la existencia del Usuario y su Contraseña en la tabla de Usuario    

    //Aqui terminan los procemiento para comprobar existencia(select)
    //Aqui empiezan los procedimiento para actualizar (update)
   
/*Cambiar la contraseña del usuario especifico, tienes que especificar la nueva contraseña al principio
    luego al usuario que quieres que se la cambia y por ultimo un boleano donde si es 1 cambia a traves
    del nombre de usuario y si es falso cambia a traves del correro electronico (Afecta a la tabla usuario)*/     
   public void Cambiar_Contraseña(String nueva_contraseña, String cambio, boolean tipo) {
    Connection conexion = null;
    PreparedStatement consulta = null;
    ResultSet resultado = null;
    String url = "jdbc:postgresql://localhost:5432/Proyecto_Marvel";
    String usuarioBD = "postgres";
    String contrasenaBD = "joseluis0699";
    String sql="";
    try {
        conexion = DriverManager.getConnection(url, usuarioBD, contrasenaBD);
        if(tipo){
            sql = "UPDATE Usuario SET Contrasena = ? WHERE Usuario = ?";
        }else{
            sql = "UPDATE Usuario SET Contrasena = ? WHERE Correo_Electronico = ?";
        }
        consulta = conexion.prepareStatement(sql);
        consulta.setString(1, nueva_contraseña);
        consulta.setString(2, cambio);
        consulta.executeUpdate();
    } catch (SQLException e) {
        System.err.println("Error: No se actualizó la contraseña " + e.getMessage());
    } finally {
        if (resultado != null) {
            try {
                resultado.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (consulta != null) {
            try {
                consulta.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (conexion != null) {
            try {
                conexion.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}//fin de cambiar la contraseña del usuario especifico

   //Aqui terminan los procedimiento para actualiza (update)
   
   //Aqui empiezas los procedimientos para insertar (insert)
   /*Nota: Lamentablemente tendre que crear un pocoton de funciones para las inserciones ya que
   como algunas tablas usan datos especificos para su tabla esta como dificil crear una generica
   pero hay algunas que si comparte el mismo diseño, como las de intercespcion que la mayoria 
   maneja dos datos, entonces  hare un listado en el siguiente comentario UwU*/
   
   /* Lista de */

//Inserta un nuevo usuario en la tabla de usuario   
public void crearNuevoUsuario(String usuario, String correoElectronico, String primerNombre,
                              String segundoNombre, String primerApellido, String segundoApellido,
                              String contrasena, String fecha, String genero, 
                              String nroTarjeta, int pais, int caso1, int caso2) {
    
    if (caso1== 1) {
        segundoNombre= null;
        if (caso2==1){
           segundoApellido= null; 
        } else{
        }
    }
    
    Connection conexion = null;
    PreparedStatement consulta = null;
    ResultSet resultado = null;
    String sql = "INSERT INTO usuario (usuario, correo_electronico, primer_nombre, segundo_nombre, primer_apellido, segundo_apellido, contrasena, fecha_nacimiento, genero, Nro_Tarjeta, UID_Pais) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
    String url = "jdbc:postgresql://localhost:5432/Proyecto_Marvel";
    String usuarioBD = "postgres";
    String contrasenaBD = "joseluis0699";
    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
    Date fechaDate = null;
    try {
        fechaDate = formato.parse(fecha);
    } catch (ParseException ex) {
        System.err.println("Error al parsear fecha: " + ex.getMessage());
        return;
    }
    try {
        conexion = DriverManager.getConnection(url, usuarioBD, contrasenaBD);
        consulta = conexion.prepareStatement(sql);
        consulta.setString(1, usuario);
        consulta.setString(2, correoElectronico);
        consulta.setString(3, primerNombre);
        consulta.setString(4, segundoNombre);
        consulta.setString(5, primerApellido);
        consulta.setString(6, segundoApellido);
        consulta.setString(7, contrasena);
        consulta.setDate(8, new java.sql.Date(fechaDate.getTime()));
        consulta.setString(9, genero);
        consulta.setString(10, nroTarjeta);
        consulta.setInt(11, pais);
        consulta.executeUpdate();
    } catch (SQLException e) {
        System.err.println("Error al crear nuevo usuario: " + e.getMessage());
    } finally {
        if (resultado != null) {
            try {
                resultado.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (consulta != null) {
            try {
                consulta.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (conexion != null) {
            try {
                conexion.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}//Fin de insertar un nuevo usuario

public void insertar_mensaulidad(String usuario_mensualidad){
    String url = "jdbc:postgresql://localhost:5432/nombre_de_la_base_de_datos";
        String usuario = "usuario";
        String contrasena = "contraseña";
        String sql = "{CALL insertar_mensualidad(?,NULL,?,?)}";
        int codigoMembresia= Toma_Tu_Valor(usuario,2);
        
    try (Connection conn = DriverManager.getConnection(url, usuario, contrasena);
        CallableStatement stmt = conn.prepareCall(sql)) {

        // Establecer los parámetros del procedimiento almacenado
            Timestamp fechaInicio = new Timestamp(System.currentTimeMillis());
            System.out.println (fechaInicio);        

        stmt.setTimestamp(1, fechaInicio);       
        stmt.setString(2, usuario_mensualidad);
        stmt.setInt(3, codigoMembresia);

            // Ejecutar el procedimiento almacenado
            stmt.execute();

        } catch (SQLException e) {
            System.err.println("Error al insertar mensualidad: " + e.getMessage());
        }
}


}
