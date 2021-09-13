import java.util.Collection;
import java.util.LinkedList;

public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class solution {

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return head;
        }

        ListNode prev = head;
        ListNode curr = head.next;

        while (curr != null) {
            if (curr.val == prev.val) {
                prev.next = curr.next;
                curr = prev;
            }
            prev = curr;
            curr = curr.next;
        }
        return head;
        
    }

    public static void main(String[] args) {
        solution leet = new solution();
        Collection a = new LinkedList();
        a.add(1);
        a.add(1);
        a.add(2);
        System.out.println(a);
        System.out.println(leet.deleteDuplicates(a));
    }
}
