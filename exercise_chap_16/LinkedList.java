// Class LinkedList<E> can be used to store a list of values of type E.
import java.util.*;

public class LinkedList<E extends Comparable<E>> {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        LinkedList<Integer> otherList = new LinkedList<>();
    System.out.println("e16q1");
    list.add(1);
    list.add(2);
    list.add(3);
    list.set(1, 10);
    System.out.println(list); 
    list.clear();

    System.out.println("e16q2");
    list.add(5);
    list.add(1);
    list.add(3);
    System.out.println(list.min()); 

    System.out.println("e16q3");
    list.clear();
    list.add(1);
    list.add(3);
    list.add(5);
    System.out.println(list.isSorted()); 
    list.add(2);
    System.out.println(list.isSorted()); 

    System.out.println("e16q4");
    list.clear();
    list.add(1);
    list.add(18);
    list.add(2);
    list.add(7);
    list.add(18);
    list.add(39);
    list.add(18);
    list.add(40);
    System.out.println(list.lastIndexOf(18)); 
    System.out.println(list.lastIndexOf(3)); 

    System.out.println("e16q5");
    list.clear();
    list.add(1);
    list.add(1);
    list.add(1);
    list.add(3);
    list.add(3);
    list.add(6);
    list.add(9);
    list.add(15);
    list.add(15);
    list.add(23);
    list.add(23);
    list.add(23);
    list.add(40);
    list.add(40);
    System.out.println(list.countDuplicates()); 

    System.out.println("e16q6");
    list.addAll(Arrays.asList(1, 18, 2, 7, 8, 39, 18, 40));
    System.out.println(list.hasTwoConsecutive());  // Expected: true
    list.clear();

    System.out.println("e16q7");
    list.addAll(Arrays.asList(1, 2, 3, 4, 5));
    System.out.println(list.deleteBack());  // Expected: 5
    System.out.println(list);  // Expected: [1, 2, 3, 4]
    list.clear();

    System.out.println("e16q8");
    list.addAll(Arrays.asList(10, 25, 31, 47, 52, 68, 77));
    list.switchPairs();
    System.out.println(list);  // Expected: [25, 10, 47, 31, 68, 52, 77]
    list.clear();

    System.out.println("e16q9");
    list.addAll(Arrays.asList(1, 8, 19, 4, 17));
    list.stutter();
    System.out.println(list);  
    list.clear();

    System.out.println("e16q10");
    list.addAll(Arrays.asList(18, 7, 4, 24, 11));
    list.stretch(3);
    System.out.println(list);  
    list.clear();

    System.out.println("e16q11");
    list.addAll(Arrays.asList(1, 7, 3, 9, 4, 6, 5));
    list.compress();
    System.out.println(list);  
    list.clear();

    System.out.println("e16q12");
    list.addAll(Arrays.asList(8, 7, -4, 19, 0, 43, -8, -7, 2));
    list.split();
    System.out.println(list);  
    list.clear();

    System.out.println("e16q13");
    list.addAll(Arrays.asList(1, 2, 3, 4));
    otherList.addAll(Arrays.asList(5, 6, 7, 8));
    list.transferFrom(otherList);
    System.out.println(list);  
    System.out.println(otherList);  
    list.clear();
    otherList.clear();

    System.out.println("e16q14");
    list.addAll(Arrays.asList(3, 9, 4, 2, 3, 8, 17, 4, 3, 18));
    list.removeAll(3);
    System.out.println(list);  
    list.clear();

    System.out.println("e16q15");
    list.addAll(Arrays.asList(1, 2, 3, 4));
    otherList.addAll(Arrays.asList(1, 2, 3, 4));
    System.out.println(list.equals(otherList)); 
    otherList.add(5);
    System.out.println(list.equals(otherList)); 
    list.clear();
    otherList.clear();

    System.out.println("e16q16");
    list.addAll(Arrays.asList(8, 13, 17, 4, 9, 12, 98, 41, 7, 23, 0, 92));
    otherList = list.removeEvens();
    System.out.println(list);  
    System.out.println(otherList);  

    // System.out.println("e16q17");
    // list.addAll(Arrays.asList(8, 13, 17, 4, 9, 12, 98, 41, 7, 23, 0, 92));
    // list.removeRange(3, 8);
    // System.out.println(list);  

    System.out.println("e16q18");
    list.addAll(Arrays.asList(1, 3, 2, 7));
    list.doubleList();
    System.out.println(list);  

