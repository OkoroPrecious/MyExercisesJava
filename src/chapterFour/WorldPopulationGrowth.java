package chapterFour;

import java.util.Scanner;

public class WorldPopulationGrowth {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);
        int yearCount = 1;

        System.out.print("Whats the current world population?: ");
        long cwp = keyboardInput.nextLong();

        System.out.print("Whats the population growth rate?: ");
        double populationGrowthRate = keyboardInput.nextDouble();

        populationGrowthRate = populationGrowthRate / 100;


        for (yearCount = 1; yearCount < 76; yearCount++) {
            cwp = (long) (cwp + (cwp * populationGrowthRate));
            System.out.printf("World population after year %d is %d%n", yearCount, cwp);

        }
    }
}
