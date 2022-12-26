/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema02 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String[] vendedores = {"Jessica cole", "Robert Wallace"};

        int[][] ventas = new int[2][5];
        int suma = 0;

        for (int i = 0; i < ventas.length; i++) {
            for (int j = 0; j < ventas[i].length; j++) {
                System.out.println("Ingrese venta diaria " + vendedores[i]);
                ventas[i][j] = entrada.nextInt();

            }

        }
        for (int i = 0; i < ventas.length; i++) {
            for (int j = 0; j < ventas[i].length; j++) {

                suma = suma + ventas[i][j];

            }

        }
        for (int i = 0; i < vendedores.length; i++) {
            System.out.println("Vendedor/a: " + vendedores[i]);
        }

        System.out.println("Ha realizado un total de ventas de: " + suma);

    }
}
