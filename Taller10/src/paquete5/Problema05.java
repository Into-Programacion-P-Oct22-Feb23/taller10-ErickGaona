/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;

import java.util.Arrays;

/**
 *
 * @author reroes
 */
public class Problema05 {

    public static void main(String[] args) {
        //String[][] inicial = new String[4][2];
        String[][] estudiantes = {{"Sarah Ward", "Philip Payne"},
        {"Carrie Burton", "Lauren Rice"},
        {"Emma Escobar", "Lori Flores"},
        {"Steven West", "Toni Martin"}};

        char inicialletra;
        //String[][] caracter = {{"P","S","T"}};                                                           
        for (int i = 0; i < estudiantes.length; i++) {
            for (int j = 0; j < estudiantes[i].length; j++) {

                inicialletra = estudiantes[i][j].charAt(0);
                String inicialDos = estudiantes[i][j].valueOf(inicialletra); // paso el char a String
                //System.out.printf("La inicial es %s, pero en tipo String\n", inicialDos);

                if (inicialDos.equals("S")) {//comprobando si sirve el metodo 
                    System.out.println("El nombre es: " + estudiantes[i][j] + " Y empieza con: " + inicialDos);
                }
                if (inicialDos.equals("P")) {
                    System.out.println("El nombre es: " + estudiantes[i][j] + " Y empieza con: " + inicialDos);
                }
                if (inicialDos.equals("T")) {
                    System.out.println("El nombre es: " + estudiantes[i][j] + " Y empieza con: " + inicialDos);
                }
                //System.out.println(" Los nombres con iniciales S-P-T son: "+inicialDos);

                //
                //System.out.println(estudiantes[i][j].charAt(0) == "P");
                //if(Arrays.equals(estudiantes, caracter)){
                //System.out.println(estudiantes[i][j]==caracter[i][j]);
                //}
                //if(estudiantes[i][j]==caracter[i][j]){
                //System.out.println("hola");
                //}
            }

        }

    }
}
