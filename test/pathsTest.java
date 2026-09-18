package test;

import paths.UniquePaths;

class UniquePathsTest {

    public static void main(String[] args) {

        UniquePaths solution = new UniquePaths();

        int result1 = solution.uniquePaths(3, 7);
        System.out.println(result1 == 28);

        int result2 = solution.uniquePaths(3, 2);
        System.out.println(result2 == 3);

        int result3 = solution.uniquePaths(1, 1);
        System.out.println(result3 == 1);

        int result4 = solution.uniquePaths(1, 5);
        System.out.println(result4 == 1);

        //Teammate: Jeet Vyas - 7 test cases for unique paths.
        int result5 = solution.uniquePaths(2, 2);
        System.out.println(result5 == 2);

        int result6 = solution.uniquePaths(3, 3);
        System.out.println(result6 == 6);

        int result7 = solution.uniquePaths(3, 4);
        System.out.println(result7 == 10);

        int result8 = solution.uniquePaths(4, 4);
        System.out.println(result8 == 20);

        int result9 = solution.uniquePaths(5, 1);
        System.out.println(result9 == 1);

        int result10 = solution.uniquePaths(2, 5);
        System.out.println(result10 == 5);

        int result11 = solution.uniquePaths(4, 3);
        System.out.println(result11 == 10);
    }
}