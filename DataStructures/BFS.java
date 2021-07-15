import java.util.LinkedList;
import java.util.Queue;


public class BFS_Solution 
{
	public static void BFS_Traversal(Node root)
	{
		if(root != null)
		{
			Queue<Node> queue = new LinkedList<Node>();
			queue.add(root);
			while (!queue.isEmpty())
			{
				Node temp = queue.remove();
				System.out.println(temp.data);
				
				if(temp.left != null) queue.add(temp.left);
				if(temp.right != null)queue.add(temp.right);
			}
		}
	}
   public static void bfs_preorder(Node node){
      if(node!=null){
         System.out.println(node.data);
         bfs_preorder(node.left);
         bfs_preorder(node.right);
      }
   }
   public static void bfs_postorder(Node node){
      if(node!=null){
         bfs_postorder(node.left);
         bfs_postorder(node.right);
          System.out.println(node.data);
      }
   }
   public static void bfs_inorder(Node node){
      if(node!=null){
         bfs_inorder(node.left);
         System.out.println(node.data);
         bfs_inorder(node.right);
      }
   }
            
	public static void main(String[] args) 
	{
		Node root = new Node(1);
		Node node1 = new Node(2);
		Node node2 = new Node(3);
		Node node3 = new Node(4);
		Node node4 = new Node(5);
		Node node5 = new Node(6);
		Node node6 = new Node(6);
		Node node7 = new Node(7);
		
		root.left = node1;
		root.right = node2;
		
		node1.left = node3;
		node1.right = node4;
		
		node2.left = node5;
		node2.right = node6;
		
		
		BFS_Traversal(root);
		
 	}
}
class Node
{
	int data;
	Node left;
	Node right;
	
	
	Node(int data)
	{
		this.data = data;
		this.left =null;
		this.right = null;
	}
}