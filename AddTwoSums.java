public class AddTwoSums {
	
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    	
    	int value,carry; //和 & 进位
        
    	//个位部分
        value = (l1.val + l2.val >= 10) ? (l1.val + l2.val - 10) : (l1.val + l2.val);
        carry = (l1.val + l2.val >= 10) ? 1 : 0;
        
        ListNode sum = new ListNode(value);
		ListNode tmp = sum; //指针，开始指向第一个节点
    	
    	while(l1.next !=null && l2.next !=null) {
   
    		l1=l1.next;
    		l2=l2.next;
    		
    		//加上进位
    		value = (l1.val + l2.val + carry >= 10) ? (l1.val + l2.val + carry - 10) : (l1.val + l2.val + carry);
    		carry = (l1.val + l2.val + carry >= 10) ? 1 : 0;
    		
    		tmp.next = new ListNode(value); 
    		tmp = tmp.next; // 指向下一个节点
    			
    	}
    	
    	while  (l1.next !=null) {//只剩第一个数
    		
    		l1=l1.next;
    		value = (l1.val + carry >= 10) ? (l1.val + carry - 10) : (l1.val + carry);
    		carry = (l1.val + carry >= 10) ? 1 : 0;
    		
    		tmp.next = new ListNode(value); 
    		tmp = tmp.next; // 指向下一个节点
    			
    	}
    	
    	while  (l2.next !=null) {//只剩第二个数
    		
    		l2=l2.next;
    		value = (l2.val + carry >= 10) ? (l2.val + carry - 10) : (l2.val + carry);
    		carry = (l2.val + carry >= 10) ? 1 : 0;
    		
    		tmp.next = new ListNode(value); 
    		tmp = tmp.next; // 指向下一个节点
    			
    	}
    	
    	if (carry ==1) {//最后还有进位
    		tmp.next = new ListNode(1); 
    	}
        
        return sum;
    }
}

/**
 * Definition for singly-linked list.
 */
 class ListNode {
     int val;
     ListNode next;
     ListNode(int x) {
         val = x;
         next = null;
     }
 }
 
