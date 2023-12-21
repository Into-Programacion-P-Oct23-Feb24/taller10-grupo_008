/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author reroes
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double[][] notas = {{9, 10, 7, 8},
        {10, 5, 7, 9},
        {7, 9.4, 10, 9}};
        String[] nombresEstudiante = {"Jerry Ponce", "Gabriela Lewis", "David Bell"};
        double[] sumaNotas = new double[3];

        double suma = 0;
        String reporte = "";

        for (int fila = 0; fila < notas.length; fila++) {
            suma = 0;
            for (int col = 0; col < notas[fila].length; col++) {
                suma = suma + notas[fila][col];

            }
            sumaNotas[fila] = suma / 4;
        }

        // Presentación de resultados
        for (int i = 0; i < nombresEstudiante.length; i++) {

            reporte = String.format("%sEstudiante: %s tiene un promedio "
                    + "de %.2f\n",
                    reporte,
                    nombresEstudiante[i],
                    sumaNotas[i]);
        }

        System.out.printf("%s\n", reporte);

    }
}
