package mergeTwoLists_21;

/**
 * Created by Jack on 2018/8/24.
 */
public class Solution {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode ans = new ListNode(0);
        ListNode tmp = ans;
        ListNode rootNode = l1;
        ListNode rootNode2 = l2;

        while(rootNode != null){
            if (rootNode2 == null){
                tmp.next = new ListNode(rootNode.val);
                tmp = tmp.next;
                rootNode = rootNode.next;
                continue;
            }

            if (rootNode.val > rootNode2.val){
                tmp.next = new ListNode(rootNode2.val);
                tmp = tmp.next;
                rootNode2 = rootNode2.next;
                continue;
            }


            if (rootNode.val <= rootNode2.val){
                tmp.next = new ListNode(rootNode.val);
                tmp = tmp.next;
                rootNode = rootNode.next;
                continue;
            }

        }

        while (rootNode2!=null){
            tmp.next = new ListNode(rootNode2.val);
            tmp = tmp.next;
            rootNode2 = rootNode2.next;
        }
        return ans.next;
    }


    public class ListNode {
        int val;
        ListNode next;

        public ListNode(int x) {
            val = x;
        }
    }


    public static void main(String[] args) {

    }
}
