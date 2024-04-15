package operadores;

import java.util.Scanner;

public class ejercicio3 {
    /*
    Ejercicio 3: Guillermo tiene N dolares. Luis tiene la mitad de lo que posee Guillermo.
    Juan tiene la mitad de lo que poseen Luis y Guillermo juntos. Hacer un programa que calcule e
    imprima la cantidad de dinero que tienen entre los tres.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float guillermo,luis,juan;

        System.out.println("ingrese cuanto tiene Guillermo: ");
        guillermo = sc.nextFloat();

        luis = guillermo/2;
        juan = (guillermo+luis)/2;

        System.out.println("guillermo tiene: "+guillermo+
                "\nLuis tiene: "+luis+
                "\nJuan tiene: "+juan+
                "\ny los tres tienen "+(guillermo+luis+juan));


    }
}
