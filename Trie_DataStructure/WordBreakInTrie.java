package DSA.Trie_DataStructure;

public class WordBreakInTrie {
    public static class Node{
        Node[] children;
        boolean eow;    //end of word
        //Constructor
        public Node(){
            children=new Node[26];  //a->z
            //Initialize
            for(int i=0;i<26;i++)
                children[i]=null;

            eow=false;
        }
    }
    //Global variable
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
    public static boolean search(String key){
        Node curr=root;
        for(int i=0;i<key.length();i++){
            int idx=key.charAt(i)-'a';
            Node node=curr.children[idx];

            if(node==null) {
                return false;
            }

            if(i==key.length()-1 && node.eow==false) {
                return false;
            }
            curr=curr.children[idx];
        }
        return true;
    }
    public static boolean wordBreak(String key){
        if(key.length()==0) {
            return true;
        }

        for(int i=1;i<=key.length();i++){
            String firstPart=key.substring(0,i) ;    //i is exclusive here.
            String secondPart =key.substring(i);
            /*
            If both the answer will return true then true else false.
            Because in case any part will return false then our answer is
            false.
            */
            if(search(firstPart) && wordBreak(secondPart)){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        //Make a trie of this string words
        String[] words={"i","like","sam","samsung","mobile"};
        String key="ilikesung";
        //Insert the word array into trie.
        for(int i=0;i<words.length;i++){
            insertWord(words[i]);
        }
        System.out.println(wordBreak(key));
    }
}
