class Solution {
    public int smallestDivisor(int[] nums, int limit) {
       int low = 1, high = nums[0];
        for(int num : nums){
            high = Math.max(high, num);
        }

        while(low<=high){
            int mid = low+ (high-low)/2;
            int count = 0;
            for(int num: nums){
                count +=((num-1)/mid)+1;
            }
            if(count<=limit)
                high = mid-1;
            else 
                low = mid+1;
        }
        return low;
    }
}