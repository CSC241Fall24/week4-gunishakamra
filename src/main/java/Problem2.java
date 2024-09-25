
public class Problem2 {
    public static ListNode insert(ListNode head, int val, int position) {
        // TODO: Implement the insert method
        // This method should insert a new node with the given value at the specified position
        // If the position is out of bounds, insert the node at the end of the list
       
        ListNode newNode = new ListNode(val);

        if (position == 1 || head == null) {
            newNode.next = head;
            return newNode;
        }

        ListNode current = head;
        int currentIndex = 1;

        while (current != null && currentIndex < position - 1) {
            current = current.next;
            currentIndex++;
        }

        if (current == null) {
            return head;  
        }

        newNode.next = current.next;
        current.next = newNode;

        return head;
    }
    public static void main(String [] args){
        ListNode l1 = new ListNode(1);
            l1.next = new ListNode(2);
            l1.next.next = new ListNode(3);
    
          
            // Inserts elements in a list at a particular position
            ListNode insertedList = insert(l1, 4, 2);
    
            // Print the inserted list
            Problem1.printList(insertedList);

    }
}
