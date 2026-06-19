// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class BFS{
    public void bfs(List<List<Integer>> adj,int root){
        Queue<Integer> q=new LinkedList<>();
        boolean[] visited=new boolean[adj.size()];
        visited[root]=true;
        q.add(root);
        
        while(!q.isEmpty()){
            int node=q.poll();
            System.out.print(node+ " ");
            
            for(int neighbour:adj.get(node)){
                if (!visited[neighbour]){
                    visited[neighbour]=true;
                    q.add(neighbour);
                }
            }
        }
    }

    public static void main(String[] args) {
        int vertices = 3;
        
        List<List<Integer>> adjList = new ArrayList<>(vertices);
        
        for (int i = 0; i < vertices; i++) {
            adjList.add(new ArrayList<>());
        }
        
        adjList.get(0).add(1);
        adjList.get(1).add(0);
        
        adjList.get(0).add(2);
        adjList.get(2).add(0);
        
        BFS b =new BFS();
        b.bfs(adjList,0);
        
        
    }
}