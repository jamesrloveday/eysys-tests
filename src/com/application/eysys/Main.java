package com.application.eysys;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int bound = Integer.parseInt(args[0]);
        long[] myBigArray = generateSomeHugeArray(bound);
       System.out.println("Array stats: " + new ArrayManipulator().getStats(myBigArray).toString());
       Matcher matcher = new Matcher();
        System.out.println("Match found: " + matcher.matchToArgument("Java engineer"));
        List<String> jobList = new ArrayList<>();
        jobList.add("Java engineer");
        jobList.add("Accountant");
        Map<String, String> jobMatcher = matcher.matchToArgumentList(jobList);
        jobMatcher.keySet().forEach(k -> {
            System.out.println("Match found: " + k + " with: " + jobMatcher.get(k));
        });
    }


    public static long[] generateSomeHugeArray(int bound) {
        int n = (int)(Math.random()*9 + 1);
        long[] array = new long[n];
        for(int i = 0; i < array.length; i++) {
            array[1] = new Random().nextInt(bound);
        }
        return array;
    }


}
