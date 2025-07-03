package ds.array.sorting;

public class BubbleSort {

	public static void main(String []args) {
		int []a =new int[] {1,2,3,4,5,6};
		for(int i=0;i<a.length-1;i++)
		{
			boolean flag = false;
			for(int j=0;j<a.length-1;j++) {
				if(a[j]>a[j+1]) {
					a[j]=a[j]+a[j+1]-(a[j+1]=a[j]);
					flag=true;
				}
			}
			if(flag=false) {
				break;
			}
		}
		for(int num : a) {
			System.out.println(num+" ");
		}
		
	}
}
