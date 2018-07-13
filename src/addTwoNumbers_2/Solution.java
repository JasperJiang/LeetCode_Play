package addTwoNumbers_2;

/**
 * Created by Jack on 2018/6/30.
 */
public class Solution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode result = new ListNode(0);

        ListNode dummy = result;

        ListNode p = l1;
        ListNode q = l2;

        while (p != null || q != null) {
            int x = p == null ? 0 : p.val;
            int y = q == null ? 0 : q.val;

            int sum = carry+x + y;

            carry = sum/10;

            dummy.next = new ListNode(sum%10);
            p = p == null ? null : p.next;
            q = q == null ? null : q.next;

            dummy = dummy.next;
        }

        if (carry!=0){
            dummy.next = new ListNode(carry);
        }

        return result.next;
    }


    public static void main(String[] args) {

    }


    public class ListNode {
        int val;
        ListNode next;

        public ListNode(int x) {
            val = x;
        }
    }
}




