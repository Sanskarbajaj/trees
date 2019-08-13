package trees;

public class FindInBst extends BST{
	public boolean findinbst(Node node,int data)
	{
		if(node==null)
		{
			return false;
		}
		if(data==node.data)
		{
			return true;
		}
		else if(data>node.data)
		{
			findinbst(node.right, data);
		}
		else if(data<node.data)
		{
			findinbst(node.left, data);
		}
		return false;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
