package com.shahriaarrr;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int a, b;
	    int x;
	    Scanner in = new Scanner(System.in);

        System.out.print("give me your first number: ");
        a = in.nextInt();

        System.out.print("give me your second number: ");
        b = in.nextInt();

        System.out.println("Find and enter the operator you want from the list below: ");
        System.out.println("1 -> for + ");
        System.out.println("2 -> for - ");
        System.out.println("3 -> for * ");
        System.out.println("4 -> for / ");
        System.out.println("5 -> for % ");
        System.out.print("give me your operator: ");
        x = in.nextInt();


        calculate(a, x, b);
    }

    public static void calculate(int x, int y, int z){

        System.out.println();

        switch (y){
            case 1:
                System.out.println("Result -> " + (x + z));
                break;
            case 2:
                System.out.println("Result -> " + (x - z));
                break;
            case 3:
                System.out.println("Result -> " + (x * z));
                break;
            case 4:
                System.out.println("Result -> " + (x / z));
                break;
            case 5:
                System.out.println("Result -> " + (x % z));
                break;
            default:
                System.out.println("Error!!");
        }
    }
}
