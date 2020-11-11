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
        String name = "";
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        name = keyboard.nextLine();
        System.out.printf("You entered: %s", name);
    }
}
