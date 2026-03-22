package javaBasic;

public class TypeCasting {
    public static void main(String[] args){
        char Ar = 'a';    //implicit typecasting
        double SA = Ar;
        System.out.println(SA);
        char Qr = 'a';    //explicit typecasting
        int PA = (int)Qr;
        System.out.println(PA);
        char x = '2';
        System.out.println((int)x);
        int y = 43;
        int ch = (char)y;
        System.out.println(ch);
    }
    
}
