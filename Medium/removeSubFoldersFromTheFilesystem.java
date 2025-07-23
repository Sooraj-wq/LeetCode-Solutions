//1233. Remove Sub-Folders from the Filesystem

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class removeSubFoldersFromTheFilesystem {
        public List<String> removeSubfolders(String[] folder) {
        
        Arrays.sort(folder);
        ArrayList<String> result = new ArrayList<>();
        for(int i = 0; i < folder.length; i++){
            
            String curr = folder[i];
            while(i < folder.length){
                if(startsWith(curr,folder[i])){
                    i++;
                }else{
                    i--;
                    break;
                }
            }
            result.add(curr);
        }

         return result;
    }
       

        public Boolean startsWith(String prefix,String name){
            if(prefix.length() > name.length()){
                return false;
            }
            int i;
            for(i = 0; i < prefix.length(); i++){
                if(prefix.charAt(i)!=name.charAt(i)){
                    return false;
                }
            }
            if(name.length() > prefix.length() && name.charAt(i)!='/'){
                return false;
            }
            return true;
        }
}
