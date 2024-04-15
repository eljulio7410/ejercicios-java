package operadores;

import java.util.Scanner;

public class operadores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float num1, num2, sum, res, mult, div;

        System.out.println("ingrese dos numeros: ");
        num1 = sc.nextFloat();
        num2 = sc.nextFloat();

        sum= num1+num2;
        res= num1-num2;
        mult= num1+num2;
        div = num1/num2;
        System.out.println("suma: "+sum);
        System.out.println("resta: "+res);
        System.out.println("multiplicacion: "+mult);
        System.out.println("division: "+div);


    }
}
