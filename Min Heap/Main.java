public class Main {
    public static void main(String[] args) {

        MinHeap minheap = new MinHeap(12);
        minheap.insert(50);
        minheap.insert(17);
        minheap.insert(10);
        minheap.insert(5);
        minheap.insert(50);
        minheap.insert(17);
        minheap.insert(18);
        minheap.insert(41);
        minheap.insert(54);
        minheap.insert(-1);
        minheap.insert(2);

        System.out.println("Result "+minheap.poll());
        System.out.println("Result "+minheap.poll());
        System.out.println("Result "+minheap.poll());
        minheap.printHeap();

    }
}
