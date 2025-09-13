public class maximumDepthOfABinaryTree {
    int max = 0;

    public int maxDepth(TreeNode root) {
        
        if(root == null){
            return 0;
        }

        int leftBranch = maxDepth(root.left);
        int rightBranch = maxDepth(root.right);

        max = Math.max(leftBranch, rightBranch);

        return max + 1;
    }
}
