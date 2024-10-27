public class BellmanFordExample {
    public static void main(String[] args) {
        BellmanFord bf = new BellmanFord(5, 8);
        bf.addEdge(0, 0, 1, -1);
        bf.addEdge(1, 0, 2, 4);
        bf.addEdge(2, 1, 2, 3);
        bf.addEdge(3, 1, 3, 2);
        bf.addEdge(4, 1, 4, 2);
        bf.addEdge(5, 3, 2, 5);
        bf.addEdge(6, 3, 1, 1);
        bf.addEdge(7, 4, 3, -3);

        bf.bellmanFord(0);
    }
}