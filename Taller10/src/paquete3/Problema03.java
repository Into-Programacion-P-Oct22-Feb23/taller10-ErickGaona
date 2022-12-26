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

        //String[][] notasCualitativas = new String[3][3];
        double[][] notasCuantitativas = {{7.1, 8, 10},
        {3, 7, 9},
        {10, 9, 2.1}};

        String[] notasCualitativas = {"Insuficiente", "Regular", "Buena",
            "Muy buena", "Sobresaliente"};
        double resultado;

        for (int i = 0; i < notasCuantitativas.length; i++) {
            for (int j = 0; j < notasCuantitativas[i].length; j++) {
                resultado = notasCuantitativas[i][j];

                if ((resultado > 0) && (resultado <= 2.9)) {
                    System.out.printf("Nota es: %s\nla nota cuantitativa es: "
                            + "%s\n\n", notasCuantitativas[i][j],
                            notasCualitativas[0]);

                } else {
                    if ((resultado >= 3) && (resultado <= 4.9)) {
                        System.out.printf("Nota es: %s\nla nota cuantitativa"
                                + " es: "
                                + "%s\n\n", notasCuantitativas[i][j],
                                notasCualitativas[1]);
                    } else {
                        if ((resultado >= 5) && (resultado <= 7.9)) {
                            System.out.printf("Nota es: %s\nla nota cuantitativa"
                                    + " es: "
                                    + "%s\n\n", notasCuantitativas[i][j],
                                    notasCualitativas[2]);
                        } else {
                            if ((resultado >= 8) && (resultado <= 9.5)) {
                                System.out.printf("Nota es: %s\nla nota "
                                        + "cuantitativa es: "
                                        + "%s\n\n", notasCuantitativas[i][j],
                                        notasCualitativas[3]);
                            } else {

                                if ((resultado >= 9.6) && (resultado <= 10)) {
                                    System.out.printf("Nota es: %s\nla nota "
                                            + "cuantitativa es: "
                                            + "%s\n\n", notasCuantitativas[i][j],
                                            notasCualitativas[3]);
                                }

                            }

                        }

                    }

                }

            }
        }

    }
}
