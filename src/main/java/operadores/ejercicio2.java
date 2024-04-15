package operadores;

import java.util.Scanner;

public class ejercicio2 {
    //calcular el salario de un trabajador por sus horas

    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        float salario, salarioSemana, salariaHora, salarioDia;
        System.out.println("ingrese su salario: ");
        salario= sc.nextFloat();
        salarioDia=salario/22;
        salarioSemana=salarioDia*5;
        salariaHora=salarioDia/8;

        System.out.print("su salario por semana es: "+salarioSemana);
        System.out.println("\nsu salario por dia es: "+salarioDia);

    }
}
