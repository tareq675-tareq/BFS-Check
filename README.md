public static void bfs(int begin, Map<Integer, List<Integer>> graph)

    At first we assign the node number to the key:
        Key = node number.
    and the list to value:
        Value = list of adjacent or neighbor nodes here.

Queue<Integer> queue = new LinkedList<>();

    Then we used queues to control BFS order (first in → first out)
    and ensures that we explore nodes one by one.

Set<Integer> visited = new HashSet<>();

    Then we keeps tracking of nodes we have already visited and skip them
    to avoide infinte loops.

queue.add(begin);
visited.add(begin);

    Add the starting node into the queue
    then mark it as visited
    BFS will begin from this node as a starting point.

while (!queue.isEmpty()) {

    Here we keep looping until every reachable node is processed.

int node = queue.poll();
System.out.print(node + " ");

    Take out the front node in the queue from the top
    Then print it in BFS order.

List<Integer> list = graph.get(node);
if (list == null) {
    list = Collections.emptyList();
}

    Looks up the neighbors in the adjacency list
    If none, returns an empty list.

for (int neighbor : list){
    if (!visited.contains(neighbor)) {
        queue.add(neighbor);
        visited.add(neighbor);
     }
}

    It runs for each neighbor:
    
    If the node not visited:
        Mark it as visited then add it to queue.

    If it visited:
        Ignore it.


    Then the code keeps repeating and the queue gives the next unprocessed node
    BFS continues until queue is fully empty
    All reachable nodes have been visited exactly once.
