package Condicionales;

import javax.swing.*;

public class Ejercicio6 {
    public static void main(String[] args) {
        int a;

        a = Integer.parseInt(JOptionPane.showInputDialog("Ingrese dos numeros"));
        if (a%2==0){
            JOptionPane.showMessageDialog(null,a+" es par");
        }else {
            JOptionPane.showMessageDialog(null,a+" es impar");
        }
    }
}
