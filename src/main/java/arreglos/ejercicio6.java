package arreglos;

import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] a,b,c;
        a = new int[12];
        b = new int[12];
        c = new int[24];

        int total = a.length;
        int total2 = c.length;

        for (int i = 0; i < total; i++){

            a[i] = i+1;
        }
        for (int i = 0; i < total; i++){

            b[i] = i+13;
        }
        int aux=0;
        for (int i=0; i<total; i+=3){
            for (int j=0; j<total/4; j++ ){
                c[aux++]= a[i+j];
            }
            for (int j=0; j<total/4; j++){
                c[aux++]= b[i+j];
            }
        }
        for (int i =0; i<total2 ; i++){
            System.out.print(c[i]+" ");
        }

    }
}
