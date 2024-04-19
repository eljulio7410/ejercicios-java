package arreglos;

import java.util.Scanner;

public class EjercicioMayorYMenor {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);

        int[] numero = new int[5];
        int max=0;
        int min=0;

        System.out.println("ingrese 5 numeros: ");
        for (int i =0; i<numero.length; i++){
            numero [i] = sc.nextInt();
        }
        for (int i = 0; i<numero.length; i++){
            max = (numero[max]>numero[i]? max: i);
            min = (numero[min]<numero[i]? min: i);
        }
        System.out.println("numero mayor: "+numero[max]);
        System.out.println("numero menor: "+numero[min]);


    }
}
