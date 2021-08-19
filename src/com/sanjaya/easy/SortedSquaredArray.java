package com.sanjaya.easy;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SortedSquaredArray {
    public static void main(String[] args) {
        int input[] = new int[] {-50, -13, -2, -1, 0, 0, 1, 1, 2, 3, 19, 20};
        int[] ints = sortedSquaredArrayo(input);
        System.out.println(Arrays.toString(ints));


    }

    //Does not cover negative
    static int[] sortedSquaredArray(int[] array) {
        for (int i = 0; i < array.length ; i++) {
            array[i]=array[i]*array[i];
        }
        Arrays.sort(array);
        return array;
    }
    //IN PLACE
    static int[] sortedSquaredArrayo(int[] array) {
        int arrysq[] = new int[array.length];
        int smallInx=0;
        int largeInx=array.length-1;
        for (int i = array.length-1; i >= 0 ; i--) {
           if(Math.abs(array[smallInx]) > Math.abs(array[largeInx])){
               arrysq[i]=array[smallInx]*array[smallInx];
               smallInx++;
           }else{
               arrysq[i]=array[largeInx]*array[largeInx];
               largeInx--;
           }
        }
        return arrysq ;
    }


}
