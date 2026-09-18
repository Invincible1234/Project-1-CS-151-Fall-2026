package test;


import ugly.UglyNumberII;
import static org.junit.jupiter.api.Assertions.assertEquals;

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


        // Test cases (Jeet) - 7 JUnit test cases for ec.
        assertEquals(2, s.nthUglyNumber(2));
        assertEquals(3, s.nthUglyNumber(3));
        assertEquals(5, s.nthUglyNumber(5));
        assertEquals(8, s.nthUglyNumber(7));
        assertEquals(24, s.nthUglyNumber(15));
        assertEquals(6, s.nthUglyNumber(6));
        assertEquals(16, s.nthUglyNumber(12));
    }
}
