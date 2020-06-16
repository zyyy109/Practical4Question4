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
public class T1Q5 {
    public static void main(String[] args){
        int min;
        int max;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter the min : ");
        min=scan.nextInt();
        
        System.out.println("Enter the max : ");
        max=scan.nextInt();
        
        for(int i=min;i<=max;i++){
            if(i%2!=0){
                System.out.print(i + " ");
           
        }
        
               
    }
            
    }
}
