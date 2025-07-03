package array.problems.easy;

public class NumberOccursOnce {

	public static void main(String[] args) {
		int [] nums = new int[] {1,1,2,3,4,5,3,2,4};
		
//		firstApproach(nums); // Hashing T.C(O(n) and S.C O(maxElement+1) i.e O(n)
//		secondApproach(nums); // LinerSerach T.C O(n*n) S.C O(1)
		thirdApproach(nums);     // Optimal Approach   T.C is O(n) to travel array just S.C O(1)
		
		
	}

	// Optimal Approach
	private static void thirdApproach(int []nums) {
		// perform XOR operation
		int xor = 0;
		for(int i=0;i<nums.length;i++) {
			xor = xor ^ nums[i];
		}
		System.out.println(xor + " Founds once");
	}

	@SuppressWarnings("unused")
	// Liner Search Approach
	private static void secondApproach(int[] nums) {
		for(int i=0;i<nums.length;i++) {
			int max = nums[i];
			int j=0,cnt=0;
			while(j<nums.length) {
				if(nums[j]==max) {
					cnt++;
				}
				j++;
			}
			if(cnt==1)
				System.out.println(max+" Founds once");
		}
		
	}

	@SuppressWarnings("unused")
	private static void firstApproach(int[] nums) {
		int size = findMax(nums);
		int []hashArray = new int[size+1];
		
		for(int i=0;i<nums.length;i++) {
			hashArray[nums[i]]++;
		}
		
		for(int i=0;i<hashArray.length;i++) {
			if(hashArray[i]==1) {
				System.out.println(i+" : occurs once");
			}
		}		
	}

	private static int findMax(int[] nums) {
		int max =nums[0];
		for(int i=1;i<nums.length;i++) {
			if(nums[i]>max) {
				max= nums[i];
			}
		}
		return max;
	}
}
