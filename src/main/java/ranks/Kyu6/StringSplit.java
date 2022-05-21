package ranks.Kyu6;

/*
Complete the solution so that it splits the string into pairs of two characters.
If the string contains an odd number of characters
then it should replace the missing second character of the final pair with an underscore ('_').

* 'abc' =>  ['ab', 'c_']
* 'abcdef' => ['ab', 'cd', 'ef']
 */


public class StringSplit {
    public static String[] solution(String s) {
        if (s.length() % 2 != 0) {
            s = s + '_';
        }
        char [] chars = s.toCharArray();
        int i = 0;
        int j = 0;
        String[] solution = new String [chars.length/2 ];
        while (i < chars.length  && j <= solution.length) {
            String el = chars[i] + String.valueOf(chars[i+1]);
            solution[j] = el;
            i = i + 2;
            j++;
        }
        return solution;
    }

}