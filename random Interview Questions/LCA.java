import java.util.*;
/**
 * Implementation of a Binary Tree class in Java
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
    return buildTree(1, 10);
  }

  private TreeNode buildTree(int n, int max) {
    if(n > max)
      return null;
    else 
      return new TreeNode(n, buildTree(2*n, max), buildTree(2*n+1, max));
  }

  public void traversePreOrder(){
    System.out.print("Pre order: ");
    traversePreOrder(parent);
    System.out.println();
  }

  private void traversePreOrder(TreeNode root){
    if(root!=null){
      System.out.print(" " + root.data);
      traversePreOrder(root.left);
      traversePreOrder(root.right);
    }
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

  public void traversePostOrder(){
    System.out.print("In order: ");
    traversePostOrder(parent);
    System.out.println();
  }

  private void traversePostOrder(TreeNode root){
    if(root!=null){
      traversePostOrder(root.left);
      traversePostOrder(root.right);
      System.out.print(" " + root.data);
    }
  }

   public void findLCA(TreeNode root,E a,E b){
    TreeNode<Integer> x = getLCA(root,a, b);
        System.out.println("LCA  "+x.data);

  }

  public TreeNode getLCA(TreeNode root,E a, E b){

    if(root == null){
      return null;
      }

      if(root.data == a || root.data == b) {
        return root;
      }

      TreeNode left = getLCA(root.left,a,b);
      TreeNode right = getLCA(root.right,a,b);

      if(left !=null && right != null)
        return root;

      if (left == null) {
        return right;        
      }
      else
        return left;


  }



}

class LCA {

   public static void main(String[] args){
    
      BinaryTree<Integer> tree = new BinaryTree<Integer>();

      BinaryTree<Integer>.TreeNode<Integer> leftLeftLeft  = tree.new TreeNode<Integer>(8);
      BinaryTree<Integer>.TreeNode<Integer> leftLeft  = tree.new TreeNode<Integer>(4,leftLeftLeft,null);
      BinaryTree<Integer>.TreeNode<Integer> leftRight  = tree.new TreeNode<Integer>(9);
      BinaryTree<Integer>.TreeNode<Integer> rightLeftLeft  = tree.new TreeNode<Integer>(6);
      BinaryTree<Integer>.TreeNode<Integer> rightLeft  = tree.new TreeNode<Integer>(5,rightLeftLeft,null);
      BinaryTree<Integer>.TreeNode<Integer> rightRight  = tree.new TreeNode<Integer>(7);
      BinaryTree<Integer>.TreeNode<Integer> left  = tree.new TreeNode<Integer>(2,leftLeft,leftRight);
      BinaryTree<Integer>.TreeNode<Integer> right = tree.new TreeNode<Integer>(3,rightLeft,rightRight);
      BinaryTree<Integer>.TreeNode<Integer> root  = tree.new TreeNode<Integer>(1, left, right);
      tree.setParent(root);
      tree.findLCA(root,8,9);
      tree.traversePreOrder();
      tree.traverseInOrder();
      tree.traversePostOrder();

      tree = new BinaryTree<Integer>();
      root  = tree.buildTree();
      tree.setParent(root);
      tree.traversePreOrder();
      tree.traverseInOrder();
      tree.traversePostOrder();

      
   }
}