class Solution {
    public boolean isArmstrong(int n) {
        if(n==0)return true;
        int sum=0;
        int original=n;
        int count=(int)Math.log10(n)+1;
        while(n>0){
            int ld=n%10;
            sum+=Math.pow(ld,count);
            n=n/10;
        }
        return original==sum;
    }
}