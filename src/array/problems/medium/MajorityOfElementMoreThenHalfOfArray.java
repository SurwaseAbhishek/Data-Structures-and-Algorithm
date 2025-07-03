package array.problems.medium;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MajorityOfElementMoreThenHalfOfArray {

	public static void main(String[] args) {
		int []nums = new int[] {7,7,5,7,5,1,5,7,7,5,7,7};
//		firstApproach(nums);
//		secondApproach(nums);  // using hashing technique
		thirfApproach(nums);
	}
	
	private static void thirfApproach(int[] nums) {

		int selectedElement=0;
		int count=0;
		for(int i=0;i<nums.length;i++) {
			if(count==0) {
				count++;
				selectedElement=nums[i];
			}
			else if(nums[i]==selectedElement){
				count++;
			}else {
				count--;
			}
		}
		
		count=0;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]==selectedElement) {
				count++;
			}
		}
		if(count>nums.length/2) {
			System.out.println(selectedElement +" Having count greter then array size");
		}
		
	}

	@SuppressWarnings("unused")
	private static void secondApproach(int[] nums) {
		HashMap<Integer,Integer> mpp = new HashMap<Integer,Integer>();
		for(int i=0;i<nums.length;i++) {
			int value = mpp.getOrDefault(nums[i],0);
			mpp.put(nums[i], value+1);
		}
		
		for(Map.Entry<Integer, Integer> map : mpp.entrySet()){
			if(map.getValue()>nums.length/2) {
				System.out.println(map.getKey());
			}
		}
	}

	@SuppressWarnings("unused")
	private static void firstApproach(int[] nums) {
		for(int i=0;i<nums.length;i++) {
			int count=0;
			for(int j=0;j<nums.length;j++) {
				if(nums[i]==nums[j]) {
					count++;
				}
			}
			if(count>nums.length/2) {
				System.out.print(nums[i]);		
				break;
				
			}
		}
	}
}
  