package OOPS;

public class Constructor {
    public static class car{
        int seats;
        String name;
        double length;
        car(){

        }
        car(int x ,String s ,double d){
           seats = x;
           name = s;
           length = d;
        }
        void print(){
            System.out.println(seats+" "+name+" "+length);
        }
    }
    public static void main(String[] args) {
        car c1 = new car(5, "Rohit", 3.99);
        c1.print();
    }
}