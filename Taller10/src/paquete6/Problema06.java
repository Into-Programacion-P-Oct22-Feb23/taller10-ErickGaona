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

        String[][] caracteres = new String[4][2];
        System.out.println("Los estudiantes con mayor a 11 caracteres son: \n");
        for (int i = 0; i < estudiantes.length; i++) {
            for (int j = 0; j < estudiantes[i].length; j++) {

                if (estudiantes[i][j].length() == 11) {
                    System.out.println("" + estudiantes[i][j] + " con un total de: "
                            + estudiantes[i][j].length());
                    //caracteres[i][j]=estudiantes[i][j];
                    //System.out.println(estudiantes[i][j].length()>11);
                }

                //System.out.println("El total de caracteres es :" + estudiantes[i][j].length());
            }

        }

    }
}
