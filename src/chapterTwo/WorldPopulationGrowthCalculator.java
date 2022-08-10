package chapterTwo;

import java.util.Scanner;

public class WorldPopulationGrowthCalculator {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);
        long cwpAfterOneYear;
        long cwpAfterTwoYears;
        long cwpAfterThreeYears;
        long cwpAfterFourYears;
        long cwpAfterFiveYears;


        System.out.println("Whats the current world population?: ");
        long cwp = keyboardInput.nextLong();

        System.out.println("Whats the population growth rate?: ");
        double populationGrowthRate = keyboardInput.nextDouble();

        populationGrowthRate = populationGrowthRate / 100;

        cwpAfterOneYear = (long) (cwp + (cwp * populationGrowthRate));
        System.out.println("World population after one year is " + cwpAfterOneYear);

        cwp = cwpAfterOneYear;
        cwpAfterTwoYears = (long) (cwp + (cwp * populationGrowthRate));
        System.out.println("World population after two years is " + cwpAfterTwoYears);

        cwp = cwpAfterTwoYears;
        cwpAfterThreeYears = (long) (cwp + (cwp * populationGrowthRate));
        System.out.println("World population growth after three years is " + cwpAfterThreeYears);

        cwp = cwpAfterThreeYears;
        cwpAfterFourYears = (long) (cwp + (cwp * populationGrowthRate));
        System.out.println("World population after four years is " + cwpAfterFourYears);

        cwp = cwpAfterFourYears;
        cwpAfterFiveYears = (long) (cwp +  (cwp * populationGrowthRate));
        System.out.println("world population after five years is " + cwpAfterFiveYears);
    }
}
