package Day1;

public class Kadane {

	public static void main(String[] args) {
		int[] arr = {1, 1, 0, 0, 2};
		System.out.println(maxSubarraySum(arr, arr.length));
	}
	
	public static long maxSubarraySum(int[] arr, int n) {
		long maxSum = Long.MIN_VALUE;
		long sum = 0;
		for(int el : arr) {
			sum += el;
			if(sum < 0) {
				sum = 0;
			}
			if(maxSum < sum) {
				maxSum = sum;
			}
		}
		return maxSum;
	}

}
