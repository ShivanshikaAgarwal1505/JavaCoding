import java.util.*;
import java.lang.*;
import java.io.*;

class Solution {
    public int maxProduct(int[] nums) {
        int max=nums[0], min=nums[0],m=nums[0],temp=0;
        for (int i=1; i < nums.length; i++){
            if(nums[i]>0){
                max= Math.max(nums[i], nums[i]*max);
                min=Math.min(nums[i], nums[i]*min);
            }
            else if(nums[i]==0){
                min=max=0;
            }
            else{
                temp=max;
                max=Math.max(nums[i], nums[i]*min);
                min=Math.min(nums[i], nums[i]*temp);
            }
            m= Math.max(m, max);
        }
        return m;
    }
}