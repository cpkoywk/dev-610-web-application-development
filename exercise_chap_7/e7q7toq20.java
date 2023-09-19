import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class e7q7toq20 {
    public static void main(String[] args) {

        System.out.println("e7q7:");
        int[] arr = {74, 85, 102, 99, 101, 56, 84};
        System.out.println(kthLargest(2,arr));
        System.out.println("e7q8:");
        int[] arr2 = {5, 2, 4, 17, 55, 4, 3, 26, 18, 2, 17};
        System.out.println(median(arr2));
        System.out.println("e7q9:");
        int[] arre7q9 = {1, 3, 6, 7, 12};
        System.out.println(minGap(arre7q9));
        System.out.println("e7q10:");
        int[] arre7q10 = {6, 2, 9, 11, 3};
        System.out.println(percentEven(arre7q10));
        System.out.println("e7q11:");
        int[] arre711_1 = {3, 8, 12, 2, 9,17, 43, -8, 46};
        System.out.println(isUnique(arre711_1));
        int[] arre711_2 = {4, 7, 3, 9, 12, -47, 3, 74};
        System.out.println(isUnique(arre711_2));
        System.out.println("e7q12:");
        int[] arre712 = {200, 300, 250,1,950,40};
        System.out.println(priceIsRight(arre712,280));
        System.out.println("e7q13:");
        int[] arre713 = {3, 8, 10, 1, 9, 14, -3, 0,14, 207, 56, 98, 12};
        System.out.println(longestSortedSequence(arre713));
        System.out.println("e7q14:");
        int[] arre714_1 = {1, 6, 2, 1, 4, 1, 2, 1, 8};
        int[] arre714_2 = {1, 2, 1};
        System.out.println(contains(arre714_1,arre714_2));
        System.out.println("e7q15:");
        int[] arre715_1 = {7, 2, 8, 9, 4, 13, 7, 1, 9, 10};
        int[] arre715_2 = {1, 2, 3, 4, 5};
        for (int i = 0; i < collapse(arre715_1).length; i++) {
            System.out.print(collapse(arre715_1)[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < collapse(arre715_2).length; i++) {
            System.out.print(collapse(arre715_2)[i] + " ");
        }
        System.out.println();

        System.out.println("e7q16:");
        int[] arre716_1 = {2, 4, 6};
        int[] arre716_2 = {1, 2, 3, 4, 5};
        int[] arre716=append(arre716_2,arre716_1);
        for (int i = 0; i < arre716.length; i++) {
        System.out.print(arre716[i] + " ");
        }
        System.out.println();
        System.out.println("e7q17:");
        int[] arre717=vowelCount("i think, therefore i am");
        for (int i = 0; i < arre717.length; i++) {
        System.out.print(arre717[i] + " ");
        }
        System.out.println();
        System.out.println("e7q18:");
        int[] arre718={5, 4, 2,11, 9, 10, 4, 7, 3};
        for (int i = 0; i < evenBeforeOdd(arre718).length; i++) {
        System.out.print(evenBeforeOdd(arre718)[i] + " ");
        }
        System.out.println();
        System.out.println("e7q19:");
try {
        Scanner scanner = new Scanner(new File("e7q19.txt")); 
        wordLengths(scanner);
    } catch (FileNotFoundException e) {
        System.err.println("File not found");
    }
        System.out.println("e7q20:");

    int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    int[][] b = {{9, 2, 7}, {6, 4, 4}, {3, 2, 1}};
    int[][] result = matrixAdd(a, b);

    for (int i = 0; i < result.length; i++) {
        for (int j = 0; j < result[i].length; j++) {
            System.out.print(result[i][j] + " ");
        }
        System.out.println();
    }
}
            

    public static int kthLargest(int k,int[] a) {
        Arrays.sort(a);
        return a[a.length-k-1];

    }

        public static int median(int[] a) {
        Arrays.sort(a);
        return a[a.length/2];

    }
        public static int minGap(int[] a) {
            if (a.length<2){return 0;}else{
            int num=Integer.MAX_VALUE;
            for (int i = 0; i < a.length-1; i++) {
                int gap=a[i+1]-a[i];
                if (gap<=num){num=gap;}
            }
            return num;
    }
}
        public static double percentEven(int[] a) {
            double result=0.0;
            for (int i = 0; i <= a.length-1; i++) {
                if (a[i]%2==0){result=result+1;}
            }
            return result*100/a.length;
    }

public static boolean isUnique(int[] a) {
    for (int i = 0; i < a.length; i++) {
        for (int j = i + 1; j < a.length; j++) {
            if (a[i] == a[j]) {
                return false; 
            }
        }
    }
    return true; 
}
public static int priceIsRight(int[] a, int price) {
    int difference = Integer.MAX_VALUE;
    int result = -1;
    
    for (int i = 0; i < a.length; i++) {
        int gap = price - a[i];
        
        if (gap >= 0 && gap < difference) {
            difference = gap;
            result = a[i];
        }
    }
    return result;
}
public static int longestSortedSequence(int[] a) {
    int count = 0;
    int result = 0;
    
    for (int i = 0; i < a.length-1; i++) {
        
        if (a[i+1]-a[i] >= 0) {
            count+=1;
        }else{
            if (count>=result){result=count+1;}
            count=0;
        }
    }
    return result;
}

public static boolean contains(int[] a1, int[] a2) {
    if (a2.length == 0) {
        return true; 
    }

    for (int i = 0; i <= a1.length - a2.length; i++) {
        boolean found = true;
        
        for (int j = 0; j < a2.length; j++) {
            if (a1[i + j] != a2[j]) {
                found = false;
                break;
            }
        }
        if (found) {
            return true; 
        }
    }
    
    return false;
}
public static int [] collapse(int[] a) {
    int [] result=new int[(a.length + 1) / 2];;
  if (a.length % 2 == 0) {
        for (int i = 0; i < a.length-1; i += 2) {
            result[i / 2] = a[i] + a[i + 1];
        }
    } else {
        for (int i = 0; i < a.length - 1; i += 2) {
            result[i / 2] = a[i] + a[i + 1];
        }
        result[(a.length - 1) / 2] = a[a.length - 1];
    }
    return result;
}

public static int [] append(int[] a1, int[] a2) {
    int [] result=new int[(a1.length + a2.length)];
    for (int i = 0; i < a1.length; i += 1) {
        result[i] = a1[i];
        }
    for (int i = 0; i < a2.length; i += 1) {
        result[i+a1.length] = a2[i];
        }

    return result;
}
public static int [] vowelCount(String text) {
    int [] result=new int[5];
    int aCount=0;
    int eCount=0;
    int iCount=0;
    int oCount=0;
    int uCount=0;
    text = text.toLowerCase();
    for (int i = 0; i < text.length(); i++) {
        char letter = text.charAt(i);
        if (letter=='a'){aCount+=1;}
        if (letter=='e'){eCount+=1;}
        if (letter=='i'){iCount+=1;}
        if (letter=='o'){oCount+=1;}
        if (letter=='u'){uCount+=1;}}
    result[0]=aCount;
    result[1]=eCount;
    result[2]=iCount;
    result[3]=oCount;
    result[4]=uCount;

    return result;
}

public static int[] evenBeforeOdd(int[] a1) {
    List<Integer> oddList = new ArrayList<>();
    List<Integer> evenList = new ArrayList<>();

    for (int i = 0; i < a1.length; i++) {
        if (a1[i] % 2 == 0) {
            evenList.add(a1[i]);
        } else {
            oddList.add(a1[i]);
        }
    }

    int[] result = new int[oddList.size() + evenList.size()];
    int index = 0;

    for (int num : evenList) {
        result[index++] = num;
    }

    for (int num : oddList) {
        result[index++] = num;
    }

    return result;
}

   public static void wordLengths(Scanner input) {
        int[] wordLengthCount = new int[81]; 

        while (input.hasNext()) {
            String token = input.next();
            int length = token.length();

            // Count words with different lengths
            if (length <= 80) {
                wordLengthCount[length]++;
            }
        }

        // Print the result diagram
        for (int i = 1; i < wordLengthCount.length; i++) {
            if (wordLengthCount[i] > 0) {
                System.out.print(i + ": " + wordLengthCount[i] + " ");
                printStars(wordLengthCount[i]);
            }
        }
    }

    public static void printStars(int count) {
        for (int i = 0; i < count; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
    public static int[][] matrixAdd(int[][] matrixA, int[][] matrixB) {
        int rows = matrixA.length;
        int cols = matrixA[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }

        return result;
    }
}