package CodingQuesnthirty.stack;

import java.util.Stack;

public class ValidParanthesis {
    static void main() {


        String s = "({})";
        Stack<Character> stack = new Stack<>();
        boolean isBool = false;
        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) {
                    isBool = false;
                }
                char top = stack.pop();
                if (ch == ')' && top != '(') {
                    isBool = false;
                }
                if (ch == ']' && top != '[') {
                    isBool = false;
                }
                if (ch == '}' && top != '{') {
                    isBool = false;
                }
            }
        }
        isBool = stack.isEmpty();
    }
}
