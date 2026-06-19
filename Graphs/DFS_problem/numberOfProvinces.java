package DFS_problem;

public class numberOfProvinces {

    public int findCircleNum(int[][] isConnected) {
        boolean[] visited=new boolean[isConnected.length];
        int provinces=0;

        for (int i=0;i<isConnected.length;i++){
            if(!visited[i]){
                dfs(i,isConnected,visited);
                provinces++;
            }
        }
        return provinces;

    }

    private void dfs(int city, int[][]isConnected,boolean[]visited){
        visited[city]=true;
        for(int i=0;i<isConnected[city].length;i++){
            if(isConnected[city][i]==1 && !visited[i]){
                dfs(i,isConnected,visited);
            }
        }
    }

    public static void main(String[] args) {
        int[][] isConnected = {
                {1, 1, 0},
                {1, 1, 0},
                {0, 0, 1}
        };

        numberOfProvinces solution = new numberOfProvinces();
        int result = solution.findCircleNum(isConnected);
        System.out.println("Number of provinces: " + result);
    }
    
}
