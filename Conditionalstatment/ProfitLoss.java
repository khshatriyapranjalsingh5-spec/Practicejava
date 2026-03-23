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
            System.out.println("Profit is : " + (SP - CP));
        }
        else if( CP > SP ){
            System.out.println("Loss is : " + (CP - SP));
        }
        else{
            System.out.println("Neither Profit Nor Loss");
        }
    }
}