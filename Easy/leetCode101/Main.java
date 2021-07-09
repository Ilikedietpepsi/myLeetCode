public class Main {

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

    public static void main(String[] args) {
      
	// write your code here
    }
}
