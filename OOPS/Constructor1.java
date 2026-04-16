package OOPS;

import java.util.Arrays;

public class Constructor1 {
    public static class StudentData {
        String name ;
        int rno;
        int[] marks;
        StudentData(int[] s){
            marks = Arrays.copyOf(s, s.length);

        }
        StudentData(int s){
            marks = new int[s];
        }
        
    }
    public static void main(String[] args) {
        int[] arr ={9,6,8,3,2};
        StudentData s1 = new StudentData(arr);
        s1.marks[0]=25;
        System.out.println(arr[0]);
        StudentData s2 = new StudentData(2);
    }
    
}
