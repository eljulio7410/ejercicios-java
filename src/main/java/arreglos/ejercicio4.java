package arreglos;

import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int[] lista = new int[10];

        for (int i=0; i<lista.length;i++){
            System.out.print((i+1)+". ingrese un numero: ");
            lista[i] =  sc.nextInt();
        }

        for (int j=lista.length-1; j>=5;j--){
            System.out.print(lista[lista.length-1-j]+",");
            System.out.println(lista[j]);
        }
    }
}
