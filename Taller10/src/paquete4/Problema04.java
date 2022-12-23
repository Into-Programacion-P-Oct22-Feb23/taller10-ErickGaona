/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema04 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        //double[][] dato = new double[2][2];
        double[][] dato = new double[2][2];
        int i;
        int j;
        System.out.println("Ingrese datos decimales");
        for (i = 0; i < dato.length; i++) {
            for ( j = 0; j < dato[i].length; j++) {
                System.out.print("numeros[" + i + "]"+"[" +j+ "]"+" = ");
                dato[i][j] = entrada.nextDouble();
                
            }
        }
            for ( i = 0; i < dato.length; i++) {
                for (j = 0; j < dato[i].length; j++) {
                    System.out.println(dato[i][j]);   
                    
                }
            }
        }
       
        

    }

