package operadores;

import java.util.Scanner;

public class ejercicio1notas {
    public static void main(String[] args) {
        //un programa que calcule la suma de tres notas

        float a,b,c;

        Scanner sc =new Scanner(System.in);
        System.out.println("ingrese tres notas: ");
        a= sc.nextFloat();
        b= sc.nextFloat();
        c= sc.nextFloat();
        float suma = a+b+c;

        System.out.println("La suma de las tres notas es: "+suma);
    }
}
