package com.codility.tests;

public class Countingvalleyspeaks {

	public static int countOfPalaces(int[] nums) {
		long start = System.currentTimeMillis();
		if (nums == null || nums.length == 0)
			return 0;
		if (nums.length == 1)
			return 1;
		int count = 1;
		int i = 0, j = i + 1;
		while (i < nums.length && j < nums.length) {
			if (nums[j] == nums[i]) {
				++i;
				++j;
			} else if (nums[j] > nums[i]) {
				++count;
				int k = j + 1;
				while (k < nums.length && nums[k] >= nums[k - 1]) {
					++k;
				}
				if (k == nums.length)
					return count;
				i = k - 1;
				j = k;
			} else {
				++count;
				int k = j + 1;
				while (k < nums.length && nums[k] <= nums[k - 1]) {
					++k;
				}
				if (k == nums.length)
					return count;
				i = k - 1;
				j = k;
			}
		}
		long end = System.currentTimeMillis();

		System.out.println("the total time taken is " + (end - start));

		return count;
	}

	public static int countOfPalacewithfor(int[] nums)

	{
		long start = System.currentTimeMillis();

		if (nums == null || nums.length == 0)
			return 0;
		if (nums.length == 1)
			return 1;
		int count = 1;
		int j = 0;

		for (int i = 0; i < nums.length; i++) {

			j = i + 1;

			if (j >= nums.length) {
				return count;
			}

			if (nums[i] == nums[j]) {

				continue;

			}

			else if (nums[i] > nums[j]) {
				count++;

				for (int k = j + 1; k < nums.length; k++) {
					if (nums[k - 1] >= nums[k]) {
						continue;
					} else {
						i = k - 1;
						break;
					}

				}
			}

			else {
				count++;

				for (int k = j + 1; k < nums.length; k++) {
					if (nums[k] >= nums[k - 1]) {
						continue;
					} else {
						i = (k - 1) - 1;
						break;
					}

				}

			}

		}
		long end = System.currentTimeMillis();

		System.out.println("the total time taken is " + (end - start));
		return count;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long start = System.nanoTime();

		int[] arr = { 2, 2, 3, 4, 3, 3, 2, 2, 1, 1, 2, 5 };

		int result = countOfPalacewithfor(arr);
		long end = System.nanoTime();

		System.out.println("the number of palaces are " + result + " processing time is " + (end - start));

	}

}
