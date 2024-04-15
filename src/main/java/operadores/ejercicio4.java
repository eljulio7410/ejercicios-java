package operadores;

import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        float salario,comision, porcentaje,total;

        salario = 1000;
        System.out.println("ingrese cuantos carros vendio: ");
        comision= sc.nextFloat()*150;
        System.out.println("ingrese valor de los carros vendidos");
        porcentaje= (float) (sc.nextFloat()*0.05);

        total= salario+comision+porcentaje;
        System.out.println("total salario mas bonificaciones = " + total);
    }
}
