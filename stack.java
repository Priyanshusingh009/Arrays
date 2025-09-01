import java.util.Stack;

public class stack {
    public static boolean isValid(String s) {
         
        // Stack to store opening brackets
        Stack<Character> stack = new Stack<>();

        // Traverse each character in the string
        for (char c : s.toCharArray()) {
            // If opening bracket, push to stack
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } 
            // If closing bracket, check conditions
            else {
                // If stack empty, means no opening bracket
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop(); // Take out last opening bracket

                // Check matching pairs
                if ((c == ')' && top != '(') ||
                    (c == '}' && top != '{') ||
                    (c == ']' && top != '[')) {
                    return false;
                }
            }
        }

        // If stack is empty, all brackets matched
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        //Given a string str can only containing just the characters '(', ')', '{', '}', '[' and ']',
        String str="({})";
        System.out.println(isValid(str));
    }
    
}
