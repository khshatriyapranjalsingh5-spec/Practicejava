package javaBasic;

import java.util.Scanner;

public class SumOftwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the first number : ");
        int A = sc.nextInt();
        Scanner ac = new Scanner (System.in);
        System.out.print("Enter the Second number : ");
        int B = ac.nextInt();
        int sum = A + B ;
        System.out.println("The sum of two numbers : " + sum);
    }
}