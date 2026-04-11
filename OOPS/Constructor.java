package OOPS;

public class Constructor {
    public static class car{
        int seats;
        String name;
        double length;
        car(int x ,String s ,double d){
           seats = x;
           name = s;
           length = d;
        }
    }
    public static void main(String[] args) {
        car c1 = new car(5, "Rohit", 3.99);
        System.out.println(c1.name);
    }
}