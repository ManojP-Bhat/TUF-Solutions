class Solution {
    public int countOddDigit(int n) {
        int sum=0;
        int count=0;
        while(n>0){
            sum=n%10;
            if(sum%2!=0){
                count++;
            }
            n=n/10;
        }
        return count;
    }
}