class Solution {
    public boolean checkSubsequenceSum(int[] nums, int k) {
        int n=nums.length;
        return solve(0,n,nums,k);
    }
    private boolean solve(int i,int n,int[]arr,int k){
        if(k==0){
            return true;
        }
        if(k<0){
            return false;
        }
        if(i==n){
            return k==0;
        }
        return solve(i+1,n,arr,k-arr[i])||solve(i+1,n,arr,k);
    }
}