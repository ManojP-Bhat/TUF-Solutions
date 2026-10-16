class Solution {
    public void reverseString(List<Character> s) {
        //Two pointer approach
        int left=0;
        int right=s.size()-1;
        while(left<right){
            Character temp=s.get(left);
            s.set(left,s.get(right));
            s.set(right,temp);

            left++;
            right--;
        }
    }
}