    System.out.println("e16q19");
    list.addAll(Arrays.asList(8, 23, 19, 7, 45, 98, 102, 4));
    list.rotate();
    System.out.println(list); 

    System.out.println("e16q20");
    list.addAll(Arrays.asList(10, 31, 42, 23, 44, 75, 86));
    list.shift();
    System.out.println(list); 

    System.out.println("e16q21");
    list.addAll(Arrays.asList(0, 1, 2, 1));
    list.surroundWith(1, 4);
    System.out.println(list); 

    System.out.println("e16q22");
    list.addAll(Arrays.asList(1, 8, 19, 4, 17));
    list.reverse();
    System.out.println(list);  
    }
    private ListNode<E> front;  
    private ListNode<E> back;   
    private int size;
    
// Q22
public void reverse() {
    // Handle empty or single-element list cases
    if (front.next == back || front.next.next == back) {
        return; 
    }

    ListNode<E> current = front.next;
    ListNode<E> temp = null;

    while (current != back) {
        temp = current.next;
        current.next = current.prev;
        current.prev = temp;
        current = temp; 
    }

    temp = front.next;
    front.next = back.prev;
    front.next.next = back;
    front.next.prev = front;
    
    back.prev = temp.prev;
    back.prev.prev = front;
    back.prev.next = back;
}

// Q21
public void surroundWith(E x, E y) {
    ListNode<E> current = front.next;
    while (current != back) {
        if (current.data.equals(x)) {
            ListNode<E> prevNode = new ListNode<>(y, current, current.prev);
            ListNode<E> nextNode = new ListNode<>(y, current.next, current);

            current.prev.next = prevNode;
            current.next.prev = nextNode;
            current.prev = prevNode;
            current.next = nextNode;

            current = nextNode.next; 
        } else {
            current = current.next;
        }
    }
}
// Q20
public void shift() {
    ListNode<E> current = front.next, end = back;
    int count = 0;
    while (current != end && current.next != end) {
        ListNode<E> temp = current.next;
        current.next = temp.next;
        temp.next.prev = current;

        temp.next = back;
        temp.prev = back.prev;
        back.prev.next = temp;
        back.prev = temp;

        current = current.next;
        count++;
    }
}



// Q19
public void rotate() {
    if (size > 1) {
        ListNode<E> oldFront = front.next;
        front.next = oldFront.next;
        oldFront.next.prev = front;
        oldFront.prev = back.prev;
        back.prev.next = oldFront;
        back.prev = oldFront;
        oldFront.next = back;
    }
}

// Q18
public void doubleList() {
    ListNode<E> current = front.next, end = back.prev;
    while (current != back) {
        ListNode<E> newNode = new ListNode<>(current.data, current.next, current);
        current.next.prev = newNode;
        current.next = newNode;
        if (current == end) break;
        current = newNode.next;
    }
}
// Q17
public void removeRange(int start, int end) {
    if (start < 0 || end >= size || start > end) {
        throw new IllegalArgumentException("Invalid range.");
    }
    
    System.out.println("Fetching start node...");
    ListNode<E> startNodePrev = (start > 0) ? nodeAt(start - 1) : front;
    System.out.println("Fetching end node...");
    ListNode<E> endNodeNext = nodeAt(end + 1);
    
    if (startNodePrev == null || endNodeNext == null) {
        throw new IllegalStateException("Invalid list state.");
    }

    System.out.println("Linking nodes...");
    startNodePrev.next = endNodeNext;
    endNodeNext.prev = startNodePrev;

    size -= (end - start + 1);
}

// Q16
public LinkedList<E> removeEvens() {
    LinkedList<E> evenList = new LinkedList<>();
    ListNode<E> current = front.next;

    while (current != back) {
        evenList.add(current.data);
        if (current.next != back) {
            current.next = current.next.next;
        }
        current = current.next;
    }

    return evenList;
}
    // Q15
public boolean equals(LinkedList<E> other) {
    if (this.size != other.size) {
        return false;
    }
    
    ListNode<E> currentThis = this.front.next;
    ListNode<E> currentOther = other.front.next;
    
    while (currentThis != back && currentOther != other.back) {
        if (!currentThis.data.equals(currentOther.data)) {
            return false;
        }
        currentThis = currentThis.next;
        currentOther = currentOther.next;
    }
    
    return true;
}

