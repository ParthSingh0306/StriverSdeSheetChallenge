package Day1;

import java.util.Arrays;

public class SetMatrixZeroes {

	public static void main(String[] args) {
		int[][] mat = {
				{1, 1, 1},
				{1, 0, 1},
				{1, 1, 1}
		};
		System.out.println(Arrays.deepToString(mat));
		setZeros(mat);
		System.out.println(Arrays.deepToString(mat));
	}
	
	public static void setZeros(int matrix[][]) {
        int n = matrix.length;
        int m = matrix[0].length;
        int[] row = new int[n];
        int[] col = new int[m];

        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                if(matrix[i][j] == 0) {
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }


        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                if(row[i] == 1 || col[j] == 1) {
                    matrix[i][j] = 0;
                }
            }
        }

    }

}
