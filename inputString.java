package com.inputstring;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int count = 0;
        String inputStr;

        Scanner input = new Scanner(System.in);
        System.out.print("What is string? ");
        inputStr = input.nextLine();

        for(int i = 0; i<inputStr.length(); i++) {

            if(inputStr.charAt(i) != 0) {

                count++;

            }

        }

        System.out.print(inputStr + " has " + count + " characters");

    }
}
