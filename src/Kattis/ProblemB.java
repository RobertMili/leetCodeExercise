package Kattis;

import java.util.*;

class ProblemB {

    // Edge class to represent an edge with a destination and a cost
    static class Edge {
        int to, cost;

        Edge(int to, int cost) {
            this.to = to;
            this.cost = cost;
        }
    }

    static final int INF = Integer.MAX_VALUE; // Infinite cost
    static List<Edge>[] graph; // Adjacency list for the graph
    static int[] dist; // Array to store shortest distances

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Number of nodes
        int m = sc.nextInt(); // Number of edges

        // Initialize graph as an adjacency list
        graph = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }

        // Read edges and construct the graph
        for (int i = 0; i < m; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            graph[u].add(new Edge(v, 1)); // cost is 1 as per the C++ code
            graph[v].add(new Edge(u, 1)); // graph is undirected, so add reverse edge
        }

        // Run Dijkstra's algorithm from node 1
        dijkstra(1, n);

        // Output the shortest distance from node 1 to node n
        if (dist[n] == INF) {
            System.out.println(0); // If no path, print 0
        } else {
            System.out.println(dist[n] - 1); // Print the shortest distance (subtract 1 as per C++ code logic)
        }
    }

    // Dijkstra's algorithm using a priority queue
    static void dijkstra(int source, int n) {
        dist = new int[n + 1]; // Distance array to store shortest distances
        Arrays.fill(dist, INF); // Initialize distances with infinity
        dist[source] = 0; // Distance to the source node is 0

        // Priority queue to select the node with the smallest distance
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        pq.offer(new int[]{0, source}); // {distance, node}

        while (!pq.isEmpty()) {
            int[] current = pq.poll();
            int currentDist = current[0];
            int node = current[1];

            // If we have already found a better path, skip this one
            if (currentDist > dist[node]) continue;

            // Traverse all neighbors
            for (Edge edge : graph[node]) {
                int neighbor = edge.to;
                int newDist = dist[node] + edge.cost;

                // If we find a shorter path to the neighbor, update the distance
                if (newDist < dist[neighbor]) {
                    dist[neighbor] = newDist;
                    pq.offer(new int[]{newDist, neighbor});
                }
            }
        }
    }
}
