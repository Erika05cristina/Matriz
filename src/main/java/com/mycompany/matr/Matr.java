/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.matr;

import java.util.Scanner;

/**
 *
 * @author PC-08
 */
public class Matr {

    public static void main(String[] args) {
        var arreglo = new Arreglo();

        System.out.println("\n*** Vector 1 ***");
        var vector1 = arreglo.crearVector(5);
        System.out.println("\n**** Vector 2 ***");
        var vector2 = arreglo.crearVector(5);
        var vectorSumado = arreglo.sumaVector(vector1, vector2);
        System.out.println("\n ** Vector 1 ** | ** Vector 2 **");
        for (int i = 0; i < vector1.length; i++) {
            System.out.printf(" %7d\t | %5d \n", vector1[i], vector2[i]);

        }                                   

        System.out.println("\nSuma de vectores");
        for (int i = 0; i < vector2.length; i++) {

            System.out.println("  "+vectorSumado[i]);
        }

        System.out.println("\n****Matriz 1***");
        var matriz1 = arreglo.crearMatriz(2, 2);
        System.out.println("\n***Matriz 2***");
        var matriz2 = arreglo.crearMatriz(2, 2);

        System.out.println("** Matriz 1**|** Matriz 2**|");
        for (int y = 0; y < matriz1.length; y++) {
            for (int x = 0; x < matriz1[y].length; x++) {
                System.out.printf("%5d ", matriz1[y][x]);
            }
            System.out.print(" | ");

            for (int x = 0; x < matriz2[y].length; x++) {
                System.out.printf("%5d ", matriz2[y][x]);
            }
            System.out.print(" | ");
            System.out.println();
        }

        System.out.println("\nSuma de Matrices");
        var sumaMatriz = arreglo.sumaMatriz(matriz1, matriz2);
        for (var i = 0; i < matriz1.length; i++) {
            for (var j = 0; j < matriz1[0].length; j++) {

                System.out.printf("%5d ", sumaMatriz[i][j]);
            }
            System.out.println(" ");
        }

        /*
        var a = 0;
        System.out.println("a = " + a);

        a++;
        System.out.println("a = " + a);

        a++;
        System.out.println("a = " + a);

        a++;
        System.out.println("a = " + a);

        a++;
        System.out.println("a = " + a);

        a++;
        System.out.println("a = " + a);

        while (a < 100) {
            System.out.println("a = " + a);
            a++;
        }
        var numero=0;
        //leer datos del teclado
        do {
            var lectura = new Scanner(System.in);
            System.out.println("Ingresar números menores a 10");
            numero = lectura.nextInt();
            System.out.println("numero = " + numero);
        } while (numero < 10);
        
        
        for (var i = 0; i < 10; i++) {
            System.out.println("Hola "+i);
        }
        
        var numeroList = new int[5];
        numeroList[0]=7;
        numeroList[1]=9;
        numeroList[2]=4;
        numeroList[3]=11;
        numeroList[4]=3;
        
        var numeroDecimalList = new double[5];
        numeroDecimalList[0]=8.5;
        numeroDecimalList[1]=4.0;
        numeroDecimalList[2]=9.3;
        numeroDecimalList[3]=6.4;
        numeroDecimalList[4]=3.9;
        
        
        for (var i = 0; i < numeroList.length; i++) {
            System.out.println(numeroList[i]);
        }
        for (var i = 0; i < numeroDecimalList.length; i++) {
            System.out.println(numeroDecimalList[i]);
        }
 
        
        System.out.println("Ingresar la dimensión del arreglo unidimensional o arreglo");
        var lectura = new Scanner(System.in);
        var dimension = lectura.nextInt();
        
        var arreglo = new int[dimension];
        
        for (var i = 0; i < arreglo.length; i++) {
            System.out.println("Ingresar el número de la posición "+(i+1));
            arreglo[i] = lectura.nextInt();
        }
        
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println(arreglo[i]);
        }
         */
 /* 
        var lectura = new Scanner(System.in);
        System.out.println("Ingrese el número de filas que tendrá la matriz");
        var filas = lectura.nextInt();
        System.out.println("Ingrese el número de columnas que tendrá la matriz");
        var columnas = lectura.nextInt();

        var matriz = new int[filas][columnas];
        
        System.out.println("Ingrese el valor correspondiente a la posición 0,0");
        matriz [0][0] = lectura.nextInt();
        System.out.println("Ingrese el valor correspondiente a la posición 0,1");
        matriz [0][1] = lectura.nextInt();
        System.out.println("Ingrese el valor correspondiente a la posición 0,2");
        matriz [0][2] = lectura.nextInt();
        System.out.println("Ingrese el valor correspondiente a la posición 1,0");
        matriz [1][0] = lectura.nextInt();
        System.out.println("Ingrese el valor correspondiente a la posición 1,1");
        matriz [1][1] = lectura.nextInt();
        System.out.println("Ingrese el valor correspondiente a la posición 1,2");
        matriz [1][2] = lectura.nextInt();
        
        System.out.println(matriz [0][0]+" "+matriz [0][1]+" "+matriz [0][2]);
        System.out.println(matriz [1][0]+" "+matriz [1][1]+" "+matriz [1][2]);
         
        for (var i = 0; i < filas; i++) {
            for (var j = 0; j < columnas; j++) {
                System.out.println("Ingrese el valor correspondiente a la posición [" + i + "] [" + j + "] ");
                matriz[i][j] = lectura.nextInt();

            }

        }
        for (var i = 0; i < filas; i++) {
            for (var j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j]);

            }
                System.out.println(" ");
        }
         */
    }

}
