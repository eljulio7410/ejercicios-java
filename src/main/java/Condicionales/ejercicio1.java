package Condicionales;

import javax.swing.*;

public class ejercicio1 {
    public static void main(String[] args) {
        int numero;

        numero = Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero: "));

        if (numero%10 == 0){
            JOptionPane.showMessageDialog(null,numero+" es multiplo de 10");
        }else {
            JOptionPane.showMessageDialog(null,numero+" No es multiplo de 10");
        }
    }
}
