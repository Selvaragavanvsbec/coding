import java.util.*;
class Solution {
    Stack<Long> stack;
    long min;

    public Solution() {
        stack = new Stack<>();
        min = -1;
    }

    public void push(int x) {
        if (stack.isEmpty()) {
            stack.push((long)x);
            min = x;
        } else {
            if (x >= min) {
                stack.push((long)x);
            } else {
                stack.push(2L * x - min);
                min = x;
            }
        }
    }

    public void pop() {
        if (stack.isEmpty()) return;
        long top = stack.pop();
        if (top < min) {
            min = 2 * min - top;
        }
        if (stack.isEmpty()) min = -1;
    }

    public int peek() {
        if (stack.isEmpty()) return -1;
        long top = stack.peek();
        if (top >= min) return (int)top;
        else return (int)min;
    }

    public int getMin() {
        if (stack.isEmpty()) return -1;
        return (int)min;
    }
}
