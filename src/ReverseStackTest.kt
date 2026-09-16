import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class ReverseStackTest {

    @Test
    fun testReverseStack() {
        val stack = MyStack<Int>()

        stack.push(1)
        stack.push(2)
        stack.push(3)

        reverseStack(stack)

        assertEquals(1, stack.pop())
        assertEquals(2, stack.pop())
        assertEquals(3, stack.pop())
        assertTrue(stack.isEmpty())
    }
}