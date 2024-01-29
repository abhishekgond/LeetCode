import java.util.*;
    //   this is logic only 
class Solution {
    public void rotate_array(int nums[],int a,int b){
        while(a<=b){
            int temp = nums[a];
            nums[a] = nums[b];
            nums[b]=temp;
            a++;
            b--;
        }
    }
    public void rotate(int[] nums, int k) {
        k = k%nums.length;
        // first method 
        // int arr[] = new int[nums.length];
        // int j=0;
        // for(int i= nums.length-k;i<nums.length;i++){
        //     arr[j++] = nums[i];
        // }
        // for(int i=0;i<=nums.length-k-1;i++){
        //     arr[j++] = nums[i];
        // }
        // for(int i=0;i<arr.length;i++){
        //     System.out.print(" "+arr[i]);
        // }

        // second method 
        int a= nums.length-1;
        int b = nums.length-k;
        int i=0,j=nums.length-k-1;
        rotate_array(nums ,i,j);
        rotate_array(nums ,b,a);
        rotate_array(nums,0,nums.length-1);
      }
    }
