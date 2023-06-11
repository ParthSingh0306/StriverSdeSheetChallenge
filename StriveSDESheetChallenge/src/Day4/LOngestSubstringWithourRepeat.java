package Day4;

import java.util.HashSet;
import java.util.Set;

public class LOngestSubstringWithourRepeat {

	public static void main(String[] args) {
		String input = "ParthParth";
		System.out.println(uniqueSubstrings(input));
	}
	
	public static int uniqueSubstrings(String input) {
		int n = input.length();
		Set<Character> set = new HashSet<>();
		int i=0; int j = 0;
		int max = Integer.MIN_VALUE;

		while(j < n) {
			char ch = input.charAt(j);
			if(!set.contains(ch)) {
				set.add(ch);
				j++;
				max = Math.max(max, set.size());
			}
			else {
				set.remove(input.charAt(i));
				i++;
			}
		}

		return max;
	}

}
