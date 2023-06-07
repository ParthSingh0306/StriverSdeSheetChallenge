package Day3;

import java.util.ArrayList;

public class MajorityElement2 {

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>() {{add(7); add(4); add(4); add(9); add(7); }};
		System.out.println(majorityElement2(arr));
	}
	
	public static ArrayList<Integer> majorityElement2(ArrayList<Integer> arr) {
        int n = arr.size();
        ArrayList<Integer> ans = new ArrayList<>();

        int cnt1 = 0;
        int cnt2 = 0;

        int el1 = Integer.MIN_VALUE;
        int el2 = Integer.MIN_VALUE;

        for(int i=0; i<n; i++) {
            if(cnt1 == 0 && el2 != arr.get(i)) {
                cnt1 = 1;
                el1 = arr.get(i);
            }
            else if(cnt2 == 0 && el1 != arr.get(i)) {
                cnt2 = 1;
                el2 = arr.get(i);
            }
            else if(el1 == arr.get(i)) cnt1++;
            else if(el2 == arr.get(i)) cnt2++;
            else {
                cnt1--; cnt2--;
            }
        }

        cnt1 = 0;
        cnt2 = 0;

        for(int el : arr) {
            if(el == el1) cnt1++;
            if(el == el2) cnt2++;
        }

        int maj = Math.floorDiv(n, 3);

        if(cnt1 > maj) ans.add(el1);
        if(cnt2 > maj) ans.add(el2);

        return ans;
    }

}
