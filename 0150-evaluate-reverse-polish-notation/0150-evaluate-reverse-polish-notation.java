class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st=new Stack<>();
        int n1=1;
        int n2=1;
        for(int i=0;i<tokens.length;i++){
            String c=tokens[i];
            if(!c.equals("+")&&!c.equals("-")&&!c.equals("/")&&!c.equals("*")){
                st.push(Integer.valueOf(c));
            }
            else{
                //if(!st.isEmpty()) {
                n2=st.peek();
                st.pop();
                //}
                //if(!st.isEmpty()){
                n1=st.peek();
                st.pop();
                //}
                if(c.equals("+")){
                    st.push(n1+n2);
                }
                else if(c.equals("-")){
                    st.push(n1-n2);
                }
                else if(c.equals("/")){
                    st.push(n1/n2);
                }
                else if(c.equals("*")){
                    st.push(n1*n2);
                }
            }
        }
        return st.pop();
    }
}