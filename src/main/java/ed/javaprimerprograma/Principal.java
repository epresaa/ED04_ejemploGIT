/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ed.javaprimerprograma;

import javax.swing.JOptionPane;

/**
 *
 * @author Edurne
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog("Introduce tu nombre: ");
        JOptionPane.showMessageDialog(null, "Ongi etorri " + nombre + "!");
    }
    
}
