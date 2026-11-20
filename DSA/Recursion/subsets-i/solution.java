class Solution {
    public List<Integer> subsetSums(int[] nums) {
        List<Integer>ans=new ArrayList<>();
        backtrack(0,0,nums,ans);
        return ans;
    }
    private void backtrack(int ind,int sum,int[]nums,List<Integer>ans){
        if(ind==nums.length){
            ans.add(sum);
            return;
        }
        backtrack(ind+1,sum+nums[ind],nums,ans);
        backtrack(ind+1,sum,nums,ans);
    }
}