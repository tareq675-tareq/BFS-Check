package bfstest;
import java.util.*;

public class BFSTest {

    public static void bfs(int begin, Map < Integer, List<Integer> > graph) {
        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();


        queue.add(begin);
        visited.add(begin);

        while (!queue.isEmpty()) {
            int node = queue.poll();
            System.out.print(node + " ");


            List<Integer> list = graph.get(node);
            if (list == null) {
                list = Collections.emptyList();
            }

            for (int neighbor : list){
                if (!visited.contains(neighbor)) {
                    queue.add(neighbor);
                    visited.add(neighbor);
                }
            }
        }
    }
    
    public static void main(String[] args) {
        
        Map<Integer, List<Integer>> graph = new HashMap<>();
        graph.put(1, Arrays.asList(2, 3));
        graph.put(2, Arrays.asList(4, 5));
        graph.put(3, Arrays.asList(6));
        graph.put(7, new ArrayList<Integer>());
        graph.put(5, new ArrayList<Integer>());
        graph.put(6, new ArrayList<Integer>());

        System.out.println("BFS starting from node 1:");
        bfs(1, graph);
        
    }
}
