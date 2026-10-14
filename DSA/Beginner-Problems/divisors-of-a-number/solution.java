class Solution {
    public int[] divisors(int n) {
        int[]temp=new int[n];
        int count=0;
        for(int i=1;i<=temp.length;i++){
            if(n%i==0){
                temp[count]=i;
                count++;
            }
        }
        int[]ans=new int[count];
        for(int i=0;i<count;i++){
            ans[i]=temp[i];
        }
        return ans;
    }
}