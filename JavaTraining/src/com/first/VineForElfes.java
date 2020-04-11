package com.first;

import java.util.Arrays;

public class VineForElfes {
    public static void main(String[] args) {
        int[] massive = {12, 21, 1, 3, 2, 7, 4, 11, 8, 27, 23, 24, 45, 98, 64, 22};
        bubleVineSort(massive);
    }

    public static void bubleVineSort(int[] massive) {
        int count = 0;
        for (int a : massive) {
            if (a % 2 == 0)
                count++;
        }
        int[] wineArray = new int[count];
        for (int i = 0, j = 0; i < massive.length; i++) {
            if (massive[i] % 2 == 0) {
                wineArray[j] = massive[i];
                j++;
            }
        }




        System.out.println(Arrays.toString(wineArray));
    }
}
