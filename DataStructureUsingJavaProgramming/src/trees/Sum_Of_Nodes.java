package trees;

import java.util.LinkedList;
import java.util.Queue;

import trees.Count_Of_Nodes.BinaryTree;
import trees.Count_Of_Nodes.Node;

public class Sum_Of_Nodes {
	
	static class Node
	{
		int data;
		Node left;
		Node right;
		Node(int data)
		{
			this.data=data;
			this.left=null;
			this.right=null;
		}
	}
	static class BinaryTree{
		static int idx=-1;
		
		public static Node buildTree(int nodes[])
		{
			idx++;
			if(nodes[idx]==-1)
			{
				return null;
			}
			Node newNode =new Node(nodes[idx]);
			newNode.left=buildTree(nodes);
			newNode.right=buildTree(nodes);
			return newNode;
			
		}
	}

	public static void inorder(Node root)
	{
		if(root==null)
		{
			return ;
		}
		inorder(root.left);
		System.out.print(root.data+" ");
		inorder(root.right);
	}
	public static void postorder(Node root)
	{
		if(root==null)
		{
			return ;
		}
		postorder(root.left);
		postorder(root.right);
		System.out.print(root.data+" ");
	}

	public static void levelorder(Node root)
	{
		if(root==null)
		{
			return;
		}
		Queue<Node>q=new LinkedList<>();
		q.add(root);
		q.add(null);
		while(!q.isEmpty())
		{
			Node currnode=q.remove();
			if(currnode==null)
			{
				System.out.println();
				if(q.isEmpty())
				{
					break;
				}
				else
				{
					q.add(null);
				}
			}
			else
			{
				System.out.print(currnode.data+" ");
				if(currnode.left!=null)
				{
					q.add(currnode.left);
				}
				if(currnode.right!=null)
				{
					q.add(currnode.right);
				}
			}
		}
	}
	public static int countofnodes(Node root)
	{
		if(root==null)
		{
			return 0;
		}
		int leftnodes=countofnodes(root.left);
		int rightnodes=countofnodes(root.right);
		return leftnodes+rightnodes+1;
	}
	public static int sumofnodes(Node root)
	{
		if(root==null)
		{
			return 0;
		}
		int leftsum=sumofnodes(root.left);
		int rightsum=sumofnodes(root.right);
		return leftsum+rightsum+root.data;
	}
	public static void main(String[] args) {
		int nodes[]= {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
		BinaryTree tree=new BinaryTree();
		Node root=tree.buildTree(nodes);
		System.out.println(sumofnodes(root));
	}

}
