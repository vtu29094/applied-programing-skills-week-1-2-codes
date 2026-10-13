
import java.util.*;

class StockSpanner {
    Stack<int[]> stack = new Stack<>();
    int day = 0;

    public StockSpanner() {
    }

    public int next(int price) {
        day++;

        while (!stack.isEmpty() && stack.peek()[0] <= price) {
            stack.pop();
        }

        int span = stack.isEmpty() ? day : day - stack.peek()[1];
        stack.push(new int[]{price, day});

        return span;
    }
}
