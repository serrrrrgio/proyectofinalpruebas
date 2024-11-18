package co.edu.uniquindio.poo ;

public class Administrador extends Persona{
        
    /**
    * Constructor
    */

    public Administrador (String nombre, String apellido, String correo, String cedula, String telefono, String usuario, String contrasena,
    PreguntaSeguridad preguntaSeguridad, String respuesta){
        super(nombre, apellido, correo, cedula, telefono, usuario, contrasena, preguntaSeguridad, respuesta);
    }
}
