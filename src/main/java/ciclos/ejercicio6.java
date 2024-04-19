package ciclos;

import javax.swing.*;

public class ejercicio6 {
    public static void main(String[] args) {
        int numero;
        int contador=0;

        do {
            numero = Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero"));
            contador += numero;
        } while (numero!=0);
        JOptionPane.showMessageDialog(null,"la suma de los numeros digitados es: "+contador);
    }
}
