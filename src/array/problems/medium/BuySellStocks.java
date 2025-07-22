package array.problems.medium;
// This code is refer to Buy and sell stock at maximum price so that maximum profict will be done
public class BuySellStocks {
	public static void main(String[] args) {
		int[] stockPrice = new int[]{7,4,5,1,6,4};
//		bruteForceApproach(stockPrice);
		OptimisedApproach(stockPrice);
	}

	private static void OptimisedApproach(int[] stockPrice) {
		int sellProfit=0;
		int minPriceStock = Integer.MAX_VALUE;
		for(int traveler=0;traveler<stockPrice.length;traveler++) {
			minPriceStock = Math.min(minPriceStock,stockPrice[traveler]);
			sellProfit = Math.max(sellProfit, stockPrice[traveler]-minPriceStock);
		}//for
		System.out.println("Maximum Profit will be :"+sellProfit);
	}//OptimisedApproach

	@SuppressWarnings("unused")
	private static void bruteForceApproach(int[] stockPrice) {
		int buyDay=0,sellDay=0;
		int sellProfit=0;
//		O(n*n) Time Complexity
		for(int buy=0;buy<stockPrice.length;buy++) {
			for(int sell=buy+1;sell<stockPrice.length;sell++) {
				if((stockPrice[sell]>stockPrice[buy]) && (sellProfit < (stockPrice[sell]-stockPrice[buy]))) {
					sellProfit = stockPrice[sell]-stockPrice[buy];
					buyDay = buy;
					sellDay = sell;	
				}//if
			}//innerfor
		}//outerfor
		System.out.println("Buy Stock at : "+buyDay);
		System.out.println("Sell Stock at : "+sellDay);
		System.out.println("Profit will be :"+sellProfit);
	}//bruteForceApproach
}//Class
