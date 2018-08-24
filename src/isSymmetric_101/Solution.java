package isSymmetric_101;

import java.util.ArrayList;
import java.util.List;

public class Solution {


    public static boolean robot(TreeNode rootL,TreeNode rootR){
       if (rootL == null && rootR == null){
           return true;
       }
       if ((rootL != null && rootR == null) || (rootL == null && rootR != null)){
           return false;
       }
       if ((rootL.val == rootR.val) && (robot(rootL.left,rootR.right)) && (robot(rootL.right,rootR.left))){
           return true;
       }
       return false;
    }

    public static boolean isSymmetric(TreeNode root) {
        if (root == null)
            return true;
        return robot(root.left,root.right);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = null;
        TreeNode root_r = new TreeNode(2);
        root.right = root_r;

        TreeNode a_l = new TreeNode(3);
        root_r.left = a_l;

        System.out.println(isSymmetric(root));
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
