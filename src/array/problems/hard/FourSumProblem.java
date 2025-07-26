package array.problems.hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*4 Sum | Find Quads that add up to a target value

Example 1:
Input Format: arr[] = [1,0,-1,0,-2,2], target = 0
Result: [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]
Explanation: We have to find unique quadruplets from the array such that the sum of those elements is equal to the target sum given that is 0. The result obtained is such that the sum of the quadruplets yields 0.

Example 2:
Input Format: arr[] = [4,3,3,4,4,2,1,2,1,1], target = 9
Result: [[1,1,3,4],[1,2,2,4],[1,2,3,3]]
Explanation: The sum of all the quadruplets is equal to the target i.e. 9.*/

public class FourSumProblem {
	public static void main(String[] args) {
		int[] nums = new int[]{4,3,3,4,4,2,1,2,1,1};
		int targetSum=9;
//		printNumbers(bruteForceApproach(nums,targetSum)); // Worst approach o(n*n*n*n)
		System.out.println("---------------------------");
//		printNumbers(betterApproach(nums,targetSum)); // Best Approach as T.C is O(n*n*n) S.C O(No. of list formed)
		System.out.println("---------------------------");
		printNumbers(optimisedApproach(nums,targetSum)); // Best Approach as T.C is O(n*n*n) S.C O(No. of list formed) as to store no of quadruplet
		
	}//main
	
	/*
	 * Steps : fixed 2-pointer which will travel 2-pointer will move check sum ==
	 * sum(4-pointers) if(sum==target) add to list increament 2 moving pointer
	 * if(sum<target) increament 1-pointer until duplicate avoid if(sum>target) that
	 * means we need lesser nom increament 2-pointer until duplicate avoid
	 */
	private static List<List<Integer>> optimisedApproach(int[] nums, int targetSum) {
		//This approach avoid S.C for hashSet 
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		Arrays.sort(nums); //[1, 1, 1, 2, 2, 3, 3, 4, 4, 4]
		for(int i=0;i<nums.length;i++) {
			if(i!=0&&nums[i]==nums[i-1])continue;
			for(int j=i+1;j<nums.length;j++) {
				if(j>i+1&&nums[j]==nums[j-1])continue;
				int k=j+1;
				int o=nums.length-1;
				while(k<o) {
					if(targetSum<nums[i]+nums[j]+nums[k]+nums[o]) {
						o--;
					}//if
					else if(targetSum>nums[i]+nums[j]+nums[k]+nums[o]) {
						k++;
					}//else-if
					else {
						list.add(Arrays.asList(nums[i],nums[j],nums[k],nums[o]));
						k++;o--;
						while(k<o&&nums[k]==nums[k-1]) k++;
						while(k<o&&nums[o]==nums[o+1]) o--;

					}//else
				}//while
			}//j-loop
		}//i-loop
		return list;
	}//optimisedApproach
	
	
	private static List<List<Integer>> betterApproach(int[] nums, int targetSum) {
		Set<List> set = new HashSet<List>();
		Set<Integer> uniqueSet = null;
		for(int i=0;i<nums.length;i++) {
			for(int j=i+1;j<nums.length;j++) {
				uniqueSet = new HashSet<Integer>();
				for(int k=j+1;k<nums.length;k++) {
					int targetValue = targetSum - nums[i]-nums[j]-nums[k];
					if(uniqueSet.contains(targetValue)) {
						List<Integer> list = Arrays.asList(nums[i],nums[j],nums[k],targetValue);
						list.sort(null);
						set.add(list);
					}
					uniqueSet.add(nums[k]);
				}//k-loop
			}//j-loop
		}//i-loop
		
		return new ArrayList<>(set);
	}//betterApproach
	/*
	  Steps : travel travel travel travel 
	  If found stored in list sort it and add
	  List in set if duplicate pairs
	 */
	private static List<List<Integer>> bruteForceApproach(int[] nums, int targetSum) {
		Set<List> set = new HashSet<List>();
		for(int i=0;i<nums.length;i++) {
			for(int j=i+1;j<nums.length;j++) {
				for(int k=j+1;k<nums.length;k++) {
					for(int o=k+1;o<nums.length;o++) {
						if(targetSum==nums[i]+nums[j]+nums[k]+nums[o]) {
							List<Integer> list = Arrays.asList(nums[i],nums[j],nums[k],nums[o]);
							list.sort(null);
							set.add(list);
						}
					}//o-loop
				}//k-loop
			}//j-loop
		}//i-loop
		return new ArrayList<>(set);
	}//bruteForceApproach
	
	//print calculated list
	private static void printNumbers(List<List<Integer>> list) {
		for (List<Integer> proxyList : list) {
			for (Integer num : proxyList) {
				System.out.print(num + " ");
			}//inner-loop
			System.out.println();
		}//outr-loop
	}//printNumbers
}//FourSumProblem
