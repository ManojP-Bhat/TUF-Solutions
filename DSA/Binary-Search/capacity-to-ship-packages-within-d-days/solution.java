class Solution {
    public int shipWithinDays(int[] weights, int days) {
       int low=Arrays.stream(weights).max().getAsInt();
       int high=Arrays.stream(weights).sum();
       while(low<=high){
        int mid=low+(high-low)/2;
        if(canShip(weights,days,mid)){
            high=mid-1;
        }else{
            low=mid+1;
        }
       }
       return low;
    }
    private boolean canShip(int[]nums,int days,int mid){
        int requiredDay=1;
        int load=0;
        for(int n:nums){
            if(load+n>mid){
                requiredDay++;
                load=0;
            }
            load+=n;
        }
        return requiredDay<=days;
    }
}