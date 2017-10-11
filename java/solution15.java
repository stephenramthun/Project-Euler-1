package core;

import java.math.BigInteger;

public class solution15 {

	/*
	 * The solution to problem 15 is
	 * actually quite simple. Brute
	 * force can be quickly recognized
	 * as not viable. Luckily, however,
	 * this can be viewed as a simple
	 * nCr problem, pronounced n
	 * choose r. If we have a grid of
	 * size (y*y) we know that we have
	 * an object size of 2y, for there
	 * are two options on each grid. Our
	 * for our sample however, since we can
	 * only chose one, would be y.
	 * 
	 * To calculate nCr we must use the
	 * following equation:
	 * 
	 * n!/(r!(n-r)!)
	 * 
	 * We can then substitute in our
	 * variables:
	 * 
	 * (2y)!/(y!(2y-y)!)
	 * 
	 * Simplifying:
	 * 
	 * (2y)!/(y!)^2
	 */
	
	public static void problem15(int size){
		System.out.println(factorial(2*size).divide(factorial(size).pow(2)));
//		System.out.println(factorial(2*size));
//		System.out.println();
	}
	
	public static BigInteger factorial(int n){
		if(n <= 1){
			return BigInteger.ONE;
		}else{
			return BigInteger.valueOf(n).multiply(factorial(n-1));
		}
	}
	
}
