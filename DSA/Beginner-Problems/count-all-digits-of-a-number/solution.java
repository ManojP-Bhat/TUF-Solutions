class Solution {
    public int countDigit(int n) {
        if(n==0)return 1;
        int digit=0;
        int count=0; 
        while(n>0){
            digit=n%10;
            n=n/10;
            count++;
        }
        return count;
    }
}