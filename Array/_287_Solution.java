public class _287_Solution {
    // Use This Function
    class Solution {
        public int findDuplicate(int[] nums) {
            int ans=0,j=1;
            Arrays.sort(nums);
            for(int i=0;i<nums.length-1;i++){
                if(nums[i]==nums[j++]){
                    ans=nums[i];
                }
            }
            return ans;
        }
    }
    public static void main(String[] args) {
        
    }
}
