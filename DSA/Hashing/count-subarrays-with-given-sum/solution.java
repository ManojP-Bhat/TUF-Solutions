class Solution {
    public int subarraySum(int[] nums, int k) {
        int n=nums.length;
        int count=0;
        int psum=0;
        Map<Integer,Integer>map=new HashMap<>();
        map.put(0,1);
        for(int i=0;i<n;i++){
            psum+=nums[i];
            int removeSum=psum-k;
            count+=map.getOrDefault(removeSum,0);
            map.put(psum,map.getOrDefault(psum,0)+1);
        }
        return count;
    }

}