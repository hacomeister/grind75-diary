//Runtime: 188 ms, faster than 79.00% of Kotlin online submissions for Invert Binary Tree.
//Memory Usage: 34.4 MB, less than 27.27% of Kotlin online submissions for Invert Binary Tree.

/**
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
class Solution {
    fun invertTree(root: TreeNode?): TreeNode? {
        if (root == null) return null

        return TreeNode(root.`val`).apply {
            left = invertTree(root.right)
            right = invertTree(root.left)
        }
    }

}