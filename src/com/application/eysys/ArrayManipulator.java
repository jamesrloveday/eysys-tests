package com.application.eysys;

import java.util.Arrays;

/**
 * Created by james on 03/02/2017.
 */
public class ArrayManipulator {
    private double mean;
    private long mode;
    private double median;
    private int range;

    public ArrayManipulator getStats(int[] myBigArray) {
        this.mean = getMean(myBigArray);
        this.mode = getMode(myBigArray);
        this.median = getMedian(myBigArray);
        this.range = getRange(myBigArray);
        return this;
    }


    private double getMean(int[] myBigArray) {
        double sum = 0;
        for (int i = 0; i < myBigArray.length; i++) {
            sum = sum + myBigArray[i];
        }
        double average = sum / myBigArray.length;
        return average;
    }

    private int getMode(int[] array) {
        int mode = array[0];
        int maxCount = 0;
        for (int i = 0; i < array.length; i++) {
            int value = array[i];
            int count = 1;
            for (int j = 0; j < array.length; j++) {
                if (array[j] == value) count++;
                if (count > maxCount) {
                    mode = value;
                    maxCount = count;
                }
            }
        }
        return mode;
    }

    private double getMedian(int[] array) {
        Arrays.sort(array);
        double median;
        if (array.length % 2 == 0)
            median = ((double)array[array.length/2] + (double)array[array.length/2 - 1])/2;
        else
            median = (double) array[array.length/2];
        return median;
    }

    private int getRange(int[] array) {
        Arrays.sort(array);
        return array[array.length - 1] - array[0];

    }

    @Override
    public String toString() {
        return "Mean = " + this.mean +
                " Mode = " + this.mode +
                " Median = " + this.median +
                " Range = " + this.range;
    }

}
