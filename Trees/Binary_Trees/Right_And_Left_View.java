// https://practice.geeksforgeeks.org/problems/left-view-of-binary-tree/1#
import java.util.*;
public class Right_And_Left_View {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(7);
        root.left.right.left = new Node(6);
        System.out.println(RightView(root,0,list));
        System.out.println(LeftView(root,0,list));
    }

    public static ArrayList<Integer> RightView(Node root,int level,ArrayList<Integer> list){
        if(root != null){
            if(level == list.size()){
                list.add(root.val);
            }
            RightView(root.right,level+1,list);
            RightView(root.left,level+1,list);
        }
        return list;
    }  
    
    public static ArrayList<Integer> LeftView(Node root,int level,ArrayList<Integer> list){
        if(root != null){
            if(level == list.size()){
                list.add(root.val);
            }
            LeftView(root.left,level+1,list);
            LeftView(root.right,level+1,list);
        }
        return list;
    } 

    static class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val = val;
        }
    }

}


