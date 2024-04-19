package ciclos;

import javax.swing.*;

public class ejrcicio4 {
    public static void main(String[] args) {
        int numero,i=1;

        numero = Integer.parseInt(JOptionPane.showInputDialog("ingrese numeros positivos: "));

        while(numero>=0){
            i++;
            numero = Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero: "));
        }
        JOptionPane.showMessageDialog(null,"el total de numeros digitados es: "+i);
    }
}
