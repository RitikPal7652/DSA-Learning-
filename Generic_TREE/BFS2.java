package DSA.Generic_TREE;
import java.io.*;
import java.util.*;
public class BFS2 {
    public static class Node{
        char data;
        ArrayList< Node> children = new ArrayList<>();
        public Node(char data){
            this.data = data;
        }
    }
    public static void main(String args[]) {
            Node root = new Node('A');
            (root.children).add(new Node('B'));
            (root.children).add(new Node('F'));
            (root.children).add(new Node('J'));
            (root.children.get(0).children).add(new Node('C'));
            (root.children.get(0).children).add(new Node('D'));
            (root.children.get(0).children).add(new Node('E'));
            (root.children.get(1).children).add(new Node('G'));
            (root.children.get(1).children).add(new Node('H'));
            (root.children.get(2).children).add(new Node('K'));
            (root.children.get(2).children).add(new Node('L'));
            (root.children.get(2).children).add(new Node('M'));
            (root.children.get(2).children).add(new Node('N'));
            (root.children.get(2).children.get(2).children).add(new Node('P'));
            (root.children.get(2).children.get(2).children).add(new Node('Q'));

            System.out.println("Level order traversal for the tree is ");
            levelOrderTraversal(root);
        }
        public static void levelOrderTraversal(Node root) {
            if (root == null)
                return;
            Queue<Node > q = new ArrayDeque<>();
            q.add(root); // Enqueue root
            while (!q.isEmpty()) {
                int n = q.size();
                while (n > 0) {//By using this loop we know the level.
                    // Dequeue an item from queue and print it
                    Node p = q.peek();
                    q.remove();
                    System.out.print(p.data + " ");
                    // Enqueue all children of the dequeued item
                    for (int i = 0; i < p.children.size(); i++)
                        q.add(p.children.get(i));
                    n--;
                }
                // Print new line between two levels
                System.out.println();
            }
        }
    }

