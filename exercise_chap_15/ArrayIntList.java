import java.util.NoSuchElementException;

public class ArrayIntList { public static void main(String[] args) {
        System.out.println("e15q1");
        ArrayIntList list = new ArrayIntList();
        list.add(1);
        list.add(18);
        list.add(2);
        list.add(7);
        list.add(18);
        list.add(39);
        list.add(18);
        list.add(40);
        list.print();

        int target = 18;
        int lastIndex = list.lastIndexOf(target);
        System.out.println("Last index of " + target + " is " + lastIndex);

        target = 3;
        lastIndex = list.lastIndexOf(target);
        System.out.println("Last index of " + target + " is " + lastIndex);
        System.out.println("e15q2");

        ArrayIntList list1 = new ArrayIntList();
    list1.add(11);
    list1.add(-7);
    list1.add(3);
    list1.add(42);
    list1.add(0);
    list1.add(14);

    ArrayIntList list2 = new ArrayIntList();
    list2.add(3);
    list2.add(42);
    list2.add(0);


    System.out.println(list1.indexOfSubList(list2));


    System.out.println("e15q3");

    ArrayIntList list3 = new ArrayIntList();
    list3.add(11);
    list3.add(-7);
    list3.add(3);
    list3.add(42);
    list3.add(3);
    list3.add(0);
    list3.add(14);
    list3.add(3);
    list3.print();

    list3.replaceAll(3, 999);

    list3.print();
    System.out.println("e15q4");
    ArrayIntList list4 = new ArrayIntList();
    list4.add(11);
    list4.add(-7);
    list4.add(3);
    list4.add(42);
    list4.add(0);
    list4.add(14);
    list4.add(56);
    list4.print();  
    list4.reverse();
    list4.print(); 

    System.out.println("e15q5");
    ArrayIntList list5 = new ArrayIntList();
    list5.add(2);
    list5.add(3);
    list5.add(5);
    list5.add(4);
    list5.add(7);
    list5.add(15);
    list5.add(20);
    list5.add(7);
    list5.print();  

    ArrayIntList list5_2 = list5.runningTotal();
    list5_2.print();
    System.out.println("e15q6");
    ArrayIntList list6 = new ArrayIntList();
    list6.add(42);
    list6.add(-7);
    list6.add(3);
    list6.add(0);
    list6.add(15);
    list6.fill(2);
    list6.print();  

    
    System.out.println("e15q7");
    ArrayIntList list7 = new ArrayIntList();
    list7.add(3);
    list7.add(8);
    list7.add(2);
    list7.add(5);
    list7.add(19);
    list7.add(24);
    list7.add(-3);
    list7.add(0);
    list7.add(4);
    list7.add(4);
    list7.add(8);
    list7.add(205);
    list7.add(42);
    System.out.println(list7.isPairwiseSorted()); 

    ArrayIntList list7b = new ArrayIntList();
    list7b.add(7);
    list7b.add(42);
    list7b.add(308);
    list7b.add(409);
    list7b.add(19);
    list7b.add(17);
    list7b.add(2);
    System.out.println(list7b.isPairwiseSorted());  

 System.out.println("e15q8");
    ArrayIntList list8 = new ArrayIntList();
    list8.add(2);
    list8.add(-3);
    list8.add(2);
    list8.add(0);
    list8.add(5);
    list8.add(2);
    list8.add(2);
    list8.add(6);
    System.out.println(list8.count(2));  
    System.out.println("e15q9");
    ArrayIntList list9 = new ArrayIntList();
    list9.add(1);
    list9.add(3);
    list9.add(4);
    list9.add(7);
    list9.add(7);
    list9.add(7);
    list9.add(7);
    list9.add(9);
    list9.add(9);
    list9.add(11);
    list9.add(13);
    list9.add(14);
    list9.add(14);
    list9.add(14);
    list9.add(16);
    list9.add(16);
    list9.add(18);
    list9.add(19);
    list9.add(19);
    list9.add(19);
    System.out.println(list9.maxCount());  

    System.out.println("e15q10");
    ArrayIntList list10 = new ArrayIntList();
    list10.add(1);
    list10.add(3);
    list10.add(5);
    list10.add(2);
    list10.add(9);
    list10.add(7);
    list10.add(-3);
    list10.add(0);
    list10.add(42);
    list10.add(308);
    list10.add(17);
    System.out.println(list10.longestSortedSequence());  

    System.out.println("e15q11");
    ArrayIntList list11 = new ArrayIntList();
    list11.add(8);
    list11.add(17);
    list11.add(42);
    list11.add(3);
    list11.add(8);
    System.out.println(list11.removeLast());  
    list11.print();  

