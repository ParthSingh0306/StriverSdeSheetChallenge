package Day3;

public class MajorityElement1 {

	public static void main(String[] args) {
		int[] arr = {2, 3, 9, 2, 2};
		System.out.println(findMajority(arr, arr.length));
	}
	
	public static int findMajority(int[] arr, int n) {
		int el = arr[0];
		int cnt = 1;

		for(int i=1; i<n; i++) {
			if(arr[i] == el) cnt++;
			else cnt--;
			if(cnt == 0) {
				el = arr[i];
				cnt++;
			}
		}

		int cntEl = 0;
		for(int a : arr) {
			if(a == el) cntEl++;
		}

		int maj = Math.floorDiv(n, 2);
		if(cntEl > maj) return el;
		return -1;
	}

}
