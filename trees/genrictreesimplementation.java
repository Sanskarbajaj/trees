package trees;

import java.util.ArrayList;
import java.util.Scanner;

public class genrictreesimplementation {
	class Node
	{
		int data;
		ArrayList<Node> children=new ArrayList<genrictreesimplementation.Node>();
		public Node(int data) {
		this.data=data;
		this.children=new ArrayList<genrictreesimplementation.Node>();
		}
	}
	Node root;
	int size;
	public genrictreesimplementation() {
		Scanner s=new Scanner(System.in);
		this.root=takeinput(s,null,0);
		
	}
	public Node takeinput(Scanner s,Node parent,int nmochilds)
	{
		if(parent==null)
		{
			System.out.println("Enter the value for root node");
		}
		else
		{
			System.out.println("enter child of particular"+nmochilds+" child  for   "+parent.data);
		}
		int nodedata=s.nextInt();
		Node node=new Node(nodedata);
		this.size++;
		 System.out.println("no of children for "+node.data);
		int childs=s.nextInt();
		for(int i=0;i<childs;i++)
		{
			Node cnode=takeinput(s,node,i);
			node.children.add(cnode);
		}
		return node;
	}
	public void display()
	{
		this.display(this.root);
	}
	private void display(Node node)
	{
		String str=node.data+"->";
		for(int i=0;i<node.children.size();i++)
		{
			str=str+node.children.get(i).data+",";
		}
		str=str+"End";
		System.out.println(str);
		for(int i=0;i<node.children.size();i++)
		{
			this.display(node.children.get(i));
		}
		
	}

	public static void main(String[] args) {
		
		genrictreesimplementation gtree= new genrictreesimplementation();
		gtree.display();
		

	}

}
