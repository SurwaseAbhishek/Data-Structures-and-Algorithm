package array.problems.medium;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
	public static void main(String[] args) {
		int nums[] = new int[] {3,2,4};
		int targtedSum=6;
//		 firstApproach(nums); // approach T.C O(n*n) i.e n square
/*		 int []ans = secondapproach(nums,targtedSum); // Hashing  required element = target - current  selected element
		 for(int num : ans) {
			 System.out.print(num+" ");
		 }
*/
		int []ans = thirdApproach(nums,targtedSum); // Using two Pointers
		for(int num : ans) {
			 System.out.print(num+" ");
		 }
		 
	}

	private static int[] thirdApproach(int[] nums,int target) {
		int ans[]=new int[2];
        ans[0]=ans[1]=-1;
        Arrays.sort(nums);
        int left = 0;int right = nums.length-1;
        while(left<right){
            if(nums[left]+nums[right]==target) ans[0]=left;ans[1]=right;
            if(nums[left]+nums[right]>target) right--;
            else left++;
        }
        return ans;
		
	}

	@SuppressWarnings("unused")
	private static int[] secondapproach(int[] nums,int targtedSum) {
		int []ans = new int[2];
		HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
		ans[0]=ans[1]=-1;
		for(int i=0;i<nums.length;i++) {
			int targetedElement = targtedSum-nums[i];
			if(map.containsKey(targetedElement)) {
				ans[1]= i;
				ans[0]= map.get(targetedElement);
			}
			map.put(nums[i], i);
		}
		return ans;
	}

	@SuppressWarnings("unused")
	private static void firstApproach(int[] nums) {
		int targetedSum = 14;
		int totalSum = 0;
		boolean flag = false;
		for(int i=0;i<nums.length;i++) {
			totalSum=0;
			for(int j=i;j<nums.length;j++) {
				totalSum=nums[i]+nums[j];
				if(totalSum==targetedSum) {
					flag =true;
					System.out.println(flag);
					System.out.println("Integers are present at : "+i+" and "+j+" position");
					System.exit(0);
				}
			}
		}		
	}
	
}
