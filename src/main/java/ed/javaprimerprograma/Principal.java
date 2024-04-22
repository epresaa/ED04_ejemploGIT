package ed.javaprimerprograma;

import javax.swing.JOptionPane;

/**
 * Descripcion de la clase
 * @author Edurne
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog("Introduce tu nombre: ");
        JOptionPane.showMessageDialog(null, "Ongi etorri " + nombre + "!");
        System.out.println("Test Versiones");
    }
    
}
