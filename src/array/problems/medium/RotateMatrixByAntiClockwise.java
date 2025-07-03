package array.problems.medium;

public class RotateMatrixByAntiClockwise {
	public static void main(String[] args) {
		int[][] nums = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][] temp = new int[nums.length][nums[0].length];

//		firstApproach(nums, temp);// Brute-Force
//		display(nums);
//		secondApproach(nums);
		display(nums);
		thirdApproach(nums);

	}

	private static void thirdApproach(int[][] nums) {
		
	}

	private static void secondApproach(int[][] nums) {
		// Transpose of matrix
		System.out.println("After transpose Matrix is :: ");
		for (int row = 0; row < nums.length; row++) {
			for (int column = 0; column < nums[0].length; column++) {
				if (column > row) {
					nums[row][column] = nums[row][column] + nums[column][row] - (nums[column][row] = nums[row][column]);
				}
			}
		}

		// Reverse each column
		
		for (int column = 0; column < nums[0].length; column++) {
			int start = 0;
			int end = nums[0].length - 1;
			for (int row = 0; row < nums.length; row++) {
				while (start < end) {
					nums[start][column] = nums[start][column] + nums[end][column]
							- (nums[end][column] = nums[start][column]);
					start++;
					end--;
				}
			}
		}
	}

	private static void display(int[][] temp) {
		for (int row = 0; row < temp.length; row++) {
			for (int column = 0; column < temp[0].length; column++) {
				System.out.print(temp[row][column] + " ");
			}
			System.out.println();
		}

	}

	private static void firstApproach(int[][] nums, int[][] temp) {

		int tempVariable = temp[0].length - 1;
		for (int row = 0; row < nums.length; row++) {
			for (int column = 0; column < nums[0].length; column++) {
				temp[row][column] = nums[column][tempVariable];
			}
			tempVariable--;
		}
	}
}
