class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        int longest=1;
        int count=0;
        int prevSmall=Integer.MIN_VALUE;
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
            if(nums[i]-1==prevSmall){
                count++;
                prevSmall=nums[i];
            }else if(nums[i]!=prevSmall){
                count=1;
                prevSmall=nums[i];
            }
            longest=Math.max(longest,count);
        }
        return longest;
    }
}