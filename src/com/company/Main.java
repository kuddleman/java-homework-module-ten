package com.company;
import java.math.RoundingMode;
import java.text.DecimalFormat;
public class Main {
    private static DecimalFormat df = new DecimalFormat("0.00");

    public static void main(String[] args) {
	// write your code here

        double [] monthlyRainfall = {6.5, 2.1, 3.67, 4.78, 9.34, 6.54, 8.67, 1.2, 6.9, 3.45, 6.5, 7.8};
        double total = totalRainfall(monthlyRainfall);
        System.out.println("Total Rainfall is: " + total);

        double average = averageMonthlyRainfall(monthlyRainfall);
        System.out.println("The average monthly rainfall is: " + df.format(average));

        String heavyMonth = rainiestMonth(monthlyRainfall);
        System.out.println("The month with the most rain is " + heavyMonth);

        String lightMonth = leastRainiestMonth(monthlyRainfall);
        System.out.println("The month with the least rain is " + lightMonth);
        Payroll.sayHello();
    }

//    Write a RainFall class that stores the total rainfall for each of 12 months
//    into an array of doubles. The program should have methods that return
//    the following:

//    the total rainfall for the year

    public static double totalRainfall(double[] array) {
        double total = 0;
        for ( int i = 0; i < array.length; i++) {
            total += array[i];
        }
        return total;
    }

//    the average monthly rainfall
    public static double averageMonthlyRainfall( double[] array) {
        double totalRain = totalRainfall(array);
        return totalRain / array.length;
    }


//    the month with the most rain
    public static String rainiestMonth(double[] array) {
        int idxRainiestMonth = 0;
        double amtRainiestMonth = array[0];
        for ( int i = 1; i < array.length; i++) {
            if (array[i] > amtRainiestMonth) {
                amtRainiestMonth = array[i];
                idxRainiestMonth = i;
            }
        }
           int rainiestMonth = idxRainiestMonth + 1;
            String monthString;
            switch (rainiestMonth) {
                case 1:  monthString = "January";
                    break;
                case 2:  monthString = "February";
                    break;
                case 3:  monthString = "March";
                    break;
                case 4:  monthString = "April";
                    break;
                case 5:  monthString = "May";
                    break;
                case 6:  monthString = "June";
                    break;
                case 7:  monthString = "July";
                    break;
                case 8:  monthString = "August";
                    break;
                case 9:  monthString = "September";
                    break;
                case 10: monthString = "October";
                    break;
                case 11: monthString = "November";
                    break;
                case 12: monthString = "December";
                    break;
                default: monthString = "Invalid month";
                    break;
            }

        return monthString;
    }

//    the month with the least rain
public static String leastRainiestMonth(double[] array) {
    int idxLeastRainiestMonth = 0;
    double amtLeastRainiestMonth = array[0];
    for ( int i = 1; i < array.length; i++) {
        if (array[i] < amtLeastRainiestMonth) {
            amtLeastRainiestMonth = array[i];
            idxLeastRainiestMonth = i;
        }
    }
    idxLeastRainiestMonth ++;
    String monthString;
    switch (idxLeastRainiestMonth) {
        case 1:  monthString = "January";
            break;
        case 2:  monthString = "February";
            break;
        case 3:  monthString = "March";
            break;
        case 4:  monthString = "April";
            break;
        case 5:  monthString = "May";
            break;
        case 6:  monthString = "June";
            break;
        case 7:  monthString = "July";
            break;
        case 8:  monthString = "August";
            break;
        case 9:  monthString = "September";
            break;
        case 10: monthString = "October";
            break;
        case 11: monthString = "November";
            break;
        case 12: monthString = "December";
            break;
        default: monthString = "Invalid month";
            break;
    }

    return monthString;
}



}
