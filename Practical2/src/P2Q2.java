/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ZY
 */
public class P2Q2 {
    
    
    public static double sqrt(double x){
    double lowerLimit=0,upperLimit=0;
    double midpoint;
    double squareMidpoint;
      if (x > 1) {
            lowerLimit = 1; 
            upperLimit = x; 
        }
      else if(x<0){
          System.out.println("Error!!!!!!");
          System.exit(-1);
      }else if(x==0||x==1)
          return x;
      else{
          //x<1&&x>0
          lowerLimit = x; 
          upperLimit = 1;
      }
      
    while(Math.abs((upperLimit-lowerLimit)/lowerLimit)>=1.0e-8 ){
    midpoint = (lowerLimit + upperLimit) / 2;  
    squareMidpoint = Math.pow(midpoint, 2);
    
    if (squareMidpoint > x) { 
                upperLimit = midpoint;
            } else {
                lowerLimit = midpoint;
            }
      }
    
    return (lowerLimit+upperLimit)/2.0;
  
    
    }
    
        
    
    

    public static void main(String []args) {
       
     
  System.out.println("Number	SquareRoot"); 
      for(int i=0;i<=25;i++)
            System.out.printf("%-9d %.4f\n", i, sqrt(i));
        
        
    }
}

