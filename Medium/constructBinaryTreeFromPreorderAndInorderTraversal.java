import java.util.HashMap;

public class constructBinaryTreeFromPreorderAndInorderTraversal {
    private int idx = 0;
    HashMap<Integer,Integer> map = new HashMap<>();

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        
        for(int i = 0; i < inorder.length; i++){
            map.put(inorder[i], i);
        }

        return build(preorder, 0, inorder.length - 1);
    }

    public TreeNode build(int[] preorder, int start, int end){
        
        if(start > end){
            return null;
        }

        int rootVal = preorder[idx++];
        TreeNode root = new TreeNode(rootVal);

        int inorderidx = map.get(rootVal);

        root.left = build(preorder, start, inorderidx - 1);
        root.right = build(preorder, inorderidx + 1, end);

        return root;
    }
}
