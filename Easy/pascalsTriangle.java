import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class pascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        
        if (numRows == 0) return triangle;

        triangle.add(Arrays.asList(1));
        
        for (int i = 1; i < numRows; i++) {
            
            List<Integer> prev = triangle.get(i - 1);
            List<Integer> curr = new ArrayList<>();
            
            curr.add(1);
            
            for (int j = 0; j < prev.size() - 1; j++) {
                curr.add(prev.get(j) + prev.get(j + 1));
            }
            curr.add(1); 
            
            triangle.add(curr);
        }
        
        return triangle;
    }
}
