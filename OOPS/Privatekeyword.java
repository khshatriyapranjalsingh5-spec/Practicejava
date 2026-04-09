package OOPS;

class Student{
        String name;
        private int rno = 28;
        double cgpa;
        void print(){
            System.out.println(name +" "+ rno +" "+ cgpa);
        }
} 

public class Privatekeyword {
    public static void main (String[] args){
           Student s = new Student();
           s.cgpa = 7.5 ; 
           //s.rno = 96 ;
           s.name ="Rohit";
          // System.out.println(s.rno);
           s.print();
    }
}