import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // Thêm phần tử vào ngăn xếp
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Ngăn xếp: " + stack);

        // Lấy phần tử ra khỏi ngăn xếp
        int popped = stack.pop();
        System.out.println("Phần tử bị loại bỏ: " + popped);
        System.out.println("Ngăn xếp sau khi loại bỏ: " + stack);
    }
}
