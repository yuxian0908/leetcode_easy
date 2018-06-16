package leetcode;

public class ConvertSortedArraytoBinarySearchTree {
	public TreeNode sortedArrayToBST(int[] nums) {
    	if(nums.length==0) return null;
    	
    	TreeNode res = helper(nums, 0, nums.length-1);
        return res;
    }
    private TreeNode helper(int[] num, int low, int high) {
    	if(low>high) return null;
    	int mid = (high+low+1)/2;
    	TreeNode root = new TreeNode(num[mid]);
    	root.left = helper(num, low, mid-1);
    	root.right = helper(num, mid+1, high);
    	
    	return root;
    }
}
