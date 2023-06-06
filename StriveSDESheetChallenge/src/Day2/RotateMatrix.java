package Day2;

import java.util.ArrayList;

public class RotateMatrix {

	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> mat = new ArrayList<>();
		ArrayList<Integer> a1 = new ArrayList<>() { {add(1); add(2); add(3);} };
		ArrayList<Integer> a2 = new ArrayList<>() { {add(4); add(5); add(6);} };
		ArrayList<Integer> a3 = new ArrayList<>() { {add(7); add(8); add(9);} };
		mat.add(a1);
		mat.add(a2);
		mat.add(a3);
		System.out.println(mat);
		rotateMatrix(mat, 3, 3);
		System.out.println(mat);
	}
	
	public static void rotateMatrix(ArrayList<ArrayList<Integer>> mat, int n, int m) {
        int u = 0;
        int l = 0;
        int r = m-1;
        int d = n-1;

        while(l<r && u<d) {
            int prev = mat.get(u+1).get(l);

            for(int i=l; i<=r; i++) {
                int curr = mat.get(u).get(i);
                mat.get(u).set(i, prev);
                prev = curr;
            }
            u++;

            for(int i=u; i<=d; i++) {
                int curr = mat.get(i).get(r);
                mat.get(i).set(r, prev);
                prev = curr;
            }
            r--;

            for(int i=r; i>=l; i--) {
                int curr = mat.get(d).get(i);
                mat.get(d).set(i, prev);
                prev = curr;
            }
            d--;

            for(int i=d; i>=u; i--) {
                int curr = mat.get(i).get(l);
                mat.get(i).set(l, prev);
                prev = curr;
            }
            l++;
        }
    }

}
