package test;

import paths.UniquePaths;
import static org.junit.jupiter.api.Assertions.assertEquals;


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
        // Teammate: Jeet Vyas - 7 JUnit test cases for unique paths.

        assertEquals(2, solution.uniquePaths(2, 2));
        assertEquals(6, solution.uniquePaths(3, 3));
        assertEquals(10, solution.uniquePaths(3, 4));
        assertEquals(20, solution.uniquePaths(4, 4));
        assertEquals(1, solution.uniquePaths(5, 1));
        assertEquals(5, solution.uniquePaths(2, 5));
        assertEquals(10, solution.uniquePaths(4, 3));
    }
}