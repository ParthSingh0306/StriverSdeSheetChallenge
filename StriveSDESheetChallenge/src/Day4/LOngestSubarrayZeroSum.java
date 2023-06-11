package Day4;

import java.util.HashMap;
import java.util.Map;

public class LOngestSubarrayZeroSum {

	public static void main(String[] args) {
		int a[] = {9, -3, 3, -1, 6, -5};
		System.out.println(LongestSubsetWithZeroSum(a));
	}
	
	public static int LongestSubsetWithZeroSum(int[] arr) {
		int n = arr.length;
		Map<Integer, Integer> map = new HashMap<>();

		int maxi = 0;
		int sum = 0;
		for(int i=0; i<n; i++) {
			sum += arr[i];
			if(sum == 0) {
				maxi = i + 1;
			}
			else {
				if(map.containsKey(sum)) {
					maxi = Math.max(maxi, i - map.get(sum));
				}
				else {
					map.put(sum, i);
				}
			}
		}

		return maxi;
	}

}
