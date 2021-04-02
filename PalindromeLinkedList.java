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
/*class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null)
            return true;
    ListNode slow=head;
        ListNode fast=head;
        ListNode prev=null;
        while(fast!=null && fast.next!=null )
        {
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        prev.next=null;
        ListNode left=head;
        ListNode right=slow;
        ListNode rev=reverse(right);
       while(left!=null && rev!=null)
       {
           if(left.val!=rev.val)
               return false;
           left=left.next;
           rev=rev.next;
       }
        
        return true;
        
        
        
        
        
        
        
        
        
        
    }
    public ListNode reverse(ListNode head)
    {
        ListNode prev=null;
        ListNode curr=head;
        ListNode next=null;
        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
             prev=curr;
            curr=next;
           
        }
        return prev;
    }
}*/



class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode head1=head;
        ArrayList<Integer> a=new ArrayList<>();
        while(head!=null)
        {
            a.add(head.val);
            head=head.next;
        
        }
       // Collections.reverse(a);
        ListNode a1=new ListNode(1);
        ListNode a2=a1;
    
        for(int i:a)
        {
            a1.next=new ListNode(i);
            a1=a1.next;
        }
        ListNode head2=a2.next;
        
        ListNode head3=reverse(head1);
       
        
        while(head2!=null && head3!=null)
       {
           if(head2.val!=head3.val)
               return false;
           head2=head2.next;
           head3=head3.next;
       }
        
        return true;
        
        
        
        
        
        
    }
    public ListNode reverse(ListNode head)
    {
        ListNode prev=null;
        ListNode curr=head;
        ListNode next=null;
        while(curr!=null)
        {
            next=curr.next;
            curr.next=prev;
             prev=curr;
            curr=next;
           
        }
        return prev;
    }
}