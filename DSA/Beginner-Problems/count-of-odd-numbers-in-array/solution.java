class Solution{
    public int countOdd(int[] arr, int n) {
       int count=0;
       for(int i=0;i<arr.length;i++){
        if(arr[i]%2!=0){
            count++;
        }else{
            continue;
        }
       }
       return count;
    }
}