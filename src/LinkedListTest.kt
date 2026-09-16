import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class LinkedListTest {

    @Test
    fun testPushFront() {
        val list = MyLinkedList<Int>()

        list.pushFront(10)
        list.pushFront(20)

        assertEquals(20, list.peekFront())
        assertEquals(10, list.peekBack())
    }

    @Test
    fun testPushBack() {
        val list = MyLinkedList<Int>()

        list.pushBack(10)
        list.pushBack(20)

        assertEquals(10, list.peekFront())
        assertEquals(20, list.peekBack())
    }

    @Test
    fun testPopFront() {
        val list = MyLinkedList<Int>()

        list.pushBack(10)
        list.pushBack(20)

        assertEquals(10, list.popFront())
        assertEquals(20, list.peekFront())
    }

    @Test
    fun testPopBack() {
        val list = MyLinkedList<Int>()

        list.pushBack(10)
        list.pushBack(20)

        assertEquals(20, list.popBack())
        assertEquals(10, list.peekBack())
    }

    @Test
    fun testPeekFront() {
        val list = MyLinkedList<Int>()

        list.pushFront(10)

        assertEquals(10, list.peekFront())
    }

    @Test
    fun testPeekBack() {
        val list = MyLinkedList<Int>()

        list.pushBack(10)

        assertEquals(10, list.peekBack())
    }

    @Test
    fun testIsEmpty() {
        val list = MyLinkedList<Int>()

        assertTrue(list.isEmpty())

        list.pushFront(10)

        assertFalse(list.isEmpty())
    }

    @Test
    fun testEmptyList() {
        val list = MyLinkedList<Int>()

        assertNull(list.popFront())
        assertNull(list.popBack())
        assertNull(list.peekFront())
        assertNull(list.peekBack())
    }

    @Test
    fun testSingleElement() {
        val list = MyLinkedList<Int>()

        list.pushFront(10)

        assertEquals(10, list.popFront())
        assertTrue(list.isEmpty())
        assertNull(list.peekFront())
        assertNull(list.peekBack())
    }
}