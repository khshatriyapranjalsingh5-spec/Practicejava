package Conditionalstatment;

import java.util.Scanner;

public class FourDigitNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int num = sc.nextInt();
        if(num > 999 && num < 10000){
            System.out.println("It is four digit number. ");
        }
        else{
            System.out.println("It is not a four digit number. ");
        }
    }
    
}
