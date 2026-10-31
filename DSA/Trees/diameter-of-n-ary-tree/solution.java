/**
 * Definition for an n-ary tree node.
 * class TreeNode {
 *     int val;
 *     List<TreeNode> children;
 * 
 *     TreeNode(int _val) {
 *         val = _val;
 *         children = new ArrayList<>();
 *     }
 * }
 **/


class Solution {

    int maxDiameter = 0;

    public int diameter(TreeNode root) {
        maxDiameter = 0;
        maxDepth(root);
        return maxDiameter;
    }

    private int maxDepth(TreeNode node) {

        if (node == null) {
            return 0;
        }

        int max1 = 0;
        int max2 = 0;

        for (TreeNode child : node.children) {

            int depth = maxDepth(child);

            if (depth > max1) {
                max2 = max1;
                max1 = depth;
            }
            else if (depth > max2) {
                max2 = depth;
            }
        }

        // Longest path passing through the current node
        maxDiameter = Math.max(maxDiameter, max1 + max2);

        // Return the longest depth from this node
        return max1 + 1;
    }
}