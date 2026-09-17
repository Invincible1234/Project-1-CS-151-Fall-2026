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
    
        
    }
}
