import java.util.ArrayList;
import java.util.List;

public class letterCombinationsOfAPhoneNumber {
    String[] combinations = {"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    List<String> array= new ArrayList<>();

    public List<String> letterCombinations(String digits) {
        
        if(digits.isEmpty()){
            return array;
        }

        find(digits, 0, "");
        return array;
    }

    public void find(String digits, int idx, String curr){
        
        if(idx > digits.length() - 1){
            array.add(curr);
            return;
        }

        int number = digits.charAt(idx) - '0';
        int arrayIndex = number - 2;
        for(int j = 0; j < combinations[arrayIndex].length(); j++){
                    find(digits, idx+1, curr + combinations[arrayIndex].charAt(j));
        }

        return;
    }
}
