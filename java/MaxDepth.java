package LeetCodeSol.java;

public class MaxDepth {
	 public int maxDepth(TreeNode root) {
		 
	        int depth = 0;
	        return depthHelp(root,depth);
	    }
	    public int depthHelp(TreeNode root, int d){
	        if(root == null) return d;
	        return Math.max(depthHelp(root.left,d+1),depthHelp(root.right,d+1));
	    }
	    
	    	
}
