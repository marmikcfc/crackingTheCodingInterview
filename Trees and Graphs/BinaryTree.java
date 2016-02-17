import java.util.*;

class BinarySearchTree<E extends Comparable <E>> {
  
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

  private TreeNode root, overallRoot;

  public TreeNode getRoot(){
    return this.overallRoot;
  }

  public void add(E element){
    overallRoot = add(overallRoot, element);
  }

  public TreeNode add(TreeNode root, E element){
    if(root == null){
      root = new TreeNode(element);
      System.out.println(element);
    }
    else if(element.compareTo((E)root.getData()) < 0){
      root.left = add(root.left, element);
      System.out.println("/");
      System.out.println(element);
    }
    else{
      root.right = add(root.right, element);
      System.out.println("\\");
      System.out.println(element);
    }
    return root;
  }

  public boolean contains(E element){
    return contains(overallRoot, element);
  }

  private boolean contains(TreeNode root, E element){
    if(root == null)
      return false;
    else if(element.compareTo((E)root.getData()) == 0)
      return true;
    else if(element.compareTo((E)root.getData()) < 0)
      return contains(root.left, element);
    else
      return contains(root.right, element);
  }

  public void traverseInOrder(){
    System.out.print("In order: ");
    traverseInOrder(overallRoot);
    System.out.println();
  }

  private void traverseInOrder(TreeNode root){
    if(root!=null){
      traverseInOrder(root.left);
      System.out.print(" " + root.data);
      traverseInOrder(root.right);
    }
  }

  public void traversePostOrder(){
    System.out.print("Post order: ");
    traversePostOrder(overallRoot);
    System.out.println();
  }

  private void traversePostOrder(TreeNode root){
    if(root!=null){
      traversePostOrder(root.left);
      traversePostOrder(root.right);
      System.out.print(" " + root.data);

    }
  }

    public void traversePreOrder(){
    System.out.print("Pre order: ");
    traversePreOrder(overallRoot);
    System.out.println();
  }

  private void traversePreOrder(TreeNode root){
    if(root!=null){
      System.out.print(" " + root.data);
      traversePreOrder(root.left);
      traversePreOrder(root.right);
      

    }
  }


  public int getHeight(TreeNode root) {
if (root == null) return 0; // Base case
 return Math.max(getHeight(root.left),
 getHeight(root.right)) + 1;
 }

  public boolean isBalanced(TreeNode root) {
 if (root == null) return true; // Base case

 int heightDiff = getHeight(root.left) - getHeight(root.right);
 if (Math.abs(heightDiff) > 1) {
 return false;
 } else { // Recurse
 return isBalanced(root.left) && isBalanced(root.right);
 }
 }

  public static int min = Integer.MIN_VALUE;
 public static boolean checkIfBST(TreeNode n) {
if (n == null) return true;
// Check / recurse left
 if (!checkIfBST(n.left)) return false;

 // Check current
 if (n.data <= min) return false;
 min = n.data;

 // Check / recurse right
 if (!checkIfBST(n.right)) return false;

 return true; // All good!
 }


}

class prob5 {
  public static void main(String[] args){
    BinarySearchTree<Integer> tree = new BinarySearchTree<Integer>();
    System.out.println("Treee");
    int[] array = {84, 69, 76, 86, 94, 91};
    for(int i: array){
      tree.add(i);
    }

    tree.traverseInOrder();
    tree.traversePostOrder();
    tree.traversePreOrder();
    System.out.println(tree.checkIfBST());

    
  }
}