package com.bridgelabz.basic_core_java_programs;

import com.sun.jdi.VMCannotBeModifiedException;

import java.util.Scanner;

public class BasicCorePrograms {
    static Scanner sc = new Scanner(System.in);

    static void flipCoin() {
        System.out.println("Enter how many times you want to flip the coin");
        int num = sc.nextInt();
        int head = 0, tail = 0;
        for (int i = 0; i < num; i++) {
            int flip = (int) Math.floor(Math.random() * 10) % 2;
            if (flip < 0.5) {
                tail++;
            } else {
                head++;
            }
        }
        System.out.println("The number of heads " + tail);
        System.out.println("The number of tails " + head);
        float headPercentage = head * 100 / num;
        float tailPercentage = tail * 100 / num;
        System.out.println("The Percentage of tail is " + tailPercentage + "%");
        System.out.println("The Percentage of head is " + headPercentage + "%");
        System.out.println("===================");
    }

    static int leapYear() {
        System.out.println("Enter the year");
        int year = sc.nextInt();
        if (year % 4 == 0 || year % 400 == 0 && year % 100 != 0) {
            System.out.println(+year + " is a leap year");
        } else {
            System.out.println(+year + " is not a leap year");
        }
        System.out.println("===================");
        return year;
    }

    static int powerOfTwo() {
        System.out.println("Enter the power value N");
        int N = sc.nextInt();
        int powerOfTwo = 0;
        for (int i = 1; i <= N; i++) {
            powerOfTwo = (int) Math.pow(2, i);
            System.out.println(i + "th power of 2 is " + powerOfTwo);
        }
        System.out.println("===================");
        return powerOfTwo;
    }

    static double harmonicNumber() {
        System.out.println("Enter the number whose harmonic number you want");
        int number = sc.nextInt();
        double result = 0.0;
        int i;
        for (i = 1; i < number; i++) {
            result = result + (double) 1 / i;
        }
        System.out.println("The harmonic number of " + i + " is " + result);
        System.out.println("===================");
        return result;
    }

    static int primeFactors() {
        System.out.println("Enter the number whose prime factors you want");
        int number = sc.nextInt();
        int primeFactorial = 2;
        while (number > 1) {
            if (number % primeFactorial == 0) {
                System.out.println(primeFactorial);
                number = number / primeFactorial;
            } else {
                primeFactorial++;
            }
        }
        System.out.println("===================");
        return primeFactorial;
    }

    public static void main(String[] args) {
        BasicCorePrograms.flipCoin();
        BasicCorePrograms.leapYear();
        BasicCorePrograms.powerOfTwo();
        BasicCorePrograms.harmonicNumber();
        BasicCorePrograms.primeFactors();

    }
}
