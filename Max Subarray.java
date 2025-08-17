import java.util.*;
import java.lang.*;
import java.io.*;

class Solution {
    public int maxSubArray(int[] nums) {
        int max=nums[0], total=0;
        if (nums.length==1) return nums[0];
        for (int n: nums){
            total+=n;
            max= total>max ? total: max;
            if(total<0){
                total=0;
            }
        }
        return max;
    }
}