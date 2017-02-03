package com.application.eysys;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int bound = Integer.valueOf(args[0]);
        long[] myBigArray = generateSomeHugeArray(bound);
       System.out.println("Array stats: " + new ArrayManipulator().getStats(myBigArray).toString());
    }

    public static long[] generateSomeHugeArray(int bound) {
        long[] array = new long[bound];
        for(int i = 0; i < array.length; i++) {
            array[1] = new Random().nextInt(Integer.MAX_VALUE);
        }
        return array;
    }
}
