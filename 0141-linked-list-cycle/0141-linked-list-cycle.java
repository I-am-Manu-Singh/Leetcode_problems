public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head==null||head.next==null){
            return false;
        }
        ListNode fast=head;
        ListNode slow=head;

        /* we assume that cycle DNE ,i.e we have a singly linked list which will
         end somewhere and if in between the fast and slow pointers met that
        means there is no end to this linked list and cycle does exists*/

        while(fast!=null&&fast.next!=null){ // covering both even and odd number of nodes,for even fast would reach null and for odd fast.next would be null

            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true; //cycle does exists 
            }
        }
        return false; // cycle DNE
        
    }
}