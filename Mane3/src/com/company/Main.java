package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();
        int res1 = num / 10;
        int res2 = num % 10;
        int res = res1 + res2;

        System.out.println(res);
    }
}
