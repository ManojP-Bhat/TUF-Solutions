class Solution {
    public int findMin(ArrayList<Integer> arr) {
      int low=0;
      int high=arr.size()-1;
      int result=Integer.MAX_VALUE;
      while(low<=high){
        int mid=(low+high)/2;
        if(arr.get(low)<=arr.get(mid)){
            result=Math.min(result,arr.get(low));
            low=mid+1;
        }else{
            result=Math.min(result,arr.get(mid));
            high=mid-1;
        }
      }
      return result;
    }
}
