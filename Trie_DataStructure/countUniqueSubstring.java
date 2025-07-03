package DSA.Trie_DataStructure;

public class countUniqueSubstring {
    public static class Node{
        Node[] children;
        boolean eow;    //end of word

        public Node(){
            children=new Node[26];
            for(int i=0;i<26;i++)
                children[i]=null;

            eow=false;
        }
    }
    //Root node is always an empty node in trie.
    static Node root=new Node();
    public static void insertWord(String word){
        Node curr=root;
        //Traverse on each character of word and make trie for it.
        for(int i=0;i<word.length();i++){
            //By using this we can calculate every index of character.
            int idx=word.charAt(i)-'a';

            //Make new node if node is not formed there.
            if(curr.children[idx]==null)
                curr.children[idx]=new Node();

            //Make index as eow if we are at last index of word.
            if(i==word.length()-1)
                curr.children[idx].eow=true;

            //Move to next node.
            curr=curr.children[idx];
        }
    }
    public static int count(Node root){
        /*
        This is how we can calculate how many nodes are present in trie,
        like as we are calculating nodes in binary trees.
        count(left)+count(right)+1 due to count of current node.
         */
        if(root==null)
            return 0;

        int count=0;
        for(int i=0;i<26;i++)
        {
            if(root.children[i]!=null){
                count+=count(root.children[i]);
            }
        }
        return count+1; //due to count of current node.
    }
    public static void main(String[] args) {
        String s="apple";
        /*
        In this case, we have done following steps:
        1. First of all we calculate all the suffix of our s(given) string.
        2. We insert that suffixes in the trie so that it can arrange.
        3. In this we calculated prefix of all suffixes.

         */
        for(int i=0;i<s.length();i++){
            String suffix=s.substring(i);
            insertWord(suffix);
        }
        System.out.println(count(root));
    }
}
