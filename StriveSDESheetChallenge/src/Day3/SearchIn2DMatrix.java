package Day3;

public class SearchIn2DMatrix {

	public static void main(String[] args) {
		int[][] mat = {
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9}
		};
		
		System.out.println(searchMatrix(mat, 99));
	}
	
	public static boolean searchMatrix(int[][] mat, int target) {
        int n = mat.length;
        int m = mat[0].length;
        int row = 0;
        int col = m -1;

        while(row < n && col >=0) {
            if(mat[row][col] == target) {
                return true;
            } else if(mat[row][col]< target) {
                row++;
            } else {
                col--;
            }
        }

        return false;
    }

}
