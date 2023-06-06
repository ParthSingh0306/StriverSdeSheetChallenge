package Day2;

public class DuplicateNumber {

	public static void main(String[] args) {
		int[] arr = {1, 1, 2};
		System.out.println(findDuplicate(arr, arr.length));
	}
	
	public static int findDuplicate(int[] arr, int n){
        int slow = arr[0];
        int fast = arr[0];

        do{
            slow = arr[slow];
            fast = arr[arr[fast]];
        } while(slow != fast);

        fast = arr[slow];

        while(slow != fast) {
            slow = arr[slow];
            fast = arr[fast];
        }

        return slow;
    }

}
