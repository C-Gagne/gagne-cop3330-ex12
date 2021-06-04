/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  Copyright 2021 Crystal Gagne
 */

package org.example.ex12;

import java.util.Scanner;

public class App {
    Scanner in = new Scanner(System.in);

    public static void main(String[] args)
    {
        App mainApp = new App();

        double principle = mainApp.getPrinciple();
        double interest = mainApp.getInterest();
        int years = mainApp.getYears();


        String outputString = genOutputString(years, interest, principle);
        System.out.println(outputString);
    }

    public Double getPrinciple()
    {
        System.out.println("Enter the principle: ");
        return in.nextDouble();
    }

    public Double getInterest()
    {
        System.out.println("Enter the interest: ");
        return in.nextDouble();
    }

    public Integer getYears()
    {
        System.out.println("Enter the number of years: ");

        // Read and return an integer.
        return in.nextInt();
    }

    public static String genOutputString(int years, double interest, double principle)
    {
        double finalValue = principle + ((years * (interest/100)) * principle);
        return String.format("After %d years at %.2f, the investment will be worth $%.2f.", years, interest, finalValue);
    }
}
