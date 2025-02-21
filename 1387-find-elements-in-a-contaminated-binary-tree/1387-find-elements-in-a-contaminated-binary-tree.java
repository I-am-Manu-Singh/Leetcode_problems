import java.util.*;

class FindElements {
    private List<Integer> valuesList = new ArrayList<>();

    /**
     * Recursively restores the values of the tree nodes.
     */
    private void solve(TreeNode root) {
        if (root == null) {
            return; // Base case: If node is null, stop recursion
        }

        // Store the restored value
        valuesList.add(root.val);

        // Process left child
        if (root.left != null) {
            root.left.val = root.val * 2 + 1;
        }
        solve(root.left);

        // Process right child
        if (root.right != null) {
            root.right.val = root.val * 2 + 2;
        }
        solve(root.right);
    }

    /**
     * Constructor initializes the recovery process of the tree.
     */
    public FindElements(TreeNode root) {
        root.val = 0;
        solve(root);
    }

    /**
     * Checks if a given `target` value exists in the recovered tree.
     */
    public boolean find(int target) {
        return valuesList.contains(target);
    }
}