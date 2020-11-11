/*
Author: Gabriel Dietrich
Date: Nov 11, 2020
 */


package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        // Define the scanner
        Scanner keyboard = new Scanner(System.in);

        // Input
        // Name
        String name = "";
        System.out.print("Please enter your name: ");
        name = keyboard.nextLine();


        // Age
        float age = 0.0f;
        System.out.print("Please enter your age: ");
        age = keyboard.nextFloat();
        System.out.println();

        //Output
        System.out.printf("You entered: %s \n", name);
        System.out.printf("You entered: %.2f \n", age);
    }
}
