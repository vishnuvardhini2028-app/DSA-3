/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graph;
import java.util.*;


public class BFSandDFS 
{
    static void bfs(int start, List<List<Integer>> adj, int V) {
        boolean[] visited = new boolean[V];
        Queue<Integer> q = new LinkedList<>();

        q.add(start);
        visited[start] = true;

        while (!q.isEmpty()) {
            int node = q.poll();
            System.out.print(node + " ");

            for (int n : adj.get(node)) {
                if (!visited[n]) {
                    visited[n] = true;
                    q.add(n);
                }
            }
        }
    }

    static void dfs(int node, boolean[] visited, List<List<Integer>> adj) {
        visited[node] = true;
        System.out.print(node + " ");

        for (int n : adj.get(node)) {
            if (!visited[n])
                dfs(n, visited, adj);
        }
    }

    public static void main(String[] args) {
        int V = 5;
        List<List<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < V; i++)
            adj.add(new ArrayList<>());

        int[][] edges = {{0,1},{0,2},{1,3},{2,4},{3,4}};

        for (int[] e : edges) {
            adj.get(e[0]).add(e[1]);
            adj.get(e[1]).add(e[0]);
        }

        System.out.println("BFS:");
        bfs(0, adj, V);

        System.out.println("\nDFS:");
        dfs(0, new boolean[V], adj);
    }
}
