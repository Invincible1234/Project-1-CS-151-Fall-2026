package test.uglyNumber;

import  ugly.UglyNumberII;

public class uglynumber2test {

    public static void main(String[] args) {

        uglynumber2test solution = new uglynumber2test();

        int result1 = solution.nthUglyNumber(1);
        System.out.println(result1 == 1);

        int result2 = solution.nthUglyNumber(2);
        System.out.println(result2 == 2);

        int result3 = solution.nthUglyNumber(5);
        System.out.println(result3 == 5);

        int result4 = solution.nthUglyNumber(6);
        System.out.println(result4 == 6);

        int result5 = solution.nthUglyNumber(10);
        System.out.println(result5 == 12);

        int result6 = solution.nthUglyNumber(15);
        System.out.println(result6 == 24);

        int result7 = solution.nthUglyNumber(20);
        System.out.println(result7 == 36);
    }
}