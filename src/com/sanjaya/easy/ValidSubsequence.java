package com.sanjaya.easy;

import java.util.Arrays;
import java.util.List;

public class ValidSubsequence {
    public static void main(String[] args) {
        List<Integer>  array = Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10);
        List<Integer> sequence = Arrays.asList(1, 6, -1, 10);
       System.out.println(isValidSubsequence(array,sequence));


    }

    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence){
        int seqIndex=0;
        int arrayIndex=0;
        if(sequence.size() > array.size()){
            return false;
        }
        while(arrayIndex<array.size() && seqIndex <sequence.size()){
            if(sequence.get(seqIndex)==array.get(arrayIndex)){
                seqIndex++;
            }
            arrayIndex++;
        }
        return seqIndex == sequence.size();
    }
}
