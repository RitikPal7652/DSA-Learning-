package DSA.Graph;

import java.util.ArrayList;
import java.util.Stack;

public class topological_Sorting {
    public static void create_Graph(ArrayList<Edge>[] graph){
        //Place empty arraylist in all the indexes of array.
        //Do remember always make graph in ascending order. 0 1 2 3 4 5 like this....
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }
    /*Do remember always put that index first whichever source is given and then start
      numbering from source to till then whatever source is last.
                        Ex: source is 2. so index is 2.
                            source is 3 so index is 3.
                            source is 4 so index is 4.  like this so on ......
     */
        graph[2].add(new Edge(2,3));

        graph[3].add(new Edge(3,1));

        graph[4].add(new Edge(4,0));
        graph[4].add(new Edge(4,1));

        graph[5].add(new Edge(5,0));
        graph[5].add(new Edge(5,2));
    }
    public static class Edge{
        int src;
        int dest;
        //Constructor.
        public Edge(int s,int d){
            this.src=s;
            this.dest=d;
        }
    }
    public static void main(String[] args) {
        int V=6;
        ArrayList<Edge>[] graph=new ArrayList[V];
        create_Graph(graph);
        boolean[] visit=new boolean[V];
        Stack<Integer> st=new Stack<>();

        for(int i=0;i<V;i++){
            if(!visit[i]){//Element is not visited in the visited array.
                topologicalSorting(graph,visit,i,st);
            }
        }
        //Call print Stack function
        printStack(st);
    }

    public static void topologicalSorting(ArrayList<Edge>[] graph, boolean[] visit, int curr, Stack<Integer> st) {
        /*
        We use inbuilt stack here. Bcoz if we make explicit stack here it will make again
        and again in every call of recursion. And we are not able to store it in a stack.
         */
        visit[curr]=true;
        //Go on all the neighbours
        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            if(!visit[e.dest]){//If true is not present at e.destination element.
                topologicalSorting(graph,visit,e.dest,st);
            }
        }
        st.push(curr);
    }
    public static void printStack(Stack<Integer> st){
        while(!st.isEmpty()){
            System.out.print(st.pop()+" ");
        }
    }
}
