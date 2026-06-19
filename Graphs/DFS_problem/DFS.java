package DFS_problem;
import java.util.*;
class DFS{
    public void dfs(List<List<Integer>> adj,int root,boolean[] visited){
        
        visited[root]=true;
        System.out.print(root+ " ");
        
        for(int neighbour:adj.get(root)){
            if (!visited[neighbour]){
                visited[neighbour]=true;
                dfs(adj,neighbour,visited);
            
            }
        }
    }
    

    public static void main(String[] args) {
        int vertices = 3;
        
        List<List<Integer>> adjList = new ArrayList<>(vertices);
        boolean[] visited=new boolean[vertices];
        
        for (int i = 0; i < vertices; i++) {
            adjList.add(new ArrayList<>());
        }
        
        adjList.get(0).add(1);
        adjList.get(1).add(0);
        
        adjList.get(0).add(2);
        adjList.get(2).add(0);
        
        DFS d =new DFS();
        d.dfs(adjList,0,visited);
        
        
    }
}