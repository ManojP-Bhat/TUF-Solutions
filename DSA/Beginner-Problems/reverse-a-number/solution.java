
class Solution {
    public int reverseNumber(int n) {
    int revnum=0;
    while(n>0){
        int lastDigit=n%10;
        revnum=(revnum*10)+lastDigit;
        n=n/10;
    }
    return revnum;
    }
}