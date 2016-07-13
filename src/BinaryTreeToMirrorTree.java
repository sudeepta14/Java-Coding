public class BinaryTreeToMirrorTree
{
	static class TreeNode{
		int value;
		TreeNode left,right;
		public TreeNode( int value) {
			this.value=value;
		}
	}

	public static void main(String[] args) {
		TreeNode tn=new TreeNode(1);
		tn.left=new TreeNode(2);
		tn.right=new TreeNode(3);
		tn.left.left=new TreeNode(4);
		tn.left.right=new TreeNode(5);
		tn.right.left=new TreeNode(6);
		tn.right.right=new TreeNode(7);
		tn=getMirrorTree(tn);
		levelOrderTraversal(tn);
	}

	private static void preOrder(TreeNode tn) {
		if(tn!=null)
		{
			preOrder(tn.left);
			System.out.println(tn.value);
			preOrder(tn.right);
		}
	}
	private static void levelOrderTraversal(TreeNode tn) {
		int height=getHeight(tn);
		for (int i = 0; i < height; i++) {
			printNodes(tn,i);
			System.out.println();
		}
	}

	private static void printNodes(TreeNode tn, int i) {
		if(tn==null||i<0)return;
		if(i==0)
			System.out.print(tn.value+"/");
		printNodes(tn.left, i-1);
		printNodes(tn.right, i-1);
	}

	private static int getHeight(TreeNode tn) {
		if(tn==null)	
			return 0;
		return 1+Math.max(getHeight(tn.left), getHeight(tn.right));
	}
	private static TreeNode getMirrorTree(TreeNode tn) {
		if(tn==null)
			return tn;
		else
		{
			getMirrorTree(tn.left);
			getMirrorTree(tn.right);			
			TreeNode tn1=tn.left;
			tn.left=tn.right;
			tn.right=tn1;
			return tn;
		}
	}


	
}