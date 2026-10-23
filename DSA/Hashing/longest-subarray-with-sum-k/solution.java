class Solution {
    public int longestSubarray(int[] nums, int k) {
       int n=nums.length;
       int sum=0;
       int maxLen=0;
       HashMap<Integer,Integer> map=new HashMap<>();
       for(int i=0;i<n;i++){
        sum+=nums[i];
        if(sum==k){
            maxLen=Math.max(maxLen,i+1);
        }
        int rem=sum-k;
        if(map.containsKey(rem)){
            int len=i-map.get(rem);
            maxLen=Math.max(maxLen,len);
        }
        if(!map.containsKey(sum)){
            map.put(sum,i);
        }

       }
       return maxLen;
    }
}