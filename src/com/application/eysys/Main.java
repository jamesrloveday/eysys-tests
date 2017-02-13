package com.application.eysys;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
       int bound = Integer.parseInt(args[0]);
       int[] myArray = generateRandomArray(bound);
       ArrayManipulator arrayManipulator = new ArrayManipulator();
       System.out.println("The values are: " + arrayManipulator.getStats(myArray));

       TitleFinder finder = new TitleFinder();
       System.out.println("The match is: " + finder.find("Architect"));
        System.out.println("The match is: " + finder.find("Java engineer"));
    }

    private static int[] generateRandomArray(int bound) {
        int[] generated = new int[new Random().nextInt(bound)];
        for(int i = 0; i < generated.length; i++) {
            generated[i] = new Random().nextInt();
        }
        return generated;
    }


}
