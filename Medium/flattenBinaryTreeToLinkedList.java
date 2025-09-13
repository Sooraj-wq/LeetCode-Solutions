
public class flattenBinaryTreeToLinkedList {
    public void flatten(TreeNode root) {
        
        if(root == null){
            return;
        }

        flatten(root.left);
        flatten(root.right);

        TreeNode right = root.right;
        TreeNode left = root.left;

        root.left = null;
        root.right = left;

        TreeNode curr = root;

        while(curr.right!=null){
            curr = curr.right;
        }

        curr.right = right;
    }
}
