package arreglos;

import javax.swing.*;
import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numero = new int[5];

        for (int i = 0; i<5; i++){
            System.out.print("ingrese un numero: ");
            numero [i] = sc.nextInt();
        }
        for (int i=numero.length-1;i>=0; i--){
            System.out.print(numero[i]+" ");
        }
    }
}
