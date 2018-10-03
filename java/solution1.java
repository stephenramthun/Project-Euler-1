import java.util.*;

public class solution1{

/**

Project Euler #1: Multiples of 3 and 5

If we list all the natural numbers below 10 that are multiples of 3 or 5,
 we get 3,5,6 and 9. The sum of these multiples is 23.
Find the sum of all the multiples of or below . 

**/


	public int sumOfMultiples(int n){
		int sum=0;
		for(int i=3;i<n;i++){
			//checking if they are multiples of 3 or 5
			if(i%3==0 || i%5==0){
				sum+=i;
			}
		}
		return sum;
	} 

	public static void main(String[] args){
		int q,n;
		Scanner sc = new Scanner(System.in);
		q=sc.nextInt();
		for(int i=0;i<q;i++){
			n=sc.nextInt();
			System.out.println(new solution1().sumOfMultiples(n));
		}

	}
}
