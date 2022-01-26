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
    public void inOrder(TreeNode root, List<Integer> li)
    {
        if(root == null)
            return;
        inOrder(root.left,li);
        li.add(root.val);
        inOrder(root.right,li);
    }
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> li = new ArrayList<Integer>();
        inOrder(root1,li);
        inOrder(root2,li);
        Collections.sort(li);
        return li;
    }
}