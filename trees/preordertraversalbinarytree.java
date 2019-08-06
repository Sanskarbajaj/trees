package trees;

public class preordertraversalbinarytree extends binarytree {

	public void preorder()
	{
	     preorder(root);
	}
	public void preorder(Node node)
	{
		if(node==null)
		{
			return;
		}
		System.out.println(node.data);
		preorder(node.left);
		preorder(node.right);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
