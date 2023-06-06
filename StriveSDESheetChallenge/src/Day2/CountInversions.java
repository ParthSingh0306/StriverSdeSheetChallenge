package Day2;

public class CountInversions {

	public static void main(String[] args) {
		int[] arr = {5, 3, 2, 1, 4};
		int[] temp = new int[arr.length];
		System.out.println(mergeSort(arr, temp, 0, arr.length-1));
	}

	private static int mergeSort(int[] arr, int[] temp, int si, int ei) {
		int invCnt = 0;
		if(si < ei) {
			int mid = (si + ei) / 2;
			invCnt += mergeSort(arr, temp, si, mid);
			invCnt += mergeSort(arr, temp,  mid+1, ei);
			invCnt += merge(arr, temp, si, mid+1, ei);
		}
		return invCnt;
	}

	private static int merge(int[] arr, int[] temp, int si, int mid, int ei) {
		int invCnt = 0;
		int k = si;
		int i = si;
		int j = mid;
		while(i <= mid-1 && j <= ei) {
			if(arr[i] <= arr[j]) {
				temp[k] = arr[i];
				i++;
			}
			else {
				temp[k] = arr[j];
				j++;
				invCnt += (mid - i);
			}
			k++;
		}
		
		while(i <= mid-1) {
			temp[k++] = arr[i];
			i++;
		}
		
		while(j <= ei) {
			temp[k++] = arr[j];
			j++;
		}
		
		for(i=si; i<=ei; i++) {
			arr[i] = temp[i];
		}
		
		return invCnt;
	}

}
