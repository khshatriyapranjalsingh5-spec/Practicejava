package javaBasic;

import java.util.Scanner;

public class squareOfnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value : ");
        int A = sc.nextInt();
        int Sq = A * A ;
        System.out.println("The Square of number : " + Sq );
    }
}
