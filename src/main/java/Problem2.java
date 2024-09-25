
public class Problem2 {
    public static ListNode insert(ListNode head, int val, int position) {
        // TODO: Implement the insert method
        // This method should insert a new node with the given value at the specified position
        // If the position is out of bounds, insert the node at the end of the list
       
        ListNode newNode = new ListNode(val);

        // If the list is empty or position is 1, insert at the beginning
        if (position == 1 || head == null) {
            newNode.next = head;
            return newNode;
        }

        ListNode current = head;
        int currentIndex = 1;

        // Traverse the list to find the position just before the insertion point
        while (current.next != null && currentIndex < position - 1) {
            current = current.next;
            currentIndex++;
        }

        // If we reached the end of the list or the position is out of bounds, append the node at the end
        if (current.next == null && currentIndex < position - 1) {
            current.next = newNode;
        } else {
            newNode.next = current.next;
            current.next = newNode;
        }

        return head;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(3);
        l1.next.next.next = new ListNode(4);

        // Inserts element at the end since the position is out of bounds
        ListNode insertedList = insert(l1, 5, 10);

        // Print the inserted list
        Problem1.printList(insertedList);  
    }
}
