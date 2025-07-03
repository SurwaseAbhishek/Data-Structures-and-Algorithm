package array.problems.easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class UniqueElementInArray {

	public static void main(String[] args) {
		int []a = new int []{1,2,2,2,3,3,4,5,6,6,7,7,8};
//		firstApproach(a);
//		secondApproach(a);
		thirdApproach(a);
	}

	private static void thirdApproach(int[] a) {
		// Two pointer Optimal Approach O(n)
		int i =0,j=i+1;
		while(j<a.length) {
			if(a[i]!=a[j]) {
				a[i+1]=a[j];
				i++;
			}
			j++;
		}
		
		for(int k =0;k<i+1;k++) {
			System.out.print(a[k]+" ");
		}
		System.out.println("Unique element are : "+(i+1));

		
	}

	@SuppressWarnings("unused")
	private static void secondApproach(int[] a) {
		// We will add in set set contains unique elements
		// Here O(n log n) log n for HashMap() n is for loop if all number are already unique
		HashSet<Integer> set = new HashSet<Integer>();
		for(int i=0;i<a.length;i++) {
			set.add(a[i]);
		}
		for(Integer num :set) {
			System.out.println(num+" ");
		}
		System.out.println("Unique element are : "+set.size());

	}

	@SuppressWarnings("unused")
	private static void firstApproach(int[] a) {
		// Wrong Approach
		List<Integer> list = new ArrayList<Integer>();
			for(int i=0;i<a.length;i++) {
				for(int j=i+1;j<a.length;j++) {
					if(a[i]==a[j]) {
						list.add(a[i]);
						break;
					}
				}
			}
		for(Integer num :list) {
			System.out.println(num+" ");
		}
		System.out.println("Unique element are"+list.size());

	}
}
