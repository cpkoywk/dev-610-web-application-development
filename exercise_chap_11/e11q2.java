//e11q2 to e11q21
import java.util.Set;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
public class e11q2 {
    public static void main(String[] args) {
            LinkedList<Integer> list1 = new LinkedList<>();
            list1.add(1);
            list1.add(2);
            list1.add(3);
            list1.add(4);
            list1.add(5);
    
            LinkedList<Integer> list2 = new LinkedList<>();
            list2.add(6);
            list2.add(7);
            list2.add(8);
            list2.add(9);
            list2.add(10);
            list2.add(11);
            list2.add(12);
    
            LinkedList<Integer> result = alternate(list1, list2);
            System.out.println(result);


        System.out.println("e11q4");

           LinkedList<Integer> myList = new LinkedList<>();
        myList.add(15);
        myList.add(1);
        myList.add(6);
        myList.add(12);
        myList.add(-3);
        myList.add(4);
        myList.add(8);
        myList.add(21);
        myList.add(2);
        myList.add(30);
        myList.add(-1);
        myList.add(9);
    
            partition(myList, 5);
            System.out.println(myList); 

        System.out.println("e11q5");

        List<Integer> listE11q5 = new ArrayList<>();
        listE11q5.add(7);
        listE11q5.add(4);
        listE11q5.add(-9);
        listE11q5.add(4);
        listE11q5.add(15);
        listE11q5.add(8);
        listE11q5.add(27);
        listE11q5.add(7);
        listE11q5.add(11);
        listE11q5.add(-5);
        listE11q5.add(32);
        listE11q5.add(-9);
        listE11q5.add(-9);
        System.out.println(listE11q5);
        sortAndRemoveDuplicates(listE11q5);
        System.out.println(listE11q5);

        System.out.println("E11q6:");
        LinkedList<Integer> listE11q6 = new LinkedList<>();
        listE11q6.add(3);
        listE11q6.add(7);
        listE11q6.add(3);
        listE11q6.add(-1);
        listE11q6.add(2);
        listE11q6.add(3);
        listE11q6.add(7);
        listE11q6.add(2);
        listE11q6.add(15);
        listE11q6.add(15);

        System.out.println(listE11q6);        
        System.out.println(countUnique(listE11q6));

        System.out.println("E11q7:");
        LinkedList<Integer> E11q7list1 = new LinkedList<>();
        E11q7list1.add(3);
        E11q7list1.add(7);
        E11q7list1.add(3);
        E11q7list1.add(-1);
        E11q7list1.add(2);
        E11q7list1.add(3);
        E11q7list1.add(7);
        E11q7list1.add(2);
        E11q7list1.add(15);
        E11q7list1.add(15);
        LinkedList<Integer> E11q7list2 = new LinkedList<>();
        E11q7list2.add(-5);
        E11q7list2.add(15);
        E11q7list2.add(2);
        E11q7list2.add(-1);
        E11q7list2.add(7);
        E11q7list2.add(15);
        E11q7list2.add(36);       

        System.out.println(E11q7list1+" "+E11q7list2);        
        System.out.println(countCommon(E11q7list1, E11q7list2));        
        System.out.println("E11q8:");
            Set<String> E11q7Set = new HashSet<>();
            E11q7Set.add("Hello");
            E11q7Set.add("World");
            E11q7Set.add("Iam");
            E11q7Set.add("Java");     
        System.out.println(maxLength(E11q7Set));

        System.out.println("E11q9:");
            Set<Integer> E11q9Set = new HashSet<>(E11q7list1) ;
            System.out.println(E11q9Set);
        System.out.println(hasOdd(E11q9Set));

        System.out.println("E11q10:");
        System.out.println(E11q7Set);
        removeEvenLength(E11q7Set);
        System.out.println(E11q7Set);

        System.out.println("E11q11:");

        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(4);
        set1.add(7);
        set1.add(9);

        Set<Integer> set2 = new HashSet<>();
        set2.add(2);
        set2.add(4);
        set2.add(5);
        set2.add(6);
        set2.add(7);

        System.out.println(set1);
        System.out.println(set2);
        System.out.println(symmetricSetDifference(set1,set2));

        System.out.println("E11q12:");
        List<String> E11q12List = new LinkedList<>();
        E11q12List.add("apple");
        E11q12List.add("banana");
        E11q12List.add("apple");
        E11q12List.add("cherry");
        E11q12List.add("banana");
        E11q12List.add("apple");
        E11q12List.add("date");
        System.out.println(contains3(E11q12List));

        System.out.println("E11q13:");

        Map<String, String> E11q13Map1 = new HashMap<>();
        E11q13Map1.put("Marty", "Stepp");
        E11q13Map1.put("Stuart", "Reges");
        E11q13Map1.put("Jessica", "Miller");
        E11q13Map1.put("Amanda", "Camp");
        E11q13Map1.put("Hal", "Perkins");
        System.out.println(isUnique(E11q13Map1)); 

        Map<String, String> E11q13Map2 = new HashMap<>();
        E11q13Map2.put("Kendrick", "Perkins");
        E11q13Map2.put("Stuart", "Reges");
        E11q13Map2.put("Jessica", "Miller");
        E11q13Map2.put("Bruce", "Reges");
        E11q13Map2.put("Hal", "Perkins");
        System.out.println(isUnique(E11q13Map2)); 

                System.out.println("e11q14:");

        Map<String, Integer> e11q14Map1 = new HashMap<>();
        e11q14Map1.put("Janet", 87);
        e11q14Map1.put("Logan", 62);
        e11q14Map1.put("Whitaker", 46);
        e11q14Map1.put("Alyssa", 100);
        e11q14Map1.put("Stefanie", 80);
        e11q14Map1.put("Jeff", 88);
        e11q14Map1.put("Kim", 52);
        e11q14Map1.put("Sylvia", 95);

        Map<String, Integer> e11q14Map2 = new HashMap<>();
        e11q14Map2.put("Logan", 62);
        e11q14Map2.put("Kim", 52);
        e11q14Map2.put("Whitaker", 52);
        e11q14Map2.put("Jeff", 88);
        e11q14Map2.put("Stefanie", 80);
        e11q14Map2.put("Brian", 60);
        e11q14Map2.put("Lisa", 83);
        e11q14Map2.put("Sylvia", 87);

        System.out.println(intersect(e11q14Map1, e11q14Map2));

        System.out.println("e11q15:");

        System.out.println(E11q7list1);
        System.out.println(maxOccurrences(E11q7list1));


        System.out.println("e11q16:");
        Map<String, String> e11q16Map1 = new HashMap<>();
        e11q16Map1.put("Marty", "206-9024");
        e11q16Map1.put("Hawking", "123-4567");
        e11q16Map1.put("Smith", "949-0504");
        e11q16Map1.put("Newton", "123-4567");
        System.out.println(is1to1(e11q16Map1)); 
        Map<String, String> e11q16Map2 = new HashMap<>();
        e11q16Map2.put("Marty", "206-9024");
        e11q16Map2.put("Hawking", "555-1234");
        e11q16Map2.put("Smith", "949-0504");
        e11q16Map2.put("Newton", "123-4567");
        System.out.println(is1to1(e11q16Map2)); 

        System.out.println("e11q17:");
        Map<String, String> e11q17Map1 = new HashMap<>();
        e11q17Map1.put("Smith", "949-0504");
        e11q17Map1.put("Marty", "206-9024");
        Map<String, String> e11q17Map2 = new HashMap<>();
        e11q17Map2.put("Marty", "206-9024");
        e11q17Map2.put("Hawking", "123-4567");
        e11q17Map2.put("Smith", "949-0504");
        e11q17Map2.put("Newton", "123-4567");
        System.out.println(subMap(e11q17Map1, e11q17Map2)); 

        System.out.println("e11q18:");
        Map<String, String> e11q18Map = new HashMap<>();
        e11q18Map.put("42", "Marty");
        e11q18Map.put("81", "Sue");
        e11q18Map.put("17", "Ed");
        e11q18Map.put("31", "Dave");
        e11q18Map.put("56", "Ed");
        e11q18Map.put("3", "Marty");
        e11q18Map.put("29", "Ed");
        Map<String, Set<String>> reversedMap = reverse(e11q18Map);
        System.out.println(reversedMap);
                
        System.out.println("e11q19");
        System.out.println(e11q14Map2);
        System.out.println(rarest(e11q14Map2));

        System.out.println("e11q21");
        List<String> words = Arrays.asList("banana", "bends", "i", "mend", "sandy");
        Map<String, Integer> pairCounts = pairCounts(words);
        System.out.println(pairCounts);

    }
    
