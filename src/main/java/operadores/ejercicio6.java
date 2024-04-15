package operadores;

import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        float a,b,c,suma1,suma2;
        System.out.println("ingrese dos numeros a sumar: ");
        a= sc.nextFloat();
        b= sc.nextFloat();
        System.out.println("ingrese la potencia: ");
        c=sc.nextFloat();


        suma1 = (float) Math.pow((a+b),c);
        System.out.println("suma1 = " + suma1);
        suma2 = (float) (Math.pow(a,c)+(Math.pow(b,c))+(2*(a*b)));
        System.out.println("suma2 = " + suma2);

    }
}
