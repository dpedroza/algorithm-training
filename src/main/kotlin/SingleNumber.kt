/**
 * Solutions for the 30 day
 * #stayhome leetcode challenge
 */
class SingleNumber {

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
}
