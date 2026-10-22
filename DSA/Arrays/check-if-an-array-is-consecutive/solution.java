class Solution {
    public boolean isConsecutive(int[] nums) {
       int n=nums.length;
       int min=Integer.MAX_VALUE;
       int max=Integer.MIN_VALUE;
       HashSet<Integer> set=new HashSet<>();
       for(int num:nums){
        if(set.contains(num)){
            return false;
        }
        set.add(num);
        min=Math.min(min,num);
        max=Math.max(max,num);
       }
       return max-min+1==n;
    }
}