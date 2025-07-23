//1717. Maximum Score From Removing Substrings
import java.util.*;
public class maximumScoreFromRemovingSubstrings {
class Solution {
    public int maximumGain(String s, int x, int y) {
        char highFirst, highSecond, lowFirst, lowSecond;
        int highPoints, lowPoints;

        if (x > y) {
            highFirst = 'a';
            highSecond = 'b';
            highPoints = x;
            lowFirst = 'b';
            lowSecond = 'a';
            lowPoints = y;
        } else {
            highFirst = 'b';
            highSecond = 'a';
            highPoints = y;
            lowFirst = 'a';
            lowSecond = 'b';
            lowPoints = x;
        }

        int totalScore = 0;
        
        Stack<Character> stack1 = new Stack<>();
        for (char c : s.toCharArray()) {
            if (!stack1.isEmpty() && stack1.peek() == highFirst && c == highSecond) {
                stack1.pop();
                totalScore += highPoints;
            } else {
                stack1.push(c);
            }
        }

        Stack<Character> stack2 = new Stack<>();
        for (char c : stack1) {
            if (!stack2.isEmpty() && stack2.peek() == lowFirst && c == lowSecond) {
                stack2.pop();
                totalScore += lowPoints;
            } else {
                stack2.push(c);
            }
        }

        return totalScore;
    }
}
}
