package tipo2;


import java.util.Scanner;

public class tipo2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String palabra;

        char [] palindromo;


        System.out.println("ingrese la palabra: ");
        palabra = s.nextLine();
        palabra = palabra.replace(" ","");
        palabra = palabra.toLowerCase();
        palindromo = palabra.toCharArray();

        int a,b;
        a = 0;
        b = palabra.length() - 1;

        while (a<b){
            if (palindromo[a] == palindromo[b]){
                a++;
                b--;
            }
            else{
                System.out.println("no es palindromo");
                break;
            }
        }
        if (a == b){
            System.out.println("es palindromo");
        }
    }
}