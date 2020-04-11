package com.first;

public class minMax {
    public static void main(String[] args) {
    int[] massive = {1, 12,2, 222,323,11, 44, 111};
    minMax(massive);
    }
    public static void minMax(int[] massive){
        int min = massive[0], max = massive[0];
        for(int i:massive){
            if(i < min)
                min = i;
            if(i > max)
                max = i;
        }
        System.out.println("max value is " + max);
        System.out.println("min value is " + min);
        System.out.println("the deference is " +( max - min));
    }
}
