package DSA.Trie_DataStructure;

public class wordBreak {
    public static class Node{
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

            if(node==null)    return false;

            if(i==key.length()-1 && node.eow==false)
                return false;

            curr=curr.children[idx];
        }
        return true;
    }
    public static boolean wordBreakProblem(String key){
        if(key.length()==0) return true;

        for(int i=1;i<=key.length();i++){
            String firstPart=key.substring(0,i);
            String secPart=key.substring(i);

            if(search(firstPart) && wordBreakProblem(secPart))
                return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String[] words={"i","like","sam","samsung","mobile"};
        String key="ilikesamsung";
        //Insert
        for(int i=0;i<words.length;i++){
            insertWord(words[i]);
        }
        System.out.println(wordBreakProblem(key));
    }
}
