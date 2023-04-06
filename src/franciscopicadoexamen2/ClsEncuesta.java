/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package franciscopicadoexamen2;
import java.util.Scanner;

/**
 *
 * @author fpica
 */
public class ClsEncuesta {
    private static String nombre, correo, edad;

    public ClsEncuesta(String nombre, String correo, String edad) {
        this.nombre = nombre;
        this.correo = correo;
        this.edad = edad;
    }
    

public ClsEncuesta (){
    
    
}

    public static String getNombre() {
        return nombre;
    }

    public static String getCorreo() {
        return correo;
    }

    public static String getEdad() {
        return edad;
    }

    public static void setNombre(String nombre) {
        nombre = nombre;
    }

    public static void setCorreo(String correo) {
        correo = correo;
    }

    public static void setEdad(String edad) {
        edad = edad;
    }
    
    
}
    

