package DSA.Trie_DataStructure;

public class LongestWordWithAllPrifixes {
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
    public static String ans="";
    public static void longestSubstring(Node root,StringBuilder temp){
        if(root==null)  return;

        //Traverse on all characters of root if not empty and eow is true add in temp.
        for(int i=0;i<26;i++){
            if(root.children[i]!=null && root.children[i].eow==true){
                temp.append((char)(i+'a'));

                if(temp.length()>ans.length()){
                    ans=temp.toString();
                }
                longestSubstring(root.children[i],temp);
                //Now backtrack means delete the last value from temp to add some another value on it.
                temp.deleteCharAt(temp.length()-1);
            }
        }
    }
    public static void main(String[] args) {
        String[] words={"a","banana","app","appl","ap","apply","apple"};
        for(int i=0;i<words.length;i++){
            insertWord(words[i]);
        }
        longestSubstring(root,new StringBuilder(" "));
        System.out.println("Longest Substring is: "+ans);
    }
}
