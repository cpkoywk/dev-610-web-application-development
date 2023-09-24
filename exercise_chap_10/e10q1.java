//e10q1 to e10q18
import java.util.ArrayList;
import java.util.Collections;

public class e10q1 {
    public static double averageVowels(ArrayList<String> strings) {
        int totalVowels = 0;
        int totalStrings = strings.size();

        for (String str : strings) {
            str = str.toLowerCase();

            // Count the number of vowels in the current string
            int vowelCount = 0;
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowelCount++;
                }
            }

            totalVowels += vowelCount;
        }

        if (totalStrings == 0) {
            return 0.0;
        } else {
            return (double) totalVowels / totalStrings;
        }
    }
        public static void swapPairs(ArrayList<String> strings) {
            int size = strings.size();
            for (int i = 0; i < size - 1; i += 2) {
                // Swap the values at index i and i+1
                String temp = strings.get(i);
                strings.set(i, strings.get(i + 1));
                strings.set(i + 1, temp);
            }
        }
        public static void removeEvenLength(ArrayList<String> strings) {
            ArrayList<String> toRemove = new ArrayList<>();
            for (String str : strings) {
                if (str.length() % 2 == 0) {
                    toRemove.add(str);
                }
            }
        
            strings.removeAll(toRemove);
        }


    public static void doubleList(ArrayList<String> strings) {
            int size = strings.size();
            for (int i = size-1; i>=0; i--) {
                String tmp = strings.get(i);
                strings.add(i+1, tmp);
                }
            }

     public static void scaleByK(ArrayList<Integer> integers) {
                int i = 0;
                
                while (i < integers.size()) {
                    int current = integers.get(i);
                    
                    // Remove zero and negative numbers
                    if (current <= 0) {
                        integers.remove(i);
                    } else {
                        // Insert k copies of the current integer
                        for (int j = 1; j < current; j++) {
                            integers.add(i, current);
                        }
                        i += current;
                    }
                }
            }
// e10q6
    public static void minToFront(ArrayList<Integer> integers) {
                int smallest = integers.get(0);
                int smallestIndex = 0;
        
                for (int i = 1; i < integers.size(); i++) {
                    int current = integers.get(i);
                    if (current < smallest) {
                        smallest = current;
                        smallestIndex = i;
                    }
                }
        
                integers.remove(smallestIndex);
                integers.add(0, smallest);
            }
// e10q7
    public static void removeDuplicates(ArrayList<String> strings) {
                Collections.sort(strings);
                if (strings.isEmpty()) {
                    return; 
                }
                for (int i = 1; i < strings.size(); i++) {
                    // Compare the current element with the previous one
                    if (strings.get(i).equals(strings.get(i - 1))) {
                        strings.remove(i);
                    }
                }
            }
// e10q8
    public static void removeZeroes(ArrayList<Integer> integers) {
        int i = 0;
        while (i < integers.size()) {
                    if (integers.get(i)==0) {
                        integers.remove(i);
                    }else{
                        i++;
                    }
                }
            }

// e10q9
    public static int rangeBetweenZeroes(ArrayList<Integer> integers) {
        int ind1=Integer.MAX_VALUE;
        int ind2=Integer.MIN_VALUE;
        for (int i = 0; i < integers.size(); i++) {
            if (integers.get(i)==0&&i<=ind1) {
                ind1=i;
            }else if(integers.get(i)==0&&i>=ind2){
                ind2=i;
            }
        }
        return ind2-ind1+1;
        }

// e10q10
    public static void removeInRange(ArrayList<String> strings,String beginningString,String endingString) {
            ArrayList<String> copyList = new ArrayList<>(strings);
            for (String str : copyList) {
                if (str.compareTo(beginningString) >= 0 && str.compareTo(endingString) <= 0) {
                    strings.remove(str);
                }
            }
        }
// e10q11
public static void stutter(ArrayList<String> strings, int k) {
    if (k <= 0) {
        strings.clear(); 
    } else {
        int originalSize = strings.size();
        for (int i = 0; i < originalSize; i++) {
            String currentString = strings.get(i);
            for (int j = 1; j < k; j++) {
                strings.add(i + j, currentString); 
            }
            i = i+(k - 1); 
            originalSize = strings.size(); 
        }
    }
}

// e10q12
    public static void markLength4(ArrayList<String> strings) {
        ArrayList<String> newList = new ArrayList<>();
        for (String str : strings) {
            if (str.length() == 4) {
                newList.add("****");
            }
            newList.add(str);
        }
        strings.clear();
        strings.addAll(newList);
    }

