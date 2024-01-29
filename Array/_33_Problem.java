public class _33_Problem {
    // Use this Function 
    public int search(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (target == nums[i]) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        
    }
}
