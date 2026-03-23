package Conditionalstatment;

import java.util.Scanner;

public class AreaOrPerimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length : ");
        double X = sc.nextDouble();
        System.out.println("Enter Breadth : ");
        double Y = sc.nextDouble();
        double Ar = X * Y ;
        double Pr = 2*(X + Y);
        if (Ar > Pr) {
            System.out.println("The area is greater than perimeter and the area is " + Ar);
        }
        else{
            System.out.println("The area is not greater than perimeter then the perimeter is " + Pr);
        }
    }
}