    public static Map<String, Integer> pairCounts(List<String> words) {
        Map<String, Integer> countMap = new HashMap<>();
        for (String word : words) {
            for (int i = 0; i < word.length() - 1; i++) {
                String pair = word.substring(i, i + 2);
                countMap.put(pair, countMap.getOrDefault(pair, 0) + 1);
                }
            }
   

        return countMap;
    }
    public static int rarest(Map<String, Integer> map) {
        if (map.isEmpty()) {
            throw new IllegalArgumentException();
        }

        Map<Integer, Integer> valueCounts = new HashMap<>();

        int minCount = Integer.MAX_VALUE;
        int rarestValue = Integer.MAX_VALUE;

        for (int value : map.values()) {
            valueCounts.put(value, valueCounts.getOrDefault(value, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : valueCounts.entrySet()) {
            int value = entry.getKey();
            int count = entry.getValue();
            
            if (count < minCount || (count == minCount && value < rarestValue)) {
                minCount = count;
                rarestValue = value;
            }
        }

        return rarestValue;
    }

    public static Map<String, Set<String>> reverse(Map<String, String> map1) {
        Map<String, Set<String>> map2 = new HashMap<>();

       for (Map.Entry<String, String> entry : map1.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (!map2.containsKey(value)) {
                map2.put(value, new HashSet<>());
            }
            map2.get(value).add(key);
        }
        return map2;
        }
 

       public static Boolean subMap(Map<String, String> map1,Map<String, String> map2) {
       for (Map.Entry<String, String> entry : map1.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (map2.containsKey(key) && !map2.get(key).equals(value)) {
                return false;}
            if (!map2.containsKey(key)) {
                return false;  
            }
        }
        return true;
    }    

    public static Boolean is1to1(Map<String, String> map) {
        Map<String, Integer> countMap = new HashMap<>();

        for (String value : map.values()) {
            countMap.put(value, countMap.getOrDefault(value, 0) + 1);

        for (int count : countMap.values()) {
            if (count >1) {
                return false;
            }
        }}
        return true;
    }    

    public static int maxOccurrences(List<Integer> integerList) {
        Map<Integer, Integer> countMap = new HashMap<>();

        for (Integer num : integerList) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        int maxCount = 0;
        for (int count : countMap.values()) {
            if (count > maxCount) {
                maxCount = count;
            }
        }
        return maxCount;
    }

    public static Map<String, Integer> intersect(Map<String, Integer> map1, Map<String, Integer> map2) {
        Map<String, Integer> intersection = new HashMap<>();

        for (Map.Entry<String, Integer> entry : map1.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            if (map2.containsKey(key) && map2.get(key).equals(value)) {
                intersection.put(key, value);
            }
        }
        return intersection;
    }

    public static boolean isUnique(Map<String, String> map) {
        Set<String> uniqueValues = new HashSet<>();
        for (String value : map.values()) {
            if (uniqueValues.contains(value)) {
                return false;
            }
            uniqueValues.add(value);
        }
        return true;
    }


    public static boolean contains3(List<String> stringList) {
        Map<String, Integer> stringFreq = new HashMap<>();

        for (String str : stringList) {
            stringFreq.put(str, stringFreq.getOrDefault(str, 0) + 1);
        }

        for (int count : stringFreq.values()) {
            if (count >= 3) {
                return true;
            }
        }
        return false;
    }
    

    public static Set<Integer> symmetricSetDifference(Set<Integer> set1,Set<Integer> set2) {
        Set<Integer> combinedSet = new HashSet<>(set1); 
        Set<Integer> commonSet = new HashSet<>(set1); 
        commonSet.retainAll(set2);
        combinedSet.addAll(set2);
        combinedSet.removeAll(commonSet);
        return combinedSet;

    }    

    public static void removeEvenLength(Set<String> stringSet) {
        Iterator<String> iterator = stringSet.iterator();
        while (iterator.hasNext()) {
            String str = iterator.next();
            int currentLength = str.length();
            if (currentLength % 2 == 0) {
                iterator.remove();
            }
        }
    }


    public static boolean hasOdd(Set<Integer> set) {
        Boolean result=false;
            for (Integer i : set) {
            if (i% 2==1) {
                result=true;
            }
        }
        return result;
    }
    public static int maxLength(Set<String> stringSet) {
        int max = 0;
        
        for (String str : stringSet) {
            int currentLength = str.length();
            if (currentLength > max) {
                max = currentLength;
            }
        }
        
        return max;
    }

        public static int countCommon(List<Integer> list1,List<Integer> list2) {
            Set<Integer> set1 = new HashSet<>(list1);
            Set<Integer> set2 = new HashSet<>(list2);
            set1.retainAll(set2);
        
            return set1.size();
        }



        public static int countUnique(List<Integer> list) {
        Set<Integer> uniqueSet = new HashSet<>(list);
        return uniqueSet.size();

    }

    public static void sortAndRemoveDuplicates(List<Integer> list) {
        Set<Integer> uniqueSet = new HashSet<>(list);
        list.clear();
        list.addAll(uniqueSet);
        Collections.sort(list);
    }




    public static void partition(LinkedList<Integer> list, int E) {
            ListIterator<Integer> iterator = list.listIterator();
            LinkedList<Integer> lessThanE = new LinkedList<>();
            LinkedList<Integer> greaterThanOrEqualE = new LinkedList<>();
    
            while (iterator.hasNext()) {
                int current = iterator.next();
                if (current < E) {
                    lessThanE.add(current);
                } else {
                    greaterThanOrEqualE.add(current);
                }
            }
            list.clear();
            list.addAll(lessThanE);
            list.addAll(greaterThanOrEqualE);
        }


 public static LinkedList<Integer> removeInRange(LinkedList<Integer> list, int element, int startInd, int endInd) {
     ListIterator<Integer> iterator = list.listIterator(startInd);
        int currentIndex = startInd;
        while (iterator.hasNext() && currentIndex < endInd) {
            if (iterator.next() == element) {
                iterator.remove();
            }
            currentIndex++;
        }
        return list; 
    }


   

    public static LinkedList<Integer> alternate(LinkedList<Integer> list1, LinkedList<Integer> list2) {
        LinkedList<Integer> result = new LinkedList<>();

        int size1 = list1.size();
        int size2 = list2.size();
        int maxSize = Math.max(size1, size2);

        for (int i = 0; i < maxSize; i++) {
            if (i < size1) {
                result.add(list1.get(i));
            }
            if (i < size2) {
                result.add(list2.get(i));
            }
        }
        return result;
    }

}