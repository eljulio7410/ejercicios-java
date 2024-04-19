package ciclos;

import javax.swing.*;

public class ejercicio10 {
    public static void main(String[] args) {
        int numero;
        int contador=0;

        for (int i=1; i<=10; i++){
            numero = Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero: "));
            contador+=numero;
        }
        JOptionPane.showMessageDialog(null,"la suma es: "+contador);
    }
}
