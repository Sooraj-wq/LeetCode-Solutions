import javax.swing.tree.TreeNode;

public class sumRootToLeafNumbers {
    int sum = 0;
    public int sumNumbers(TreeNode root) {
        return helper(root,0);
    }

    public int helper(TreeNode root, int currSum){
        
        if(root == null){
            return 0;
        }

        currSum = currSum*10 + root.val;

        if(root.left == null && root.right == null){
            return currSum;
        }

        int leftSum = helper(root.left, currSum);
        int rightSum = helper(root.right, currSum);
 

        return leftSum + rightSum;
    }
}
