package arreglos;

import javax.swing.*;
import java.lang.reflect.Array;
import java.util.Scanner;

public class arreglos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nElementos;

        nElementos = Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero de elementos"));

        char[] letras = new char[nElementos];

        for (int i = 0; i<nElementos; i++){
            System.out.print((i+1)+". Digite un caracter: ");
            letras[i] = sc.next().charAt(0);
        }
        System.out.println("los caracteres del arreglo son: ");
        for (int i = 0; i<nElementos; i++){
            System.out.print(letras[i]+" ");
        }
    }
}
