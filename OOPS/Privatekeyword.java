package OOPS;

class Student{
        String name;
        private int rno = 28;
        double cgpa;
        void print(){   //getter
            System.out.println(name +" "+ rno +" "+ cgpa);
        }
        int getRno(){    //getter
            return rno;
        }
        void setRno(int x){      //setter
            if (rno > 0) {
                rno = x ;
            }
        }
} 

public class Privatekeyword {
    public static void main (String[] args){
        Student s = new Student();
        s.cgpa = 7.5 ; 
        //s.rno = 96 ;
        s.name ="Rohit";
        s.setRno(45);
        System.out.println(s.getRno());
    }
}