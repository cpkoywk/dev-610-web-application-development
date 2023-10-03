import java.util.*;
public class e14q1 {
    //Queue: FIFO
    //stack: LIFO

    public static void main(String[] args) {
        System.out.println("e14q1");

        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(-5);
        stack.push(1);
        stack.push(2);
        stack.push(-4);
        System.out.println(stack);
        splitStack(stack);
        System.out.println(stack);
        System.out.println("e14q2");
        System.out.println(stack);
        stutter(stack);
        System.out.println(stack);

System.out.println("e14q3");
        System.out.println("stack before: "+ stack);
        Stack<Integer> stackq3=copyStack(stack);
        System.out.println("stack after: "+ stack);
        System.out.println("stack copy:" + stackq3);
System.out.println("e14q4");
        Stack<Integer> stackq4 = new Stack<>();
        stackq4.push(7);
        stackq4.push(2);
        stackq4.push(8);
        stackq4.push(9);
        stackq4.push(4);
        stackq4.push(11);
        stackq4.push(7);
        stackq4.push(1);
        stackq4.push(42);
        System.out.println(stackq4);
        collapse(stackq4);
        System.out.println(stackq4);
        
    System.out.println("e14q5");
    System.out.println(equals(stackq4,stackq3));

    System.out.println("e14q6");
    Queue<Integer> q = new ArrayDeque<>(Arrays.asList(3, 5, 4, 17, 6, 83, 1, 84, 16, 37));
    System.out.println("Before rearrange: " + q);
    rearrange(q);
    System.out.println("After rearrange: " + q);

    System.out.println("e14q7");
    Queue<Integer> q7 = new ArrayDeque<>(Arrays.asList(1, 8, 7, 2, 9, 18, 12, 0));
    System.out.println("Before reverseHalf: " + q7);
    reverseHalf(q7);
    System.out.println("After reverseHalf: " + q7);
    System.out.println("e14q8");
    Queue<Integer> q8 = new ArrayDeque<>(Arrays.asList(3, 8, 17, 9, 17, 8, 3));
    System.out.println(isPalindrome(q8));

    System.out.println("e14q9");
    Stack<Integer> stack9 = new Stack<>();
    stack9.addAll(Arrays.asList(1, 2, 8, 6, -1, 15, 7)); 
    switchPairs(stack9);
    System.out.println(stack9);

    System.out.println("e14q10");
    Stack<Integer> stack10 = new Stack<>();

    stack10.addAll(Arrays.asList(5, 6, 7, 8, 9, 10)); 
    System.out.println(isConsecutive(stack10));

    System.out.println("e14q11");
        Queue<Integer> q11 = new LinkedList<>(Arrays.asList(1, 2, -2, 4, -5, 8, -8, 12, -15));
        System.out.println("Original  " + q11);
        reorder(q11);
        System.out.println("After reorder " + q11);
    System.out.println("e14q12");
        Stack<Integer> stack12 = new Stack<>();
            stack12.addAll(Arrays.asList(1,2,3,4,5,6,7,8)); 


        System.out.println("Original Stack: " + stack12);
        shift(stack12, 3);
        System.out.println("After shift: " +stack12);

    System.out.println("e14q13");
    Stack<Integer> stack13 = new Stack<>();
    stack13.addAll(Arrays.asList(1,5,10,3,12,7,5,8,15,15,20,4)); 


    System.out.println("Original Stack: " + stack13);
    expunge(stack13);
    System.out.println("After expunge: " + stack13);


    System.out.println("e14q14");
    Queue<Integer> q14 = new LinkedList<>(Arrays.asList(10, 20, 30, 40, 50, 60, 70, 80, 90));
    System.out.println("Original Queue: " + q14);
    reverseFirstK(4, q14);
    System.out.println("After reverseFirstK(4, q): " + q14);

    System.out.println("e14q15");
    Stack<Integer> stack15 = new Stack<>();
stack15.addAll(Arrays.asList(2,3,8,8,11,17,20,20));


    System.out.println("Original Stack: " + stack15);
    System.out.println("Is Sorted? " + isSorted(stack15));
    System.out.println("Stack After Method Call: " + stack15);



    System.out.println("e14q16");
 Stack<Integer> s16 = new Stack<>();
 s16.addAll(Arrays.asList(10, 53, 19, 24));
 mirror(s16);
 System.out.println("After mirroring: " + s16);
    System.out.println("e14q17");

 Stack<Integer> s17 = new Stack<>();
 s17.addAll(Arrays.asList(2, 2, 2, 2, 2, -4, -4, -4, 82, 6, 6, 6, 6, 17, 17));
 compressDuplicates(s17);
 System.out.println("After compressing duplicates: " + s17);
    System.out.println("e14q18");

 Queue<Integer> q18 = new LinkedList<>();
 q18.addAll(Arrays.asList(10, 50, 19, 54, 30, 67));
 mirrorHalves(q18);
 System.out.println("After mirror halves: " + q18);
    System.out.println("e14q19");

 Stack<Integer> s19 = new Stack<>();
 s19.addAll(Arrays.asList(2, 8, 3, 19, 2, 3, 2, 7, 12, -8, 4));
 int min1 = removeMin(s19);
 System.out.println("Removed min: " + min1 + ", Stack: " + s19);
 int min2 = removeMin(s19);
 System.out.println("Removed min: " + min2 + ", Stack: " + s19);
    System.out.println("e14q20");

 Queue<Integer> q20 = new LinkedList<>();
 q20.addAll(Arrays.asList(2, 8, -5, 19, 7, 3, 24, 42));
 interleave(q20);
 System.out.println("After interleaving: " + q20);
    System.out.println("e14q21");

 Stack<Integer> s21 = new Stack<>();
 s21.addAll(Arrays.asList(27, 5, 42, -11, 0, 19));
 maxToTop(s21);
 System.out.println("After moving max to top: " + s21);


    }
        // 21. maxToTop
    public static void maxToTop(Stack<Integer> stack) {
        Queue<Integer> queue = new LinkedList<>();
        int max = Integer.MIN_VALUE;
        while (!stack.isEmpty()) {
            max = Math.max(max, stack.peek());
            queue.add(stack.pop());
        }
        while (!queue.isEmpty()) {
            int current = queue.poll();
            if (current != max) {
                stack.push(current);
            }
        }
        stack.push(max);
    }
      // 20. interleave
    public static void interleave(Queue<Integer> queue) {
        if (queue.size() % 2 != 0) {
            throw new IllegalArgumentException();
        }
        Stack<Integer> stack = new Stack<>();
        int halfSize = queue.size() / 2;
        for (int i = 0; i < halfSize; i++) {
            stack.push(queue.poll());
        }
        Queue<Integer> tempQueue = new LinkedList<>();
        while (!stack.isEmpty()) {
            tempQueue.add(stack.pop());
            tempQueue.add(queue.poll());
        }
        while (!tempQueue.isEmpty()) {
            queue.add(tempQueue.poll());
        }
    }

