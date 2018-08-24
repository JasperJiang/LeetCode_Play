package inorderTraversal_94;

import java.util.*;

public class Solution {

    public static void robot(List<Integer> ans,TreeNode root){
        if(root!=null){
            robot(ans,root.left);
            ans.add(root.val);
            robot(ans,root.right);
        }
    }


    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        robot(ans,root);
        return ans;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = null;
        TreeNode root_r = new TreeNode(2);
        root.right = root_r;

        TreeNode a_l = new TreeNode(3);
        root_r.left = a_l;

        System.out.println(inorderTraversal(root));
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

}


