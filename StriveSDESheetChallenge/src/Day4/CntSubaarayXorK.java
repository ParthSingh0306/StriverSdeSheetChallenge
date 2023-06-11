package Day4;

import java.util.HashMap;
import java.util.Map;

public class CntSubaarayXorK {

	public static void main(String[] args) {
		int[] a = {4, 2, 2, 6, 4};
        int k = 6;
        System.out.println(subarraysXor(a, k));
	}
	
	public static int subarraysXor(int[] arr, int x) {
		int n = arr.length;
		Map<Integer, Integer> map = new HashMap<>();
		int xr = 0;
		map.put(xr, map.getOrDefault(xr, 0) + 1);
		int cnt = 0;
		for(int i=0; i<n; i++) {
			xr = xr ^ arr[i];
			int req = xr ^ x;
			cnt += map.getOrDefault(req, 0);
			map.put(xr, map.getOrDefault(xr, 0) + 1);
		}

		return cnt;
	}

}
