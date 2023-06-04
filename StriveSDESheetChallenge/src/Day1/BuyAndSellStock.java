package Day1;

import java.util.ArrayList;

public class BuyAndSellStock {

	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<>(){
			 { add(2); add(100); add(120); add(150);}
		};
		System.out.println(maximumProfit(arr));
	}
	
	public static int maximumProfit(ArrayList<Integer> prices){
        int n = prices.size();
        int maxProfit = 0;
        int min = prices.get(0);

        for(int i=1; i<n; i++) {
            int profit = prices.get(i) - min;
            maxProfit = Math.max(maxProfit, profit);
            min = Math.min(min, prices.get(i));
        }

        return maxProfit;
    }

}
