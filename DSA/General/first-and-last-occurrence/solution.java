class Solution {
    public int[] searchRange(int[] nums, int target) {
    int n=nums.length;
    int first=firstOccurance(nums,target,n);
    int last=lastOccurance(nums,target,n);
    return new int[]{first,last};
    }
    private int firstOccurance(int[]nums,int x,int n){
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]<x){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return low<n&&nums[low]==x?low:-1;
    }
    private int lastOccurance(int[]nums,int x,int n){
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]<=x){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return high>=0&&nums[high]==x?high:-1;
    }
}