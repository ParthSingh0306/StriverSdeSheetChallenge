package Day4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TwoSum {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		int sum = 5;
		List<int[]> ans = pairSum(arr, sum);
		for(int[] ar : ans) System.out.println(Arrays.toString(ar));
	}
	
	public static List<int[]> pairSum(int[] arr, int s) {
        Arrays.sort(arr);
        List<int[]> ans = new ArrayList<>();
        int n = arr.length;
        Map<Integer, Set<Integer>> map = new HashMap<>();

        for(int i=0; i<n; i++) {
            map.putIfAbsent(arr[i], new HashSet<>());
            map.get(arr[i]).add(i);
        }

        for(int i=0; i<n; i++) {
            if(map.containsKey(arr[i])) {
                map.get(arr[i]).remove(i);
            }

            if(map.containsKey(s - arr[i])) {
                Set<Integer> set = map.get(s - arr[i]);
                int[] arr1 = new int[2];

                arr1[0] = arr[i];
                arr1[1] = s - arr[i];

                for(int j : set) {
                    ans.add(arr1);
                }
            }
        }

        return ans;
    }

}
