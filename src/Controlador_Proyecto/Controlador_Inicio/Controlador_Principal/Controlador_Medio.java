/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador_Proyecto.Controlador_Inicio.Controlador_Principal;

//Vistas 
import Vista.Admin.Principal;
import Vista.Admin.Medio;
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
    
    public Controlador_Medio (Medio medio){
        this.medio=medio;
    }
}