    System.out.println("e15q12");
    ArrayIntList list12 = new ArrayIntList();
    list12.add(8);
    list12.add(17);
    list12.add(9);
    list12.add(24);
    list12.add(42);
    list12.add(3);
    list12.add(8);
    list12.removeFront(4);
    list12.print(); 

    System.out.println("e15q13");
    ArrayIntList list13 = new ArrayIntList();
    list13.add(2);
    list13.add(4);
    list13.add(2);
    list13.add(2);
    list13.add(3);
    list13.add(2);
    list13.removeAll(2);
    list13.print();  

    System.out.println("e15q14");
    ArrayIntList list14 = new ArrayIntList();
    list14.add(4);
    list14.add(3);
    list14.add(2);
    list14.add(1);
    list14.printInversions();
 
 
    System.out.println("e15q15");
    ArrayIntList list15 = new ArrayIntList();
    list15.add(1);
    list15.add(3);
    list15.add(2);
    list15.add(7);
    list15.mirror();
    list15.print();  
 
    System.out.println("e15q16");
    ArrayIntList list16 = new ArrayIntList();
    list16.add(42);
    list16.add(7);
    list16.add(0);
    list16.add(-3);
    list16.add(15);
    list16.stutter();
    list16.print();  

    System.out.println("e15q17");
    ArrayIntList list17 = new ArrayIntList();
    list17.add(18);
    list17.add(7);
    list17.add(4);
    list17.add(24);
    list17.add(11);
    list17.stretch(3);
    list17.print(); 
 
    System.out.println("e15q18");
    ArrayIntList list18 = new ArrayIntList();
    list18.add(1);
    list18.add(8);
    list18.add(2);
    list18.add(7);
    list18.doubleList();
    list18.print();  

    System.out.println("e15q19");
    ArrayIntList list19 = new ArrayIntList();
    list19.add(1);
    list19.add(7);
    list19.add(3);
    list19.add(9);
    list19.add(4);
    list19.add(6);
    list19.add(5);
    list19.compress();
    list19.print();  

    System.out.println("e15q20");
    ArrayIntList list20 = new ArrayIntList();
    list20.add(8);
    list20.add(23);
    list20.add(19);
    list20.add(7);
    list20.add(12);
    list20.add(4);
    list20.rotate();
    list20.print();  

    System.out.println("e15q21");
    ArrayIntList list21 = new ArrayIntList();
    list21.add(10);
    list21.add(25);
    list21.add(31);
    list21.add(47);
    list21.add(52);
    list21.add(68);
    list21.add(77);
    list21.switchPairs();
    list21.print(); 


    System.out.println("e15q22");

    ArrayIntList list22 = new ArrayIntList();
    list22.add(5);
    list22.add(2);
    list22.add(2);
    list22.add(-5);
    list22.add(4);
    list22.add(3);
    list22.add(2);
    list22.add(4);
    list22.add(1);
    list22.add(1);
    list22.add(1);
    list22.add(0);
    list22.add(2);
    list22.add(17);
    
