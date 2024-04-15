package Condicionales;

import javax.swing.*;
import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {


        float compra;

        compra= Float.parseFloat(JOptionPane.showInputDialog("Ingrese el valor de su compra: "));

        float descuento = compra*0.20F;
        float total = compra-descuento;


        if (compra > 300){
            JOptionPane.showMessageDialog(null,"\npor su compra tiene un descuento del 20%: "+descuento+
                    "\ncon un valor total a pagar de: "+total);
        }else{
            JOptionPane.showMessageDialog(null,"su compra no tiene descuento: ");
        }
    }

}