// e10q13
    public static void reverse3(ArrayList<Integer> list) {
        int size = list.size();
        int numGroups = size / 3;

        for (int i = 0; i < numGroups; i++) {
            int startIndex = i * 3;
            int endIndex = startIndex + 2;
            
            while (startIndex < endIndex) {
                int temp = list.get(startIndex);
                list.set(startIndex, list.get(endIndex));
                list.set(endIndex, temp);
                startIndex++;
                endIndex--;
            }
        }
    }
// e10q14
public static void removeShorterStrings(ArrayList<String> strings) {
    int index = 0;

    while (index < strings.size() - 1) {
        String firstString = strings.get(index);
        String secondString = strings.get(index + 1);

        if (firstString.length() <= secondString.length()) {
            strings.remove(index);
        } else {
            strings.remove(index + 1);
        }
        index++;
    }
}

// e10q15
public static void filterRange(ArrayList<Integer> integers, int min,int max) {
        ArrayList<Integer> newList = new ArrayList<>();
        for (Integer num : integers) {
            if (num<min||num>max) {
                newList.add(num);
            }
        }
        integers.clear();
        integers.addAll(newList);
}


// e10q16
public static void clump(ArrayList<String> strings) {
    int index = 0;
    ArrayList<String> newList = new ArrayList<>();
    while (index < strings.size() - 1) {
        String firstString = strings.get(index);
        String secondString = strings.get(index + 1);
        newList.add("(" + firstString + "," + secondString + ")");
        index += 2;
    }
    if (index == strings.size() - 1) {
        newList.add(strings.get(index));
    }

    // Replace the original list with the clumped result
    strings.clear();
    strings.addAll(newList);
}

// e10q17
public static void interleave(ArrayList<Integer> a1, ArrayList<Integer> a2) {
    int size1 = a1.size();
    int size2 = a2.size();
    int index1 = 0;
    int index2 = 0;

    while (index1 < size1 && index2 < size2) {
        a1.add(index1+1, a2.get(index2));
        index1 += 2; 
        index2++;    
    }

    while (index2 < size2) {
        a1.add(a2.get(index2));
        index2++;
    }
}
// e10q18
public static void mirror(ArrayList<String> a1) {
    ArrayList<String> duplicateList = new ArrayList<>(a1);
    for (int i = a1.size()-1; i >=0; i--) {
        duplicateList.add(a1.get(i));
}
    a1.clear();
    a1.addAll(duplicateList);
}


