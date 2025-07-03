package DSA.BST_iNTERVIEW;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class construct_Binary_Tree {
    public static class Node{
        int val;
        Node left;
        Node right;
        public Node(int val){this.val=val;}
    }
    public static int height(Node root){
        if(root==null || (root.left==null && root.right==null)) return 0;
        return 1+Math.max(height(root.left),height(root.right));
    }
    public static void nthLevel(Node root,int n){
        if(root==null)  return;
        if(n==1){
            System.out.print(root.val+" ");
        }
        nthLevel(root.left,n-1);
        nthLevel(root.right,n-1);
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
        String[] s={"1","2","3","4","5","","6","","7","","","8","","","","9",""};
        Node root=constuct_Tree(s);
        int level=height(root)+1;
        for(int i=1;i<level;i++){
            nthLevel(root,i);
            System.out.println();
        }
    }
}
