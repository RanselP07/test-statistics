package com.pluralsight;

import java.util.Arrays;
import java.util.Scanner;

public class TestStatistics {

    static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        int[] score = new int[10];
        double averageSum = 0;

        for (int i = 0; i < 10; i++){

            System.out.print("Enter your " + (i + 1) + " test score: ");
            int testScore = myScanner.nextInt();
            score[i] = testScore;

             averageSum += score[i];

        }

        double average = averageSum/10;

        System.out.print("\nTest Scores: " + Arrays.toString(score));

        Arrays.parallelSort(score);

        double median = (double) (score[4] + score[5]) / 2;


        System.out.print("\nLowest Grade: " + score[0]);

        System.out.print("\nHighest Grade: " + score[9]);

        System.out.printf("\nAverage: %.2f",  average);

        System.out.printf("\nMedian: %.2f",  median);

    }

}
