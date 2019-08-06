package trees;

import trees.binarytree.Node;

public class inordertraversalbinarytree extends binarytree {

	public void inorder()
	{
	     inorder(root);
	}
	public void inorder(Node node)
	{
		if(node==null)
		{
			return;
		}
		inorder(node.left);
		System.out.print(node.data);
		inorder(node.right);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
