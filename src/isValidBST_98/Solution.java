package isValidBST_98;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {

    public boolean isValidBST(TreeNode root) {

        if (root == null) return true;

        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(root);

        while (!queue.isEmpty()){
            TreeNode node = queue.poll();

            if (node.left != null){
                queue.add(node.left);
                if (node.left.val >= node.val){
                    return false;
                }
            }
            if (node.right != null){
                queue.add(node.right);
                if (node.right.val <= node.val){
                    return false;
                }
            }

        }

        return true;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);

        TreeNode left1 = new TreeNode(5);

        TreeNode right1 = new TreeNode(15);


        TreeNode left2 = new TreeNode(6);

        TreeNode right2 = new TreeNode(20);

        root.left = left1;
        root.right = right1;

        right1.left = left2;
        right1.right = right2;

        Solution s = new Solution();

        System.out.println(s.isValidBST(root));
    }
}


