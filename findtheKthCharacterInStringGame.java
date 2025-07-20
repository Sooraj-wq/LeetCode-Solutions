public class findtheKthCharacterInStringGame {
    public char kthCharacter(int k) {
        
        StringBuilder word = new StringBuilder("a");
        StringBuilder curr = new StringBuilder();

        while(k > word.length()){
            for(int i=0; i<word.length(); i++){
                curr.append((char)(word.charAt(i)+1));
            }
            word.append(curr);
            curr = new StringBuilder();
        }

        return word.charAt(k-1);
    }
}
