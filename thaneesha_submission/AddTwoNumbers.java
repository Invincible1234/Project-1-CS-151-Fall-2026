package hw1;
import java.math.BigInteger;
import java.util.LinkedList;


public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    	
        String snum1 = "";
        String snum2 = "";

        while (l1!= null){
            int x = l1.val;
            snum1 =  String.valueOf(x) + snum1;
            l1 = l1.next;
        }
        
        System.out.println(snum1);
        BigInteger num1 = new BigInteger(snum1);
        
         while (l2!= null){
            int x = l2.val;
            snum2 =  String.valueOf(x) + snum2;
            l2 = l2.next;
        }
         
        BigInteger num2 = new BigInteger(snum2);

        BigInteger sum = num1.add(num2);
        String ssum = String.valueOf(sum);
        System.out.println(ssum);
        
        int firstval = Integer.parseInt(String.valueOf(ssum.charAt(ssum.length()-1)));
        
        ListNode head = new ListNode(firstval);
        LinkedList<ListNode> x = new LinkedList<ListNode>();
        x.add(head);
        ListNode curr = head;
        
        for (int i = ssum.length()-2; i >= 0; i--) {
        	int value = Integer.parseInt(String.valueOf(ssum.charAt(i)));
        	curr.next = new ListNode(value);
        	curr = curr.next;
        }
        
        return head;
        
        }
    }
