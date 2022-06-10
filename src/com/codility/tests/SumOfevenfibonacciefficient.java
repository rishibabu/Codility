package com.codility.tests;

public class SumOfevenfibonacciefficient {

	
	public static int printFibonacci(int n)
	{
		long start = System.currentTimeMillis();
		int fib = 0;
		
		//initializing the first even number neglecting non even numbers 0 and 1
		int next = 2;
		int previous = 0;
		
		int evenSum = next + previous;
		
	

		for(int i = 0;i<n-1; i++)
		{
			if(evenSum>n)
			{
				break;
			}
			
			fib = 4*next + previous;
		    
			previous  = next;
		    		
		    next = fib;
			
			System.out.println("the fibonaci sequence for the number "+n+" is "+fib);

		    
			
				evenSum+=fib;
				
			
			
		}
		
		long end = System.currentTimeMillis();

		System.out.println("the total time taken for the operation is "+(end-start)+" milli seconds");
		
		return evenSum;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 System.out.println("the sum of even numbers in the fibonacci sequence is"+printFibonacci(8));
	}

}
