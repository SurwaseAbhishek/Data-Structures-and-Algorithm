package array.problems.easy;

import java.util.Arrays;

class RecursiveApproach{
	
	public void recursiveApproach(int a[]) {
		int max = a[0];
		for(int i = 1;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		System.out.println("Maximum element is : "+max+" BrutForce Apprach");
	}
}
public class LargestElement {
	public static void main(String[] args) {
		RecursiveApproach rec = new RecursiveApproach();
		int []a = new int[] {2,33,45,12,34,56,22};
		rec.recursiveApproach(a);
		Arrays.sort(a);
		System.out.println("Maximum element is : "+a[a.length-1]);
	}

}
