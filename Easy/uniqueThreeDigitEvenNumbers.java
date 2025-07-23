//3483 Unique 3-Digit Even Numbers
import java.util.*;
public class uniqueThreeDigitEvenNumbers {

 class Solution {
    public int totalNumbers(int[] digits) {
        Set<Integer> result = new HashSet<>();
        for(int i=0; i<digits.length; i++){
            if(digits[i]==0){
                continue;
            }
            for(int j=0; j<digits.length; j++){
                if(j==i){
                    continue;
                }
                for(int k=0; k<digits.length; k++){
                    if(k==i || k==j){
                        continue;
                    }

                    int num = digits[i]*100 + digits[j]*10 + digits[k];
                    if(num%2==0){
                        result.add(num);
                    }
                }
            }
        }
    return result.size();
    
    }
}
}
