class Solution {
    public int maxConsecutiveGoodNums(int[] nums, int[] goodNumbers) {
        Set<Integer>good=new HashSet<>();
        for(int num:goodNumbers){
            good.add(num);
        }
        int count=0;
        int maxCount=0;
        for(int num:nums){
            if(good.contains(num)){
                count++;
                maxCount=Math.max(maxCount,count);
            }else{
                count=0;
            }
        }
        return maxCount;
    }
}