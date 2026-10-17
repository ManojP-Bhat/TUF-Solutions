class Solution {
    public List<List<Integer>> pascalTriangleIII(int n) {
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            ans.add(genRows(i));
        }
        return ans;
    }
    private static List<Integer> genRows(int row){
        long ans=1;
        List<Integer>res=new ArrayList<>();
        res.add((int)ans);
        for(int col=1;col<=row;col++){
            ans=ans*(row-col+1);
            ans=ans/col;
            res.add((int)ans);
        }
        return res;
    }
}