package Kattis;

import java.util.*;

class ProblemB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // Number of nodes
        int M = sc.nextInt(); // Number of edges
        int[][] edges = new int[M][2];

        for (int i = 0; i < M; i++) {
            edges[i][0] = sc.nextInt() - 1;
            edges[i][1] = sc.nextInt() - 1;
        }
        final int START = 0;
        final int END = N - 1;

        // Compute the maximum number of color changes
        int maxColorChanges = getMaxColorChanges(N, edges, START, END);
        System.out.println(maxColorChanges);
    }

    static int getMaxColorChanges(int n, int[][] edges, int start, int end) {
        int maxChanges = 0;
        int numEdges = edges.length;
        int numColorings = 1 << numEdges; // 2^numEdges

        // Iterate through all possible edge colorings
        for (int mask = 0; mask < numColorings; mask++) {
            // Create the colored graph for this masking
            Map<Integer, Map<Integer, Character>> coloredGraph = new HashMap<>();
            for (int i = 0; i < numEdges; i++) {
                int u = edges[i][0];
                int v = edges[i][1];
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

                // Count color change if necessary
                if (lastColor != -1 && (lastColor == 'R' && color == 'B') || (lastColor == 'B' && color == 'R')) {
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

