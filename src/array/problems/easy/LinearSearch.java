package array.problems.easy;

public class LinearSearch {

	public static void main(String[] args) {
		int []nums = new int[] {2,3,4,55,77,8,9,55,6,};
		
		// T.C o(n)
		int key = 55;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]==key) {
				System.out.println("element is present at : "+(i)+" postion");
			}
		}
	}
}
