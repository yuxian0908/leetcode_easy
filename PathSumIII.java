package leetcode;

public class PathSumIII {
    public int pathSum(TreeNode root, int sum) {
    	if(root==null)return 0;
    	
        return findPath(root, sum)+pathSum(root.left, sum)+pathSum(root.right, sum);
    }
    
    private int findPath(TreeNode root, int sum) {
    	
    	int res = 0;
    	if(root==null) return res;
    	if(root.val==sum) res++;
    	
    	res = findPath(root.left, sum-root.val)+res;
    	res = findPath(root.right, sum-root.val)+res;
    	return res;
    }
}
