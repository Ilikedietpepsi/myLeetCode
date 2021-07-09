public class Main {

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p==null && q==null) {
            return true;
        }
        else if (p != null && q == null) {
            return false;
        }

        else if (q != null && p == null) {
            return false;
        }
        else if (p.val != q.val) {
            return false;
        }
        else if (p.val == q.val && p.left == null && p.right == null && q.left == null && q.right == null) {
            return true;
        }

        boolean left = isSameTree(p.left, q.left);
        boolean right = isSameTree(p.right,q.right);

        return (left && right);
    }

    public static void main(String[] args) {
	// write your code here
    }
}
