class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> arr=new ArrayList<>();
        Arrays.sort(nums);
        backtrack(0,arr,nums,ans);
        return ans;
    }
    private void backtrack(int ind,List<Integer> arr,int[]nums,List<List<Integer>>ans){
        if(ind==nums.length){
            ans.add(new ArrayList<>(arr));
            return;
        }
        arr.add(nums[ind]);
        backtrack(ind+1,arr,nums,ans);
        arr.remove(arr.size()-1);
        for(int j=ind+1;j<nums.length;j++){
            if(nums[j]!=nums[ind]){
                backtrack(j,arr,nums,ans);
                return;
            }
        }
        backtrack(nums.length,arr,nums,ans);
    }
}