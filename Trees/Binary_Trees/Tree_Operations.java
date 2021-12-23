import java.util.*;
public class Tree_Operations  {
    public static void main(String[] args) {

      Node root = new Node(10);
      root.left = new Node(20);
      root.left.left = new Node(40);
      root.left.right = new Node(50);
      root.left.right.left = new Node(70);
      root.left.right.right = new Node(80);
      root.right = new Node(30);
      root.right.right = new Node(60);
      List<Integer> l = new ArrayList<>();
      System.out.println("inOrder");
      System.out.println(inOrder(root,l));
      System.out.println("\npreOrder");
      preOrder(root);
      System.out.println("\npostOrder");
      postOrder(root);
      System.out.println("\nDistance k");
      distanceK(root, 2);
      System.out.println("\nLevel order traversal");
      BFS(root);
      System.out.print("\nMax in binary Tree = ");
      System.out.println(getMax(root));
   
    }

    // Breth first search or level Order traversal
    public static void BFS(Node root){
      Queue<Node> q = new LinkedList<Node>();
       q.add(root);
       while(q.isEmpty() == false){
         System.out.print(q.peek().key+" ");
         Node curr = q.poll();   // poll prints and deleats the head element
         if(curr.left != null) q.add(curr.left);
         if(curr.right != null) q.add(curr.right); 
       }
    }

    public static int size(Node root){
      if(root == null){
        return 0;
      }else{
        return 1 + size(root.left) + size(root.right)  ;
      }
    }

    public static int getMax(Node root){
      if(root == null){
        return Integer.MIN_VALUE;
      }

      return Math.max(root.key,Math.max(getMax(root.left),getMax(root.right)));
    }

    public static void distanceK(Node root,int k){
      if(root == null) return;
        
        if(k == 0){
          System.out.print(root.key+" ");
        } else {
          distanceK(root.left, k-1);
          distanceK(root.right, k-1);
        }
    }

    public static List<Integer> inOrder(Node root,List<Integer> l){
      if(root != null){
        inOrder(root.left,l);
        // System.out.print(root.key+" ");
        l.add(root.key);
        inOrder(root.right,l);
      }
        return l;
    }

    public static void preOrder(Node root){
      if(root != null){
        System.out.print(root.key+" ");
        preOrder(root.left);
        preOrder(root.right);
      }
    }

    public static void postOrder(Node root){
      if(root != null){
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.key+" ");
      }
    }
}

class Node{
  int key;
  Node left;
  Node right;

  Node(int key){
    this.key = key;
  }
}



