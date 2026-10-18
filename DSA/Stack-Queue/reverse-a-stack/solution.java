class Solution {
    public void reverseStack(Stack<Integer> st) {
        if(st.isEmpty()){
            return;
        }
        int top=st.pop();
        reverseStack(st);
        newStack(st,top);
    }
    public void newStack(Stack<Integer> stack,int ele){
        if(stack.isEmpty()){
            stack.push(ele);
            return;
        }
        int top=stack.pop();
        newStack(stack,ele);
        stack.push(top);
    }
}