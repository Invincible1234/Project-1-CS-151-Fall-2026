package test;

import ugly.UglyNumberII;

public class UglyNumberIITest {


    public static void main(String[] args) {
        UglyNumberII s = new UglyNumberII();

        // Test cases (Nam)
        System.out.println(s.nthUglyNumber(10) == 12);
        System.out.println(s.nthUglyNumber(4) == 4);
        System.out.println(s.nthUglyNumber(8) == 9);
        System.out.println(s.nthUglyNumber(1) == 1);
        System.out.println(s.nthUglyNumber(13) == 18);
        System.out.println(s.nthUglyNumber(20) == 36);
        
        
        //Test cases (Thaneesha)
        UglyNumberII t = new UglyNumberII();
        System.out.println(t.nthUglyNumber(2) == 2);
        System.out.println(t.nthUglyNumber(5) == 5);
        System.out.println(t.nthUglyNumber(3) == 3);
        System.out.println(t.nthUglyNumber(7) == 8);
        System.out.println(t.nthUglyNumber(6) == 6);
        System.out.println(t.nthUglyNumber(9) == 10);
    }
}
