/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ZY
 */
import java.util.Scanner;

public class P1Q3 {
    
    public static void main(String[] args) {
        
        String cardNo="";
        int sum1 = 0;
        int sum2 = 0;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter 8-digit Card number :");
        cardNo = scan.nextLine();
        
        for(int i=7; i>0; i-=2 ){
           int temp =  cardNo.charAt(i)-'0';
            
           sum1 += temp;
           
        }
        
        for (int i=6;i>=0;i-=2){
           int temp = cardNo.charAt(i)-'0';
           
           int doubling = temp*2;
           
           if(doubling>=10){
               int q=doubling/10;
               int r=doubling%10;
               
               sum2+=q+r;
           }else{
               sum2+=doubling;
           }
          
        }
       System.out.println("Sum 1 = "+ sum1+" Sum 2 = "+sum2);
       if((sum1+sum2)%10!=0){
    System.out.print("\n Invalid card number:");
    }else
    System.out.print("\nValid card number:");
    }
    
    
}
