// Implements a set of integers using a hash table.
// The hash table uses separate chaining to resolve collisions.

import java.util.PriorityQueue;
import java.util.Stack;

public class HashIntSet {
    public static void main(String[] args) {
        
        System.out.println("e18q1");
        HashIntSet set1 = new HashIntSet();
        set1.add(-5);
        set1.add(1);
        set1.add(2);
        set1.add(3);

        System.out.println(set1); 
        
  
        
        HashIntSet set1b = new HashIntSet();
        set1b.add(2);
        set1b.add(3);
        set1b.add(6);
        set1b.add(44);
        set1b.add(79);
        System.out.println(set1b); 

        set1.addAll(set1b);
        System.out.println(set1);
        
        System.out.println("e18q2");
        HashIntSet set2 = new HashIntSet();
        set2.add(-2);
        set2.add(3);
          set2.add(5);
        set2.add(6);
          set2.add(8);
            HashIntSet set2b = new HashIntSet();
        set2b.add(3);
        set2b.add(6);
          set2b.add(8);
        System.out.println(set2.containsAll(set2b)); 
          HashIntSet set2c = new HashIntSet();
        set2c.add(3);
        set2c.add(6);
          set2c.add(7);
        set2c.add(8);
        System.out.println(set2.containsAll(set2c)); 

        System.out.println("e18q3");
        HashIntSet set3 = new HashIntSet();
        set3.add(-3);
        set3.add(8);
        set3.add(1);
        set3.add(2);
        set3.add(3);

        HashIntSet set3b = new HashIntSet();
        set3b.add(-3);
        set3b.add(8);
        set3b.add(2);
        set3b.add(1);
        set3b.add(3);
        System.out.println(set3.equals(set3b)); 

        System.out.println("e18q4");
        HashIntSet set4 = new HashIntSet();
        set4.add(-2);
        set4.add(3);
        set4.add(5);
                set4.add(6);
        set4.add(8);

           HashIntSet set4b = new HashIntSet();
        set4b.add(2);
        set4b.add(3);
        set4b.add(6);
        set4b.add(8);
        set4b.add(11);

        set4.removeAll(set4b);
        System.out.println(set4); 
        System.out.println("e18q5");
HashIntSet set5a = new HashIntSet();
set5a.add(-2);
set5a.add(3);
set5a.add(5);
set5a.add(6);
set5a.add(8);

HashIntSet set5b = new HashIntSet();
set5b.add(2);
set5b.add(3);
set5b.add(6);
set5b.add(8);
set5b.add(11);

set5a.retainAll(set5b);
System.out.println(set5a); 

        System.out.println("e18q6");
HashIntSet set6a = new HashIntSet();
set6a.add(1);
set6a.add(5);
set6a.add(8);
set6a.add(10);

int[] array6a = set6a.toArray();
for (int i : array6a) {
    System.out.print(i + " "); 
}
System.out.println();
    
System.out.println("e18q7");
     HashIntSet set7a = new HashIntSet();
     set7a.add(-2);
     set7a.add(3);
     set7a.add(5);
     set7a.add(6);
     set7a.add(8);
     
     String output7a = set7a.toString();
     System.out.println(output7a); 
 }

 
   //q7
   public String toString() {
       StringBuilder result = new StringBuilder("[");
       boolean first = true; 
   
       for (int i = 0; i < elementData.length; i++) {
           HashEntry current = elementData[i];
           while (current != null) {
               if (!first) {
                   result.append(", ");
               }
               result.append(current.data);
               first = false;  
               current = current.next;
           }
       }
       result.append("]");
       return result.toString();
   }
   
