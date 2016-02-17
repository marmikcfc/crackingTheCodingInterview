import java.util.List;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Iterator;

class prob5<E extends Comparable<E>> {

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
      LinkedList<LinkedList<TreeNode<E>>> ans = new LinkedList<LinkedList<TreeNode<E>>>();

      Queue<TreeNode<E>> queue = new LinkedList<TreeNode<E>>();
      queue.add(root);
      LinkedList<TreeNode<E>> l1 = new LinkedList<TreeNode<E>>();
      l1.add(root);
      ans.add(l1);
      while(!queue.isEmpty()){
         LinkedList<TreeNode<E>> l2= new LinkedList<TreeNode<E>>();
         TreeNode current = queue.remove();
         System.out.print((E)current.getData() + " ");
         if(current.left != null){
            queue.add(current.left);
            l2.add(current.left);
         }
         if(current.right != null){ 
            queue.add(current.right);
            l2.add(current.right);
      }
      ans.add(l2);
   }

                       System.out.println();
        // Traditional for loop approach
           for (int i = 0; i < ans.size(); i++) {
              for(int j = 0; j<ans.get(i).size();j++) {
               TreeNode curr = ans.get(i).get(j);
                        System.out.print((E)curr.getData() + " ");


              }
              System.out.println();
           }

    }




    public static void main(String[] args) {
	prob4<Integer> tree = new prob4<Integer>();
      	int[] array = {84, 69, 76, 86, 94, 91};
      	for(int i: array){
        	tree.add(i);
      	}
	System.out.println("Level Order Traversal: ");
	tree.doLevelOrderTraversal();
	System.out.println();

      System.out.println(tree.checkIfBST());

    }
}