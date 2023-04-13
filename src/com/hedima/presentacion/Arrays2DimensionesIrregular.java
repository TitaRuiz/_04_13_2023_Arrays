package com.hedima.presentacion;

import java.util.Arrays;
import java.util.Random;

public class Arrays2DimensionesIrregular {
    public static void main(String[] args) {
        int[][] nums = new int[3][];
        nums[0]= new int[3];
        nums[1]= new int[4];
        nums[2]= new int[5];
        Random r1 = new Random();

        for(int i=0; i<nums.length; i++) {
            System.out.println("Fila " + i);
            for (int j=0; j<nums[i].length; j++) {
                nums[i][j] = r1.nextInt(50);
            }
        }
        System.out.println(Arrays.deepToString(nums));

        int[][] dims = {{1,2,3,4,5},{3,6,7,8},{1,15}};
        System.out.println(Arrays.deepToString(dims));

        int[][] pepito = {{1, 2,},{3,40,50},{23,12,5},{1}};

        System.out.println(Arrays.deepToString(pepito));
    }
}
