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
