package OOPS;

public class Passingclassestomethod {
    public static class Car {
    
        int seat;
        String name;
        double length;
        String type;
        int torque;
    }
    public static void main(String[] args) {
        Car c = new Car();
        c.name = "Suv";
        c.length = 2.7;
        c.seat = 5;

        change(c);

        System.out.println(c.seat);
    }
    private static void change(Car c){
        c.seat = 4;
    }
}