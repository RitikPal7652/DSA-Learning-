package DSA.Graph;

import java.util.ArrayList;

public class isCyclePresent {
    public static class Edge {
        int src;
        int dest;

        //Constructor
        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    public static void create_Graph(ArrayList<Edge>[] graph) {
        //Place empty arrayList in each index of array.
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 0));
        //graph[1].add(new Edge(2,3));

        graph[2].add(new Edge(2, 3));
        //graph[2].add(new Edge(3,4));

        //graph[3].add(new Edge(3, 1));
        //graph[3].add(new Edge(4,2));
    }

    public static boolean cycle(ArrayList<Edge>[] graph, int curr, boolean[] visit, boolean[] stack) {
        visit[curr] = true;
        stack[curr] = true;
        //Adding all the neighbours of curr node.
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (stack[e.dest]) return true;//Is stack contains that element.
            else if (!visit[e.dest]) {  //Is e.destination is visited in array.
                if (cycle(graph, e.dest, visit, stack)) return true;
            }
        }
        stack[curr] = false;
        return false;
    }

    public static void main(String[] args) {
        int V = 4;
        ArrayList<Edge>[] graph = new ArrayList[V];
        create_Graph(graph);

        boolean[] visit = new boolean[V];
        boolean[] stack = new boolean[V];
        for (int i = 0; i < V; i++) {   //When Components of graph are there.
            if (!visit[i]) {//Not visited.
                boolean cycle = cycle(graph, i, visit, stack);
                if (cycle) {
                    System.out.println(cycle);
                    break;
                } else {
                    System.out.println(cycle);
                    break;
                }
            }
        }
    }
}
