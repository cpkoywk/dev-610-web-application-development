import java.util.Arrays;
import java.util.NoSuchElementException;

// Implements a priority queue of integers using a
// min-heap represented as an array.
public class HeapIntPriorityQueue {

    public static void main(String[] args) {
        System.out.println("e18q14");
        HeapIntPriorityQueue heap1 = new HeapIntPriorityQueue();
        heap1.add(42);
        heap1.add(50);
        heap1.add(45);
        heap1.add(78);
        heap1.add(61);
        int[] array1 = heap1.toArray();
        System.out.println(Arrays.toString(array1));
        System.out.println("e18q15");

        System.out.println(heap1);  
    
        System.out.println("e18q16");
        HeapIntPriorityQueue heap2 = new HeapIntPriorityQueue();
        heap2.add(10);
        heap2.add(20);
        heap2.add(15);
    
        heap1.merge(heap2);
        System.out.println(heap1);  
    }

    private int[] elementData;
    private int size;
    //q14
    public int[] toArray() {
        int[] result = new int[size];
        for (int i = 0; i < size; i++) {
            result[i] = elementData[i + 1];
        }
        return result;
    }
    //q15
    public String toString() {
        StringBuilder result = new StringBuilder("[");
        if (!isEmpty()) {
            result.append(elementData[1]);
            for (int i = 2; i <= size; i++) {
                result.append(", ").append(elementData[i]);
            }
        }
        result.append("]");
        return result.toString();
    }
    //q16
    public void merge(HeapIntPriorityQueue other) {
        for (int i = 1; i <= other.size; i++) {
            add(other.elementData[i]);
        }
    }

    
    // Constructs an empty queue.
    public HeapIntPriorityQueue() {
        elementData = new int[10];
        size = 0;
    }
    
    public void add(int value) {
        if (size + 1 >= elementData.length) {
            elementData = Arrays.copyOf(elementData, elementData.length * 2);
        }
        
        elementData[size + 1] = value;
        
        int index = size + 1;
        boolean found = false;   
        while (!found && hasParent(index)) {
            int parent = parent(index);
            if (elementData[index] < elementData[parent]) {
                swap(elementData, index, parent(index));
                index = parent(index);
            } else {
                found = true;  
            }
        }
        
        size++;
    }
    
    public boolean isEmpty() {
        return size == 0;
    }
    

    public int peek() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return elementData[1];
    }
    
   
    public int remove() {
        int result = peek();

        elementData[1] = elementData[size];
        size--;
        
        int index = 1;
        boolean found = false;   
        while (!found && hasLeftChild(index)) {
            int left = leftChild(index);
            int right = rightChild(index);
            int child = left;
            if (hasRightChild(index) &&
                    elementData[right] < elementData[left]) {
                child = right;
            }
            
            if (elementData[index] > elementData[child]) {
                swap(elementData, index, child);
                index = child;
            } else {
                found = true; 
            }
        }
        
        return result;
    }
    
    public int size() {
        return size;
    }
    
    // Returns a string representation of this queue, such as "[10, 20, 30]";
    // The elements are not guaranteed to be listed in sorted order.
    // public String toString() {
    //     String result = "[";
    //     if (!isEmpty()) {
    //         result += elementData[1];
    //         for (int i = 2; i <= size; i++) {
    //             result += ", " + elementData[i];
    //         }
    //     }
    //     return result + "]";
    // }
    
    
    private int parent(int index) {
        return index / 2;
    }
    
    private int leftChild(int index) {
        return index * 2;
    }
    
    // returns index of right child of given index
    private int rightChild(int index) {
        return index * 2 + 1;
    }
    
    // returns true if the node at the given index has a parent (is not the root)
    private boolean hasParent(int index) {
        return index > 1;
    }
    
    // returns true if the node at the given index has a non-empty left child
    private boolean hasLeftChild(int index) {
        return leftChild(index) <= size;
    }
    
    // returns true if the node at the given index has a non-empty right child
    private boolean hasRightChild(int index) {
        return rightChild(index) <= size;
    }
    
    // switches the values at the two given indexes of the given array
    private void swap(int[] a, int index1, int index2) {
        int temp = a[index1];
        a[index1] = a[index2];
        a[index2] = temp;
    }
}