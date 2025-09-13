import java.util.ArrayList;
import java.util.List;
import javax.swing.tree.TreeNode;

public class binaryTreeInorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        traverse(root,list); //Note that the return types of the main and helper functions are different
        return list; //Hence list must be initialised separately and cannot be passed as a parametarized instance to the helper function!
    }

    public void traverse(TreeNode root, List<Integer> list){
        if(root == null){
            return;
        }

        traverse(root.left,list);
        list.add(root.val);
        traverse(root.right,list);

    }

/*Stack solution
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();

        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }

            root = stack.pop();
            res.add(root.val);
            root = root.right;
        }

        return res;        
    }
}

 */
}
