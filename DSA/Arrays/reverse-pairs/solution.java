class Solution {
    public int reversePairs(int[] nums) {
        return countPairs(nums,nums.length);
    }
    private int countPairs(int[]nums,int n){
        int cnt=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if((long)nums[i]>(long)2*nums[j]){
                    cnt++;
                }
            }
        }
        return cnt;
    }
}