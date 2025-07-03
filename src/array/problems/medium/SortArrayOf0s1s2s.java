package array.problems.medium;

public class SortArrayOf0s1s2s {
	public static void main(String[] args) {
		int []nums = new int[]{2,0,2,1,1,0};
//		firstApproach(nums);
		// we can use sorting technique also merge dort will give us n lo n T.C
		secondApproach(nums);
	}

	private static void secondApproach(int[] nums) {
		int low=0,mid=0,high=nums.length-1;
		try {
			while(mid<=high)
			{
				if(nums[mid]==0) {
					nums[low]=nums[low]+nums[mid]-(nums[mid]=nums[low]);
					low++;mid++;
				}
				else if(nums[mid]==1) {
					mid++;
				}
				else if(nums[mid]==2) {
					nums[mid]=nums[mid]+nums[high]-(nums[high]=nums[mid]);
					high--;
				}
			}
		}catch(Exception e) {
			System.out.println(low);
			System.out.println(mid);
			System.out.println(high);

		}
		for(int num : nums) {
			System.out.print(num+" ");
		}
		
	}

	private static void firstApproach(int[] nums) {
		int cnt0=0,cnt1=0,cnt2=0;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]==0) cnt0++;
			if(nums[i]==1) cnt1++;
			if(nums[i]==2) cnt2++;
		}
		int i=0;
		while(i<cnt0) {
			nums[i]=0;
			i++;
		}
		while(i<cnt1+cnt0) {
			nums[i]=1;
			i++;
		}
		while(i<nums.length) {
			nums[i]=2;
			i++;
		}
		
		for(int num : nums) {
			System.out.print(num+" ");
		}
	}
}
