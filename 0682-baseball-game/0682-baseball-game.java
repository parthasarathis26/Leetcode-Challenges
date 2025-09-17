class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st=new Stack<>();
        int sum=0;
        for(int i=0;i<operations.length;i++){
            if (!operations[i].equals("C") && !operations[i].equals("D") && !operations[i].equals("+")){

                st.push(Integer.valueOf(operations[i]));
            }
            else if(operations[i].equals("C")){
                st.pop();
            }
            else if(operations[i].equals("D")){
                int n=st.peek();
                st.push(n*2);
            }
            else{
                int n1=st.pop();
                int n2=st.peek();
                int res=n1+n2;
                st.push(n1);
                st.push(res);
            }
        }
        while(!st.isEmpty()){
            sum+=st.pop();
        }
        return sum;
    }
}