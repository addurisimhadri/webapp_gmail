package com.sim.collections;

public class Swapping {

	public static void main(String[] args) {		
		int a = 0, b = 1;	 
        System.out.println("a = "+a);
        System.out.println("b = "+b); 
        //Beginning of Swapping
        a = a + b;
        b = a - b;
        a = a - b;
        //End of Swapping 
        System.out.println("The numbers after swapping are");
        System.out.println("a = "+a);
        System.out.println("b = "+b);

	}

}
