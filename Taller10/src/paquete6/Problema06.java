/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete6;

/**
 *
 * @author reroes
 */
public class Problema06 {

    public static void main(String[] args) {
        String[][] estudiantes = {{"Sarah Ward", "Philip Payne"},
        {"Carrie Burton", "Lauren Rice"},
        {"Emma Escobar", "Lori Flores"},
        {"Steven West", "Toni Martin"}
        };
      // TODO code application logic here
      String a="";
     for (int f = 0; f < estudiantes.length; f++) {

            for (int c = 0; c < estudiantes[f].length; c++) {
                
                switch (estudiantes[f][c].length()) {
                    case (11):
                        a = a + estudiantes[f][c] + "\n";
                        break;

                }

            }
        }
        
        System.out.println(a);
                
    }
    
}