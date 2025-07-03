package array.problems.medium;

public class MaxSumKedeanesAlgo {
public static void main(String[] args) {
	int nums[] = new int[] {-2,1,-3,4,-1,2,1,-5,4};
	
	firstApproach(nums);// using two inner loop
	secondApproach(nums);
}

	private static void firstApproach(int[] nums) {
	// TODO Auto-generated method stub
	
}

	private static void secondApproach(int[] nums) {
		long max = Long.MIN_VALUE;
		int sum =0;
		int ansstart =-1; int ansend = -1;
		int start =0;
		for(int i=0;i<nums.length;i++) {
			if(sum==0) start = i;
			sum = sum+nums[i];
			if(sum>max) {
				max = sum;
				ansstart = start; 
				ansend=i;
				
			}
			if(sum<0) {
				sum=0;
			}
		}
		System.out.println(max);
		for(int i =ansstart;i<ansend;i++) {
			System.out.print(nums[i]+" ");
		}
	}

}
