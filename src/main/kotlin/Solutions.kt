fun main() {

}
/**
 * Solutions for the 30 day
 * #stayhome leetcode challenge
 */
object Solutions {

    /**
     *
     * Challenge 1/30
     *
     * @param ints should not be empty and contain
     * at maximum one number that is not repeated
     * others must be
     */
    fun singleNumber(ints: IntArray): Int {

        if (ints.isEmpty()) return -1

        val set = HashSet<Int>()

        for (i in ints) {

            if (set.contains(i)) {
                set.remove(i)
            } else {
                set.add(i)
            }

        }

        return if (set.isEmpty() || set.size > 1) {
            -1
        } else {
            set.first()
        }
    }

    /**
     * Challenge 2/30
     *
     * @param value it digits square numbers are sum until
     * @return true when the result of sum equals one
     * @return false otherwise
     */
    fun isHappy(value: Int): Boolean {
        // as kotlin function parameters are Val type.
        var mainValue = value
        if (mainValue == 1) {
            return true
        } else if (mainValue == 4) {
            // because if value is 4
            // it will become 16 and start again.
            return false
        }
        var newValue = 0
        while (mainValue > 0) {
            newValue += (mainValue % 10) * (mainValue % 10)
            mainValue /= 10
        }
        return isHappy(newValue)
    }

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
