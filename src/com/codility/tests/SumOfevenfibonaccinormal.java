package com.codility.tests;

public class SumOfevenfibonaccinormal {

	
	public static int printPalindrome(int n)
	{
		long start = System.currentTimeMillis();
		int fib = 0;
		
		int next = 1;
		int previous = 0;
		
		int evenSum = 0;
		
		System.out.println("the palindrome sequence for the number "+n+"is "+0);
		System.out.println("the palindrome sequence for the number "+n+"is "+1);


		for(int i = 0;i<n-2; i++)
		{
			
			fib = next + previous;
		    
			previous  = next;
		    		
		    next = fib;
			
			System.out.println("the palindrome sequence for the number "+n+"is "+fib);

		    
			if(fib%2==0)
			{
				evenSum+=fib;
				
			}
			
		}
		
		long end = System.currentTimeMillis();

		System.out.println("thetotal time taken for the operation is "+(end-start)+"milli seconds");
		
		return evenSum;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 System.out.println("the sum of even numbers in the fibonacci sequence is"+printPalindrome(8));
	}

}
