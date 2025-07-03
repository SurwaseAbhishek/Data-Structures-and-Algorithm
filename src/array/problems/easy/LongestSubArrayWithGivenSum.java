package array.problems.easy;

public class LongestSubArrayWithGivenSum {

	public static void main(String[] args) {
		int [] nums = new int[] {2,3,5,1,9};
		firstApproach(nums,22);
	}

	private static void firstApproach(int[] nums,int k) {
		 int len =0;
		 for(int i =0;i<nums.length;i++) {
			 int sum =0;
			 for(int j=i;j<nums.length;j++) {
				 sum = sum + nums[j];
				 if(sum==k) {
					 len = Math.max(len, j-i+1);
				 }
				 if(sum>k) {
					 break;
				 }
			 }
		 }
		 System.out.println(len + " is Longest SubArray");
	}
}
