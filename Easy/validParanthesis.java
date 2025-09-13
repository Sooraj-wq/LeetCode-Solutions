import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class validParanthesis {
        public boolean isValid(String s) {
        List<Character> list = Arrays.asList('{', '[', '(');
        Stack<Character> stack = new Stack<>();
        for(int i = 0 ; i < s.length() ; i++){
            
            char ch = s.charAt(i);
            char pair = ' ';
            switch(ch){
                case ')':
                    pair = '(';
                    break;
                case ']':
                    pair = '[';
                    break;
                case '}':
                    pair = '{';
                    break;
            }
            if(!stack.isEmpty()){
                if(stack.peek() == pair){
                    stack.pop();    
                }else if (list.contains(ch)){
                    stack.push(ch);
                }else{
                    return false;
                }
                
            }else if (stack.isEmpty()) {
                stack.push(ch); 
            }
        }

        if(!stack.isEmpty()){
            return false;
        }
        return true;
    }
}
