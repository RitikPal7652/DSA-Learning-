package DSA.Trie_DataStructure;

public class MakeTrieNode {
    static class Node{
        Node[] children;
        boolean eow;    //end of words

        public Node(){      //Constructor
            children=new Node[26];  //a -> z
            //Initialize an array
            for(int i=0;i<26;i++)
                children[i]=null;

            eow=false;
        }
    }
    //This is our root node it place empty at all time we start ahead from it.
    static Node root=new Node();
    public static void main(String[] args) {
        String words[]={"the","a","there","their","any"};

    }
}
