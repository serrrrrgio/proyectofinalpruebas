package co.edu.uniquindio.poo;

public class Persona {
    public String nombre;
    public String apellido;
    public String correo;
    public String cedula;
    public String telefono;
    public String usuario;
    public String contrasena;
    public PreguntaSeguridad preguntaSeguridad;
    public String respuesta;

    /**
     * Constructor
     */

    public Persona(String nombre, String apellido, String correo, String cedula, String telefono, String usuario,
            String contrasena,
            PreguntaSeguridad preguntaSeguridad, String respuesta) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.cedula = cedula;
        this.telefono = telefono;
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.preguntaSeguridad = preguntaSeguridad;
        this.respuesta = respuesta;
    }

    /**
     * Getters y Setters
     */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public PreguntaSeguridad getPreguntaSeguridad() {
        return preguntaSeguridad;
    }

    public void setPreguntaSeguridad(PreguntaSeguridad preguntaSeguridad) {
        this.preguntaSeguridad = preguntaSeguridad;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    /**
     * Método para verificar la respuesta de seguridad
     */
    public boolean verificarRespuestaSeguridad(String respuestaUsuario) {
        return respuesta.equalsIgnoreCase(respuestaUsuario);
    }

    /**
     * Método para cambiar la contrasena
     */
    public boolean cambiarContrasena(String respuestaUsuario, String nuevaContrasena) {
        if (verificarRespuestaSeguridad(respuestaUsuario)) {
            this.contrasena = nuevaContrasena;
            return true;
        }
        return false;
    }
}