// Q14: removeAll method
public void removeAll(E value) {
    ListNode<E> current = front.next;
    
    while (current != back) {
        if (current.data.equals(value)) {
            current.prev.next = current.next;
            current.next.prev = current.prev;
            size--;
        }
        current = current.next;
    }
}

// Q13: transferFrom method
public void transferFrom(LinkedList<E> other) {
    this.back.prev.next = other.front.next;
    other.front.next.prev = this.back.prev;
    
    this.back = other.back;
    other.front.next = other.back;
    other.back.prev = other.front;
    other.size = 0;
    this.size += other.size;
}

// Q12
public void split() {
    ListNode<E> current = front.next;
    ListNode<E> lastNeg = front;
    
    while (current != back) {
        if ((int) current.data < 0) {
            current.prev.next = current.next;
            current.next.prev = current.prev;
            
            lastNeg.next.prev = current;
            current.next = lastNeg.next;
            
            current.prev = lastNeg;
            lastNeg.next = current;
            
            lastNeg = current;
            
            current = current.next.next;
        } else {
            current = current.next;
        }
    }
}

// Q11
public void compress() {
    ListNode<E> current = front.next;
    
    while (current != null && current.next != back) {
        current.data = (E) new Integer((int) current.data + (int) current.next.data);
        
        current.next = current.next.next;
        current.next.prev = current;
        size--;
        
        current = current.next;
    }
}

public void stretch(int n) {
    if (n <= 0) {
        clear();
        return;
    }

    ListNode<E> current = front.next;
    while (current != back) {
        for (int i = 1; i < n; i++) {
            ListNode<E> node = new ListNode<>(current.data, current.next, current);
            current.next.prev = node;
            current.next = node;
            size++;
            current = node; 
        }
        current = current.next; 
    }
}
public void stutter() {
    ListNode<E> current = front.next;
    while (current != back) {
        ListNode<E> node = new ListNode<>(current.data, current.next, current);
        current.next.prev = node;
        current.next = node;
        size++;
        
        current = current.next.next;
    }
}

// Q8: switchPairs method
public void switchPairs() {
    ListNode<E> current = front.next;
    while (current != null && current.next != back) {
        E temp = current.data;
        current.data = current.next.data;
        current.next.data = temp;
        
        current = current.next.next;
    }
}

// Q7: deleteBack method
public E deleteBack() {
    if (isEmpty()) {
        throw new NoSuchElementException();
    }
    E deletedValue = back.prev.data;
    back.prev = back.prev.prev;
    back.prev.next = back;
    size--;
    return deletedValue;
}

