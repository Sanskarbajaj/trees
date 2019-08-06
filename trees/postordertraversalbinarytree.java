package trees;

import trees.binarytree.Node;

public class postordertraversalbinarytree extends binarytree{
	public void postorder()
	{
	     postorder(root);
	}
	public void postorder(Node node)
	{
		if(node==null)
		{
			return;
		}
		postorder(node.left);
		postorder(node.right);
		System.out.print(node.data);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
