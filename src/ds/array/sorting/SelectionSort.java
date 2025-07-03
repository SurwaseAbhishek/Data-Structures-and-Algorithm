package ds.array.sorting;

public class SelectionSort {

	public static void main(String[] args) {
		int[] a = new int[] { 7, 4, 10, 8, 3, 1 };
		for(int i=0;i<a.length-1;i++)
		{
			int min = i;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[j]<a[min])
				min=j;
			}
			if(min!=i)
				a[i]=a[i]+a[min]-(a[min]=a[i]);
		}
		for(int num : a)
			System.out.print(num+" ");
	}
}
