class Solution {
    public int countOccurrences(int[] arr, int target) {
        int first=firstOccurance(arr,target);
        if(first==-1)return 0;
        int last=lastOccurance(arr,target);
        return last-first+1; 
    }
    private int firstOccurance(int[]nums,int target){
        int n=nums.length;
        int low=0;
        int high=n-1;
        int result=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target){
                result=mid;
                high=mid-1;
            }
            else if(nums[mid]<target){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return result;
    }
    private int lastOccurance(int[]nums,int target){
        int n=nums.length;
        int low=0;
        int high=n-1;
        int result=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target){
                result=mid;
                low=mid+1;
            }
            else if(nums[mid]>target){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return result;
    }
}
