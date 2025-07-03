package DSA.Trie_DataStructure;

public class startsWith {
    public static class Node{
        Node[] children;
        boolean eow;    //end of words

        public Node(){
            children=new Node[26];
            for(int i=0;i<26;i++)
                children[i]=null;

            eow=false;
        }
    }

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
    public static boolean startWithMethod(String prefix){
        Node curr=root;
        for(int i=0;i<prefix.length();i++){
            int idx=prefix.charAt(i)-'a';

            if(curr.children[idx]==null)
                return false;

            curr=curr.children[idx];
        }
        return true;
    }
    public static void main(String[] args) {
        String[] words={"apple","app","mango","man","woman"};
        String prefix="moon";

        for(int i=0;i<words.length;i++)
            insertWord(words[i]);

        System.out.println(startWithMethod(prefix));
    }
}
