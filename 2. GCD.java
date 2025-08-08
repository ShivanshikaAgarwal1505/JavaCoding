import java.util.*;
import java.lang.*;
import java.io.*;
// Given an integer array nums, return the greatest common divisor of the smallest number and largest number in nums.
class Solution {
    public int findGCD(int[] nums) {
        if(nums.length<2){
            return 0;
        }
        int min=nums[0], max=nums[0];
        for (int i=1; i<nums.length; i++){
            if(nums[i]>max){
                max=nums[i];
            }
            else if(nums[i]<min){
                min=nums[i];
            }
        }
        
        if(max % min == 0){
            return min;
        }
        else{
            for (int i=min/2; i>=2; i--){
                
                if(min%i==0 && max%i==0){
                    return i;
                }
            }
        }
        return 1;
    }
    
    public void public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);        	
		int n = sc.nextInt();        
		int arr[] = new int[n];
		for(int i = 0; i < n; i++)        
		{            
		arr[i] = sc.nextInt();        
		} 
    }
}