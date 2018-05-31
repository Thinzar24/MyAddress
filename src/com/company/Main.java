package com.company;

import com.sun.xml.internal.stream.Entity;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String firstInitial="";
        String lastName="";
        String houseNumber="";
        String streetName="";
        String state="";
        String city="";
        String name="";

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter your first initial: ");
        firstInitial = keyboard.nextLine();
        System.out.println("Enter your Last Name: ");
        lastName = keyboard.nextLine();
        System.out.println("Enter your House Numer: ");
        houseNumber= keyboard.nextLine();
        System.out.println("Enter your Street Name: ");
        streetName= keyboard.nextLine();
        System.out.println("Enter your State: ");
        state = keyboard.nextLine();
        System.out.println("Enter your city: ");
        city = keyboard.nextLine();

        System.out.print(firstInitial + " " + lastName +" " + houseNumber + " ");
        System.out.print(streetName + " " + state + " " + city );
    }
}
