package array.problems.medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeaderInArray {
	public static void main(String[] args) {
		int []nums = new int[] {4, 7, 1, 0};
		firstApproach(nums); //Bruete force O(n*n)
		secondApproach(nums);// Optimal Approach O(n)
		
	}

	private static void secondApproach(int[] nums) {
		List<Integer> leaderlist = new ArrayList<Integer>();
		int max = Integer.MAX_VALUE;
		for(int index=nums.length-1;index>=0;index--) {
			if(nums[index]>max){
				leaderlist.add(nums[index]);
				max=nums[index];
			}
		}
		Collections.reverse(leaderlist);
		for(int num: leaderlist) {
			System.out.print(num+" ");
		}
		
	}

	private static void firstApproach(int[] nums) {
		List<Integer> leaderList= new ArrayList<Integer>(); 
		for(int index = 0;index<nums.length;index++) {
			boolean flag =true;

			for(int j_index=index+1;j_index<nums.length;j_index++) {
				if(nums[index]<nums[j_index]) {
					flag=false;
				}
			}
			if(flag) {
				leaderList.add(nums[index]);
			}
		}
		
		for(Integer num : leaderList) {
			System.out.print(num+" ");
		}
	}
}
