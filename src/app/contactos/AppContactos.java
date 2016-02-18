package app.contactos;

import javax.swing.JOptionPane;

/**
 * Esta es la clase principal de la aplicacion.
 * @author gallegomanuel
 * @version 1.0
 */
public class AppContactos {

    public static void main(String[] args) {
        Libreta obj = new Libreta();
        boolean condicion = true;
        do {
            int opcion = Integer.parseInt(JOptionPane.showInputDialog("AGENDA DE CONTACTOS\n \nElige la opcion:\n1.) Buscar\n2.) Añadir\n3.) Editar\n4.) Borrar\n5.) Salir"));
            switch (opcion) {
                case 1:
                    obj.buscaNombre();
                    break;
                case 2:
                    obj.engadir();
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    condicion = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion incorrecta");
                    
            }
        } while (condicion);

    }
    public void holi2(){
        
    }

}
