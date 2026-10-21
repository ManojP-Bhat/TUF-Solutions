class Solution {
    public int NumberOfJumps(int[] nums, int k) {
        int total=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+k<nums[j]){
                    total++;
                }
            }
        }
        return total;
    }
}