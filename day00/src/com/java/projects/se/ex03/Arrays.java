package com.java.projects.se.ex03;

public class Arrays
{
    int sum;
    String summ;
    int [] s1 = {1, 2, 3, 4};
    int [] s2 = {5, 6, 7, 8};
    String [] s3 = {"Hello", "Hi", "Sun"};

    public void showArr()
    {
        sum = s1[1] + s2[3];
        summ = s3[0]+ s3[1];
        System.out.println(sum);
        System.out.println(summ);
    }
}
