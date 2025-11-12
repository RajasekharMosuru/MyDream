package SolveDSAProblems.FAANG;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        System.out.println(validParathes("({[]})"));
    }

    public static boolean validParathes(String s) {
        Stack<Character> stackParanth = new Stack<>();
        for(char c: s.toCharArray()){
            if("({[".indexOf(c) != -1){
                stackParanth.push(c);
            } else{
                if(stackParanth.isEmpty()){
                    return false;
                }
                char top = stackParanth.pop();
                if((c == ')' && top != '(') || (c == '}' && top != '{') || (c == ']' && top != '[')){
                    return false;
                }
            }
        }
        return stackParanth.isEmpty();
    }
}
