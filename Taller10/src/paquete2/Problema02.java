/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import java.util.*;

/**
 *
 * @author reroes
 */
public class Problema02 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] vendedores = {"Jessica Cole", "Robert Wallace"};
        double[][] ventas = new double[2][5]; //
        double total = 0.0;
        double i = 0;
        double suma=0;
        for (int f = 0; f < ventas.length; f++) {
            System.out.println("Ventas diarias de 5 dias de " + vendedores[f]);
            for (int c = 0; c < ventas[f].length; c++) {
                i = entrada.nextDouble();
                suma = suma+i;
            }
        }
        
        System.out.println("Vendedor(a)"+vendedores [0]+"\n"
                +"Vendedor(a)"+vendedores [1]+"\n"
                +"Han realizado un total de "+suma+"$ en ventas");  
    }
}
