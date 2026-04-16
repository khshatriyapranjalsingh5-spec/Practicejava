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
    void print(){
        System.out.println(this.name+" "+this.run+" "+this.century);
    }
}
public class finalandStatic {
    public static void main(String[] args) {
        Cricketer c1 =new Cricketer("Rohit",12550,50);
        c1.print();
    }
}
