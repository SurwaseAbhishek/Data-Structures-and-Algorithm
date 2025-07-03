package array.problems.medium;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NextPermutation {
	public static void main(String[] args) {
		int[]num = new int[]{1,3,2};
		List<int[]> list = Arrays.asList(num);
		int pointing =-1;
//		Observation 1 : find break point
			for(int index = num.length-2;index>=0;index++) {
				if(num[index]<num[index+1]) {
					pointing = index;
					break;
				}
			}	
			
			if(pointing==-1) {
				Collections.reverse(list);
			}
			
//		Observation 2 : find nearest element of pointing element
			int min = num[pointing];
			for(int index=pointing;index<num.length;index++) {
				
			}
	}
}
