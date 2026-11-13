class Solution {
    public List<String> generateBinaryStrings(int n) {
        result.clear();
        backtrack("",n,'0');
        return result;
    }
    List<String>result=new ArrayList<>();
    void backtrack(String s, int n, char prev){
        if(s.length()==n){
            result.add(s);
            return;
        }
        backtrack(s+"0",n,'0');
        if(prev!='1'){
            backtrack(s+"1",n,'1');
        }
    }
}