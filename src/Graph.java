import java.util.*;

class Graph {
    private final Map<Integer, List<Edge>> adjList = new HashMap<>();

    public void addEdge(int source, int destination, int weight) {
        adjList.computeIfAbsent(source, k -> new ArrayList<>()).add(new Edge(destination, weight));
    }

    public void dijkstra(int start) {
        Map<Integer, Integer> distances = new HashMap<>();
        PriorityQueue<Edge> pq = new PriorityQueue<>(Comparator.comparingInt(edge -> edge.weight));
        pq.add(new Edge(start, 0));
        distances.put(start, 0);

        while (!pq.isEmpty()) {
            Edge current = pq.poll();

            for (Edge neighbor : adjList.getOrDefault(current.destination, new ArrayList<>())) {
                int newDist = distances.get(current.destination) + neighbor.weight;

                if (newDist < distances.getOrDefault(neighbor.destination, Integer.MAX_VALUE)) {
                    distances.put(neighbor.destination, newDist);
                    pq.add(new Edge(neighbor.destination, newDist));
                }
            }
        }

        System.out.println("Khoảng cách tối thiểu từ " + start + ": " + distances);
    }

    static class Edge {
        int destination;
        int weight;

        Edge(int destination, int weight) {
            this.destination = destination;
            this.weight = weight;
        }
    }
}

