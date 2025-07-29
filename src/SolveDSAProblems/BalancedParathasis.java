package SolveDSAProblems;

import java.util.Stack;

public class BalancedParathasis {

        public static void main(String args[]){
            String ghh = "{[()]}()";
            System.out.println("The provided string is balanced ?" +ghh+ " is  " +isBalanced(ghh));

        }

        private static Boolean isBalanced(String ghh) {
            Stack<Character> stk = new Stack<Character>();
            char[] ch = ghh.toCharArray();
            for(char c: ch){
                if(c == '{' || c== '[' || c== '('){
                    stk.push(c);
                } else if (c == '}' || c== ']' || c== ')') {
                    if(stk.isEmpty() || !isPatternMatching(stk.pop(), c) ){
                        return false;
                    }
                }
            }
            return stk.isEmpty();
        }

    private static boolean isPatternMatching(Character open, char close) {
            return (open == '{' && close == '}')
                    || (open == '(' && close == ')') || (open == '[' && close == ']');
    }
}
