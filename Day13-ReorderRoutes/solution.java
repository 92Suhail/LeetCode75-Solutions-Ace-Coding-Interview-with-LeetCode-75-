class Solution {
    public int minReorder(int n, int[][] connections) {
        Map<Integer, List<int[]>> graph = new HashMap<>();
        for (int[] conn : connections) {
            graph.computeIfAbsent(conn[0], k -> new ArrayList<>()).add(new int[]{conn[1], 1});
            graph.computeIfAbsent(conn[1], k -> new ArrayList<>()).add(new int[]{conn[0], 0});
        }
        boolean[] visited = new boolean[n];
        return dfs(0, graph, visited);
    }
    private int dfs(int node, Map<Integer, List<int[]>> graph, boolean[] visited) {
        visited[node] = true;
        int count = 0;
        for (int[] neighbor : graph.get(node)) {
            int nextNode = neighbor[0];
            int needsReversal = neighbor[1];
            if (!visited[nextNode]) {
                count += needsReversal + dfs(nextNode, graph, visited);
            }
        }
        return count;
    }
}
