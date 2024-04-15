package Condicionales;

import javax.swing.*;

public class ejercicio2 {
    public static void main(String[] args) {
        int a,b;


        a=Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero: "));
        b=Integer.parseInt(JOptionPane.showInputDialog("ingrese otro numero: "));

        if (a>b){
            JOptionPane.showMessageDialog(null,a+" es mayor que "+b);
        }
        else if (b>a){
            JOptionPane.showMessageDialog(null,b+" es mayor que "+a);

        }else{
            JOptionPane.showMessageDialog(null,"son iguales");
        }
    }
}
