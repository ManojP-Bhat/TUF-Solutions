class Solution {
    public int[] getFloorAndCeil(int[] nums, int x) {
       int n=nums.length;
       int floor=findFloor(nums,x,n);
       int ceil=findCeil(nums,x,n);
       return new int[]{floor,ceil};
    }
    private int findFloor(int[]nums,int x,int n){
        int low=0,high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]<=x){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return high>=0?nums[high]:-1;
    }
    private int findCeil(int[]nums,int x,int n){
       int low=0,high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]>=x){
               high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return low<n?nums[low]:-1; 
    }
}