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
    public ListNode middleNode(ListNode head) {
        ArrayList<ListNode> ar = new ArrayList<ListNode>();
        int length = 0;
        while(head != null){
            ar.add(head);
            length += 1;
            head = head.next;
        }
        
        return ar.get(length /2);
    }
}