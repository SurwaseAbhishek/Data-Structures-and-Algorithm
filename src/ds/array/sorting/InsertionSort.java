package ds.array.sorting;

public class InsertionSort {

	public static void main(String[] args) {
		int[]a = new int [] {5,4,10,1,6,2};
		for(int i=1;i<a.length;i++)
		{
			int temp = a[i];
			int j=i-1;
			while(j>=0 && a[j]>temp) {
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=temp;
		}
		for(int num : a) {
			System.out.println(num+" ");
		}
	}
}
