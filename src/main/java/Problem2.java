
public class Problem2 {
    public static ListNode insert(ListNode head, int val, int position) {
        // TODO: Implement the insert method
        // This method should insert a new node with the given value at the specified position
        // If the position is out of bounds, insert the node at the end of the list
       
        ListNode newNode = new ListNode(val);
        
        if (position == 0) {
            newNode.next = head;
            return newNode;
        }

        ListNode current = head;
        int currentIndex = 0;

        while (current != null && currentIndex < position - 1) {
            current = current.next;
            currentIndex++;
        }

        if (current == null) {
            return head == null ? newNode : head;
        }

        newNode.next = current.next;
        current.next = newNode;

        return head;
    }
}
