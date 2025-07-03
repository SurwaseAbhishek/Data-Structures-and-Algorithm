package array.problems.easy;
import java.util.ArrayList;
import java.util.HashSet;

public class UnionOfSortedArray {

	public static void main(String[] args) {
		int []num1 = new int[] {1,2,3,4,5,6,7,8,9};
		int []num2 = new int[] {2,3,4,5,11,12};
//		 firstApproach(num1,num2);		
		secondApproach(num1,num2);
	}

	private static void secondApproach(int[] num1, int[] num2) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		int j=0,i=0;
		while((i<num1.length) && (j<num2.length)) {
			if(num1[i]<num2[j]) {
				if (list.size() == 0 || list.get(list.size()-1) != num1[i])
					list.add(num1[i]);
			      i++;
			}else {
				if(list.size()== 0 || list.get(list.size()-1) != num2[j]) {
					list.add(num2[j]);
					j++;
				}
			}
		}
		
		while(i<num1.length) {
			if (list.size() == 0 || list.get(list.size()-1) != num1[i])
				list.add(num1[i]);
		      i++;
		}
		
		
		while(j<num2.length) {
			if(list.size()== 0 || list.get(list.size()-1) != num2[j]) {
				list.add(num2[j]);
				j++;
			}
		}
		
		for(int num : list) {
			System.out.print(num+" ");
		}
	}

	@SuppressWarnings("unused")
	private static void firstApproach(int[] num1, int[] num2) {
		HashSet<Integer> map = new HashSet<Integer>();
		for(int i=0;i<num1.length;i++) {
			map.add(num1[i]);
			if(i<num2.length)
				map.add(num2[i]);
		}
		int []unionArray = new int[map.size()];
		int i=0;
		for(int num : map) {
			unionArray[i]=num;
			i++;
		}
		
		for(int num : unionArray) {
			System.out.print(num+" ");
		}
	}
	
	
}
