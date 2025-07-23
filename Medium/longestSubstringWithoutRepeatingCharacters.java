//3. Longest Substring Without Repeating Characters

import java.util.HashSet;

public class longestSubstringWithoutRepeatingCharacters {
    class Solution {
        public int lengthOfLongestSubstring(String s) {

        //dynamic sliding window algorithm

        HashSet<Character> set = new HashSet<>();
        int len = s.length();

        if(len==0){
            return 0;
        }

        int rear = 0; //rear pointer
        int front = 0; //front pointer
        int max = 1;
        
        while(front < len){
            if(!set.contains(s.charAt(front))){
                set.add(s.charAt(front)); //If the current character is not in the set then go to the next character 
                front++;
            }else{
                set.remove(s.charAt(rear)); //if the current character is in the set then remove the rear characters until the repeated character is removed
                rear++;
            }
            max = Math.max(max,set.size());
        }

        return max;
    }
}
}
