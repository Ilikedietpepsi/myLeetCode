/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
        return check(root,root);
    }

    public static boolean check(TreeNode a, TreeNode b) {
        if (a == null && b == null) {
            return true;
        }

        if (a == null && b != null) {
            return false;
        }

        if (a != null && b == null) {
            return false;
        }

        return a.val==b.val && check(a.left,b.right) && check(a.right,b.left);
    }
}
