/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.matr;

import java.util.Scanner;

/**
 *
 * @author PC-08
 */
public class Arreglo {

    public int[] crearVector(int f) {
        var retorno = new int[f];
        var lectura = new Scanner(System.in);
        for (int i = 0; i < f; i++) {
            System.out.println("Ingrese número en la posición: " + i);
            retorno[i] = lectura.nextInt();
        }
        return retorno;
    }

    public int[] sumaVector(int[] v1, int[] v2) {
        var retorno = new int[v1.length];

        for (int i = 0; i < v1.length; i++) {
            retorno[i] = v1[i] + v2[i];
        }

        return retorno;
    }

    public int[][] crearMatriz(int f, int c) {
        ;
        var lectura = new Scanner(System.in);
        var matriz = new int[f][c];
        for (var i = 0; i < f; i++) {
            for (var j = 0; j < c; j++) {
                System.out.println("Ingrese el valor correspondiente a la posición [" + i + "] [" + j + "] ");
                matriz[i][j] = lectura.nextInt();

            }

        }
        return matriz;
    }

    public int[][] sumaMatriz(int[][] m1, int[][] m2) {
        var retorno = new int[m1.length][m1[0].length];

        for (var i = 0; i < m1.length; i++) {

            for (var j = 0; j < m1[0].length; j++) {

                retorno[i][j] = m1[i][j] + m2[i][j];

            }

        }

        return retorno;

    }

}
