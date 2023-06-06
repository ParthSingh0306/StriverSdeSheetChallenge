package Day2;

import java.util.ArrayList;
import java.util.Arrays;

public class RepeatingMissingNumber {

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(1); arr.add(2); arr.add(3); arr.add(5); arr.add(5);
		System.out.println(Arrays.toString(missingAndRepeating(arr, 5)));
	}
	
	public static int[] missingAndRepeating(ArrayList<Integer> arr, int n) {
        long sn = (n*(n+1)) / 2;
        long s2n = (n*(n+1)*(2*n+1)) / 6;

        long s = 0;
        long s2 = 0;

        for(int el : arr) {
            s += el;
            s2 += ( (long) (el) * (long) (el) );
        }

        long val1 = s - sn; // x- y
        long val2 = s2 - s2n; // x2 - y2

        val2 = val2 / val1;  // x + y = (x+y * x-y)  / x-y

        long x = (val1 + val2) / 2;
        long y = x - val1;

        return new int[] {(int) y , (int) x};
    }

}
