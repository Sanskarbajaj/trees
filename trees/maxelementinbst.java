package trees;

public class maxelementinbst extends BST {
	public int givemax()
	{
		return this.givemax(root);
	}
	public int givemax(Node node)
	{
		Node temp=node;
		while(temp.right!=null)
		{
			temp=temp.right;
		}
		return temp.data;
	}

	public static void main(String[] args) {
		
	}

}
