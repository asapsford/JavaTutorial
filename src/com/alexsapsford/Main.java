package com.alexsapsford;

import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Number: ");

        int x;
        x = input.nextInt();
        if (x % 3 == 0 && x % 5 == 0) {
            System.out.println("Buzz Fizz");
        } else if (x % 3 == 0) {
            System.out.print("Buzz");
        } else if (x % 5 == 0) {
            System.out.print("Fizz");
        }


    }



    }
