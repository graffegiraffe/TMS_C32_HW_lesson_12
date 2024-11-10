package main.java.by.rublevskaya.model.task2;

import java.util.Scanner;

/*
Task 2
Write a program that will check that the entered link is valid.
For example, when analyzing a link like this https://teachmeskills.by/kursy/programmirovaniya-online
 - the program should return that the link is valid.
and when entering tcp://teachmeskills.by/kursy/programmirovaniya-online -
the program should return that the link is not valid (the link starts with neither http nor https)
 */
public class URLRun {
    public static void main(String[] args) {
        System.out.println("Enter link:");
        Scanner scanner = new Scanner(System.in);
        String inputLink = scanner.nextLine();
        if (URLValidator.isValidUrl(inputLink)) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
        scanner.close();
    }
}
