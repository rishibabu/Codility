package com.codility.tests;

public class binarysearch {

	/*
	 * recursive approach
	Runtime 1 ms
	Memory  54.4 MB
			
	*/
	
	  public static int search(int[] nums, int target) {
	        
	       return helper(nums,target,0);
	        
	    }
	  
	  //uses O(logn)approach
	  public static int searchUsingLoop(int[] nums, int target) {
		    int pivot, left = 0, right = nums.length - 1;
		    while (left <= right) {
		      pivot = left + (right - left) / 2;
		      if (nums[pivot] == target) return pivot;
		      if (target < nums[pivot]) right = pivot - 1;
		      else left = pivot + 1;
		    }
		    return -1;
		  }
	  
	  public static int helper(int[]nums,int target,int index)
	  {

		  if(index>=nums.length)
		  {
			  return -1;
		  }
		  
		  if(nums[index]==target)
		  {
			  return index;
		  }
		  
//		  int pivot = nums.length/2;
//		  
//		  if(nums[pivot-1] >target)
//		  {
//			  return helper(nums,target,index+1);
//		  }
//		  
		  else
		  {
			  return helper(nums,target,index+1);

		  }
	  }
	  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] binaryarray = {1,3,5,7,9,11};
		
		System.out.println("the index of the element is"+searchUsingLoop(binaryarray,11));

	}

}
