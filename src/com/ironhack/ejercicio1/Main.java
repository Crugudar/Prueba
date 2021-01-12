package com.ironhack.ejercicio1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] exercise1ArrayInt = {5, 4, 3, 2, 1};
        int[]result1= multiply(exercise1ArrayInt);
        Arrays.stream(result1).forEach(System.out::println);



        int[] exercise2ArrayInt = {1, 2, 3, 4, 5};
        int[]result2=reverse(exercise2ArrayInt);
        Arrays.stream(result2).forEach(System.out::println);


    }

    public static int[] multiply(int[] array){

        int[]result = new int[array.length];

        for (int i=0; i<array.length; i++){
            if(i+1==array.length){
                result[i]=array[i]*array[0];
            }else{
                result[i]=array[i]*array[i+1];
            }

        }

        return result;
    }

    public static int[] reverse(int[] array){

        int[]result = new int[array.length];

        int j=0;

        for(int i=array.length-1;i>=0;i--){
            result[j]=array[i];
            j++;
        }

        return result;
    }
}
