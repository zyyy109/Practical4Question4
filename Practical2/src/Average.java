/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ZY
 */
public class Average {
    public static void main(String []args) {
    
    	
    	double calculateAverage1 = calculateAverage(12, 5);
    	System.out.println("Average 1: " + calculateAverage1);
    	
    	double calculateAverage2 = calculateAverage(12, 5, 6);
    	System.out.println("Average 2: " + calculateAverage2);
    	
    	double calculateAverage3 = calculateAverage(22.3, 5.5);
    	System.out.println("Average 3: " + calculateAverage3);
    	
    	double calculateAverage4 = calculateAverage(1.5, 3.4, 6.6);
    	System.out.println("Average 4: " + calculateAverage4);
    }
    
    public static double calculateAverage (int a, int b) {
    	return ((a + b) / 2.0);
    }
    
    public static double calculateAverage (int a, int b, int c) {
    	return ((a + b + c) / 3.0);
    }
    
    public static double calculateAverage (double a, double b) {
    	return ((a + b) / 2.0);
    }
    
    public static double calculateAverage (double a, double b, double c) {
    	return ((a + b + c) / 3.0);
    }
}
