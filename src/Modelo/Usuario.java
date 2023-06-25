/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author José Luis López
 */
//Librerias a utilizar
import java.util.Date;
import java.util.regex.Pattern;
import java.text.SimpleDateFormat;
//Fin de librerias a utlizar

public class Usuario {
    private String usuario;
    private String correoElectronico;
    private String primerNombre;
    private String segundoNombre;
    private String primerApellido;
    private String segundoApellido;
    private String contrasena;
    private Date fechaNacimiento;
    private char genero;
    private String nroTarjeta;
    private int uidPais;
    
    public Usuario(String usuario, String correoElectronico, String primerNombre, String segundoNombre, 
                   String primerApellido, String segundoApellido, String contrasena, Date fechaNacimiento, 
                   char genero, String nroTarjeta, int uidPais) {
        // Validaciones de las propiedades
        if (usuario == null || usuario.trim().isEmpty()) {
            throw new IllegalArgumentException("El campo 'Usuario' es obligatorio");
        }
        
        if (correoElectronico == null || correoElectronico.trim().isEmpty()) {
            throw new IllegalArgumentException("El campo 'Correo_Electronico' es obligatorio");
        }
        
        String emailRegex = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
        if (!Pattern.matches(emailRegex, correoElectronico)) {
            throw new IllegalArgumentException("El campo 'Correo_Electronico' no tiene un formato válido");
        }
        
        if (primerNombre == null || primerNombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El campo 'Primer_Nombre' es obligatorio");
        }
        
        if (primerApellido == null || primerApellido.trim().isEmpty()) {
            throw new IllegalArgumentException("El campo 'Primer_Apellido' es obligatorio");
        }
        
        if (contrasena == null || contrasena.trim().isEmpty()) {
            throw new IllegalArgumentException("El campo 'Contrasena' es obligatorio");
        }
        
        if (fechaNacimiento == null) {
            throw new IllegalArgumentException("El campo 'Fecha_Nacimiento' es obligatorio");
        }
        
        Date today = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date minDate = null;
        try {
            minDate = dateFormat.parse("1900-01-01");
        } catch (Exception e) {
            // Manejo de excepciones
        }
        if (fechaNacimiento.before(minDate) || fechaNacimiento.after(today)) {
            throw new IllegalArgumentException("El campo 'Fecha_Nacimiento' no tiene un valor válido");
        }
        
        if (genero != 'M' && genero != 'F' && genero != 'D' && genero != 'O') {
            throw new IllegalArgumentException("El campo 'Genero' tiene un valor no válido");
        }
        
        String tarjetaRegex = "^[0-9]{13,18}$";
        if (nroTarjeta == null || nroTarjeta.trim().isEmpty() || !Pattern.matches(tarjetaRegex, nroTarjeta)) {
            throw new IllegalArgumentException("El campo 'Nro_Tarjeta' no cumple con los requisitos de formato");
        }
        
        if (uidPais <= 0) {
            throw new IllegalArgumentException("El campo 'UID_Pais' es obligatorio");
        }
        
        // Asignación de valores a las propiedades
        this.usuario = usuario;
        this.correoElectronico = correoElectronico;
        this.primerNombre = primerNombre;
        this.segundoNombre = segundoNombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.contrasena = contrasena;
        this.fechaNacimiento = fechaNacimiento;
        this.genero = genero;
        this.nroTarjeta = nroTarjeta;
        this.uidPais = uidPais;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public void setNroTarjeta(String nroTarjeta) {
        this.nroTarjeta = nroTarjeta;
    }

    public void setUidPais(int uidPais) {
        this.uidPais = uidPais;
    }
    
    public String getUsuario() {
        return usuario;
    }
    
    public String getCorreoElectronico() {
        return correoElectronico;
    }
    
    public String getPrimerNombre() {
        return primerNombre;
    }
    
    public String getSegundoNombre() {
        return segundoNombre;
    }
    
    public String getPrimerApellido() {
        return primerApellido;
    }
    
    public String getSegundoApellido() {
        return segundoApellido;
    }
    
    public String getContrasena() {
        return contrasena;
    }
    
    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }
    
    public char getGenero() {
        return genero;
    }
    
    public String getNroTarjeta() {
        return nroTarjeta;
    }
    
    public int getUidPais() {
        return uidPais;
    }
    
    // Aquí puedes agregar métodos adicionales según tus necesidades.
}