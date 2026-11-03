class Solution {
    public int findPages(int[] nums, int m) {
        int n=nums.length;
        if(m>n) return -1;
        int low=Integer.MIN_VALUE;
        int high=0;
        for(int i=0;i<n;i++){
            low=Math.max(low,nums[i]);
            high=high+nums[i];
        }
        while(low<=high){
            int mid=(low+high)/2;
            int students=countStudent(nums,mid);
            if(students>m){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return low;
    }
    private int countStudent(int[]nums,int pages){
        int n=nums.length;
        int students=1;
        int pagesStudent=0;
        for(int i=0;i<n;i++){
            if(pagesStudent+nums[i]<=pages){
                pagesStudent+=nums[i];
            }else{
                students++;
                pagesStudent=nums[i];
            }
        }
        return students;
    }

}