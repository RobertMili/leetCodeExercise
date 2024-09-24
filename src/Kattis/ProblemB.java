import java.util.*;

public class ProblemB {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // Fixed input values
    final int N = sc.nextInt(); // Number of nodes
    final int M = sc.nextInt(); // Number of edges
    final int[][] EDGES = new int[M][2];


        for (int i = 0; i < M; i++) {
            EDGES[i][0] = sc.nextInt();
            EDGES[i][1] = sc.nextInt();
        }
    final int START = 0;
    final int END = N-1;


        // Build the graph
        List<List<Integer>> adj = new ArrayList<>(N);
        for (int i = 0; i < N; i++) {
            adj.add(new ArrayList<>());
        }
        for (int[] edge : EDGES) {
            int u = edge[0] - 1;
            int v = edge[1] - 1;
            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        // Compute the maximum number of color changes
        int maxColorChanges = getMaxColorChanges(N, EDGES, START, END, adj);
        System.out.println(maxColorChanges);
    }

    static int getMaxColorChanges(int n, int[][] edges, int start, int end, List<List<Integer>> adj) {
        int maxChanges = 0;
        int numEdges = edges.length;
        int numColorings = 1 << numEdges; // 2^numEdges

        for (int mask = 0; mask < numColorings; mask++) {
            // Create the colored graph for this masking
            Map<Integer, Map<Integer, Character>> coloredGraph = new HashMap<>();
            for (int i = 0; i < numEdges; i++) {
                int u = edges[i][0] - 1;
                int v = edges[i][1] - 1;
                char color = ((mask & (1 << i)) == 0) ? 'R' : 'B'; // Red or Blue
                coloredGraph.computeIfAbsent(u, k -> new HashMap<>()).put(v, color);
                coloredGraph.computeIfAbsent(v, k -> new HashMap<>()).put(u, color);
            }

            // BFS to find the minimum color changes on this colored graph
            int changes = bfsMinColorChanges(n, coloredGraph, start, end);
            maxChanges = Math.max(maxChanges, changes);
        }

        return maxChanges;
    }

    static int bfsMinColorChanges(int n, Map<Integer, Map<Integer, Character>> graph, int start, int end) {
        Queue<int[]> queue = new LinkedList<>();
        boolean[][] visited = new boolean[n][2]; // [node][lastColor]
        queue.offer(new int[]{start, -1, 0}); // {currentNode, lastColor, changes}
        visited[start][0] = true;
        visited[start][1] = true;

        while (!queue.isEmpty()) {
            int[] state = queue.poll();
            int node = state[0];
            int lastColor = state[1];
            int changes = state[2];

            if (node == end) {
                return changes;
            }

            for (Map.Entry<Integer, Character> entry : graph.getOrDefault(node, Collections.emptyMap()).entrySet()) {
                int nextNode = entry.getKey();
                char color = entry.getValue();
                int nextChanges = changes;
                if (lastColor != -1 && lastColor != color) {
                    nextChanges++;
                }
                if (!visited[nextNode][color == 'R' ? 0 : 1]) {
                    visited[nextNode][color == 'R' ? 0 : 1] = true;
                    queue.offer(new int[]{nextNode, color, nextChanges});
                }
            }
        }
        return Integer.MAX_VALUE; // unreachable
    }
}
