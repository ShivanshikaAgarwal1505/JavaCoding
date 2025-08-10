import java.util.*;
import java.lang.*;
import java.io.*;

class Solution {
    public int maxProduct(int[] nums){
        int max=nums[0], min=nums[0], pro=nums[0];
        for (int i=1; i<nums.length; i++){
            int px=max, pn=min;
            max= Math.max(nums[i], Math.max(pn*nums[i], px*nums[i]));
            min= Math.min(nums[i], Math.min(pn*nums[i], px*nums[i]));
            pro= Math.max(max,pro);
        }
        return pro;
    }
}