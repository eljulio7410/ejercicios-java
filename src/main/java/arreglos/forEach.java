package arreglos;

import javax.swing.*;
import java.util.Scanner;

public class forEach {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int numero;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de nombres: "));

        String[] nombres = new String[numero];

        for (int i=0; i<numero; i++){
            System.out.print((i+1)+". Ingrese el nombre: ");
            nombres [i] = sc.next();
        }
        for(String i:nombres){
            System.out.println(i);
        }

    }
}
