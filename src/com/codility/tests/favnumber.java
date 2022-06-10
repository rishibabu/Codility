package com.codility.tests;

public class favnumber {

	 public static int solution(int X, int Y, int[] A) {
	        int N = A.length;
	        int result = -1;
	        
	        for (int i = 0; i < N; i++) {
	        	int nX = 0;
		        int nY = 0;
		        
		     for(int j = i;j<N;j++)
		     {
	            if (A[j] == X)
	                nX += 1;
	            if (A[j] == Y)
	                nY += 1;
	            if (nX == nY)
	                result = j;
	            
		     }
	        }
	        return result;
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {6,42,11,7,1,42};
	    int x = 7, y = 42;
	    System.out.println(solution(x, y,arr));
	 
		
	}

}
