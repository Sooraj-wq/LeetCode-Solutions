import java.util.HashMap;

public class ransomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        
        HashMap<Character,Integer> magMap = new HashMap<>();
        HashMap<Character,Integer> ransomMap = new HashMap<>();
        
        for(int i = 0; i < magazine.length(); i++){
            Character ch = magazine.charAt(i);
            if(!magMap.containsKey(ch)){
                magMap.put(ch,1);
            }else{
                magMap.computeIfPresent(ch,(key,value) -> value+1);
            }
        }

        for(int i = 0; i < ransomNote.length(); i++){
            Character ch = ransomNote.charAt(i);
            if(!ransomMap.containsKey(ch)){
                ransomMap.put(ch,1);
            }else{
                ransomMap.computeIfPresent(ch,(key,value) -> value+1);
            }
        }

        for(Character ch: ransomMap.keySet()){
            if(magMap.containsKey(ch) == false || ransomMap.get(ch) > magMap.get(ch)){
                return false;
            }
        }

        return true;

    }
}
