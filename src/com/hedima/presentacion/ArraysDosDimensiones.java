package com.hedima.presentacion;


import java.util.Arrays;
import java.util.Scanner;

public class ArraysDosDimensiones {

    public static void main(String[] args) {
        // Arrays de dos dimension
        //1. Arrays regulares todas las filas tienen el mismo número de columnas
        int[][] numeros = new int[3][2];

        numeros[0][0] = 5;
        numeros[0][1] = 3;
        numeros[1][0] = 10;
        numeros[1][1] = 19;
        numeros[2][0] = 12;
        numeros[2][1] = 13;

        System.out.println(Arrays.deepToString(numeros));

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Fila " + i);
            for (int j = 0; j<numeros[i].length; j++){ //La cantidad de columnas se obtiene de las filas
                System.out.println("Elemento de la Fila " + i + " Columna " + j+ "->" + numeros[i][j]);
            }
        }

        //Declarar un array de 2x2
        //Dar valor a cada una de las celdas por la consola
        int numeros1[][] = new int[2][2];

        Scanner s1 = new Scanner(System.in);
        for (int i = 0; i < numeros1.length; i++) {
            for (int j=0; j<numeros1[i].length; j++) {
                System.out.print("Introducir fila "+i+" columna "+j+" ");
                numeros1[i][j] = s1.nextInt();
            }
        }
//        System.out.println(Arrays.toString(numeros[0]));
//        System.out.println(Arrays.toString(numeros[1]));
        System.out.println(Arrays.deepToString(numeros1));
    }

}





