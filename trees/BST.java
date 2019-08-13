package trees;

public class BST {
	class Node
	{
		int data;
		Node left;
		Node right;
		public Node() {
			// TODO Auto-generated constructor stub
		
		}
	}
	Node root;
	int[] arr= {1,2,3,4,5,6,7,8,9,0};
	public BST() {

	this.root=construct(arr,0,arr.length-1);
	}
	public Node construct(int[] arr,int low,int high)
	{
		if(low>high)
		{
			return null;
		}
		int mid=(low+high)/2;
		Node node=new Node();
		node.data=arr[mid];
		node.left=construct(arr, low,mid-1);
		node.right=construct(arr, mid+1, high);
		return node;
		
	}
	public void display()
	{
		this.display(root);
	}
	public void display(Node node)
	{
		if(node==null)
		{
			return;
		}
		String str="";
		if(node.left!=null)
		{
			str=str+node.left.data+"->";
		}
		str=str+node.data;
		if(node.right!=null)
		{
			str=str+"<-"+node.right.data;
		}
		System.out.println(str);
		display(node.left);
		display(node.right);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BST bst=new BST();
		bst.display();

	}

}
