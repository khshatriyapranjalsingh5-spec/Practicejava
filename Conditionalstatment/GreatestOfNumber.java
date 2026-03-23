package Conditionalstatment;

import java.util.Scanner;

public class GreatestOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int a = sc.nextInt();
        System.out.println("Enter Second number : ");
        int b = sc.nextInt();
        System.out.println("Enter Third number : ");
        int c = sc.nextInt();
        if (a > b) {
            if (a > c) {
                System.out.println("(a) First number is greatest. ");
            }
            else{
                System.out.println("(c) Third number is greatest. ");
            }
        }
        else{
            if (b > c) {
                System.out.println("(b) Second number is greatest. ");
            }
            else{
                System.out.println("(c) Third number is greatest. ");
            }
        }
    }
}
