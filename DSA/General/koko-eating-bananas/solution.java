class Solution {
    public int minimumRateToEatBananas(int[] nums, int h) {
        int low=1;
        int high=findMax(nums);
        while(low<=high){
            int mid=(low+high)/2;
            long totalH=calculateTotalHours(nums,mid);
            if(totalH<=h){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return low;
    }
    private long calculateTotalHours(int[]nums,int hour){
        long totalH=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            totalH+=Math.ceil((double)nums[i]/(double)hour);
        }
        return totalH;
    }
    private int findMax(int[]nums){
        int maxi=Integer.MIN_VALUE;
        int n=nums.length;
        for(int i=0;i<n;i++){
            maxi=Math.max(maxi,nums[i]);
        }
        return maxi;
    }
}