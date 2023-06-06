package Day2;

import java.util.Arrays;

public class MergeTwoSortedArrays {

	public static void main(String[] args) {
		int[] arr1 = {1, 2, 5, 7, 8};
		int[] arr2 = {3, 6, 9, 10};
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(ninjaAndSortedArrays(arr1, arr2, 5, 4)));
	}
	
	public static int[] ninjaAndSortedArrays(int arr1[], int arr2[], int m, int n) {
        int[] ans = new int[n+m];
        int f = 0;
        int s = 0;
        int k = 0;

        while(f < m && s < n) {
            if(arr1[f] < arr2[s]) {
                ans[k++] = arr1[f];
                f++;
            }
            else {
                ans[k++] = arr2[s];
                s++;
            }
        }

        while(f < m) {
            ans[k++] = arr1[f];
            f++; 
        }

        while(s < n) {
            ans[k++] = arr2[s];
            s++;
        }

        return ans;
    }

}
