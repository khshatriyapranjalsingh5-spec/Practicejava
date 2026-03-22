package Conditionalstatment;

import java.util.Scanner;

public class ProfitLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter CP : ");
        int CP = sc.nextInt();
        System.out.println("Enter SP : ");
        int SP = sc.nextInt();
        if(CP < SP){
            System.out.println("Profit");
        }
        else if( CP == SP ){
            System.out.println("Neither Profit Nor Loss");
        }
        else{
            System.out.println("Loss");
        }
    }
}