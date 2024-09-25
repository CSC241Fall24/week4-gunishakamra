public class Problem1 {
    public static ListNode concatenate(ListNode l1, ListNode l2) {
            if (l1 == null) {
                return l2;
            }
            ListNode current = l1;
            while (current.next != null) {
                current = current.next;
            }
            current.next = l2;
            return l1;
        }
        
        public static void printList(ListNode current) {
            while (current != null) {
                System.out.print(current.val + " ");
                current = current.next;
            }
            System.out.println();
        }
    
        public static void main(String[] args) {
            ListNode l1 = new ListNode(1);
            l1.next = new ListNode(2);
            l1.next.next = new ListNode(3);
    
            ListNode l2 = new ListNode(4);
            l2.next = new ListNode(5);
    
            // Concatenate the two lists
            ListNode concat = concatenate(l1, l2);
    
            // Print the concatenated list
            printList(concat);
        }

}
