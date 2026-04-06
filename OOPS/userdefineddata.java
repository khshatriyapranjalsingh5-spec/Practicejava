package OOPS;

import java.util.Scanner;

public class userdefineddata {
    public static class student {
        String name;
        int rno;
        double cgpa;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        student s1 = new student();
        s1.name = sc.nextLine();
        s1.rno = sc.nextInt();
        s1.cgpa = sc.nextDouble();

        System.out.println(s1.name+" "+s1.rno+" " +s1.cgpa);
    }
}