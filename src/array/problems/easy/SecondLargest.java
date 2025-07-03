package array.problems.easy;

import java.util.Arrays;

public class SecondLargest {

	public static void main(String[] args) {
		int []a = new int[] {1,2,2,3,4,5,6,6,7,7,};
		firstAppraoch(a);  
		secondApproach(a);
		thirdApproach(a);
	}

	private static void thirdApproach(int[] a) {
		System.out.println("Second Larget :"+secondLargest(a));
		System.out.println("Second Smallet :"+secondSmallest(a));
	}

	private static int secondSmallest(int[] a) {
		int smallest =a[0];
		int ssmallest=Integer.MAX_VALUE;
		for(int i=1;i<a.length;i++) {
			if(a[i]<smallest) {
				ssmallest=smallest;
				smallest=a[i];
			}else if(a[i]!=smallest&&a[i]<ssmallest) {
				ssmallest=a[i];
			}
		}
		return ssmallest;
	}

	private static int secondLargest(int[] a) {
		System.out.println("ThirdApproach");
		int largest=a[0];
		int slargest=-1;
		for(int i=1;i<a.length;i++) {
			if(a[i]>largest) {
				slargest=largest;
				largest=a[i];
			}else if(a[i]<largest&&a[i]>slargest){
				slargest=a[i];
			}
		}
		return slargest;
	}

	private static void secondApproach(int[] a) {
		System.out.println("SecondApproach");

		//Single traversal	O(n) T.C
		// First will find largest then second largest by compare with largest 
		if(a.length==1 || a.length==0) {
			System.out.println("Second smallet is : "+ -1);
			System.out.println("Second largest is : "+ -1);
			return;
		}
		int largest=a[0],smallest=a[0];
		for(int i =1;i<a.length;i++) {
			if(a[i]>largest) {
				largest=a[i];
			}else if(a[i]<smallest) {
				smallest=a[i];
			}
		}
		
		int secondLargest = -1,secondSmallet = a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>secondLargest && a[i]!=largest) {
				secondLargest=a[i];
			}else if(a[i]<secondSmallet && a[i]!=smallest) {
				secondSmallet=a[i];
			}
		}
		
		System.out.println("Second smallet is : "+secondSmallet);
		System.out.println("Second largest is : "+secondLargest);
	}

	private static void firstAppraoch(int[] a) {
		System.out.println("FirstApproach");

		// Only Works When there is no duplicate 
		if(a.length==1 || a.length==0) {
			System.out.println("Second smallet is : "+ -1);
			System.out.println("Second largest is : "+ -1);
			return;
		}
		Arrays.sort(a);   // sort method internally use TimSort Algorithm 
		System.out.println("Second smallet is : "+a[1]);
		System.out.println("Second largest is : "+a[a.length-2]);
		
	}
}
