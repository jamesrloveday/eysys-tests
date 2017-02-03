package com.application.eysys;

import java.util.*;

import static java.util.Arrays.*;


/**
 * Created by james on 03/02/2017.
 */
public class ArrayManipulator {
    private double mean;
    private long mode;
    private double median;
    private long range;

    public ArrayManipulator getStats(long[] myBigArray) {
        this.mean = getMean(myBigArray);
        this.mode = getMode(myBigArray);
        this.median = getMedian(myBigArray);
        this.range = getRange(myBigArray);
        return this;
    }


    private Double getMean(long[] myBigArray) {
        double sum = 0;
        for(int i = 0; i < myBigArray.length; i++) {
            sum = sum + myBigArray[i];
        }
        return sum;
    }

    private long getMode(long[] array) {
        long mode = array[0];
        int maxCount = 0;
        for (int i = 0; i < array.length; i++) {
            long value = array[i];
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

    private double getMedian(long[] array) {
        sort(array);
        int middle = ((array.length) / 2);
        if(array.length % 2 == 0){
            long medianA = array[middle];
            long medianB = array[middle-1];
            median = (medianA + medianB) / 2;
        } else{
            median = array[middle + 1];
        }
        return median;
    }

    private long getRange(long[] array) {
        List<Long> intsList = asList(array);
        Collections.sort(intsList);
        return (Collections.max(intsList) - Collections.min(intsList)) + 1;
    }

    private List<Long> asList(long[] array) {
        List<Long> intList = new ArrayList<>();
        for(int i = 0; i < array.length; i++) {
            intList.add(array[i]);
        }
        return intList;
    }


    @Override
    public String toString() {
        return "Mean = " + this.mean +
                " Mode = " + this.mode +
                " Median = " + this.median +
                " Range = " + this.range;
    }

}
