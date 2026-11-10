class Solution {
    public long countSubstrings(String s) {
        long[] frequency=new long[1<<10];
        frequency[0]=1;
        int mask=0;
        long total=0;
        for(int index=0;index<s.length();index++){
            int bit=s.charAt(index)-'a';
            mask=mask^(1<<bit);
            total+=frequency[mask];
            for(int toggleBit=0;toggleBit<10;toggleBit++){
                int preMask=mask^(1<<toggleBit);
                total+=frequency[preMask];
            }
            frequency[mask]++;
        }
        return total;
    }
}