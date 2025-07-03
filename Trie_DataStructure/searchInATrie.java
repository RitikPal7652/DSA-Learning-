package DSA.Trie_DataStructure;

public class searchInATrie {
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
    /*
    Global variable, If the value of root node ones changed then it will
     be changed from everywhere.
     */
    static Node root=new Node();
    public static void insertWord(String word){
        Node curr=root;
        //Traverse on each character of word and make trie for it.
        for(int i=0;i<word.length();i++){
            //By using this we can calculate every index of character.
            int idx=word.charAt(i)-'a';

            //Make new node if node is not formed there.
            if(root.children[idx]==null)
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

            if(curr.children[idx]==null)    return false;

            if(i==key.length()-1 && curr.children[idx].eow==false)
                return false;

            curr=curr.children[idx];
        }
        return true;
    }
    public static void main(String[] args) {
        String[] words={"the","a","there","their","any"};
        /*
        Apply a loop to traverse on words string and sending each and every
        word to insertWord method so that it can insert in a trie.
         */
        for(int i=0;i<words.length;i++){
            insertWord(words[i]);
        }
        System.out.println(search("their"));
        System.out.println(search("thor"));
        System.out.println(search("an"));

    }
}
