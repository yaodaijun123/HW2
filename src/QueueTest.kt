import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class QueueTest {

    @Test
    fun testEnqueueAndPeek() {
        val queue = MyQueue<Int>()

        queue.enqueue(10)
        queue.enqueue(20)

        assertEquals(10, queue.peek())
    }

    @Test
    fun testDequeue() {
        val queue = MyQueue<Int>()

        queue.enqueue(10)
        queue.enqueue(20)

        assertEquals(10, queue.dequeue())
        assertEquals(20, queue.dequeue())
    }

    @Test
    fun testIsEmpty() {
        val queue = MyQueue<Int>()

        assertTrue(queue.isEmpty())

        queue.enqueue(10)

        assertFalse(queue.isEmpty())
    }

    @Test
    fun testEmptyQueue() {
        val queue = MyQueue<Int>()

        assertNull(queue.dequeue())
        assertNull(queue.peek())
    }
}