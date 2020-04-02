/**
 * Solutions for the 30 day
 * #stayhome leetcode challenge
 */
object Solutions {

    /**
     * Challenge 1/30
     * @param nums should not be empty and contain
     * at maximum one number that is not repeated
     * others must be
     */
    fun singleNumber(nums: IntArray): Int {

        if (nums.isEmpty()) return -1

        val set = HashSet<Int>()

        for (i in nums) {

            if (set.contains(i)) {
                set.remove(i)
            } else {
                set.add(i)
            }

        }

        return set.firstOrNull() ?: -1
    }
}
