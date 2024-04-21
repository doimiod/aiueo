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
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null)return head;
        ArrayList<Integer> arr = new ArrayList<Integer>();
        while(head!=null){
            arr.add(head.val);
            head = head.next;
        }

        Collections.sort(arr);
        ListNode dummy = new ListNode (0);
        ListNode curr = dummy;
        for(int n: arr){
            curr.next = new ListNode(n);
            curr = curr.next;
        }

        return dummy.next;
    }
}
