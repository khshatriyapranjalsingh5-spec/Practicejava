package javaBasic;

import java.util.Scanner;

public class userInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius : ");
        double r = sc.nextDouble();
        double A = 3.141592 * r * r;
        System.out.println("The Area of Circle : " + A );
    }
    
}
