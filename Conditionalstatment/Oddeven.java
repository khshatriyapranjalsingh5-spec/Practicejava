package Conditionalstatment;

import java.util.Scanner;

public class Oddeven {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter The number : ");
        int x = sc.nextInt();
        if(x%2==0){
            System.out.println("The number is Even. ");
        }
        else{
            System.out.println("The number is Odd. ");
        }
    }
}