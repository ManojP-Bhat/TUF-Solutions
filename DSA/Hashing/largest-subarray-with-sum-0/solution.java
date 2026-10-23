class Solution {
    public int maxLen(int[] arr) {
        int n=arr.length;
        int maxLen=0;
        int sum=0;
        Map<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(sum==0){
                maxLen=i+1;
            }else if(map.containsKey(sum)){
                maxLen=Math.max(maxLen,i-map.get(sum));
            }else{
                map.put(sum,i);
            }
        }
        return maxLen;
    }
}
