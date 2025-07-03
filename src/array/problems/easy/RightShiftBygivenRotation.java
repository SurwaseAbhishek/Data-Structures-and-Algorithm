package array.problems.easy;

public class RightShiftBygivenRotation {
	public static void main(String[] args) {
		int[]nums = new int[] {1,2,3,4,5,6,7};
//		firstApproach(nums);
//		secondApproach(nums,10);
		thirdApproach(nums,5);
	}

	private static void thirdApproach(int[] nums, int d) {
//		Here we can do it in O(2n) and S.C O(1)	
		int k = d%nums.length;
		int i=0,j=k-1;
		while(i<j) {
			nums[i]=nums[i]+nums[j]-(nums[j]=nums[i]);
			i++;j--;
		}
		for(int num : nums) {
			System.out.print(num+" ");
		}
		System.out.println();
		i=k;j=nums.length-1;
		while(i<j) {
			nums[i]=nums[i]+nums[j]-(nums[j]=nums[i]);
			i++;j--;
		}
		for(int num : nums) {
			System.out.print(num+" ");
		}
		System.out.println();
		i=0;j=nums.length-1;
		while(i<j) {
			nums[i]=nums[i]+nums[j]-(nums[j]=nums[i]);
			i++;j--;
		}
		for(int num : nums) {
			System.out.print(num+" ");
		}
	}

	@SuppressWarnings("unused")
	private static void secondApproach(int[] nums,int rotation) {
		// In this pproach T.C O(d)+O(n-d)+O(d) : O(n) and S.C is O(d) because we are taking one extra array for space
		int actualRotation = rotation%nums.length;
		int []temp = new int[actualRotation];
		for(int i=0;i<actualRotation;i++) {
			temp[i]=nums[i];
		}
		for(int num : temp) {
			System.out.print(num+" ");
		}
		System.out.println();
		for(int i=actualRotation;i<nums.length;i++) {
			nums[i-actualRotation]=nums[i];
		}
		for(int num : nums) {
			System.out.print(num+" ");
		}
		
		for(int i=nums.length-actualRotation;i<nums.length;i++) {
			nums[i]=temp[i-(nums.length-actualRotation)];
		}
		System.out.println();
		for(int num : nums) {
			System.out.print(num+" ");
		}
	}

	@SuppressWarnings("unused")
	private static void firstApproach(int[] nums) {
		for(int k=0;k<2;k++) {
			int temp = nums[nums.length-1];
			for(int i=nums.length-2;i>=0;i--) {
					nums[i+1]=nums[i];
			}
			nums[0]=temp;
		}
		for(int num : nums)
		{
			System.out.print(num+" ");
		}
	}
}
