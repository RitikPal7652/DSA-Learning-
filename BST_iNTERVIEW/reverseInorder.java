package DSA.BST_iNTERVIEW;

public class reverseInorder {
    public static class Node{
        int val;
        Node left;
        Node right;
        public Node(int val){
            this.val=val;
        }
    }
    public static void inorder_Reverse(Node root){
        if(root==null)  return;
        inorder_Reverse(root.right);
        System.out.print(root.val+" ");
        inorder_Reverse(root.left);

    }
    public static void preOrder(Node root){
        if(root==null)return;
        preOrder(root.right);
        System.out.print(root.val+" ");
        preOrder(root.left);

    }
    public static void postOrder(Node root){
        if(root==null)return;
        postOrder(root.right);
        System.out.print(root.val+" ");
        postOrder(root.left);

    }
    public static void main(String[] args) {
        Node root=new Node(4);
        Node a=new Node(2);
        Node b=new Node(3);
        Node c=new Node(1);
        Node d=new Node(5);
        Node e=new Node(6);
        Node f=new Node(7);
        root.left=a;
        root.right=e;
        a.left=c;
        a.right=b;
        b.left=d;
        b.right=f;

        inorder_Reverse(root);
        System.out.println();
        preOrder(root);
        System.out.println();
        postOrder(root);
    }
}
