package DSA.Generic_TREE;
import java.util.*;
public class BFS_LevelOrderTraversal {
    public static void form_Tree(Node root) {
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
    public static class Node {
        int val;
        List<Node> child;
        public Node(int val) {
            this.val = val;
            child = new ArrayList<>();
        }
    }
    public static void level_Order(Node root){
        //By using Queue.
        Queue<Node> q=new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            int n=q.size();
            while(n>0) {
                Node curr = q.remove();
                System.out.print(curr.val + " ");
                int noOfChild = curr.child.size();
                for (int i = 0; i < noOfChild; i++) {
                    q.add(curr.child.get(i));
                }
                n--;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Node root=new Node(30);
        form_Tree(root);
        level_Order(root);
    }
}
