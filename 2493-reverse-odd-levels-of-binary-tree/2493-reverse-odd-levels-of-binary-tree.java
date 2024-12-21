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
    public TreeNode reverseOddLevels(TreeNode root) {
        int lvl = 0;
        Queue<TreeNode> q = new LinkedList<>();

        q.add(root);
        while (!q.isEmpty()) {
            int size = q.size();
            List<Integer> nodes = new ArrayList<>();
            Queue<TreeNode> temp = new LinkedList<>(q);
            for (int i = 0; i < size; i++) {
                TreeNode it = q.poll();
                if (it.left != null) q.add(it.left);
                if (it.right != null) q.add(it.right);
                nodes.add(it.val);
            }
            if (lvl % 2 != 0) {
                Collections.reverse(nodes);
                int i = 0;
                while (size-- > 0) {
                    TreeNode it = temp.poll();
                    it.val = nodes.get(i);
                    i++;
                }
            }
            lvl++;
        }
        return root;
    }

}