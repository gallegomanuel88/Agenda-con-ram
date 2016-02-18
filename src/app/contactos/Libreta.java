package app.contactos;

import javax.swing.JOptionPane;
/**
 * En esta clase se encuentran todos los metos principales
 * @author gallegomanuel
 * @version 1.0
 */
public class Libreta {
    Contacto [] arraysContactos = new Contacto [100];
    //METODOS GENERICOS
    public Libreta (){
        for (int i=0; i<arraysContactos.length; i++){
            arraysContactos [i] = new Contacto ();
            arraysContactos [i].setNombre(""); //Se inicializa todos los "String nombre" a "" 
        }
    }
    /**
     * Metodo generico para introducirle un String y devolver un String introducido por pantalla
     * @param dato String introducido que aparecera en el JOptionPane
     * @return retorna un String introducido por pantalla
     */
    public String introducir (String dato){
        return JOptionPane.showInputDialog("Introduce "+dato+":");
    }
    //AÑADIR EN LA AGENDA
    public int cualLibre (){
        for (int i=0; i<arraysContactos.length; i++){
            if (arraysContactos[i].getNombre().equals(""))
                return i;
        }    
        return -1;
    }

    public void engadir (){
        
        if (cualLibre()==-1)
            JOptionPane.showMessageDialog(null, "La agenda esta llena");
        else
            arraysContactos[cualLibre()]= new Contacto (introducir("nombre"), introducir("apellido"), introducir("telefono"), introducir("emilio"));
    }
    //BUSCAR EN LA AGENDA
    public void buscaNombre() {
        boolean nomAfirmative = true;
        String texto="";
        String nombreBuscar = introducir("el nombre");
        for (int i = 0; i < arraysContactos.length ; i++) {
            if (arraysContactos[i].getNombre().equalsIgnoreCase(nombreBuscar)) {
                //JOptionPane.showMessageDialog(null, arraysContactos[i].toString());
                texto+=arraysContactos[i].toString()+"\n\n";
                nomAfirmative = false;
            }            
        }
        
        if (nomAfirmative == true) {
            JOptionPane.showMessageDialog(null, "El nombre buscado no esta en la lista");
        }
        else{
            JOptionPane.showMessageDialog(null, texto);
        }
    } 
    //EDITAR DATOS
    public void holi (){
        
    }
    
}
