//BFS code using queue

void bfs(int start) {
    boolean[] visited = new boolean[V];
    Queue<Integer> q = new LinkedList<>();

    visited[start] = true;
    q.add(start);

    while (!q.isEmpty()) {
        int node = q.poll();
        System.out.print(node + " ");

        for (int neigh : adj.get(node)) {
            if (!visited[neigh]) {
                visited[neigh] = true;
                q.add(neigh);
            }
        }
    }
}
