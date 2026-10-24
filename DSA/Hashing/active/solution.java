class Solution {
    public int subarraySumDivisbleByK(int[] nums, int k) {
        if(nums.length==0)return 0;
        int sum=0;
        int n=nums.length;
        int count=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        map.put(0,1);
        for(int num:nums){
            sum+=num;
            int rem=sum%k;
            if(rem<0){
                rem+=k;
            }
            if(map.containsKey(rem)){
                count+=map.get(rem);
            }
            map.put(rem,map.getOrDefault(rem,0)+1);
        }
        return count;
    }
}