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
    List<Integer> list=new ArrayList<>();

    private void inorder(TreeNode node,List<Integer> res){
        if(node==null){
            return;
        }

        inorder(node.left,res);
        res.add(node.val);
        inorder(node.right,res);
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        inorder(root,list);
        return list;
    }
}