package DSA.Generic_TREE;
import java.util.*;
public class preOrder {
    public static void preOrder(Node root){
        if(root.child.isEmpty()){
            System.out.print(root.val+" ");
            return;
        }
        System.out.print(root.val+" ");
        int n=root.child.size();
        for(int i=0;i<n;i++){
            preOrder(root.child.get(i));
        }
    }
    public static void form_Tree(Node root){
        root.child.add(new Node(5));
        root.child.add(new Node(11));
        root.child.add(new Node(63));
        root.child.get(0).child.add(new Node(1));
        root.child.get(0).child.add(new Node(4));
        root.child.get(0).child.add(new Node(8));
        root.child.get(1).child.add(new Node(6));
        root.child.get(1).child.add(new Node(7));
        root.child.get(1).child.add(new Node(15));
        root.child.get(2).child.add(new Node(31));
        root.child.get(2).child.add(new Node(55));
        root.child.get(2).child.add(new Node(65));
    }
    public static class Node{
        int val;
        List<Node> child;

        public Node(int val){
            this.val=val;
            child=new ArrayList<>();
        }
    }
    public static void main(String[] args) {
        Node root=new Node(30);
        form_Tree(root);
        preOrder(root);
    }
}
