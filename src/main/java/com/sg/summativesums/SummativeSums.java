/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.summativesums;

/**
 *
 * @author betzler
 * The SummativeSums class implements an application where the
 * values in three arrays of integers are summed using a method and each sum is
 * printed to the console.
 */
public class SummativeSums {

    /*
    public static void main(String[] args)
    Entry point for the program; execution begins here.
     */
    public static void main(String[] args) {
        int[] numList1 = {
            1, 90, -33, -55, 67, -16, 28, -55, 15
        };
        int[] numList2 = {
            999, -60, -77, 14, 160, 301
        };
        int[] numList3 = {
            10, 20, 30, 40, 50, 60, 70, 80, 90, 100,
            110, 120, 130, 140, 150, 160, 170, 180,
            190, 200, -99
        };

        System.out.println("\n#1 Array Sum: " + sumValues(numList1));
        System.out.println("#2 Array Sum: " + sumValues(numList2));
        System.out.println("#3 Array Sum: " + sumValues(numList3) + "\n");

    }

    /*
    public static int sumValues(int[] valueList) sums an array of integers
    and returns the sum.
     */
    public static int sumValues(int[] valueList) {
        int sum = 0;

        for (int i : valueList) {
            sum += i;
        }

        return sum;
    }

}
