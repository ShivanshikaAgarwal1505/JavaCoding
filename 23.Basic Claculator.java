import java.util.*;

public class Solution {
    public int calculate(String s) {
        int n = s.length();
        int result = 0;
        int sign = 1; // +1 means positive, -1 means negative
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);

            if (Character.isDigit(c)) {
                int num = 0;
                // Build full number (can be multiple digits)
                while (i < n && Character.isDigit(s.charAt(i))) {
                    num = num * 10 + (s.charAt(i) - '0');
                    i++;
                }
                i--; // adjust since loop goes one char ahead
                result += sign * num;
            } 
            else if (c == '+') {
                sign = 1;
            } 
            else if (c == '-') {
                sign = -1;
            } 
            else if (c == '(') {
                // Push current result and sign onto stack
                stack.push(result);
                stack.push(sign);
                // Reset result and sign for inner expression
                result = 0;
                sign = 1;
            } 
            else if (c == ')') {
                // Pop sign and previous result
                int prevSign = stack.pop();
                int prevResult = stack.pop();
                result = prevResult + prevSign * result;
            }
            // ignore spaces
        }

        return result;
    }

    // Driver (for custom input testing)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter expression: ");
        String input = sc.nextLine();
        Solution sol = new Solution();
        int ans = sol.calculate(input);
        System.out.println("Output: " + ans);
        sc.close();
    }
}
