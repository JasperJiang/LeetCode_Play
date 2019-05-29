package removeNthFromEnd_19;

public class Solution {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null || n <1){
            return head;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode p = dummy;
        ListNode q = dummy;
        while (q != null && n + 1 > 0) {
            q = q.next;
            n--;
        }

        while(q != null){
            p = p.next;
            q = q.next;
        }

        p.next = p.next.next;
        return dummy.next;
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
