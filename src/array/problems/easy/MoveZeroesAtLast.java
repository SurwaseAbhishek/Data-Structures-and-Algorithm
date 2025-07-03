package array.problems.easy;

import java.util.ArrayList;

public class MoveZeroesAtLast {
	public static void main(String[] args) {
		int[] nums = new int[] {0,2,3,0,0,4,0,5,0,6,7,8,0};
//		 firstApproach(nums);
//		secondApproach(nums);
		thirdApproach(nums);
	}

	private static void thirdApproach(int[] nums) {
		// Two Pointer Variable approach
		int j=-1;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]==0)
			{
				j=i;
				break;
			}
		}
		if(j==-1) {
			return;
		}
		
		for(int i=j+1;i<nums.length;i++) {
			if(nums[i]!= 0) {
				nums[j]=nums[j]+nums[i]-(nums[i]=nums[j]);
				j++;
			}
		}
		
		System.out.println();
		for(int num : nums) {
			System.out.print(num+" ");
		}
		
	}

	@SuppressWarnings("unused")
	private static void secondApproach(int[] nums) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<nums.length;i++) {
			if(nums[i]!=0) {
				list.add(nums[i]);
			}
		}
		System.out.println();
		for(int num : list) {
			System.out.print(num+" ");
		}
		
		for(int i=0;i<list.size();i++) {
			nums[i]=list.get(i);
		}
		
		for(int i=list.size();i<nums.length;i++) {
			nums[i]=0;
		}
		System.out.println();
		for(int num : nums) {
			System.out.print(num+" ");
		}
	}

	@SuppressWarnings("unused")
	private static void firstApproach(int[] nums) { 
		
		// S.C is O(n)
		int []temp = new int[nums.length];
		int j=nums.length-1;
		int k=0;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]==0) {
				temp[j]=nums[i];
				j--;
			}else {
				temp[k]=nums[i];
				k++;
			}
		}
		System.out.println();
		for(int num : temp) {
			System.out.print(num+" ");
		}
	}
}
