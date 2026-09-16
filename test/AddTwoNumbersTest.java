package test;

import java.util.Arrays;
import thaneesha_submission.ListNode;
import thaneesha_submission.AddTwoNumbers;

class AddTwoNumbersTest {

    public static void main (String[] args) {
    
        AddTwoNumbers s = new AddTwoNumbers();

        // Different lists of numbers
        ListNode s_one = new ListNode(1); // (1)
        ListNode s_two = new ListNode(4); // (4)

        ListNode d_one = new ListNode(2);
        d_one.next = new ListNode(5); // (52)

        ListNode t_one = new ListNode(8);
        t_one.next = new ListNode(4);
        t_one.next.next = new ListNode(3); // (348)

        // Test cases #1 (Nam)

        ListNode added = s.addTwoNumbers(s_one, s_two);
        System.out.println(added.val == 5); // 1 + 4 = 5

        added = s.addTwoNumbers(d_one, s_two);
        System.out.println(added.val == 6);
        System.out.println(added.next.val == 5); // 52 + 4 = 56
        
        added = s.addTwoNumbers(t_one, d_one);
        System.out.println(added.val == 0);
        System.out.println(added.next.val == 0);
        System.out.println(added.next.next.val == 4); // 348 + 52 = 400 


    }
    
}