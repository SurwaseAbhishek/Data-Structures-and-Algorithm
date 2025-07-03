package array.problems.easy;

public class ArraySortedOrNot {

	public static void main(String[] args) {
		int []a = new int[] {4,7,8,9,12};
		// Best Approach O(n)
		firstApproach(a);
		
	}

	private static void firstApproach(int[] a) {
		boolean flag = false;
		for(int i=0;i<a.length-1;i++) {
			if(a[i]>a[i+1]) {
				flag=true;
			}
		}
		if(flag==true) {
			System.out.println("Array is Not sorted");
		}else {
			System.out.println("Array is sorted");
		}
	}
}
