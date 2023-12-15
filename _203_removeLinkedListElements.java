public class _203_removeLinkedListElements {
 
 //Definition for singly-linked list.
  public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode node = new ListNode();
        ListNode point = node;
        ListNode temp = head;
        while(temp != null){
            if(temp.val != val){
            ListNode value = new ListNode(temp.val);
            node.next = value;
            node = node.next;
            }
            temp = temp.next;
        }
    return point.next;

    }
}
}
