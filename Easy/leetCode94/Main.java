import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> tree = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        while (cur != null || !stack.isEmpty()) {
            if (cur != null) {
                stack.push(cur);
                cur = cur.left;
            }

            else {
                cur = stack.pop();
                tree.add(cur.val);
                cur = cur.right;
            }
        }

        return tree;
    }

    public static void main(String[] args) {
	// write your code here
    }
}
