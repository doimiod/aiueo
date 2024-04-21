/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {

        ListNode dummy = new ListNode (0);
        ListNode curr = dummy;
        int formerNum = 101;

        if(head == null || head.next == null) return head;

        while(head != null){


            if((head.next != null && head.val == head.next.val) || head.val == formerNum){
                formerNum = head.val;
            }
            else{
                curr.next = new ListNode(head.val);
                curr = curr.next;
            }

            head = head.next;
        }

        return dummy.next;
        
    }
}