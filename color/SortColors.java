package color;

// Nam Vo, Partner 1: Angelica, Partner 2: Thaneesha

public class SortColors{
    public void sortColors(int[] nums) {

        // counts the number of times red, white, and blue appear
        int[] count = new int[3];
        for (int i = 0; i < nums.length; ++i) {
            count[nums[i]]++;
        }

        // insert all red's into the array first
        for (int i = 0; i < count[0]; ++i) {
            nums[i] = 0;
        }

        // inserts all white's into the array after the red's
        int tally = count[0] + count[1];
        for (int i = count[0]; i < tally; ++i) {
            nums[i] = 1;
        }

        // inserts all blue's into the array after the white's
        for (int i = tally; i < tally + count[2]; ++i) {
            nums[i] = 2;
        }
    }
}