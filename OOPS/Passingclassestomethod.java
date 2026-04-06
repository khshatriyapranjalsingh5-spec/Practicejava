package OOPS;

import java.util.Scanner;

public class Passingclassestomethod {
    public static class Car {
    
        int seat;
        String name;
        double length;
        String type;
        int torque;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Car c = new Car();

        System.out.println("Enter name:");
        c.name = sc.nextLine();

        System.out.println("Enter length:");
        c.length = sc.nextDouble();

        System.out.println("Enter seats:");
        c.seat = sc.nextInt();
        System.out.println(c.name+" "+c.length+" "+c.seat);
    }
}