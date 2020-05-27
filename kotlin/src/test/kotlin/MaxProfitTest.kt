import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized

@RunWith(Parameterized::class)
class MaxProfitTest(
    private val input: IntArray,
    private val expected: Int
) {

    private val solution = MaxProfit()

    private companion object {
        @JvmStatic
        @Parameterized.Parameters(name = "test case: {index} ==> max profit is {1}")
        fun parameters() = listOf(
            arrayOf(
                intArrayOf(7, 1, 5, 3, 6, 4), 7
            ),
            arrayOf(
                intArrayOf(1, 2, 3, 4 ,5), 4
            ),
            arrayOf(
                intArrayOf(7, 6, 4, 3, 1), 0
            )
        )
    }

    @Test
    fun singleNumberAssertions() {
        assertThat(solution.maxProfit(input), equalTo(expected))
    }
}