    // q6
    public int[] toArray() {
        int[] result = new int[size];
        int index = 0;
        for (int i = 0; i < elementData.length; i++) {
            HashEntry current = elementData[i];
            while (current != null) {
                result[index] = current.data;
                index++;
                current = current.next;
            }
        }
        return result;
    }
      public void retainAll(HashIntSet other) {
        for (int i = 0; i < elementData.length; i++) {
            HashEntry prev = null;
            HashEntry current = elementData[i];
            while (current != null) {
                if (!other.contains(current.data)) {
                    if (prev == null) {
                        elementData[i] = current.next;
                    } else {
                        prev.next = current.next;
                    }
                    size--;
                } else {
                    prev = current;
                }
                current = current.next;
            }
        }
    }


public void removeAll(HashIntSet other) {
    for (int i = 0; i < other.elementData.length; i++) {
        HashEntry current = other.elementData[i];
        while (current != null) {
            this.remove(current.data);
            current = current.next;
        }
    }
}
public boolean equals(HashIntSet other) {
    if (this.size != other.size) {
        return false;
    }

    return this.containsAll(other);
}
public boolean containsAll(HashIntSet other) {
    for (int i = 0; i < other.elementData.length; i++) {
        HashEntry current = other.elementData[i];
        while (current != null) {
            if (!this.contains(current.data)) {
                return false;
            }
            current = current.next;
        }
    }
    return true;
}
  // 1. addAll method
  public void addAll(HashIntSet other) {
    for (int i = 0; i < other.elementData.length; i++) {
        HashEntry current = other.elementData[i];
        while (current != null) {
            this.add(current.data);
            current = current.next;
        }
    }
}


    ///////////////////////////////////////////////////////////////////////
    private static final double MAX_LOAD_FACTOR = 0.75;
    private HashEntry[] elementData;
    private int size;
    
    public HashIntSet() {
        elementData = new HashEntry[10];
        size = 0;
    }
    

    public void add(int value) {
        if (!contains(value)) {
            if (loadFactor() >= MAX_LOAD_FACTOR) {
                rehash();
            }
            
            int bucket = hashFunction(value);
            elementData[bucket] = new HashEntry(value, elementData[bucket]);
            size++;
        }
    }
    
    public void clear() {
        for (int i = 0; i < elementData.length; i++) {
            elementData[i] = null;
        }
        size = 0;
    }
    
    public boolean contains(int value) {
        int bucket = hashFunction(value);
        HashEntry current = elementData[bucket];
        while (current != null) {
            if (current.data == value) {
                return true;
            }
            current = current.next;
        }
        return false;
    }
    
    public boolean isEmpty() {
        return size == 0;
    }
    
 
    public void remove(int value) {
        int bucket = hashFunction(value);
        if (elementData[bucket] != null) {
            // check front of list
            if (elementData[bucket].data == value) {
                elementData[bucket] = elementData[bucket].next;
                size--;
            } else {
                // check rest of list
                HashEntry current = elementData[bucket];
                while (current.next != null && current.next.data != value) {
                    current = current.next;
                }
                
                // if the element is found, remove it
                if (current.next != null && current.next.data == value) {
					current.next = current.next.next;
					size--;
				}
            }
        }
    }
    
    // Returns the number of elements in the queue.
    public int size() {
        return size;
    }
    
    // Returns a string representation of this queue, such as "[10, 20, 30]";
    // // The elements are not guaranteed to be listed in sorted order.
    // public String toString() {
    //     String result = "[";
    //     boolean first = true;
    //     if (!isEmpty()) {
    //         for (int i = 0; i < elementData.length; i++) {
    //             HashEntry current = elementData[i];
    //             while (current != null) {
    //                 if (!first) {
    //                     result += ", ";
    //                 }
    //                 result += current.data;
    //                 first = false;
    //                 current = current.next;
    //             }
    //         }
    //     }
    //     return result + "]";
    // }
    
    
    // Returns the preferred hash bucket index for the given value.
private int hashFunction(int value) {
return Math.abs(value) % elementData.length;
}
    
    private double loadFactor() {
        return (double) size / elementData.length;
    }
    
    private void rehash() {
        HashEntry[] oldElementData = elementData;
        elementData = new HashEntry[2 * oldElementData.length];
        size = 0;

        for (int i = 0; i < oldElementData.length; i++) {
            HashEntry current = oldElementData[i];
            while (current != null) {
                add(current.data);
                current = current.next;
            }
        }
    }
    
    private class HashEntry {
        public int data;
        public HashEntry next;

        public HashEntry(int data) {
            this(data, null);
        }

        public HashEntry(int data, HashEntry next) {
            this.data = data;
            this.next = next;
        }
    }
}
