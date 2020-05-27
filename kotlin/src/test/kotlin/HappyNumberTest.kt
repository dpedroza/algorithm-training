import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized

@RunWith(Parameterized::class)
class HappyNumberTest(
    private val input: Int,
    private val expected: Boolean
) {

    private val solution = HappyNumber()

    private companion object {
        @JvmStatic
        @Parameterized.Parameters(
            name = "test case: {index} ==> is {0} a happy number? {1}" // where -1 is invalid
        )
        fun parameters() = listOf(
            arrayOf(
                7, true
            ),
            arrayOf(
                19, true
            ),
            arrayOf(
                20, false
            )
        )
    }

    @Test
    fun happyNumberAssertions() {
        assertThat(solution.isHappy(input), equalTo(expected))
    }
}
