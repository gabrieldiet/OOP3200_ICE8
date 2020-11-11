/*
Author: Gabriel Dietrich
Date: Nov 11, 2020
 */


package com.company;

import java.util.InputMismatchException;
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
        boolean isValidInput = false; // Sentinel variable

        do
        {
            try
            {
                System.out.print("Please enter your age: ");
                age = keyboard.nextFloat();
                isValidInput = true;

                // Makes sure age is above 0 and below 120
                if((age <= 0.0f) || (age >= 120.0f))
                {
                    System.out.println("Error: You must enter an age greater than 0.0 and less than 120.0 years old");
                    keyboard.nextLine();
                    isValidInput = false;
                }

            }
            catch (InputMismatchException inputMismatchException)
            {
                System.out.println("Error: You must enter a valid floating point number");
                keyboard.nextLine();
                isValidInput = false;
            }

        }
        while(!isValidInput);



        //Output
        System.out.println();
        System.out.printf("You entered: %s \n", name);
        System.out.printf("You entered: %.2f \n", age);
    }
}
