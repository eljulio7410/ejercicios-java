package Condicionales;

import javax.swing.*;

public class ejercicio5 {
    public static void main(String[] args) {
        float horasTrabajadas,salarioTotal;

        horasTrabajadas = Float.parseFloat(JOptionPane.showInputDialog("Ingrese las horas trabajadas"));

        if (horasTrabajadas <= 40 ){
            salarioTotal = horasTrabajadas * 16;
        }else {
            salarioTotal=(40*16) + ((horasTrabajadas-40)*20);
        }
        JOptionPane.showMessageDialog(null,"Su salario total es: "+salarioTotal);
    }
}
