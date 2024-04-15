package ciclos;

import javax.swing.*;

public class ejercicio2 {
    public static void main(String[] args) {
        int numero;

        numero = Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero:\nU oprima 0 para terminar"));

        while (numero!=0){
            if (numero>0) {
                JOptionPane.showMessageDialog(null, numero+" es positivo");
            }else{
                JOptionPane.showMessageDialog(null, numero+" es negativo");
            }
            numero = Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero:\nU oprima 0 para terminar"));
        }
    }
}
