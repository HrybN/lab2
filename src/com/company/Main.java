package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
    int num1 = scan.nextInt();
    int num2 = scan.nextInt();
    int res1 = num1 / num2;
    int res2 = num1 % num2;
    System.out.println(res1);
    System.out.println(res2);


    }
}
