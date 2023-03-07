class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2)
    {
        ListNode emp=new ListNode(0);
        ListNode l3=new ListNode(0);
        ListNode result=l3;
        int carry=0;
        while(emp!=l1 || emp !=l2)
        {
            int value=l1.val+l2.val+carry;
            carry=value/10;
            l3=(l3.next=new ListNode(value%10));
            l1=null!=l1.next?l1.next:emp;
            l2=null!=l2.next?l2.next:emp;
        }
        if(carry==1)
        {
            l3.next=new ListNode(carry);
        }
        return result.next;
        
    }
}