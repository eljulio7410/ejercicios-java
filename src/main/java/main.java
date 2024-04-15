import java.util.Scanner;

public class main {

    public static boolean esPalindromo(String palabra){
        palabra = palabra.toLowerCase();
        palabra = palabra.replace(" ", "");
        palabra = palabra.replace("à","a");
        palabra = palabra.replace("è","e");
        palabra = palabra.replace("ì","i");
        palabra = palabra.replace("ò","o");
        palabra = palabra.replace("ù","u");

        int a = 0;
        int b =palabra.length() - 1;

        for (int i = 0; i<palabra.length(); i++){
            if (palabra.charAt(a) == palabra.charAt(b)){
                a++;
                b--;
            }
            else
                return false;
        }
        return true;
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String palabra;

        System.out.println("ingrese una palabra: ");
        palabra = scanner.nextLine();
        if (esPalindromo(palabra)){
            System.out.println("es palindromo");
        }
        else
            System.out.println("no es palindromo");
    }
}