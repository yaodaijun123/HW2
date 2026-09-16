/**
 * Reverses the order of elements in the stack using a queue.
 */
fun <T> reverseStack(stack: MyStack<T>) {
    val queue = MyQueue<T>()

    while (!stack.isEmpty()) {
        queue.enqueue(stack.pop()!!)
    }

    while (!queue.isEmpty()) {
        stack.push(queue.dequeue()!!)
    }
}