    public static int removeMin(Stack<Integer> stack) {
        Queue<Integer> queue = new LinkedList<>();
        int min = Integer.MAX_VALUE;
        while (!stack.isEmpty()) {
            min = Math.min(min, stack.peek());
            queue.add(stack.pop());
        }
        int count2 = 0;
        while (!queue.isEmpty()) {
            int current = queue.poll();
            if (current == min) {
                count2++;
            } else {
                stack.push(current);
            }
        }
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }
        while (!queue.isEmpty()) {
            stack.push(queue.poll());
        }
        return min;
    }
    public static void mirrorHalves(Queue<Integer> queue) {
        if (queue.size() % 2 != 0) {
            throw new IllegalArgumentException();
        }
        Stack<Integer> stack = new Stack<>();
        int halfSize = queue.size() / 2;
        for (int i = 0; i < halfSize; i++) {
            int current = queue.poll();
            queue.add(current);
            stack.push(current);
        }
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }
    }
 
    public static void compressDuplicates(Stack<Integer> stack) {
        Queue<Integer> queue = new LinkedList<>();
        while (!stack.isEmpty()) {
            int count = 1;
            int current = stack.pop();
            while (!stack.isEmpty() && stack.peek() == current) {
                count++;
                stack.pop();
            }
            queue.add(current);
            queue.add(count);
        }
        while (!queue.isEmpty()) {
            stack.push(queue.remove());
        }
    }

    public static void mirror(Stack<Integer> stack) {
        Stack<Integer> auxiliary = new Stack<>();
        auxiliary.addAll(stack);
        while (!auxiliary.isEmpty()) {
            stack.push(auxiliary.pop());
        }
    }


 


    public static boolean isSorted(Stack<Integer> stack) {
        if (stack.isEmpty() || stack.size() == 1) {
            return true;
        }

        Stack<Integer> auxiliary = new Stack<>();
        boolean isSorted = true;
        int prev = stack.pop();
        auxiliary.push(prev);

        while (!stack.isEmpty()) {
            int current = stack.pop();
            if (current > prev) {
                isSorted = false;
            }
            auxiliary.push(current);
            prev = current;
        }

        // Restore the original stack
        while (!auxiliary.isEmpty()) {
            stack.push(auxiliary.pop());
        }

        return isSorted;
    }

    public static void reverseFirstK(int k, Queue<Integer> queue) {
        if (k < 0) {
            return;
        }
        
        if (k > queue.size()) {
            throw new IllegalArgumentException();
        }
        
        Stack<Integer> stack = new Stack<>();
        int size = queue.size();
        
        // Transfer the first k elements from the queue to the stack
        for (int i = 0; i < k; i++) {
            stack.push(queue.poll());
        }
        
        // Move the remaining elements of the queue to the end
        for (int i = 0; i < size - k; i++) {
            queue.add(queue.poll());
        }
        
        // Pop the elements from the stack back into the queue
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }
        
        // Transfer the remaining (original) elements from the end of the queue back to the front
        for (int i = 0; i < size - k; i++) {
            queue.add(queue.poll());
        }
    }
    
    public static void expunge(Stack<Integer> s) {
        Stack<Integer> s1 = new Stack<>();

        while (!s.isEmpty()) {
            int current = s.pop();
            while (!s1.isEmpty() && s1.peek() < current) {
                s1.pop();
            }
            s1.push(current);
        }

        while (!s1.isEmpty()) {
            s.push(s1.pop());
        }
     
    }


    public static void shift(Stack<Integer> s, int n) {
        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            q.add(s.remove(0));  // Assuming Stack supports remove. Otherwise, we need a different way to remove the bottom element.
        }

        while (!s.isEmpty()) {
            q.add(s.pop());
        }

        while (!q.isEmpty()) {
            s.push(q.poll());
        }
                    // reverse the order
                         while (!s.isEmpty()) {
            q.add(s.pop());
        }
                        while (!q.isEmpty()) {
            s.push(q.poll());
        }
   
    }

    public static void reorder(Queue<Integer> q) {
        Stack<Integer> s = new Stack<>();
        
        while (!q.isEmpty()) {
            s.push(q.poll());
        }
        
        while (!s.isEmpty()) {
            q.add(s.pop());
        }
        
        int size = q.size();
        for (int i = 0; i < size; i++) {
            int num = q.poll();
            if (num < 0) {
                s.push(num);
            } else {
                q.add(num);
            }
        }
        
        while (!s.isEmpty()) {
            q.add(s.pop());
        }
                // reverse the order
                        while (!q.isEmpty()) {
            s.push(q.poll());
        }
        while (!s.isEmpty()) {
            q.add(s.pop());
        }

    }

    public static boolean isConsecutive(Stack<Integer> stack) {
        Queue<Integer> auxiliaryQueue = new LinkedList<>();
        boolean consecutive = true;
        int expected = stack.peek();

        while (!stack.isEmpty()) {
            int current = stack.pop();
            auxiliaryQueue.offer(current);

            if (current != expected) {
                consecutive = false;
            }

            expected--;

            if (stack.isEmpty()) {
                break;
            }
        }

        while (!auxiliaryQueue.isEmpty()) {
            stack.push(auxiliaryQueue.poll());
        }

        return consecutive;
    }
 


    public static void switchPairs(Stack<Integer> stack) {
        Queue<Integer> queue = new LinkedList<>();

        // Step 1: Transfer from stack to queue.
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }

        // Step 2: Transfer pairs from queue to stack in reverse order.
        while (queue.size() > 1) {
            int first = queue.poll();
            int second = queue.poll();
            stack.push(second);
            stack.push(first);
        }

        // Step 3: Transfer last element if odd number of elements.
        if (!queue.isEmpty()) {
            stack.push(queue.poll());
        }

        // Step 4: Transfer from stack back to queue.
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }

        // Step 5: Transfer back from queue to stack.
        while (!queue.isEmpty()) {
            stack.push(queue.poll());
        }
    }

    public static boolean isPalindrome(Queue<Integer> q) {
        Stack<Integer> s = new Stack<>();
        int size = q.size();
        boolean result = true;
    
        for (int i = 0; i < size / 2; i++) {
            int front = q.poll();
            s.push(front);
            q.add(front);
        }
    
        if (size % 2 == 1) {
            q.add(q.poll());
        }
    
        for (int i = 0; i < size / 2; i++) {
            int front = q.poll();
            int top = s.pop();
    
            if (front != top) {
                result = false;
            }
    
            q.add(front);
        }
    
        return result;
    }
    
    public static void reverseHalf(Queue<Integer> q) {
    Stack<Integer> s = new Stack<>();
    int size = q.size();

    for (int i = 0; i < size; i++) {
        if (i % 2 == 0) {
            q.add(q.poll());
        } else {
            s.push(q.poll());
        }
    }

    for (int i = 0; i < size; i++) {
        if (i % 2 == 0) {
            q.add(q.poll());
        } else {
            q.add(s.pop());
        }
    }
}


    public static void rearrange(Queue<Integer> q) {
        Stack<Integer> stack = new Stack<>();
        int size = q.size();
    
        for (int i = 0; i < size; i++) {
            int value = q.poll();
            if (value % 2 == 0) {
                q.add(value);  
                stack.push(value); 
        }
    
        while (!stack.isEmpty()) {
            q.add(stack.pop());
        }
    }
    }    




    public static boolean equals(Stack<Integer> s1, Stack<Integer> s2) {
        if (s1.size() != s2.size()) {
            return false;
        }
        Stack<Integer> aux = new Stack<>();
        boolean result = true;
        while (!s1.isEmpty() && result) {
            int n1 = s1.pop();
            int n2 = s2.pop();
            if (n1 != n2) {
                result = false;
            }
            aux.push(n1);
            aux.push(n2);
        }
        while (!aux.isEmpty()) {
            s2.push(aux.pop());
            s1.push(aux.pop());
        }
        return result;
    }

    public static void collapse(Stack<Integer> s) {
        Queue<Integer> q = new LinkedList<>();
        // reverse the order
        while (!s.isEmpty()) {
            q.add(s.pop());
        }
        while (!q.isEmpty()) {
            s.push(q.poll());
        }


        while (s.size() >= 2) {
            int first = s.pop();
            int second = s.pop();
            q.add(first + second);
        }
        
        // one element left in the stack, add it to the queue directly.
        if (!s.isEmpty()) {
            q.add(s.pop());
        }
        
        // Transfer the sums from the queue back to the stack (reverse order).
        while (!q.isEmpty()) {
            s.push(q.poll());
        }
        

    }

    public static Stack<Integer> copyStack(Stack<Integer> s) {
        Stack<Integer> s2 = new Stack<Integer>();
        Queue<Integer> q = new LinkedList<>();
        
        while (!s.isEmpty()) {
            q.add(s.pop());
        }
        while (!q.isEmpty()) {
            int num = q.poll();
            s2.push(num);
            s.push(num);  
        }
        while (!s.isEmpty()) {
            q.add(s.pop());
            q.add(s2.pop());

        }
        
        while (!q.isEmpty()) {
            s.push(q.poll());
            s2.push(q.poll());

        }
        return s2;
    }



    public static void stutter(Stack<Integer> s) {
        Queue<Integer> q = new LinkedList<>();
// reverse it one time
  while (!s.isEmpty()) {
    q.add(s.pop());
}

while (!q.isEmpty()) {
    s.push(q.poll());
}
while (!s.isEmpty()) {
    int num = s.pop();
    q.add(num);
    q.add(num);
}

// Transfer all elements from the queue back to the stack.
while (!q.isEmpty()) {
    s.push(q.poll());
}
}
    public static void splitStack(Stack<Integer> s) {
        Queue<Integer> q = new LinkedList<>();

        // pop from stacj and add to the queue.
        while (!s.isEmpty()) {
            q.add(s.pop());
        }

        int size = q.size();
        for (int i = 0; i < size; i++) {
            int num = q.poll();
            if (num >= 0) {
                s.push(num);
            } else {
                q.add(num);
            }
        }

        while (!q.isEmpty()) {
            s.push(q.poll());
        }
    }
}

