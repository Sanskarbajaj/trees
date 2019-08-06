package trees;

import java.util.Scanner;

public class binarytree {
class Node
{ 
 int data;
 Node left;
 Node right;
 public Node(int data,Node left,Node right) {
this.data=data;
this.left=left;
this.right=right;
}
}
Node root;
int size;
public binarytree() {
	Scanner s=new Scanner(System.in);
 this.root=takeinput(s,null,false);
}
public Node takeinput(Scanner s,Node parent,boolean islftorrght)
{
	if(parent==null)
	{
		System.out.println("enter data for root node");
	}
	else
	{
		if(islftorrght)
		{
			System.out.println("Enter left child of the node  "+parent.data);
		}
		else
		{
			System.out.println("Enter right child of the node  "+parent.data);	
		}
		
	}
	int nodedata=s.nextInt();
	Node node=new Node(nodedata,null,null);
	System.out.println("is there any left child of   "+node.data);
	boolean choice=s.nextBoolean();
	if(choice)
	{
		node.left=takeinput(s,node,true);
	}
	System.out.println("is there any right child of   "+node.data);
	 choice=s.nextBoolean();
	if(choice)
	{
		node.right=takeinput(s,node,false);
	}
	return node;
	
}
public void display()
{
	this.display(this.root);
}
public void display(Node node)
{
	String str="";
	str=str+node.left.data+"->";
	
	str=str+node.data;
	
	str=str+"<-"+node.right.data;
	System.out.println(str);
	if(node.left!=null)
	{
		this.display(node.left);
	}
	if(node.right!=null)
	{
		this.display(node.right);
	}
}
	public static void main(String[] args) {
		binarytree btree=new binarytree();
		btree.display();
		
		

	}

}
