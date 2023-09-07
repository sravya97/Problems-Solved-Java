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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = null;
        ListNode current = null;
        while(list1 != null && list2 != null){
            ListNode node;
            if(list1.val < list2.val){
                node = new ListNode(list1.val, null); 
                list1 = list1.next;           
            } else {
                node = new ListNode(list2.val, null);
                list2 = list2.next;
            }
             if(head == null){
                head = node;
            } else {
                current.next = node;
            }
            current = node;
        }
        while(list1 != null){
            ListNode node = new ListNode(list1.val, null);
            if(head == null){
                head = node;
            } else {
                current.next = node;
            }
            current = node;
            list1 = list1.next;   
        }
        while(list2 != null){
            ListNode node = new ListNode(list2.val, null);
             if(head == null){
                head = node;
            } else {
                current.next = node;
            }
            current = node;
            list2 = list2.next;
        }
        return head;
    }
}