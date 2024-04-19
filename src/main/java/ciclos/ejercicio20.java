package ciclos;

import javax.swing.*;

public class ejercicio20 {
    public static void main(String[] args) {
        int numero;
        int sueldos=0;
        int sueldoMayor=0;

        numero= Integer.parseInt(JOptionPane.showInputDialog("ingrese la cantidad de sueldos: "));

        for (int i=0; i<=numero; i++){
            sueldos = Integer.parseInt(JOptionPane.showInputDialog("ingrese el sueldo: "));
            if (sueldos >= sueldoMayor){
                sueldoMayor= sueldos;
            }
        }
        JOptionPane.showMessageDialog(null,"El sueldo mayor es: "+sueldoMayor);
    }
}
