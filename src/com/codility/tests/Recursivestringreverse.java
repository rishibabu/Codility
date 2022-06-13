package com.codility.tests;

import java.util.Iterator;

public class Recursivestringreverse {

	
	private static int printTen(int[]arr)
	{
		return printHelper(0,arr);
		
	}
	
	public static int printHelper(int index,int[]arr)
	{
		
		if(index>=arr.length)
		{
			return 0;
		}

		else if(arr[index]==10)
		{
			
			return arr[index];
		}
		else
		{
			return printHelper(index+1, arr);

		}

						
		
		
	}
	
	public static int printHelperwithloop(int[]arr)
	{
		int result=0;
		for (int i : arr) {
			
			if(i==10)
			{
				result = i;
				break;
			}
			
			
		}
		
		return result;
		
		
	}
	
	private static void printReverse(char [] str) {
		  helper(0, str);
		}

		private static void helper(int index, char [] str) {
		  if (str == null || index >= str.length) {
		    return;
		  }
		  helper(index + 1, str);
		  System.out.print(str[index]);
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long start = System.nanoTime();
		//char [] str = {'M','A','D'};
		 int []numbers = {1,2,4,5,6,7,8,9,11,22,33,44,55,66,77,88,99,10};
		//printReverse(str);
		int result = printTen(numbers);
		long end = System.nanoTime();

		System.out.println("the time take for the result "+result+" is "+(end-start));
		
	}

}
