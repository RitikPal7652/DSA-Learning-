package DSA.BST_iNTERVIEW;

import java.util.ArrayList;
import java.util.*;
public class find_predecessor_successor {
    public static class Node{
        int val;
        Node left;
        Node right;
        public Node(int val)    {this.val=val;}
    }
    public static void inorder(Node root,ArrayList<Integer> arr){
        if(root==null)  return;
        inorder(root.left,arr);
        arr.add(root.val);
        inorder(root.right,arr);
    }
    public static Node constuct_Tree(String[] arr){
        int x=Integer.parseInt(arr[0]);
        Node root=new Node(x);
        int n=arr.length;
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        int i=1;
        while(i<n-1){
            Node temp=q.remove();
            Node left=new Node(20);
            Node right=new Node(299);
            if(arr[i].equals("")){left=null;}
            else{
                int l=Integer.parseInt(arr[i]);
                left.val=l;
                q.add(left);
            }
            if(arr[i+1].equals("")){right=null;}
            else{
                int r=Integer.parseInt(arr[i+1]);
                right.val=r;
                q.add(right);
            }
            temp.left=left;
            temp.right=right;
            i+=2;
        }
        return root;
    }
    public static void main(String[] args) {
        String[] a={"50","30","70","20","40","60","80"};
        Node root=constuct_Tree(a);
        ArrayList<Integer> arr = new ArrayList<>();
        inorder(root,arr);
        for(int val: arr){
            System.out.print(val+" ");
        }
    }
}
