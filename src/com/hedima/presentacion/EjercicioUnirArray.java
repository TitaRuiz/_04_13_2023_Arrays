package com.hedima.presentacion;

import java.util.Arrays;

public class EjercicioUnirArray {
    public static void main(String[] args) {
        char[] cars1 = new char[]{'1','2','3','4','5','6'};
        char[] cars2 = new char[]{'a','e','r','t','y','u'};


        char[] result = new char[cars1.length + cars2.length];
        int index = 0;
        for (int i = 0; i < cars1.length; i++) {
            result[index]= cars1[i];
            index++;
            result[index]= cars2[i];
            index++;
        }
        System.out.println(Arrays.toString(result));

//        char[] cars1 = new char[]{'1','2','3','4','5','6'};
//        char[] cars2 = new char[]{'a','e','r','t','y','u'};
//        char[] resultado = new char[12];
        int r=0;
        for (int i = 0; i < cars1.length; i++) {
            result[r] = cars1[i];
            result[r+1]=cars2[i];
            r+=2;
        }
        System.out.println(Arrays.toString(result));
    }

}

