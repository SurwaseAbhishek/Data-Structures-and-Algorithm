package array.problems.medium;

public class SetMatrixZero {

	public static void main(String[] args) {
		int [][]nums = new int[][] {{1,1,1,1},{1,0,1,1},{1,1,0,1},{1,0,0,1}};
		for(int[] num : nums) {
			for(int value :num) {
				System.out.print(value+" ");
			}
			System.out.println();
		}
		System.out.println();
//		firstApproach(nums); // brute force approach Worst T.c O(n*n*n)
		secondApproach(nums);// Better Solution
		
		for(int[] num : nums) {
			for(int value :num) {
				System.out.print(value+" ");
			}
			System.out.println();
		}
		
	}
	
private static void secondApproach(int[][] nums) {
	int []rowarray = new int[nums.length];
	int []columnArray = new int[nums[0].length];
	
	for(int i=0;i<nums.length;i++) {
		for(int j=0;j<nums[0].length;j++) {
			if(nums[i][j]==0) {
				rowarray[i]=1;
				columnArray[j]=1;
			}
		}
	}
	
	for(int i=0;i<nums.length;i++) {
		for(int j=0;j<nums[0].length;j++) {
			if((rowarray[i]==1 || columnArray[j]==1) && nums[i][j]!=0) {
				nums[i][j]=0;
			}
		}
	}
}

@SuppressWarnings(value = { "unused" })
	private static void firstApproach(int[][] nums) {
		for(int i=0;i<nums.length;i++) {
			for(int j=0;j<nums[0].length;j++) {
				if(nums[i][j]==0) {
					mapRow(nums,i);
					maoColumn(nums,j);
				}
			}
		}
		
		for(int i=0;i<nums.length;i++) {
			for(int j=0;j<nums[0].length;j++) {
				if(nums[i][j]==-1) {
					nums[i][j]=0;
				}
			}
		}
		
		for(int[] num : nums) {
			for(int value :num) {
				System.out.print(value+" ");
			}
			System.out.println();
		}
		
	}

	private static void mapRow(int[][] nums, int rowIndex) {
		for(int j=0;j<nums[0].length;j++) {
			nums[rowIndex][j]=-1;
		}
	}

	private static void maoColumn(int[][] nums, int columnIndex ) {
		for(int i=0;i<nums.length;i++) {
			nums[i][columnIndex]=-1;
		}		
	}
}
