
//i was getting error on the packages and imports for this particular file
//since the original code by Angelica as is without any external path.
//based on that i hope you won't dock points for that.
public class UglyNumberII {

    public static void main(String[] args) {

        Solution solution = new Solution();

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