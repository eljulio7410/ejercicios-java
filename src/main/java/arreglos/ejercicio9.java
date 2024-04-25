package arreglos;

import java.util.Scanner;

public class ejercicio9 {
    public static void main(String[] args) {

        int [] arreglo = new int[10];
        Scanner sc = new Scanner(System.in);

        int aux, desplaza;

        for (int i = 0; i<arreglo.length; i++){
            System.out.print("Ingrese un numero: ");
            arreglo[i] = sc.nextInt();
        }

        aux = arreglo[9];

        System.out.print("Ingrese posiciones a desplazar: ");
        desplaza = sc.nextInt();

        for (int i = desplaza; i > 0 ; i--){
            for (int j = arreglo.length-2; j>=0; j--){
                arreglo[j+1] = arreglo[j];
            }

            arreglo[0] = aux;
            aux = arreglo[9];
        }

        System.out.print("El arrego es: ");
        for (int i: arreglo){
            System.out.println(i+ "");
        }
    }
}