public static void main(String[] args) {
        System.out.println("e10q1:");

        ArrayList<String> strings = new ArrayList<>();
        strings.add("Hello");
        strings.add("World");
        strings.add("This");
        double average = averageVowels(strings);
        System.out.println("Average number of vowels: " + average);

        System.out.println("e10q2:");
        ArrayList<String> strings2 = new ArrayList<>();
            strings2.add("to");
            strings2.add("be");
            strings2.add("or");
            strings2.add("not");
            strings2.add("to");
            strings2.add("be");
            strings2.add("hamlet");
            ArrayList<String> strings3 = new ArrayList<>(strings2);
            System.out.println("Original " + strings2);
            swapPairs(strings2);
            System.out.println("After Swap " + strings2);

            System.out.println("e10q3:");
            removeEvenLength(strings3);
            System.out.println(strings3);
            System.out.println("e10q4:");
            doubleList(strings2);
            System.out.println(strings2);
        System.out.println("e10q5:");

            ArrayList<Integer> intList = new ArrayList<>();
            intList.add(4);
            intList.add(1);
            intList.add(2);
            intList.add(0);
            intList.add(3);
            scaleByK(intList);
            System.out.println(intList);

        System.out.println("e10q6:");
            minToFront(intList);
            System.out.println(intList);
        System.out.println("e10q7:");

        ArrayList<String> e10q7List = new ArrayList<>();
        e10q7List.add("be");
        e10q7List.add("be");
        e10q7List.add("be");
        e10q7List.add("be");
        e10q7List.add("be");

        e10q7List.add("is");
        e10q7List.add("not");
        e10q7List.add("or");
        e10q7List.add("question");
        e10q7List.add("that");
        e10q7List.add("the");
        e10q7List.add("to");
        e10q7List.add("to");
        e10q7List.add("to");
        e10q7List.add("to");
        e10q7List.add("to");
        removeDuplicates(e10q7List);
        System.out.println(e10q7List);

        System.out.println("e10q8:");
        ArrayList<Integer> e10q8List = new ArrayList<>();
        e10q8List.add(0);
        e10q8List.add(7);
        e10q8List.add(2);
        e10q8List.add(0);
        e10q8List.add(0);
        e10q8List.add(4);
        e10q8List.add(0);
        removeZeroes(e10q8List);
        System.out.println(e10q8List);

        System.out.println("e10q9:");
        ArrayList<Integer> e10q9List = new ArrayList<>();
        e10q9List.add(7);
        e10q9List.add(2);
        e10q9List.add(0);
        e10q9List.add(0);
        e10q9List.add(4);
        e10q9List.add(0);
        e10q9List.add(9);
        e10q9List.add(0);
        e10q9List.add(6);
        e10q9List.add(4);
        e10q9List.add(8);
        System.out.println(rangeBetweenZeroes(e10q9List));

        System.out.println("e10q10:");
        ArrayList<String> e10q10List = new ArrayList<>();
        e10q10List.add("to");
        e10q10List.add("be");
        e10q10List.add("or");
        e10q10List.add("not");
        e10q10List.add("to");
        e10q10List.add("be");
        e10q10List.add("that");
        e10q10List.add("is");
        e10q10List.add("the");
        e10q10List.add("question");
        removeInRange(e10q10List, "free", "rich");
        System.out.println(e10q10List);

        System.out.println("e10q11:");
        ArrayList<String> e10q11List = new ArrayList<>();
        e10q11List.add("how");
        e10q11List.add("are");
        e10q11List.add("you");
        stutter(e10q11List, 4);
        System.out.println(e10q11List);
        
        System.out.println("e10q12:");
        ArrayList<String> e10q12list = new ArrayList<>();
        e10q12list.add("this");
        e10q12list.add("is");
        e10q12list.add("lots");
        e10q12list.add("of");
        e10q12list.add("fun");
        e10q12list.add("for");
        e10q12list.add("Java");
        e10q12list.add("coders");
        markLength4(e10q12list);
        System.out.println(e10q12list);

        System.out.println("e10q13:");
        ArrayList<Integer> e10q13List = new ArrayList<>();
        e10q13List.add(3);
        e10q13List.add(8);
        e10q13List.add(19);
        e10q13List.add(42);
        e10q13List.add(7);
        e10q13List.add(26);
        e10q13List.add(19);
        e10q13List.add(-8);
        reverse3(e10q13List);
        System.out.println(e10q13List);

        
        System.out.println("e10q14:");
        ArrayList<String> e10q14List = new ArrayList<>();
        e10q14List.add("four");
        e10q14List.add("score");
        e10q14List.add("and");
        e10q14List.add("seven");
        e10q14List.add("years");
        e10q14List.add("ago");
        e10q14List.add("our");
        removeShorterStrings(e10q14List);
        System.out.println(e10q14List);

        System.out.println("e10q15:");

            ArrayList<Integer> list = new ArrayList<>();
            list.add(4);
            list.add(7);
            list.add(9);
            list.add(2);
            list.add(7);
            list.add(7);
            list.add(5);
            list.add(3);
            list.add(5);
            list.add(1);
            list.add(7);
            list.add(8);
            list.add(6);
            list.add(7);
    
            filterRange(list, 5, 7);
            System.out.println(list);
        System.out.println("e10q16:");

        ArrayList<String> e10q16List = new ArrayList<>();
       e10q16List.add("four");
        e10q16List.add("score");
        e10q16List.add("and");
        e10q16List.add("seven");
        e10q16List.add("years");
        e10q16List.add("ago");
        e10q16List.add("our");
    
            clump(e10q16List);
            System.out.println(e10q16List);
        
        System.out.println("e10q17:");
        ArrayList<Integer> a1 = new ArrayList<>();
        a1.add(10);
        a1.add(20);
        a1.add(30);

        ArrayList<Integer> a2 = new ArrayList<>();
        a2.add(4);
        a2.add(5);
        a2.add(6);
        a2.add(7);
        a2.add(8);
        interleave(a1, a2);
        System.out.println(a1);

     System.out.println("e10q18:");
    ArrayList<String> e10q18List = new ArrayList<>();
     e10q18List.add("a");
     e10q18List.add("b");
     e10q18List.add("c");
        mirror(e10q18List);
        System.out.println(e10q18List);


    }
}



