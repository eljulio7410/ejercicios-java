package arreglos;

import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int [] numero = new int[10];
        int poscicion;
        int valor;
        for (int i = 0; i < numero.length-1; i++){
            System.out.print("ingrese un numero: ");
            numero[i] = sc.nextInt();
        }

        System.out.print("ingrese el valor: ");
        valor = sc.nextInt();
        System.out.print("ingrese el indice: ");
        poscicion = sc.nextInt();



        for (int i = numero.length-2 ; i >= poscicion; i--){
            numero[i+1] = numero [i];
        }
        numero[poscicion] = valor;

        for (int i= 0; i<numero.length; i++){
            System.out.print(numero[i]+" ");
        }
    }
}
