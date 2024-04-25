package arreglos;

import java.util.Scanner;

public class ordenEnArreglo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[10];

        System.out.println("ingrese 10 numeros: ");
        for (int i = 0; i< numeros.length; i++){
            numeros[i] = sc.nextInt();
        }
        boolean ascendente = false;
        boolean descendiente = false;

        for (int i = 0; i< numeros.length-1; i++){
            if (numeros[i] < numeros[i+1]){
                ascendente= true;
            }
            else if (numeros[i] > numeros[i+1]){
                descendiente = true;
            }
        }
        if (ascendente == true && descendiente == false){
            System.out.println("arreglo ascendente: ");
        } else if (ascendente == false && descendiente == true) {
            System.out.println("arreglo descendente: ");
        } else if (ascendente == true && descendiente == true) {
            System.out.println("arreglo desordenado");
        }else {
            System.out.println("todos iguales");
        }


    }
}
