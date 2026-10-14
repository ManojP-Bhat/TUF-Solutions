class Solution {
    public int largestDigit(int n) {
      if(n==0)return 0;
      int largest=0;
      while(n>0){
        int ld=n%10;
        if(ld>largest){
            largest=ld;
        }
        n=n/10;
      }  
      return largest;
    }
}