import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        // Thêm phần tử vào hàng đợi
        queue.add(1);
        queue.add(2);
        queue.add(3);

        System.out.println("Hàng đợi: " + queue);

        // Lấy phần tử ra khỏi hàng đợi
        int removed = queue.remove();
        System.out.println("Phần tử bị loại bỏ: " + removed);
        System.out.println("Hàng đợi sau khi loại bỏ: " + queue);
    }
}
