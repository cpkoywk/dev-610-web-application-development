import java.util.PriorityQueue;
import java.util.Stack;

public class PriorityQueueUtils {
        public static void main(String[] args) {
            System.out.println("e18q8"); 
            int[] array8 = {42, 9, 22, 17, -3, 81};
            PriorityQueueUtils.descending(array8);
            for (int num : array8) {
                System.out.print(num + " ");  
            }
            System.out.println();
    
            System.out.println("e18q9"); 
            PriorityQueue<Integer> queue9 = new PriorityQueue<>();
            queue9.add(42);
            queue9.add(50);
            queue9.add(45);
            queue9.add(78);
            queue9.add(61);// Expected output: 61
    
            System.out.println("e18q10"); 
            PriorityQueue<Integer> queue10 = new PriorityQueue<>();
            queue10.add(7);
            queue10.add(8);
            queue10.add(9);
            queue10.add(10);
            queue10.add(11);
            System.out.println(PriorityQueueUtils.isConsecutive(queue10)); 
    
            System.out.println("e18q11"); 
            PriorityQueue<Integer> queue11 = new PriorityQueue<>();
            queue11.add(7);
            queue11.add(7);
            queue11.add(8);
            queue11.add(8);
            queue11.add(8);
            queue11.add(10);
            queue11.add(45);
            queue11.add(45);
            PriorityQueueUtils.removeDuplicates(queue11);
            while (!queue11.isEmpty()) {
                System.out.print(queue11.poll() + " ");  
            }
            System.out.println();
    
            System.out.println("e18q12"); 
            PriorityQueue<Integer> queue12 = new PriorityQueue<>();
            queue12.add(7);
            queue12.add(8);
            queue12.add(10);
            queue12.add(45);
            PriorityQueueUtils.stutter(queue12);
            while (!queue12.isEmpty()) {
                System.out.print(queue12.poll() + " ");  
            }
            System.out.println();
    
            System.out.println("e18q13"); 
            PriorityQueue<Integer> queue13 = new PriorityQueue<>();
            queue13.add(1);
            queue13.add(3);
            queue13.add(3);
            queue13.add(6);
            queue13.add(6);
            queue13.add(8);
            PriorityQueueUtils.fillGaps(queue13);
            while (!queue13.isEmpty()) {
                System.out.print(queue13.poll() + " ");  
            }
            System.out.println();
        }
  


// q13.
public static void fillGaps(PriorityQueue<Integer> queue) {
    if (queue.isEmpty()) {
        return;
    }

    int start = queue.peek();
    PriorityQueue<Integer> tempQueue = new PriorityQueue<>();
    while (!queue.isEmpty()) {
        int curr = queue.poll();
        while (start < curr) {
            tempQueue.add(start++);
        }
        tempQueue.add(curr);
        start = curr + 1;
    }

    while (!tempQueue.isEmpty()) {
        queue.add(tempQueue.poll());
    }
}
// q12.
public static void stutter(PriorityQueue<Integer> queue) {
    Stack<Integer> stack = new Stack<>();
    while (!queue.isEmpty()) {
        int curr = queue.poll();
        stack.push(curr);
        stack.push(curr);
    }
    while (!stack.isEmpty()) {
        queue.add(stack.pop());
    }
}
// q11
public static void removeDuplicates(PriorityQueue<Integer> queue) {
    if (queue.isEmpty()) {
        return;
    }

    PriorityQueue<Integer> tempQueue = new PriorityQueue<>();
    Integer lastSeen = queue.poll(); 
    tempQueue.add(lastSeen); 

    while (!queue.isEmpty()) {
        int curr = queue.poll();
        if (curr != lastSeen) {
            tempQueue.add(curr);
            lastSeen = curr;
        }
    }
    while (!tempQueue.isEmpty()) {
        queue.add(tempQueue.poll());
    }
}
// q10
public static boolean isConsecutive(PriorityQueue<Integer> queue) {
    Stack<Integer> stack = new Stack<>();
    int prev = queue.poll();
    stack.push(prev);

    while (!queue.isEmpty()) {
        int curr = queue.poll();
        if (curr - prev != 1) {
            while (!stack.isEmpty()) {
                queue.add(stack.pop());
            }
            return false;
        }
        stack.push(curr);
        prev = curr;
    }

    while (!stack.isEmpty()) {
        queue.add(stack.pop());
    }

    return true;
}
// q9
public static int kthSmallest(PriorityQueue<Integer> queue, int k) {
    if (k <= 0 || k > queue.size()) {
        throw new IllegalArgumentException("Invalid value for k");
    }

    Stack<Integer> stack = new Stack<>();
    for (int i = 1; i < k; i++) {
        stack.push(queue.poll());
    }

    int result = queue.peek();

    while (!stack.isEmpty()) {
        queue.add(stack.pop());
    }

    return result;
}
// q8
public static void descending(int[] arr) {
    PriorityQueue<Integer> queue = new PriorityQueue<>((a, b) -> b - a); 
    for (int num : arr) {
        queue.add(num);
    }
    for (int i = 0; i < arr.length; i++) {
        arr[i] = queue.poll();
    }
}
}
