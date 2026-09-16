package test.path;

import paths.UniquePaths;

public class uniquePath {

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

        int result5 = solution.uniquePaths(2, 2);
        System.out.println(result5 == 2);

        int result6 = solution.uniquePaths(3, 3);
        System.out.println(result6 == 6);

        int result7 = solution.uniquePaths(5, 5);
        System.out.println(result7 == 70);
    }
}