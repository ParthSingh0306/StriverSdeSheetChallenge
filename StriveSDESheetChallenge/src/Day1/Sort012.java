package Day1;

import java.util.Arrays;

public class Sort012 {

	public static void main(String[] args) {
		int[] arr = {1, 1, 0, 0, 2};
		System.out.println(Arrays.toString(arr));
		sort012(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void sort012(int[] arr){
        int n = arr.length;
        int low = 0;
        int high = n-1;
        int mid = 0;

        while(mid <= high) {
            if(arr[mid] == 0) {
                swap(low, mid, arr);
                mid++;
                low++;
            }
            else if(arr[mid] == 2) {
                swap(high, mid, arr);
                high--;
            }
            else {
                mid++;
            }
        }
    }

    public static void swap(int f, int s, int[] arr) {
        int temp = arr[f];
        arr[f] = arr[s];
        arr[s] = temp;
    }

}
