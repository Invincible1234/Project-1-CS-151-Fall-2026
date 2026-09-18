package test;

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
        
        // Test cases #2 (Sky)
        
        //Test 1
        ListNode a1 = new ListNode(0);
        ListNode a2 = new ListNode(0);

        added = s.addTwoNumbers(a1, a2);
        System.out.println(added.val == 0); // 0 + 0 = 0

        //Test 2
        ListNode b1 = new ListNode(9);
        b1.next = new ListNode(9); // 99

        ListNode b2 = new ListNode(1); // 1

        added = s.addTwoNumbers(b1, b2);
        System.out.println(added.val == 0);
        System.out.println(added.next.val == 0);
        System.out.println(added.next.next.val == 1); // 99 + 1 = 100

        //Test 3
        ListNode c1 = new ListNode(5); // 5

        ListNode c2 = new ListNode(5);
        c2.next = new ListNode(4);
        c2.next.next = new ListNode(2); // 245

        added = s.addTwoNumbers(c1, c2);
        System.out.println(added.val == 0);
        System.out.println(added.next.val == 5);
        System.out.println(added.next.next.val == 2); // 5 + 245 = 250


    }
    
}