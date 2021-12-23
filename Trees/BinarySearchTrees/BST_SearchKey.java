public class BST_SearchKey {
    public static void main(String[] args) {
  
      Node root = new Node(15);
      root.left = new Node(5);
      root.left.left = new Node(3);
      root.right = new Node(20);
      root.right.right = new Node(80);
      root.right.left = new Node(18);
      root.right.left.left = new Node(16);
  
      System.out.println(BST_Search(root, 16));
  
    }
  
    public static boolean BST_Search(Node root,int val){
          
        if(root == null) return false;
  
        if(root.val == val) return true;
  
        // System.out.println(root.val);
  
        if(root.val > val){
          return BST_Search(root.left, val);
        }else{
          return BST_Search(root.right, val);
        }
      }
  }

  class Node{
    int val;
    Node left;
    Node right;
  
    Node(int val){
      this.val = val;
    }
  }
  