    ArrayIntList list22b = list22.fromCounts();
    list22b.print(); 


    }

public ArrayIntList fromCounts() {
        ArrayIntList result = new ArrayIntList();
        
        for (int i = 0; i < size - 1; i += 2) {
            int count = elementData[i];
            int value = elementData[i + 1];
    
            for (int j = 0; j < count; j++) {
                result.add(value);
            }
        }
        
        return result;
    }
public void switchPairs() {
    for (int i = 0; i < size - 1; i += 2) {
        int temp = elementData[i];
        elementData[i] = elementData[i + 1];
        elementData[i + 1] = temp;
    }
}

public void rotate() {
    if (size > 0) {
        int first = elementData[0];
        for (int i = 0; i < size - 1; i++) {
            elementData[i] = elementData[i + 1];
        }
        elementData[size - 1] = first;
    }
}

public void compress() {
    int newSize = (size + 1) / 2;
    for (int i = 0; i < newSize; i++) {
        elementData[i] = elementData[2 * i] + (2 * i + 1 < size ? elementData[2 * i + 1] : 0);
    }
    size = newSize;
}

public void doubleList() {
    int originalSize = size;
    for (int i = 0; i < originalSize; i++) {
        add(elementData[i]);
    }
}

public void stretch(int n) {
    if (n <= 0) {
        size = 0;
        return;
    }
    int originalSize = size;
    size *= n;
    for (int i = originalSize - 1; i >= 0; i--) {
        for (int j = 0; j < n; j++) {
            elementData[i * n + j] = elementData[i];
        }
    }
}

public void stutter() {
    int originalSize = size;
    size *= 2;
    for (int i = originalSize - 1; i >= 0; i--) {
        elementData[2 * i] = elementData[i];
        elementData[2 * i + 1] = elementData[i];
    }
}

public void mirror() {
    for (int i = size - 1; i >= 0; i--) {
        add(elementData[i]);
    }
}

public void printInversions() {
    for (int i = 0; i < size - 1; i++) {
        for (int j = i + 1; j < size; j++) {
            if (elementData[i] > elementData[j]) {
                System.out.println("(" + elementData[i] + ", " + elementData[j] + ")");
            }
        }
    }
}

public void removeAll(int value) {
    int j = 0;
    for (int i = 0; i < size; i++) {
        if (elementData[i] != value) {
            elementData[j] = elementData[i];
            j++;
        }
    }
    size = j;
}

public void removeFront(int n) {
    for (int i = 0; i < size - n; i++) {
        elementData[i] = elementData[i + n];
    }
    size -= n;
    if (size < 0) {
        size = 0;
    }
}

public int removeLast() {
    if (size == 0) {
        throw new NoSuchElementException("List is empty.");
    }
    int lastValue = elementData[size - 1];
    size--;
    return lastValue;
}

public int longestSortedSequence() {
    if (size == 0) {
        return 0;
    }

    int maxLength = 1;
    int currentLength = 1;
    for (int i = 1; i < size; i++) {
        if (elementData[i] >= elementData[i - 1]) {
            currentLength++;
            maxLength = Math.max(maxLength, currentLength);
        } else {
            currentLength = 1;
        }
    }
    return maxLength;
}

public int maxCount() {
    if (size == 0) {
        return 0;
    }

    int maxCount = 1;
    int currentCount = 1;
    for (int i = 1; i < size; i++) {
        if (elementData[i] == elementData[i - 1]) {
            currentCount++;
            maxCount = Math.max(maxCount, currentCount);
        } else {
            currentCount = 1;
        }
    }
    return maxCount;
}

public int count(int value) {
    int count = 0;
    for (int i = 0; i < size; i++) {
        if (elementData[i] == value) {
            count++;
        }
    }
    return count;
}

public boolean isPairwiseSorted() {
    for (int i = 0; i < size - 1; i += 2) {
        if (elementData[i] > elementData[i + 1]) {
            return false;
        }
    }
    return true;
}

public void fill(int value) {
    for (int i = 0; i < size; i++) {
        elementData[i] = value;
    }
}
        private int[] elementData;
    private int size;
    public ArrayIntList(int capacity) {
        elementData = new int[capacity];
        size = 0;
    }
    public ArrayIntList runningTotal() {
        ArrayIntList result = new ArrayIntList(elementData.length);  
        int sum = 0;  // running sum
    
        for (int i = 0; i < size; i++) {
            sum += elementData[i];
            result.add(sum);
        }

        return result;
    }
    public void reverse() {
        for (int i = 0; i < size / 2; i++) {
            int temp = elementData[i];
            elementData[i] = elementData[size - 1 - i];
            elementData[size - 1 - i] = temp;
        }
    }

    public void replaceAll(int n1, int n2) {
        for (int i = 0; i < size; i++) {
            if (elementData[i] == n1){
                elementData[i] = n2;
            }
        }
    }

    public int indexOfSubList(ArrayIntList L) {
        if (L.size == 0) {
            return 0;
        }
    
        for (int i = 0; i <= this.size - L.size; i++) {
            boolean found = true;
            for (int j = 0; j < L.size; j++) {
                if (this.elementData[i + j] != L.elementData[j]) {
                    found = false;
                    break;
                }
            }
            if (found) {
                return i; 
            }
        }
    
        return -1; 
    }


    public ArrayIntList() {
        elementData = new int[100];
        size = 0;
    }

    public void add(int value) {
        elementData[size] = value;
        size++;
    }

    public void print() {
        if (size == 0) {
            System.out.println("[]");
        } else {
            System.out.print("[" + elementData[0]);
            for (int i = 1; i < size; i++)
                System.out.print(", " + elementData[i]);
            System.out.println("]");
        }
    }

    public int lastIndexOf(int n) {
        for (int i = size - 1; i >= 0; i--) {
            if (elementData[i] == n) {
                return i; 
            }
        }
        return -1; 
    }

 

}