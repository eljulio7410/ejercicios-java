package ciclos;

import javax.swing.*;

public class ejercicio16 {
    public static void main(String[] args) {

        int numero;
        int mult;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero del 1 al 10"));
        if (numero>0 && numero<=10){
            for (int i = 1; i<=10; i++){
                mult = numero*i;
                System.out.println(numero+" x "+i+" = "+mult);
            }
        }else{
            JOptionPane.showMessageDialog(null,"error");
        }
    }
}
