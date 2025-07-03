package array.problems.easy;

import java.util.Arrays;

public class MissingNumberInArray {

	public static void main(String[] args) {
		int [] nums = new int[] {3,0,1};
		Arrays.sort(nums);
//		firstApproach(nums);
//		secondApproach(nums);
//		thirdApproach(nums);
		fourthApproach(nums);
	}

	private static void fourthApproach(int[] nums) {
		int XOR1=0,XOR2=0;
		for(int i=0;i<nums.length;i++) {
			XOR1=XOR1^nums[i];
			XOR2=XOR2^(i);
		}
		XOR1=XOR1^nums.length;
		System.out.println(XOR1^XOR2);
		
	}

	@SuppressWarnings("unused")
	private static void thirdApproach(int[] nums) {
		// Hashing Technic in this technic we can count multiple missing number also 
        int size = findMax(nums);
        int []hashArray = new int[size+1];
        for(int i=0;i<nums.length;i++)
        {
        	hashArray[nums[i]]++;
        }
        for(int i=0;i<hashArray.length;i++) {
        	if(hashArray[i]==0) {
        		System.out.println(i+ ": is missing");
        	}
        }
	}

	@SuppressWarnings("unused")
	private static void secondApproach(int[] nums) {
        int size = findMax(nums);
		int total = (size*(size+1))/2;
		int actualSum = findSum(nums);
		System.out.println("Missing number is :"+(total-actualSum));
        

	}

	private static int findSum(int[] nums) {
		int sum = 0;
		for(int i=0;i<nums.length;i++) {
			sum = sum+nums[i];
		}
		return sum;
	}

	private static int findMax(int[] nums) {
		int max = nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
            }
        }
        return max;
	}

	@SuppressWarnings("unused")
	private static void firstApproach(int[] nums) {
		int i=0;
		while(i<nums.length) {
			if(i==nums.length-1) {
				break;
			}
			if(nums[i]!=nums[i+1]-1) {
				System.out.println((nums[i]+1) + " : is not present in Array");
				break;
			}
			i++;
		}		
	}
}
