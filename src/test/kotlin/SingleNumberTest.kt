import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized

@RunWith(Parameterized::class)
class SingleNumberTest(
    private val input: IntArray,
    private val expected: Int
) {

    private val solution = SingleNumber()

    private companion object {
        @JvmStatic
        @Parameterized.Parameters(name = "test case: {index} ==> single number is {1}") // where -1 is invalid
        fun parameters() = listOf(
            arrayOf(
                intArrayOf(0, 0, 2, 4, 4), 2 // one single number
            ),
            arrayOf(
                intArrayOf(1, 1, 3, 3), -1 // none
            ),
            arrayOf(
                intArrayOf(5, 5, 6, 7, 8, 8), -1 // multiple
            )
        )
    }

    @Test
    fun singleNumberAssertions() {
        assertThat(solution.singleNumber(input), equalTo(expected))
    }
}
