package javaBasic;

import java.util.Scanner;

public class simpleinterest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principle amount : ");
        double P = sc.nextInt();
        Scanner ac = new Scanner(System.in);
        System.out.println("Enter the interest rate : ");
        double R = ac.nextInt();
        Scanner qc = new Scanner(System.in);
        System.out.println("Enter the time : ");
        double T = qc.nextInt();
        double SI = (double)P*R*T/100;
        System.out.println("The Simple Interest : " + SI );
    }
}