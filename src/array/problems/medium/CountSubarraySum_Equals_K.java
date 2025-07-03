package array.problems.medium;

import java.util.HashMap;
import java.util.Map;

public class CountSubarraySum_Equals_K {
	public static void main(String[] args) {
		int[] nums = new int[] { 3, 7, 6, 4, 5, 5, 2, 5, 3, 1 };
//		firstApproach(nums,6);
		secondApproach(nums,10); // pre-sum
	}

	private static void secondApproach(int[] nums, int k) {
		int cnt=0;
		int preSum=0;
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		map.put(0,1);
		for(int i=0;i<nums.length;i++) {
			preSum+=nums[i];
			int diff = preSum-k;
			cnt += map.getOrDefault(diff,0);
			map.put(preSum, map.getOrDefault(preSum,0)+1);
		}
		System.out.println("Given Array have :: "+cnt+" subarray with given sum :: "+k);
	}

	@SuppressWarnings("unused")
	private static void firstApproach(int[] nums,int k) {
		int subArrayCount = 0;

		for (int pointer1 = 0; pointer1 < nums.length; pointer1++) {
			int ans = 0;
			for (int pointer2 = pointer1; pointer2 < nums.length; pointer2++) {
				ans += nums[pointer2];
				if(ans == k) {
					subArrayCount++;
					break;
				}
			}
		}
		System.out.println("Given Array have :: "+subArrayCount+" subarray with given sum :: "+k);
	}
}
