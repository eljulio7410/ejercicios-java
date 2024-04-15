package DividirSinSigno;

import java.util.Scanner;

public class dividirSinSimbolo {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int a;
        int b;

        System.out.println("ingrese un numero: ");
        a=s.nextInt();
        System.out.println("ingrese otro numero: ");
        b=s.nextInt();
        int contador= 0;
        for (int i=1; i<=a; i=i+b){
        contador++;
        }
        System.out.println(contador);
    }
}
