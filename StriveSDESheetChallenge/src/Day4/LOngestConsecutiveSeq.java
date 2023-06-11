package Day4;

import java.util.HashSet;
import java.util.Set;

public class LOngestConsecutiveSeq {

	public static void main(String[] args) {
		int[] nums = {100, 200, 2, 1, 4, 3};
		System.out.println(lengthOfLongestConsecutiveSequence(nums));
	}
	
	public static int lengthOfLongestConsecutiveSequence(int[] arr) {
        Set<Integer> set = new HashSet<>();

        for(int it : arr) {
            set.add(it);
        }

        int longest = 0;

        for(int num : arr) {
            if(!set.contains(num-1)) {
                int currentNo = num;
                int streak = 1;

                while(set.contains(currentNo+1)) {
                    currentNo += 1;
                    streak += 1;
                }

                longest = Math.max(longest, streak);
            }
        }

        return longest;
    }

}
