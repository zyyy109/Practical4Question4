/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ZY
 */
import java.lang.Math;
public class SPQ1 {
        public static void main(String []args) {
    	double itc;
    	double cti;
    	
    	System.out.println("Inches		Centimeters");
    	for (int i = 1; i <= 10; i++) {
    		itc = inchToCentimeter(i);
    		
    		System.out.printf("%d			%.2f\n", i, itc);
    	}
    	
    	System.out.println("\nCentimeters		Inches");
    	for (int c = 5; c <= 50; c=c+5) {
    		cti = centimeterToInch(c);
    		
    		System.out.printf("%d				%.2f\n", c, cti);
    	}
    }
    
    public static double inchToCentimeter(double in) {
   		return (in * 2.54);
    }
    
    public static double centimeterToInch(double cm) {
    	return (cm / 2.54);
    }
}
