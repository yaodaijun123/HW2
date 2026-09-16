interface LinkedList<T> {
    /**
     * Adds the element [data] to the front of the linked list.
     */
    fun pushFront(data: T)

    /**
     * Adds the element [data] to the back of the linked list.
     */
    fun pushBack(data: T)

    /**
     * Removes an element from the front of the list. If the list is empty, it is unchanged.
     * @return the value at the front of the list or nil if none exists
     */
    fun popFront(): T?

    /**
     * Removes an element from the back of the list. If the list is empty, it is unchanged.
     * @return the value at the back of the list or nil if none exists
     */
    fun popBack(): T?

    /**
     * @return the value at the front of the list or nil if none exists
     */
    fun peekFront(): T?

    /**
     * @return the value at the back of the list or nil if none exists
     */
    fun peekBack(): T?

    /**
     * @return true if the list is empty and false otherwise
     */
    fun isEmpty(): Boolean
}

class MyLinkedList<T> : LinkedList<T> {

    class Node<T>(
        val data: T,
        var next: Node<T>?,
        var previous: Node<T>?
    )

    var head: Node<T>? = null
    var tail: Node<T>? = null

    override fun pushFront(data: T) {
        val newNode = Node(data, head, null)

        if (head == null) {
            tail = newNode
        }else{
                head?.previous = newNode
            }
            head = newNode


    }

    override fun pushBack(data: T) {
        val newNode = Node(data, null, tail)

        if (tail == null) {
            head = newNode
        }else{
                tail?.next = newNode
            }
            tail = newNode


    }

    override fun popFront(): T?{


        if (head == null) {
            return null
        }else{
            val front = head?.data
            head = head?.next

            if(head == null){
                tail = null
            }else{
                head?.previous = null
            }
            return front
            }
        }

    override fun popBack(): T? {
        if (tail == null) {
            return null
        }else{
            val back = tail?.data
            tail = tail?.previous
            return back
        }
    }

    override fun peekFront(): T? {
        return head?.data
    }

    override fun peekBack(): T? {
        return tail?.data
    }

    override fun isEmpty(): Boolean {
        return head == null
    }

}