// Q6
public boolean hasTwoConsecutive() {
    ListNode<E> current = front.next;
    while (current != null && current.next != back) {
        if ((int) current.data + 1 == (int) current.next.data) {
            return true;
        }
        current = current.next;
    }
    return false;
}

    // Q5
    public int countDuplicates() {
        if (isEmpty()) {
            return 0;
        }
        int duplicates = 0;
        ListNode<E> current = front.next;
        while (current.next != back) {
            if (current.data.equals(current.next.data)) {
                duplicates++;
            }
            current = current.next;
        }
        return duplicates;
    }
 // Q4
    public int lastIndexOf(E value) {
        int lastIndex = -1;
        int currentIndex = 0;
        ListNode<E> current = front.next;
        while (current != back) {
            if (current.data.equals(value)) {
                lastIndex = currentIndex;
            }
            current = current.next;
            currentIndex++;
        }
        return lastIndex;
    }
    // Q3
    public boolean isSorted() {
        ListNode<E> current = front.next;
        while (current.next != back) {
            if (current.data.compareTo(current.next.data) > 0) {
                return false;
            }
            current = current.next;
        }
        return true;
    }

    //Q2
    public E min() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        E minValue = front.next.data;
        ListNode<E> current = front.next;
        while (current != back) {
            if (current.data.compareTo(minValue) < 0) {
                minValue = current.data;
            }
            current = current.next;
        }
        return minValue;
    }
    //Q1
    public void set(int index, E value) {
        checkIndex(index);
        ListNode<E> current = nodeAt(index);
        current.data = value;
    }

    // post: constructs an empty list
    public LinkedList() {
        front = new ListNode<E>(null);
        back = new ListNode<E>(null);
        clear();
    }

    // post: returns the current number of elements in the list
    public int size() {
        return size;
    }

    // pre : 0 <= index < size() (throws IndexOutOfBoundsException if not)
    // post: returns the value at the given index in the list
    public E get(int index) {
        checkIndex(index);
        ListNode<E> current = nodeAt(index);
        return current.data;
    }

    // post: creates a comma-separated, bracketed version of the list
    public String toString() {
        if (size == 0) {
            return "[]";
        } else {
            String result = "[" + front.next.data;
            ListNode<E> current = front.next.next;
            while (current != back) {
                result += ", " + current.data;
                current = current.next;
            }
            result += "]";
            return result;
        }
    }

    // post : returns the position of the first occurrence of the given
    //        value (-1 if not found)
    public int indexOf(E value) {
        int index = 0;
        ListNode<E> current = front.next;
        while (current !=  back) {
            if (current.data.equals(value)) {
                return index;
            }
            index++;
            current = current.next;
        }
        return -1;
    }

    // post: returns true if list is empty, false otherwise
    public boolean isEmpty() {
        return size == 0;
    }

    // post: returns true if the given value is contained in the list,
    //       false otherwise
    public boolean contains(E value) {
        return indexOf(value) >= 0;
    }

    // post: appends the given value to the end of the list
    public void add(E value) {
        add(size, value);
    }

    // pre: 0 <= index <= size() (throws IndexOutOfBoundsException if not)
    // post: inserts the given value at the given index, shifting subsequent
    //       values right
    public void add(int index, E value) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("index: " + index);
        }
        ListNode<E> current = nodeAt(index - 1);
        ListNode<E> newNode = new ListNode<E>(value, current.next, current);
        current.next = newNode;
        newNode.next.prev = newNode;
        size++;
    }

    // post: appends all values in the given list to the end of this list
    public void addAll(List<E> other) {
        for (E value: other) {
            add(value);
        }
    }

    // pre : 0 <= index < size() (throws IndexOutOfBoundsException if not)
    // post: removes value at the given index, shifting subsequent values left
    public void remove(int index) {
        checkIndex(index);
        ListNode<E> current = nodeAt(index - 1);
        current.next = current.next.next;
        current.next.prev = current;
        size--;
    }

    // pre : 0 <= index < size() (throws IndexOutOfBoundsException if not)
    // post: replaces the value at the given index with the given value
  

    // post: list is empty
    public void clear() {
        front.next = back;
        back.prev = front;
        size = 0;
    }

    // post: returns an iterator for this list
    public Iterator<E> iterator() {
        return new LinkedIterator();
    }

    // pre : 0 <= index < size()
    // post: returns the node at a specific index.  Uses the fact that the list
    //       is doubly-linked to start from the front or the back, whichever
    //       is closer.
    private ListNode<E> nodeAt(int index) {
        ListNode<E> current;
        if (index < size / 2) {
            current = front;
            for (int i = 0; i < index + 1; i++) {
                current = current.next;
            }
        } else {
            current = back;
            for (int i = size; i >= index + 1; i--) {
                current = current.prev;
            }
        }
        return current;
    }

    // post: throws an IndexOutOfBoundsException if the given index is
    //       not a legal index of the current list
    private void checkIndex(int index) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException("index: " + index);
        }
    }

    private static class ListNode<E> {
        public E data;         // data stored in this node
        public ListNode<E> next;  // link to next node in the list
        public ListNode<E> prev;  // link to previous node in the list

        // post: constructs a node with given data and null links
        public ListNode(E data) {
            this(data, null, null);
        }

        // post: constructs a node with given data and given links
        public ListNode(E data, ListNode<E> next, ListNode<E> prev) {
            this.data = data;
            this.next = next;
            this.prev = prev;
        }
    }

    private class LinkedIterator implements Iterator<E> {
        private ListNode<E> current;  // location of next value to return
        private boolean removeOK;  // whether it's okay to remove now

        // post: constructs an iterator for the given list
        public LinkedIterator() {
            current = front.next;
            removeOK = false;
        }

        // post: returns true if there are more elements left, false otherwise
        public boolean hasNext() {
            return current != back;
        }

        // pre : hasNext()
        // post: returns the next element in the iteration
        public E next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            E result = current.data;
            current = current.next;
            removeOK = true;
            return result;
        }

        // pre : next() has been called without a call on remove (i.e., at most
        //       one call per call on next)
        // post: removes the last element returned by the iterator
        public void remove() {
            if (!removeOK) {
                throw new IllegalStateException();
            }
            ListNode<E> prev2 = current.prev.prev;
            prev2.next = current;
            current.prev = prev2;
            size--;
            removeOK = false;
        }
    }
}
