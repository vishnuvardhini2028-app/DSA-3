
package graph;
import java.util.*;


public class GraphRepresentationmatrixandlist 
{
        public static void main(String[] args) 
        {
        int V = 4;
        int[][] matrix = new int[V][V];

        List<List<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i < V; i++)
            adjList.add(new ArrayList<>());

        int[][] edges = {{0,1},{0,2},{1,2},{2,3}};

        for (int[] e : edges) {
            matrix[e[0]][e[1]] = 1;
            matrix[e[1]][e[0]] = 1;

            adjList.get(e[0]).add(e[1]);
            adjList.get(e[1]).add(e[0]);
        }

        System.out.println("Adjacency Matrix:");
        for (int[] row : matrix) {
            for (int val : row)
                System.out.print(val + " ");
            System.out.println();
        }

        System.out.println("\nAdjacency List:");
        for (int i = 0; i < V; i++) {
            System.out.print(i + " -> ");
            for (int node : adjList.get(i))
                System.out.print(node + " ");
            System.out.println();
        }
    }
}
    

