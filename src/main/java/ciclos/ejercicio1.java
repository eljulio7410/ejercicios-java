package ciclos;

import javax.swing.*;

public class ejercicio1 {
    public static void main(String[] args) {


        int i,potencia=0;

        i= Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero positivo: "));

        while (i>0){
            potencia=i*i;
            JOptionPane.showMessageDialog(null,"el cuadrado es: "+potencia);
            i= Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero positivo: "));
        }


    }
}
