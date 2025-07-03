package array.problems.easy;

public class Consucative1sCount {

	public static void main(String[] args) {
		int [] nums= new int[] {1,1,1,1,0,1,1,1,1,1};
		firstApproach(nums);
		
	}

	private static void firstApproach(int []nums) {
		int maxCount=1,prevmaxCount=0;
		for(int i=0;i<nums.length-1;i++) {
			if(nums[i]==nums[i+1]){
				maxCount++;
			}else {
				if(maxCount>prevmaxCount)
					prevmaxCount = maxCount;
				maxCount=1;
			}
		}
		if(maxCount>prevmaxCount)
			System.out.println(maxCount);
		else 
			System.out.println(prevmaxCount);
		
		
	}
}
