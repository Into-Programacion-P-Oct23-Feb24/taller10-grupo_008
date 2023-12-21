/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

/**
 *
 * @author reroes
 */
public class Problema03 {

    public static void main(String[] args) {
        String[][] notasCualitativas = new String[3][3];
        double[][] notasCuantitativas = {{7.1, 8, 10}, {3, 7, 9}, {10, 9, 2.1}};
        String[][] calificaciones = new String[3][3];

        /*
        Referencia para obtener el valor cualitativo de una nota numérica
        0 - 2.9   Insuficiente
        3 - 4.9   Regular
        5 - 7.9   Buena
        8 - 9.5   Muy Buena
        9.6 - 10  Sobresaliente  
         */
        for (int f = 0; f < notasCuantitativas.length; f++) {

            for (int c = 0; c < notasCuantitativas[f].length; c++) {
                if (notasCuantitativas[f][c] > 0 && notasCuantitativas[f][c] <= 2.9) {
                    calificaciones[f][c] = "Insuficiente";
                }
                if (notasCuantitativas[f][c] >= 3 && notasCuantitativas[f][c] <= 4.9) {
                    calificaciones[f][c] = "Regular";
                }
                if (notasCuantitativas[f][c] >= 5 && notasCuantitativas[f][c] <= 7.9) {
                    calificaciones[f][c] = "Buena";
                }
                if (notasCuantitativas[f][c] >= 8 && notasCuantitativas[f][c] <= 9.5) {
                    calificaciones[f][c] = "Muy Buena";
                }
                if (notasCuantitativas[f][c] >= 9.6 && notasCuantitativas[f][c] <= 10) {
                    calificaciones[f][c] = "Sobresaliente";
                }

            }

        }

        for (int f = 0; f < notasCuantitativas.length; f++) {
            for (int c = 0; c < notasCuantitativas[f].length; c++) {
                System.out.println("La nota es "
                        +notasCuantitativas[f][c]+" es "+calificaciones[f][c]);
            }

        }
    }

}
