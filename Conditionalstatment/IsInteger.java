package Conditionalstatment;

import java.util.Scanner;

public class IsInteger {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        double n = sc.nextDouble();
        int x = (int)n;
        if(n - x == 0){
            System.out.println("Is an integer");
        }
        else{
            System.out.println("Is not an integer");
        }
    }
    
}
