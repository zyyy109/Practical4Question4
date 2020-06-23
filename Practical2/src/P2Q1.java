/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ZY
 */
public class P2Q1 {
       public static void main(String []args) {
    	double squareRoot;
    	
    	System.out.println("Number	SquareRoot");
    	for (int i = 0; i <= 20; i++) {
    		squareRoot = Math.sqrt(i);
    		
    		System.out.printf("%d		%.4f\n", i, squareRoot);
    	}
    }
}
