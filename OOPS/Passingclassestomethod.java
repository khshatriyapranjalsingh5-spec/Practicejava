package OOPS;

public class Passingclassestomethod {
    public static class Car {
    
        int seat;
        String name;
        double length;
        String type;
        int torque;
        void print(){
            System.out.println(name+" "+length+" "+seat+" "+type);  //method
        }
    }
    public static void main(String[] args) {
        Car c = new Car();
        c.name = "Suv";
        c.length = 2.7;
        c.seat = 5;
        c.type = "fourwheeler";

        change(c);

        System.out.println(c.seat);

        c.print();
    }
    private static void change(Car c){ //main file mein change
        c.seat = 4;
    }
}