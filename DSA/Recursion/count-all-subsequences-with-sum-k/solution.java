class Solution {
    public int countSubsequenceWithTargetSum(int[] nums, int k) {
       return Check(0,k,nums);
    }
    private int Check(int i,int sum,int []nums){
        if(sum==0)return 1;
        if(sum<0||i==nums.length)return 0;
        return Check(i+1,sum-nums[i],nums)+Check(i+1,sum,nums);
    }
}