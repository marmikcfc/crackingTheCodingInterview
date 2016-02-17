public TreeNode invertTree(TreeNode root){
          if (root==null) return null; // line 1

         if (root.left != null){ // line 2
              TreeNode leftchild = invertTree(root.left); // line 3
               leftchild .right=root; // line 4
          }

          if (root.right != null){ // line 5
                TreeNode rightchild = invertTree(root.right); // line 6
                rightchild.left=root; // line 7
          }


          root.left=null; // line 8
          root.right=null; // line 9

          return root; // line 10
}