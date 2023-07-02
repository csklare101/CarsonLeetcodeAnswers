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
    public boolean isPalindrome(ListNode head) {
        if(head.next == null){
            return true;
        }
        ArrayList<Integer> ints = new ArrayList<>();
        boolean palindrome = true;
        while(head.next!= null){
            ints.add(head.val);
            head=head.next;
        }
        ints.add(head.val);
        int size = ints.size();
        for(int i = 0; i <= ints.size()/2 && size != 0; i++){
            if(ints.get(i) != ints.get(size - i - 1)){
                palindrome = false;
            }
        }
        
        return palindrome;
    }
}