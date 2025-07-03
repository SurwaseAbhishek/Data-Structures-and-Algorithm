package array.problems.medium;

public class RarrangeArrayElementBySign {
	public static void main(String[] args) {
		int num[] = new int[] {3,-1,4,5,-2,6,-5,-7};
		firstApproach(num); // O(2n) S.C O(n/2)+O(n/2)+O(n)
		secondApproach(num); // O(n)
		
	}
	
	private static void secondApproach(int[] num) {
		System.out.println();
		int []ans = new int [num.length];
		int negindex=1;
		int posindex=0;
		for(int index = 0;index<num.length;index++) {
			if(num[index]>0) {
				ans[posindex]=num[index];
				posindex+=+2;
			}else {
				ans[negindex]=num[index];
				negindex+=2;
			}
		}
		
		for(int value : ans) {
			System.out.print(value+" ");
		}
	}

	public static void firstApproach(int []num) {
		int []positiveArray = new int[num.length/2];
		int []negativeArray = new int[num.length/2];
		int positiveIndex=0;
		int negativeIndex=0;
		int index =0;
		while(index<num.length) {
			if(num[index]>0) {
				positiveArray[positiveIndex]=num[index];
				positiveIndex++;
			}else {
				negativeArray[negativeIndex]=num[index];
				negativeIndex++;
			}
			index++;
		}
		
		for(int ansindex =0;ansindex<num.length/2;ansindex++) {
			num[ansindex*2]=positiveArray[ansindex];
			num[ansindex*2+1]=negativeArray[ansindex];
		} 
		
		for(int value : num) {
			System.out.print(value+" ");
		}
	}
}
