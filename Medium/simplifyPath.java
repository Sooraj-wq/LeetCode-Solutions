import java.util.Stack;

public class simplifyPath {
    public String simplifyPath(String path) {
        
        Stack<String> stack = new Stack<>();
        String[] parts = path.split("/");
        String result = "";

        for(String str: parts){
            
            if(str.equals(".") || str.equals("")){
                continue;
            }else if(str.equals("..")){
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }else{
                stack.push(str);
            }
        }

        while(!stack.isEmpty()){
            String curr = stack.pop();
            result = '/' + curr + result;
        }

        if(result.length() == 0){
            return "/";
        }
        
        return result;

    }    
}
