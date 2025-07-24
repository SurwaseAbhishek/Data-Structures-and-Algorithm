package array.problems.hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSumProblemSumshouldBeZero {
	public static void main(String[] args) {
		int[] nums = new int[] { -1, 0, 1, 2, -1, -4 };
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		list = BruteForceAproach(nums);
		printNumbers(list);
		System.out.println("--------------------------");
		BetterAproach(nums);
		printNumbers(list);
		System.out.println("--------------------------");
		OptimisedApproach(nums);
		printNumbers(list);


	}// main
	//[-4, -1, -1, 0, 1, 2]
	private static List<List<Integer>> OptimisedApproach(int[] nums) {
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
			if(i!=0 && nums[i]==nums[i-1]) continue;
			int j = i + 1;
            int k = nums.length - 1;
			while (j < k) {
				int sum = nums[i] + nums[j] + nums[k];
				if (sum == 0) {
					List<Integer> Uniquelist = Arrays.asList(nums[i], nums[j], nums[k]);
					list.add(Uniquelist);
					j++;k--;
					while (j < k && nums[j] == nums[j - 1]) j++;
                    while (j < k && nums[k] == nums[k + 1]) k--;
				}//if
				else if(sum<0){
						j++;
						while (j < k && nums[j] == nums[j - 1]) j++;
				}//else-if
				else {
					k--;
                    while (j < k && nums[k] == nums[k + 1]) k--;
				}//else
			}//while
		}//i-loop
		return list;
	}//OptimisedApproach

	private static void printNumbers(List<List<Integer>> list) {
		for (List<Integer> proxyList : list) {
			for (Integer num : proxyList) {
				System.out.print(num + " ");
			}
			System.out.println();
		}
	}

	private static ArrayList<List<Integer>> BetterAproach(int[] nums) {
		Set<Integer> uniqueSet = new HashSet<Integer>();
		Set<List<Integer>> set = new HashSet<List<Integer>>();
		for (int i = 0; i < nums.length; ++i) {
			for (int j = i + 1; j < nums.length; ++j) {
				int findK = -(nums[i] + nums[j]);
				if (uniqueSet.contains(findK)) {
					List<Integer> sumList = Arrays.asList(nums[i], nums[j], findK);
					sumList.sort(null);
					set.add(sumList);
				} // if
			} // j-loo
		} // i-loop
		return new ArrayList<>(set);
	}// BetterAproach

	private static ArrayList<List<Integer>> BruteForceAproach(int[] nums) {
		Set<List<Integer>> set = new HashSet<>();
		for (int i = 0; i < nums.length; ++i) {
			for (int j = i + 1; j < nums.length; ++j) {
				for (int k = j + 1; k < nums.length; ++k) {
					if (nums[i] + nums[j] + nums[k] == 0) {
						List<Integer> sumList = Arrays.asList(nums[i], nums[j], nums[k]);
						sumList.sort(null);
						set.add(sumList);
					} // if
				} // k-loop
			} // j-loop
		} // i-loop
		return new ArrayList<>(set);
	}// BruteForceAproach
}// ThreeSumProblemSumshouldBeZero
