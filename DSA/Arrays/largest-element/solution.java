class Solution {
    public int largestElement(int[] nums) {
    int n=nums.length;
    int largest=nums[0];
    for(int i=0;i<n;i++){
        if(nums[i]>largest){
           largest=nums[i];
        }
    }
    return largest;
    }
}