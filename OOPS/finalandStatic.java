package OOPS;

class Cricketer{
    static String country = "India";
    String name;
    int run;
    int century;
    Cricketer(String x,int r,int c){
        this.name = x;
        this.run = r;
        this.century = c;
    }
    Cricketer(){
        System.out.println(this.name+" "+this.run+" "+this.century);
    }
    void print(){
        System.out.println(this.name+" "+this.run+" "+this.century);
    }
    static void greet(){
        System.out.println("I Only believe in jassi bhai ");
    }
}
public class finalandStatic {
    public static void main(String[] args) {
        Cricketer c1 = new Cricketer("Rohit",12550,50);
        c1.print();
        //Cricketer c2 = new Cricketer("Virat",15000,66);
        Cricketer c2 = new Cricketer();
        c2.greet();
    }
}
