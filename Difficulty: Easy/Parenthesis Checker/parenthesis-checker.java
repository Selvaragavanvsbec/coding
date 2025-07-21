class Solution {
    static boolean isBalanced(String s) {
        Stack<String> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '{' || s.charAt(i) == '(' || s.charAt(i) == '[') {
                st.push(String.valueOf(s.charAt(i)));
            } else {
                if (st.empty()) {
                    return false;
                }
                String c = st.pop();
                if ((s.charAt(i) == '}' && c.equals("{")) ||
                    (s.charAt(i) == ')' && c.equals("(")) ||
                    (s.charAt(i) == ']' && c.equals("["))) {
                    continue;
                } else {
                    return false;
                }
            }
        }
        if (st.empty()) {
            return true;
        }
        return false;
    }
}
