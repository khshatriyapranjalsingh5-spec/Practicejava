package OOPS;

class pokemon {
    String name;
    private int power ;
    String type ;
    pokemon(String a,int b,String c){
        this.name = a;
        this.power = b;
        this.type = c;
    }
    void print(){
        System.out.println(this.name+" "+this.power+" "+this.type);
    }
}

public class Rivisionoops {
    public static void main(String[] args) {
        pokemon x =new pokemon("pikachu",80,"electric");
        x.print();
    }
    
}
