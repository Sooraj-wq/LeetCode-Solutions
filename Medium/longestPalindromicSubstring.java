public class longestPalindromicSubstring {
    public String longestPalindrome(String s) {

        int maxLength = 0;
        String result = "";
        for(int i = 0; i<s.length(); i++){

            //odd center
            int left = i;
            int right = i;
            while(left >=0 && right < s.length()){
                if(s.charAt(left) == s.charAt(right)){
                    if((right - left + 1) > maxLength){
                            maxLength = right-left+1;
                            result = s.substring(left,right+1);
                    }
                    left--;
                    right++;
                }else{
                    break;
                }
            }

            //even center
            left = i;
            right = i+1;
            while(left >=0 && right < s.length()){
                if(s.charAt(left) == s.charAt(right)){
                    if((right - left + 1) > maxLength){
                            maxLength = right-left+1;
                            result = s.substring(left,right+1);
                    }
                    left--;
                    right++;
                }else{
                    break;
                }
            }
        }
        return result;
    }
}
