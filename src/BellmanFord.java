import java.util.Arrays;

class BellmanFord {
    private final int vertices;
    private final Edge[] edges;

    public BellmanFord(int vertices, int maxEdges) {
        this.vertices = vertices;
        edges = new Edge[maxEdges];
    }

    public void addEdge(int index, int source, int destination, int weight) {
        edges[index] = new Edge(source, destination, weight);
    }

    public void bellmanFord(int start) {
        int[] distances = new int[vertices];
        Arrays.fill(distances, Integer.MAX_VALUE);
        distances[start] = 0;

        for (int i = 1; i < vertices; i++) {
            for (Edge edge : edges) {
                if (edge != null && distances[edge.source] != Integer.MAX_VALUE) {
                    int newDist = distances[edge.source] + edge.weight;
                    if (newDist < distances[edge.destination]) {
                        distances[edge.destination] = newDist;
                    }
                }
            }
        }

        System.out.println("Khoảng cách tối thiểu từ " + start + ": " + Arrays.toString(distances));
    }

    static class Edge {
        int source;
        int destination;
        int weight;

        Edge(int source, int destination, int weight) {
            this.source = source;
            this.destination = destination;
            this.weight = weight;
        }
    }
}


