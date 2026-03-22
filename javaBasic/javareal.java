package javaBasic;

public class javareal {
    public static void main(String[] args) {
        int num1=Integer.parseInt(args[0]);
        int num2=Integer.parseInt(args[1]);
        try {
            System.out.println(num1/num2);
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
