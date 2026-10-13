
class MyCircularDeque {
    int[] arr;
    int front, rear, count, size;

    public MyCircularDeque(int k) {
        arr = new int[k];
        size = k;
        front = 0;
        rear = -1;
        count = 0;
    }

    public boolean insertFront(int value) {
        if (isFull()) return false;

        if (isEmpty()) {
            front = rear = 0;
        } else {
            front = (front - 1 + size) % size;
        }

        arr[front] = value;
        count++;
        return true;
    }

    public boolean insertLast(int value) {
        if (isFull()) return false;

        if (isEmpty()) {
            front = rear = 0;
        } else {
            rear = (rear + 1) % size;
        }

        arr[rear] = value;
        count++;
        return true;
    }

    public boolean deleteFront() {
        if (isEmpty()) return false;

        front = (front + 1) % size;
        count--;
        return true;
    }

    public boolean deleteLast() {
        if (isEmpty()) return false;

        rear = (rear - 1 + size) % size;
        count--;
        return true;
    }

    public int getFront() {
        return isEmpty() ? -1 : arr[front];
    }

    public int getRear() {
        return isEmpty() ? -1 : arr[rear];
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public boolean isFull() {
        return count == size;
    }
}
