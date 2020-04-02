import org.junit.Assert.assertEquals
import org.junit.Test

class SingleNumberTest {

    @Test
    fun shouldFindSingleNumber() {
        val input = arrayOf(0, 0, 2, 2, 4)

        val result = Solutions.singleNumber(input.toIntArray())

        assertEquals(result, 4)
    }

    @Test
    fun notDuplicatesShouldReturnInvalid() {
        val input = arrayOf(0, 0, 2, 2, 4, 4)

        val result = Solutions.singleNumber(input.toIntArray())

        assertEquals(result, -1)
    }

    @Test
    fun emptyArrayShouldReturnInvalid() {
        val input = arrayOf<Int>()

        val result = Solutions.singleNumber(input.toIntArray())

        assertEquals(result, -1)
    }
}