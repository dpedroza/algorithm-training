
import junit.framework.TestCase.assertEquals
import org.junit.Test

class FinderTest {

    private val array = arrayOf(1, 3, 5, 6, 9, 11, 12, 16, 18, 21, 26)
    private val finder = BinarySearch()

    @Test
    fun targetExistsInArray() {
        // given
        val target = 3
        val expected = 1

        // when
        val result = finder.search(array, target)

        // then
        assertEquals(expected, result)
    }

    @Test
    fun targetDoNotExistsInArray() {
        // given
        val target = 10
        val expected = -1

        // when
        val result = finder.search(array, target)

        // then
        assertEquals(expected, result)
    }

    @Test
    fun emptyArray() {
        // given
        val emptyArray = arrayOf<Int>()
        val target = 3
        val expected = -1

        // when
        val result = finder.search(emptyArray, target)

        // then
        assertEquals(expected, result)
    }
}