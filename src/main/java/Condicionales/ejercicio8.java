package Condicionales;

import javax.swing.*;

public class ejercicio8 {
    public static void main(String[] args) {
        int a;

        a=Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero en 0 y 99.999"));
        if (a>=0 && a<=9){
            JOptionPane.showMessageDialog(null,a+" tiene un solo digito");
        } else if (a>=10 && a<=99) {
            JOptionPane.showMessageDialog(null,a+" tiene dos digitos");
        } else if (a>=100 && a<=999){
            JOptionPane.showMessageDialog(null,a+" tiene tres digitos");
        } else if (a>=1000 && a<=9999){
            JOptionPane.showMessageDialog(null,a+" tiene cuatro digitos");
        } else if (a>=10000 && a<=99999){
            JOptionPane.showMessageDialog(null,a+" tiene cinco digitos");
        }else {
            JOptionPane.showMessageDialog(null,a+" tiene mas de cinco digitos");
        }
    }
}
