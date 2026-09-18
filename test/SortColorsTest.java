package test;
import java.util.Arrays;

import color.SortColors;

public class SortColorsTest {
	
	

	public static void main(String[] args) {
		
		// Thaneesha
		
		SortColors objTest = new SortColors();
		
		int [] test1 = {0,1,2,0,1,2};
		int [] expected1 = {0, 0, 1, 1, 2, 2};
		objTest.sortColors(test1);
		
		System.out.println("Test 1:");
		System.out.println(Arrays.equals(test1, expected1));
		
		
		int [] test2 = {0, 1, 2};
		int [] expected2 = {0, 1, 2};
		objTest.sortColors(test2);
		
		System.out.println("Test 2:");
		System.out.println(Arrays.equals(test2, expected2));
		
		
		int [] test3 = {0, 1, 0, 2, 0, 1, 1, 2, 2, 0, 0, 1};
		int [] expected3 = {0, 0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2};
		objTest.sortColors(test3);
		
		System.out.println("Test 3:");
		System.out.println(Arrays.equals(test3, expected3));
		
		
		int [] test4 = {1};
		int [] expected4 = {1};
		objTest.sortColors(test4);
		
		System.out.println("Test 4:");
		System.out.println(Arrays.equals(test4, expected4));
		
		
		int [] test5 = {};
		int [] expected5 = {};
		objTest.sortColors(test5);
		
		System.out.println("Test 5:");
		System.out.println(Arrays.equals(test5, expected5));
		
		
		int [] test6 = {0, 1};
		int [] expected6 = {0, 1};
		objTest.sortColors(test6);
		
		System.out.println("Test 6:");
		System.out.println(Arrays.equals(test6, expected6));
		
		

	}

}
