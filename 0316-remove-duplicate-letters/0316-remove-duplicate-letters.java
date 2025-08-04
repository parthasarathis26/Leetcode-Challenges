class Solution {
    public String removeDuplicateLetters(String s) {
        char w[] = new char[256];
        for (char c : s.toCharArray()) {
            w[c]++;
        }
        Stack<Character> st = new Stack<>();
        Stack<Character> st1 = new Stack<>();
        boolean[] inStack = new boolean[256]; // to track if a character is already in the stack

        for (char c : s.toCharArray()) {
            w[c]--;

            if (inStack[c]) continue;

            while (!st.isEmpty() && st.peek() > c && w[st.peek()] > 0) {
                inStack[st.peek()] = false;
                st.pop();
            }

            st.push(c);
            inStack[c] = true;
        }

        StringBuilder result = new StringBuilder();
        for (char c : st) {
            result.append(c);
        }
        return result.toString();
    }
}
