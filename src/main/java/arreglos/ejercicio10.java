package arreglos;

import java.util.Scanner;

public class ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arreglo = new int[10];
        boolean creciente = true;
        int numero, sitio_num=0,j=0;

        System.out.println("Llenar el arreglo: ");
        do {
            for (int i =0; i < 5; i++ ){
                System.out.print("ingrese un numero: ");
                arreglo[i] = sc.nextInt();
            }
            for (int i = 0; i < 4; i++){
                if (arreglo[i] < arreglo[i+1]){
                    creciente = true;
                }
                if (arreglo[i]> arreglo[i+1]){
                    creciente = false;
                    break;
                }
            }

            if (creciente == false){
                System.out.println("arreglo desordenado, digite nuevamente");
            }

        }while (creciente == false);

        System.out.print("digite un elemento a insertar: ");
        numero = sc.nextInt();

        while(arreglo[j]<numero && j<5){
            sitio_num++;
            j++;
        }

        for(int i = 0; i > sitio_num; i--){
            arreglo[i+1] = arreglo[i];
        }

        arreglo[sitio_num]=numero;

        System.out.print("\nEl arreglo queda: ");
        for (int i =0; i < 6; i++){
            System.out.print(arreglo[i]+" - ");
        }
    }
}
