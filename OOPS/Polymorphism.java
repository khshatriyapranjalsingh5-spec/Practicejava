package OOPS;

public class Polymorphism {
    public static class DOG{
        void speak(){
            System.out.println("Bhoww-Bhoww");
        }
    }
    public static class CAT{
        void speak(){
            System.out.println("Meow-Meow");
        }
    }
    public static class HUMAN{
        void speak(){
            System.out.println("Hello");
        }
    }
    public static void main(String[] args){
        DOG d = new DOG();
        CAT c = new CAT();
        HUMAN h = new HUMAN();

        d.speak();
        c.speak();
        h.speak();
    }
}
