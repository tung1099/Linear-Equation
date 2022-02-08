package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Giải phương trình bậc nhất");
        System.out.println("Cho phương trình 'a * x + b = c', mời bạn nhập vàp hằng số:");
        Scanner scanner = new Scanner(System.in);

        System.out.print("a:");
        double a = scanner.nextDouble();

        System.out.print("b:");
        double b = scanner.nextDouble()
                ;
        System.out.print("c:");
        double c = scanner.nextDouble();

        if (a != 0){
            double answer = (c - b)/a;
            System.out.printf("Phương trình có nghiệm là x = %f", answer);
        } else {
            if (b == c){
                System.out.print("Phương trình vô số nghiệm");
            } else {
                System.out.print("Phương trình vô nghiệm");
            }
        }

    }
}
