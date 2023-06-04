package Day1;

import java.util.ArrayList;

public class PascalTriangle {

	public static void main(String[] args) {
		int n = 6;
		System.out.println(printPascal(n));
	}
	
	public static ArrayList<ArrayList<Long>> printPascal(int n) {
        ArrayList<ArrayList<Long>> ans = new ArrayList<>();
		for(int i=0; i<n; i++) {
			ArrayList<Long> ds = new ArrayList<>();
			ds.add((long)1);
			long res = 1;
			int rindex = i;
			for(int j=1; j<rindex+1; j++) {
				res = res * (rindex + 1 - j);
				res = res / (j);
				ds.add((long)res);
			}
			ans.add(new ArrayList<>(ds));
		}
		return ans;
	}

}
