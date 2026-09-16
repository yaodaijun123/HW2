import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class StackTest {

    @Test
    fun testPushAndPeek() {
        val stack = MyStack<Int>()

        stack.push(10)
        stack.push(20)

        assertEquals(20, stack.peek())
    }

    @Test
    fun testPop() {
        val stack = MyStack<Int>()

        stack.push(10)
        stack.push(20)

        assertEquals(20, stack.pop())
        assertEquals(10, stack.pop())
    }

    @Test
    fun testIsEmpty() {
        val stack = MyStack<Int>()

        assertTrue(stack.isEmpty())

        stack.push(10)

        assertFalse(stack.isEmpty())
    }

    @Test
    fun testEmptyStack() {
        val stack = MyStack<Int>()

        assertNull(stack.pop())
        assertNull(stack.peek())
    }
}