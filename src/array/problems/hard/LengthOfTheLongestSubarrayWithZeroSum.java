package array.problems.hard;

import java.util.HashMap;
import java.util.Map;

/*Example 1:
Input Format: N = 6, array[] = {9, -3, 3, -1, 6, -5}
Result: 5
Explanation: The following subarrays sum to zero:
{-3, 3} , {-1, 6, -5}, {-3, 3, -1, 6, -5}
Since we require the length of the longest subarray, our answer is 5!
*/
//Implementation
public class LengthOfTheLongestSubarrayWithZeroSum {
	public static void main(String[] args) {
		int [] nums = new int[] {9, -3, 3, -1, 6, -5};
		System.out.println(bruteForce(nums));
		System.out.println(betterApproach(nums));
	}//main
	
	
	// O(n)
	private static int betterApproach(int[] nums) {
		int maxSubarraySize = 0,sumofSubArray=0;
		Map<Integer,Integer> mapp = new HashMap<Integer, Integer>();
		for(int i=0;i<nums.length;i++) {
			sumofSubArray+=nums[i];
			if(sumofSubArray==0) {
				maxSubarraySize+=1;
			}//if
			if(mapp.get(sumofSubArray)!=null) {
				maxSubarraySize = Math.max(maxSubarraySize, i-mapp.get(sumofSubArray));
			}//if
			else
			{
				mapp.put(sumofSubArray, i);
			}//else
		}//for
		return maxSubarraySize;
	}//betterApproach

	//O(n*n)
	private static int bruteForce(int[] nums) {
		int maxSubarraySize = 0;
		for(int i=0;i<nums.length;i++) {
			int sumofSubArray=0;
			for(int j=i;j<nums.length;j++){
				sumofSubArray+=nums[j];
				if(sumofSubArray==0) {
					maxSubarraySize=Math.max(maxSubarraySize, j-i+1);
				}//if
			}//inner-loop
		}//outer-loop
		return maxSubarraySize;
	}//bruteForce
	
}//LengthOfTheLongestSubarrayWithZeroSum
