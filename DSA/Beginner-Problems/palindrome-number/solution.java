class Solution {
    public boolean isPalindrome(int n) {
        int rev=0;
        int reverse=n;
        while(n>0){
            int last=n%10;
            rev=(rev*10)+last;
            n=n/10;
        }
        return reverse==rev;
    }
}