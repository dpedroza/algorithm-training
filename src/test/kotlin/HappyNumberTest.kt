import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

class HappyNumberTest {

    @Test
    fun oneIsAHappyNumber() {
        val input = 1

        val result = Solutions.isHappy(input)

        assertTrue(result)
    }

    @Test
    fun sevenIsAHappyNumber() {
        val input = 7

        val result = Solutions.isHappy(input)

        assertTrue(result)
    }

    @Test
    fun nineteenIsAHappyNumber() {
        val input = 19

        val result = Solutions.isHappy(input)

        assertTrue(result)
    }

    @Test
    fun twentyNotAHappyNumber() {
        val input = 20

        val result = Solutions.isHappy(input)

        assertFalse(result)
    }
}
