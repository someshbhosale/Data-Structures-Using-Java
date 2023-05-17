/*
 class Solution{ 
public boolean isPalindrome(ListNode head) {

   if(head == null || head.next == null) 
   {
       return true;
   }
  ArrayList<Integer> list=new ArrayList<>();
  ListNode temp=head;
  while(temp!=null)
  {
      list.add(temp.val);
      temp=temp.next;
  }
  int i=0;
  int j=list.size()-1;
  while(i<j)
  {
      if(list.get(i)!=list.get(j))
      {
          return false;
      }
      else
      {
          i++;
          j--;
      }
        
  }
  return true;
   
}

}
 */

 class Solution {
    public ListNode getMiddle(ListNode head) {
   ListNode fast = head;
   ListNode slow = head;
   while (fast.next != null && fast.next.next != null) {
       fast = fast.next.next;
       slow = slow.next;
   }
   return slow;
}
 
public ListNode reverse(ListNode head) {
   ListNode prev = null;
   ListNode curr = head;
  
   while (curr != null) {
       ListNode next = curr.next;
       curr.next = prev;
       prev = curr;
       curr = next;
   }
   return prev;
}
 
 
public boolean isPalindrome(ListNode head) {
   if(head == null || head.next == null) {
       return true;
   }
  
   ListNode firstHalfEnd = getMiddle(head);
   ListNode secondHalfStart = reverse(firstHalfEnd.next);
   ListNode firstHalfStart = head;
  
   while(secondHalfStart != null) {
       if(secondHalfStart.val != firstHalfStart.val) {
           return false;
       }
       secondHalfStart = secondHalfStart.next;
       firstHalfStart = firstHalfStart.next;
   }
  
   return true;
}

}