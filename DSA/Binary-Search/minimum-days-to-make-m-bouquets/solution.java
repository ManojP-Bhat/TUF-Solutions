
class Solution {
    public int roseGarden(int n, int[] nums, int k, int m) {
        long val=(long)m*k;
        if(val>n)return -1;
        int mini=Integer.MAX_VALUE,maxi=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            mini=Math.min(nums[i],mini);
            maxi=Math.max(nums[i],maxi);
        }
        int left=mini;
        int right=maxi;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(possible(nums,mid,m,k)){
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return left;
    }
    private boolean possible(int[]nums,int day,int m,int k){
        int n=nums.length;
        int count=0;
        int noOfB=0;
        for(int i=0;i<n;i++){
            if(nums[i]<=day){
                count++;
            }else{
                noOfB+=(count/k);
                count=0;
            }
        }
        noOfB+=(count/k);
        return noOfB>=m;
    }
}


