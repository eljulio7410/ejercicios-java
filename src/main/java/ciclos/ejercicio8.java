package ciclos;

import javax.swing.*;

public class ejercicio8 {
    public static void main(String[] args) {
        int numero;
        numero = Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero"));
        for (int i=1;i<=numero;i++){
            System.out.print(i+", ");
        }

    }


}
