package linkedlist;

/**
 * ****************************************************************************
 * An IntNode provides a node for a linked list with integer data in each node.
 *
 * @note Lists of nodes can be made of any length, limited only by the amount of
 * free memory in the heap. But beyond Integer.MAX_VALUE (2,147,483,647), the
 * answer from listLength is incorrect because of arithmetic overflow.
 *
 * @see
 * <A HREF="../../../../edu/colorado/nodes/IntNode.java">
 * Java Source Code for this class
 * (www.cs.colorado.edu/~main/edu/colorado/nodes/IntNode.java)</A>
 *
 * @author Michael Main
 * <A HREF="mailto:main@colorado.edu"> (main@colorado.edu) </A>
 *
 * @version Feb 10, 2016
 *
 * @see Node
 * @see BooleanNode
 * @see ByteNode
 * @see CharNode
 * @see DoubleNode
 * @see FloatNode
 * @see LongNode
 * @see ShortNode
 * ****************************************************************************
 */
public class IntNode {

    // Invariant of the IntNode class:
    //   1. The node's integer data is in the instance variable data.
    //   2. For the final node of a list, the link part is null.
    //      Otherwise, the link part is a reference to the
    //      next node of the list.
    private int data;
    private IntNode link;

    /**
     * Initialize a node with a specified initial data and link to the next
     * node. Note that the initialLink may be the null reference, which
     * indicates that the new node has nothing after it.
     *
     * @param initialData the initial data of this new node
     * @param initialLink a reference to the node after this new node--this
     * reference may be null to indicate that there is no node after this new
     * node.
     * @postcondition This node contains the specified data and link to the next
     * node.
     *
     */
    public IntNode(int initialData, IntNode initialLink) {
        data = initialData;
        link = initialLink;
    }

    /**
     * Modification method to add a new node after this node.
     *
     * @param item the data to place in the new node
     * @postcondition A new node has been created and placed after this node.
     * The data for the new node is item. Any other nodes that used to be after
     * this node are now after the new node.
     * @exception OutOfMemoryError Indicates that there is insufficient memory
     * for a new IntNode.
     *
     */
    public void addNodeAfter(int item) {
        link = new IntNode(item, link);
    }

    /**
     * Accessor method to get the data from this node.
     *
     * @return the data from this node
     *
     */
    public int getData() {
        return data;
    }

    /**
     * Accessor method to get a reference to the next node after this node.
     *
     * @return a reference to the node after this node (or the null reference if
     * there is nothing after this node)
     *
     */
    public IntNode getLink() {
        return link;
    }

    public static IntNode listCopy(IntNode source) {
        IntNode copyHead;
        IntNode copyTail;

        // Handle the special case of the empty list.
        if (source == null) {
            return null;
        }

        // Make the first node for the newly created list.
        copyHead = new IntNode(source.data, null);
        copyTail = copyHead;

        // Make the rest of the nodes for the newly created list.
        while (source.link != null) {
            source = source.link;
            copyTail.addNodeAfter(source.data);
            copyTail = copyTail.link;
        }

        // Return the head reference for the new list.
        return copyHead;
    }

    public static IntNode[] listCopyWithTail(IntNode source) {
        IntNode copyHead;
        IntNode copyTail;
        IntNode[] answer = new IntNode[2];

        // Handle the special case of the empty list.   
        if (source == null) {
            return answer; // The answer has two null references .
        }
        // Make the first node for the newly created list.
        copyHead = new IntNode(source.data, null);
        copyTail = copyHead;

        // Make the rest of the nodes for the newly created list.
        while (source.link != null) {
            source = source.link;
            copyTail.addNodeAfter(source.data);
            copyTail = copyTail.link;
        }

        // Return the head and tail references.
        answer[0] = copyHead;
        answer[1] = copyTail;
        return answer;
    }

    public static int listLength(IntNode head) {
        IntNode cursor;
        int answer;

        answer = 0;
        for (cursor = head; cursor != null; cursor = cursor.link) {
            answer++;
        }

        return answer;
    }

    public static IntNode[] listPart(IntNode start, IntNode end) {
        IntNode copyHead;
        IntNode copyTail;
        IntNode cursor;
        IntNode[] answer = new IntNode[2];

        // Make the first node for the newly created list. Notice that this will
        // cause a NullPointerException if start is null.
        copyHead = new IntNode(start.data, null);
        copyTail = copyHead;
        cursor = start;

        // Make the rest of the nodes for the newly created list.
        while (cursor != end) {
            cursor = cursor.link;
            if (cursor == null) {
                throw new IllegalArgumentException("end node was not found on the list");
            }
            copyTail.addNodeAfter(cursor.data);
            copyTail = copyTail.link;
        }

        // Return the head and tail references
        answer[0] = copyHead;
        answer[1] = copyTail;
        return answer;
    }

    public static IntNode listPosition(IntNode head, int position) {
        IntNode cursor;
        int i;

        if (position <= 0) {
            throw new IllegalArgumentException("position is not positive");
        }

        cursor = head;
        for (i = 1; (i < position) && (cursor != null); i++) {
            cursor = cursor.link;
        }

        return cursor;
    }

    public static IntNode listSearch(IntNode head, int target) {
        IntNode cursor;

        for (cursor = head; cursor != null; cursor = cursor.link) {
            if (target == cursor.data) {
                return cursor;
            }
        }

        return null;
    }

    public void removeNodeAfter() {
        link = link.link;
    }

    public void setData(int newData) {
        data = newData;
    }

    public void setLink(IntNode newLink) {
        link = newLink;
    }

}
