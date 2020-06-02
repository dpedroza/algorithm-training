class BinarySearch {

        fun search(nums: Array<Int>, target: Int): Int {

            if (nums.isEmpty()) return -1

            var left = 0
            var right = nums.size - 1

            while (left <= right) {
                // prevent (left + right) overflow
                val mid = left + (right - left) / 2
                when {
                    nums[mid] == target -> return mid
                    nums[mid] < target -> left = mid + 1
                    else -> right = mid - 1
                }
            }
            return -1
        }
}