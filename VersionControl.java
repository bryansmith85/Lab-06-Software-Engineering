/*  Program Name: Lab 06: Software Engineering
 *  Description: This is a program that will add two numbers.
 *  Author: Bryan Smith
 *  Class Section: 10852
 *  Date: 03/07/2022
 */
import java.util.Scanner;

public class VersionControl {

    public static void main(String[] args) {
        int num1;
        int num2;
        int sum;

        Scanner scnr = new Scanner(System.in);
        System.out.println("This is a program to add two numbers\n");
        System.out.println("Enter the first number: ");
        num1 = scnr.nextInt();
        System.out.println("Enter the second number: ");
        num2 = scnr.nextInt();
        sum = num1 + num2;
        System.out.println("The sum of the two numbers is: " + sum);
        scnr.close();
    }
}