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
        // TODO code application logic here
        double [][] notas={{9,10,7,8},
                           {10,5,7,9},
                           {7,9.4,10,9}
                                       };
        double promedio[]=new double[3];
        
        String[] nombresEstudiante = {"Jerry ponce", "Gabriela lewis", "David Bell"};
        double[] sumaNotas = new double[3];
        
        
        double suma = 0;
        String reporte = "";
        
        for (int i = 0; i < notas.length; i++) { 
            suma=0;
            for (int j = 0; j < notas[i].length; j++) { 
                suma = suma + notas[i][j];
                promedio[i]=suma/4;    
            }
            //sumaNotas[i] = suma; // 
        }
        
        // Presentación de resultados
        for (int i = 0; i < nombresEstudiante.length; i++) {
            reporte = String.format("%sEstudiante %s tiene un promedio  "
                    + "de notas: %.3f\n",
                    reporte,
                    nombresEstudiante[i],
                    promedio[i]);
        }
        
        System.out.printf("%s\n", reporte);
        
    }
    
}
