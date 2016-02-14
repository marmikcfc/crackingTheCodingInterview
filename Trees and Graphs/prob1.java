import java.util.*;
/**
 * Check if Tree is balanced
 */
class BinaryTree<E> {

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

    public void setData(E data){
      this.data = data;
    }

    public void setLeft(TreeNode left){
      this.left = left;
    }

    public void setRight(TreeNode right){
      this.right = right;
    }

    @SuppressWarnings("unchecked")
    public E getLeft(){
      return (E)this.left.data;
    }

    @SuppressWarnings("unchecked")
    public E getRight(){
      return (E)this.right.data;
    }

  }

  private TreeNode parent;

  public TreeNode getParent(){
    return this.parent;
  }

  public void setParent(TreeNode node){
    this.parent = node;
  }

  /**
   * Building a sequential tree
   */
  public TreeNode buildTree() {
    return buildTree(1, 13);
  }

  private TreeNode buildTree(int n, int max) {
    if(n > max)
      return null;
    else 
      return new TreeNode(n, buildTree(2*n, max), buildTree(2*n+1, max));
  }


  public void traverseInOrder(){
    System.out.print("In order: ");
    traverseInOrder(parent);
    System.out.println();
  }

  private void traverseInOrder(TreeNode root){
    if(root!=null){
      traverseInOrder(root.left);
      System.out.print(" " + root.data);
      traverseInOrder(root.right);
    }
  }

  

public int getHeight(TreeNode root) {

  if (root == null) return 0; // Base case

  int leftHeight = getHeight(root.left);
 if (leftHeight == -1) {
 return -1; // Not balanced
 }

 int rightHeight = getHeight(root.right);
 if (rightHeight == -1) {
 return -1; // Not balanced
 }

 int heightDiff = leftHeight - rightHeight;
 if (Math.abs(heightDiff) > 1) {
 return -1;
 } else { // Recurse
 return  Math.max(leftHeight,rightHeight) + 1;
 }
 }

  public boolean isBalanced(TreeNode root) {

    if(getHeight(root) == -1){
      return false;
    }
    return true;
 
 }

}

class prob1 {

   public static void main(String[] args){
    
      BinaryTree<Integer> tree = new BinaryTree<Integer>();
      BinaryTree<Integer>.TreeNode<Integer> left  = tree.new TreeNode<Integer>(5);
      BinaryTree<Integer>.TreeNode<Integer> rightRightRight = tree.new TreeNode<Integer>(61);
      BinaryTree<Integer>.TreeNode<Integer> rightRight = tree.new TreeNode<Integer>(11,null,rightRightRight);
      BinaryTree<Integer>.TreeNode<Integer> right = tree.new TreeNode<Integer>(6,null,rightRight);


      BinaryTree<Integer>.TreeNode<Integer> root  = tree.new TreeNode<Integer>(7, left, right);
      tree.setParent(root);
      tree.traverseInOrder();
      System.out.println(tree.isBalanced(root));


      tree = new BinaryTree<Integer>();
      root  = tree.buildTree();
      tree.setParent(root);
      tree.traverseInOrder();
      System.out.println(tree.isBalanced(root));

   }
}