class Java_Solution {
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        int V = adj.size();
        boolean[] visited = new boolean[V];
        ArrayList<Integer> result = new ArrayList<>();
        dfsUtil(0, adj, visited, result);
        return result;
    }
    private void dfsUtil(int node, ArrayList<ArrayList<Integer>> adj, boolean[] visited, ArrayList<Integer> result){
        visited[node] = true;
        result.add(node);
        for(int neighbour : adj.get(node)){
            if(!visited[neighbour]){
                dfsUtil(neighbour, adj, visited, result);
            }
        }
    }
}
