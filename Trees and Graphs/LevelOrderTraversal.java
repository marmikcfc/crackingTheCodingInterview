import java.util.List;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Iterator;

class LevelOrderTraversal<E extends Comparable<E>> {

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
   public void doLevelOrderTraversal(){
      doLevelOrderTraversal(overallRoot);
   }

   public void doLevelOrderTraversal(TreeNode root){
      if(root == null)
         return;

      Queue<TreeNode<E>> queue = new LinkedList<TreeNode<E>>();
      queue.add(root);
      while(!queue.isEmpty()){
         TreeNode current = queue.remove();
         System.out.print((E)current.getData() + " ");
         if(current.left != null) queue.add(current.left);
         if(current.right != null) queue.add(current.right);
      }
    }

    public static void main(String[] args) {
	LevelOrderTraversal<Integer> tree = new LevelOrderTraversal<Integer>();
      	int[] array = {84, 69, 76, 86, 94, 91};
      	for(int i: array){
        	tree.add(i);
      	}
	System.out.println("Level Order Traversal: ");
	tree.doLevelOrderTraversal();
	System.out.println();
    }
}