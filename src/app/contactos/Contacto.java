package app.contactos;

/**
 * En esta clase se encuentran todos los atributos de los contactos
 * @author gallegomanuel
 * @version 1.0
 */
public class Contacto {
    private String nombre;
    private String apellido;
    private String telefono;
    private String emilio;

    public Contacto() {
        
    }

    public Contacto(String nombre, String apellido, String telefono, String emilio) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.emilio = emilio;
    }

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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmilio() {
        return emilio;
    }

    public void setEmilio(String emilio) {
        this.emilio = emilio;
    }

    @Override
    public String toString() {
        return "CONTACTO" + "\nNombre: " + nombre + "\nApellido: " + apellido + "\nTelefono: " + telefono + "\nEmilio: " + emilio;
    }
    
}
