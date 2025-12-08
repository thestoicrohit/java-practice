public class stocks 
{
    public static void main(String[] args) 
    {
        int[] prices = {12, 5, 7, 13, 92, 85, 2};
        int highestProfit = 0;
        for (int i = 0; i < prices.length; i++) 
        { 
            for (int j = i + 1; j < prices.length; j++) 
            {
                int profit = prices[j] - prices[i];
                if (profit > highestProfit) 
                {
                    highestProfit = profit; 
                }
            }
        }
    System.out.println("Maximum Profit: " + highestProfit);
    }
}
