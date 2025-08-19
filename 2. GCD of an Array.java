import java.util.ArrayList;
import java.util.List;
class Solution {
    public int countDifferentSubsequenceGCDs(int[] nums) {
        int min = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < min) min = nums[i];
        }
        int n = (int) Math.pow(2, nums.length) - 1;
        List < Integer > gcd = new ArrayList < > ();
        for (int i = min; i > 1; i--) {
            int x = 0;
            for (int a = 0; a < nums.length; a++) {
                if (nums[a] % i == 0) x += 1;
            }
            if (x == nums.length) return i;
        }
        return 1;
    }
}