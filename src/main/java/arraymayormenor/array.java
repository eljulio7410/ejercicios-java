package arraymayormenor;

import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        int numeros;
        int mayor;
        int menor;

        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese cantidad de numeros: ");
        numeros = sc.nextInt();


        int [] l = new int[numeros];

        for (int i = 0; i < l.length; i++ ){
            System.out.print("digite un numero: ");
            l[i]= sc.nextInt();
        }
        for (int i = 0; i< l.length; i++){
            System.out.print(l[i]+ ", ");
        }
        mayor = l[0];
        menor = l[0];

        for (int i=1; i<l.length; i++){
            if (l[i] > mayor){
                mayor = l[i];
            }
        }
        for (int i = 1; i< l.length; i++){
            if (l[i]<menor){
                menor = l[i];
            }
        }

        System.out.println("\n------------------------\nel numero mayor es: "+ mayor+"\nel numero menor es: "+menor);
    }
}
