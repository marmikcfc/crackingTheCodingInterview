import java.util.List;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Iterator;

class getMinDepth<E extends Comparable<E>> {

	public class TreeNode<E> {
      public TreeNode left;
      public TreeNode right;
      public E data;

      public TreeNode(){
         this(null, null, null);
      }

      public TreeNode(E data){
         this(data, null, null);
      }

      public TreeNode(E data, TreeNode left, TreeNode right){
         this.data = data;
         this.left = left;
         this.right = right;
      }

      public E getData(){
         return this.data;
      }
	}

	private TreeNode overallRoot;

	public TreeNode getRoot(){
      return this.overallRoot;
   }

   public void add(E element){
      overallRoot = add(overallRoot, element);
   }

   public TreeNode add(TreeNode root, E element){
      if(root == null)
         root = new TreeNode(element);
      else if(element.compareTo((E)root.getData()) < 0)
         root.left = add(root.left, element);
      else
         root.right = add(root.right, element);
      return root;
   }

	// Breadth First Search traversal or Level Order Traversal
   public void MinDepth(){
     int i= MinDepth(overallRoot);
     System.out.println("getMinDepth = "+i);
   }

   public int MinDepth(TreeNode root){
      int leftDepth = Integer.MAX_VALUE;
      int rightDepth = Integer.MAX_VALUE;
     if(root == null )
      return 0;

     if(root.left == null && root.right==null)
     { return 1; }

      if(root.left != null)
     {
      leftDepth=MinDepth(root.left);
   }
     
      if(root.right  != null)
     {
      rightDepth=MinDepth(root.right);
   }

      return 1+ Math.min(leftDepth,rightDepth);
    }

    public static void main(String[] args) {
	getMinDepth<Integer> tree = new getMinDepth<Integer>();
      	int[] array = {84, 69, 76, 86, 94, 91};
      	for(int i: array){
        	tree.add(i);
      	}
	System.out.println("Level Order Traversal: ");
	tree.MinDepth();
	System.out.println();
    }
}