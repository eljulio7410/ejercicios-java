package arreglos;

import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] a,b,c;
        a = new int[10];
        b = new int[10];
        c = new int[20];

        for (int i = 0; i < 10; i++){
            System.out.print("Ingrese un numero: ");
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < 10; i++){
            System.out.print("Ingrese otro numero: ");
            b[i] = sc.nextInt();
        }
        int j = 0;
        for (int i = 0; i < 10; i++){
            c[j] = a[i];
            j++;
            c[j] = b[i];
            j++;
        }
        for (int i =0; i<20 ; i++){
            System.out.print(c[i]+" ");
        }
    }
}
