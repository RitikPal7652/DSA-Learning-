package DSA.BST_iNTERVIEW;

public class recovet_BST {
    private Node firstElement;
    private Node secondElement;
    private Node prevElement;
    public static class Node {
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
        }
    }
    public void recoverTree(Node root) {
            // Initialize the variables
            firstElement = null;
            secondElement = null;
            prevElement = new Node(Integer.MIN_VALUE);

            // Find the swapped nodes
            inorderTraversal(root);

            // Swap the values of the two nodes
            int temp = firstElement.val;
            firstElement.val = secondElement.val;
            secondElement.val = temp;
        }

        private void inorderTraversal(Node node) {
            if (node == null) {
                return;
            }

            // Visit the left subtree
            inorderTraversal(node.left);

            // Check for the swapped nodes
            if (firstElement == null && node.val < prevElement.val) {
                firstElement = prevElement;
            }
            if (firstElement != null && node.val < prevElement.val) {
                secondElement = node;
            }
            prevElement = node;

            // Visit the right subtree
            inorderTraversal(node.right);
        }

        public static void main(String[] args) {
            // Create a sample BST with two swapped nodes
            Node root = new Node(3);
            root.left = new Node(1);
            root.right = new Node(4);
            root.right.left = new Node(2);

            // Print the original tree
            System.out.print("Original Tree: ");
            printTree(root);

            // Recover the BST
//            Main solution = new Main();
//            solution.recoverTree(root);

            // Print the recovered tree
            System.out.print("\nRecovered Tree: ");
            printTree(root);
        }

        private static void printTree(Node node) {
            if (node == null) {
                return;
            }
            printTree(node.left);
            System.out.print(node.val + " ");
            printTree(node.right);
        }
    }

