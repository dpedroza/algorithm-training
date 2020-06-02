class MaxProfit {

    /**
     * Challenge Buy/Sell stock II
     *
     * @param prices prices of a stock for given index
     * @return maxProfit of these combinations
     */
    fun maxProfit(prices: IntArray): Int {

        var profit = 0

        for (i in 1 until prices.size) {
            val difference = prices[i] - prices[i - 1]

            if (difference > 0) {
                profit += difference
            }
        }

        return profit
    }
}
