package array.problems.easy;

public class LeftShiftElementInArray {

	public static void main(String[] args) {
		int[]nums = new int[] {1,2,3,4,5,6,7};
		firstApproach(nums);
	}

	private static void firstApproach(int[] nums) {
		for(int k=0;k<3;k++) {
			int temp = nums[0];
			for(int i=1;i<nums.length;i++) {
					nums[i-1]=nums[i];
			}
			nums[nums.length-1]=temp;
		}
		
		for(int num : nums)
		{
			System.out.print(num+" ");
		}
	}
}
