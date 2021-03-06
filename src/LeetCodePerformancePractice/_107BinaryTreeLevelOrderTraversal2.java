package LeetCodePerformancePractice;

import java.util.ArrayList;
import java.util.List;

public class _107BinaryTreeLevelOrderTraversal2 {
	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	public static void main(String[] args) {
		TreeNode tn=new TreeNode(1);
		tn.left=new TreeNode(2);
		tn.right=new TreeNode(2);
		tn.left.left=new TreeNode(3);
		tn.right.right=new TreeNode(3);
		tn.right.left=new TreeNode(4);
		tn.left.right=new TreeNode(4);
		System.out.println(levelOrderBottom(tn));
		tn=new TreeNode(1);
		tn.left=new TreeNode(2);
		tn.right=new TreeNode(2);
		tn.right.right=new TreeNode(3);
		tn.left.right=new TreeNode(3);
		System.out.println(levelOrderBottom(tn));
	}
	static List<List<Integer>> outputList;
	static List<Integer> levelList;
	public static List<List<Integer>> levelOrderBottom(TreeNode tn) {
		outputList=new ArrayList<>();
		int height=getHeight(tn);
		for (int i = height-1; i >=0; i--) {
			levelList=new ArrayList<>();
			printNodes(tn,i);
			outputList.add(levelList);
		}
		return outputList;
	}
	private static void printNodes(TreeNode tn, int level) {
		if(tn==null||level<0)
			return;
		if(level==0)
			levelList.add(tn.val);
		printNodes(tn.left, level-1);
		printNodes(tn.right, level-1);
	}
	private static int getHeight(TreeNode tn) {
		if(tn==null)
			return 0;
		return 1+Math.max(getHeight(tn.left), getHeight(tn.right));
	}

}
