package ciclos;

import javax.swing.*;

public class ejercicio5 {
    public static void main(String[] args) {
        int numero,aleatorio,contador=0;


        aleatorio= (int) (Math.random()*10);
        System.out.println(aleatorio);

        do {
            numero=Integer.parseInt(JOptionPane.showInputDialog("digite un numero de 1 a 10: "));

            if (aleatorio>numero){
                JOptionPane.showMessageDialog(null,"Ingrese un numero mayor");
            }else {
                JOptionPane.showMessageDialog(null,"Ingrese un numero menor");
            }
            contador++;
        }
        while (numero != aleatorio);
        JOptionPane.showMessageDialog(null, "adivinaste el numero a los "+contador+" intentos");
    }
}
