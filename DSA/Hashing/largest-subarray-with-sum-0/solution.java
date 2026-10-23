class Solution {
    public int maxLen(int[] arr) {
        int n=arr.length;
        int maxLen=0;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum+=arr[j];
                if(sum==0){
                    maxLen=Math.max(maxLen,j-i+1);
                }
            }
        }
        return maxLen;
    }
}
