class Solution {
    final long MOD=1000000007;
    private long modPow(long base,long exp){
        long result=1;
        base%=MOD;
        while(exp>0){
            if(exp%2==1) result=(result*base)%MOD;
            base=(base*base)%MOD;
            exp/=2;
        }
        return result;
    }
    public int countGoodNumbers(long n) {
        long evenPosition=(n+1)/2;
        long oddPosition=n/2;
        long res=(modPow(5,evenPosition)*modPow(4,oddPosition))%MOD;
        return (int)res;
    }
}