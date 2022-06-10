package com.codility.tests;

import java.util.Arrays;

public class missingrolls {
	
	public static int[] solution(int[] A, int F, int M) {
		int[] result = new int[F];
		int number_of_rolls = A.length + F;
		int sum_of_rolls = M * number_of_rolls;
		int sum_of_known_rolls = 0;

			for(int roll_val: A)
				sum_of_known_rolls += roll_val;
			int sum_of_unknown_rolls = sum_of_rolls - sum_of_known_rolls;
			if(sum_of_unknown_rolls < F || sum_of_unknown_rolls > 6 * F)
				return new int[1];
			for (int i = 0; i < result.length; i++)
			{
				if (sum_of_unknown_rolls - (F - 1) <= 6)
				{
					result[i] = sum_of_unknown_rolls - (F - 1);
					Arrays.fill(result, i + 1, result.length, 1);
					break;
				}
				else
				{
					result[i] = 6;
					sum_of_unknown_rolls -= 6;
					F--;
				}
			}
			return result;
		}    

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
