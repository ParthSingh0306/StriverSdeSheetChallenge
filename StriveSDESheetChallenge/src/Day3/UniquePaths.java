package Day3;

//import java.util.Arrays;

public class UniquePaths {

	public static void main(String[] args) {
		System.out.println(uniquePaths(3, 2));
	}
	
	public static int uniquePaths(int m, int n) {
//         int[][] dp = new int[m][n];
//         for(int[] arr : dp) Arrays.fill(arr, -1);
//         return f(m-1, n-1, m, n, dp);
         return space(m, n);
	}

     public static int f(int i, int j, int m, int n, int[][] dp) {
         if(i == 0 && j == 0) return 1;
         if(i < 0 || j < 0) return 0;
         if(dp[i][j] != -1) return dp[i][j];
         int up = f(i-1, j, m, n, dp);
         int left = f(i, j-1, m, n, dp);
         return dp[i][j] = up + left;
     }

     public static int tab(int m, int n) {
         int[][] dp = new int[m][n];

         for(int i=0; i<m; i++) {
             for(int j=0; j<n; j++) {
                 if(i == 0 && j == 0) {
                     dp[i][j] = 1;
                     continue;
                 }
                 int up = 0;
                 int left = 0;
                 if(i > 0) up += dp[i-1][j];
                 if(j > 0) left += dp[i][j-1];
                 dp[i][j] = up + left;
             }
         }

         return dp[m-1][n-1];
     }

    public static int space(int m, int n) {
        int[] prev = new int[n];

        for(int i=0; i<m; i++) {
            int[] curr = new int[n];
            for(int j=0; j<n; j++) {
                if(i == 0 && j == 0) {
                    curr[j] = 1;
                    continue;
                }
                int up = 0;
                int left = 0;
                if(i > 0) up += prev[j];
                if(j > 0) left += curr[j-1];
                curr[j] = up + left;
            }

            prev = curr;
        }

        return prev[n-1];
    }

}
