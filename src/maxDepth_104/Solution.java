package maxDepth_104;

public class Solution {

    public static int robot(TreeNode root){
        if(root==null){
            return 0;
        }
        int left=robot(root.left);
        int right=robot(root.right);
        return left>right?left+1:right+1;
    }


    public static int maxDepth(TreeNode root) {
        return robot(root);
    }



    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = null;
        TreeNode root_r = new TreeNode(2);
        root.right = root_r;

        TreeNode a_l = new TreeNode(3);
        root_r.left = a_l;

        System.out.println(maxDepth(root));
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

}
