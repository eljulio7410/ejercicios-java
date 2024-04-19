package ciclos;

import javax.swing.*;

public class ejercicio12 {
    public static void main(String[] args) {
        int contador=0;
        int sueldos;
        int suma=0;

        for (int i=1; i<=5;i++){
            sueldos = Integer.parseInt(JOptionPane.showInputDialog("ingrese el sueldo: "));
            suma+=sueldos;
            if (sueldos>1000){
                contador++;
            }

        }
        JOptionPane.showMessageDialog(null,"\nla suma total de los sueldos es:\n "+suma+
                "\nsueldos mayores a 1.000 es:\n "+contador);
    }
}
