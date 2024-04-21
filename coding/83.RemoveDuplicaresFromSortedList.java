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

        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        if(head == null || head.next == null) return head;

        while(head != null){

            if(head.next != null && head.val == head.next.val){
                // curr.next = head.next;
            }
            else{
                curr.next = new ListNode(head.val);
                curr = curr.next;
            }

            // if (head.next != null && head.val == head.next.val) {
            //     curr.next = head.next;
            //     System.out.println(curr.val);
            //     // System.out.println(curr.next.val);
            // } else {
            //     curr = curr.next;
            //     System.out.println(curr.val);
            // }


            head = head.next;

        }

        return dummy.next;
    }
}


// another solution
// class Solution {
//     public ListNode deleteDuplicates(ListNode head) {

//         if(head == null || head.next == null)return head;
        
//         ListNode temp = head;

//         while(temp != null && temp.next != null){

//             if(temp.val == temp.next.val){
//                 temp.next = temp.next.next;
//             }
//             else
//             temp = temp.next;
//         }
//         return head;
//     }
// }