package ranks.Kyu6;

/*
Write a function that takes a string of braces, and determines if the order of the braces is valid.
It should return true if the string is valid, and false if it's invalid.
This Kata is similar to the Valid Parentheses Kata, but introduces new characters: brackets [], and curly braces {}.

All input strings will be nonempty, and will only consist of parentheses, brackets and curly braces: ()[]{}.
 */

/*
What is considered Valid?
A string of braces is considered valid if all braces are matched with the correct brace.

Examples
"(){}[]"   =>  True
"([{}])"   =>  True
"(}"       =>  False
"[(])"     =>  False
"[({})](]" =>  False


 */

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class BraceChecker {

    public boolean isValid(String braces) {
        if (braces == null) {
            return false;
        }
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');

        for (int i = 0; i < braces.length(); i++) {
            char c = braces.charAt(i);
            if ((c == '(') || (c == '{') || (c == '[')) {
                stack.push(c);
            } else {
                if (stack.empty() || (stack.pop() != map.get(c))) {
                    return false;
                }
            }
        }
        return stack.empty();
    }

}
