/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema04 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double[][] datos = new double[2][2];
        double d = 0;
        int x=0;
        for (int f = 0; f < datos.length; f++) {
            for (int c = 0; c < datos[f].length; c++) {
                System.out.println(" Ingrese los valores del arreglo[" + f + "]" 
                        + "[" + c + "]");
                d = entrada.nextDouble();
                if (d >= 1000 && d <= 1199) {
                    datos[f][c] = d;
                } else {
                    datos[f][c] = 10;
                    x++;
                }
            }

        }
        for (int f = 0; f < datos.length; f++) {
            for (int c = 0; c < datos[f].length; c++) {
                System.out.println("arreglo[" + f + "]" + "[" + c + "]" 
                        + "=" + datos[f][c]);
            }

        }
        
         System.out.println("\nValores fuera de rango:"+x);

    }

}
