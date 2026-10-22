class Solution {
    public boolean isConsecutive(int[] nums) {
        int n=nums.length;
       Arrays.sort(nums);
       for(int i=1;i<n;i++){
        if(nums[i]-nums[i-1]!=1){
            return false;
        }
       }
       return true;
    }
}