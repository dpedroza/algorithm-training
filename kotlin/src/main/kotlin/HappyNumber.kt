class HappyNumber {

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
}