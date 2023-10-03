import java.awt.Graphics;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


//e12q1
public class e12q1 {

    public static void main(String[] args) {
        System.out.println("e12q1");

        starString(1); 
        System.out.println();

        starString(2); 
        System.out.println();

        starString(3); 
        System.out.println();
        starString(4); 

        System.out.println();

        // starString(-1); // This would throw an IllegalArgumentException
        System.out.println("e12q2");

        writeNums(5);
        System.out.println(); 
        writeNums(12);
        System.out.println();

        System.out.println("e12q3");

        writeSequence(5);
        System.out.println();

        writeSequence(1);   // 1
              System.out.println();

            writeSequence(2);   // 1 1
            System.out.println();
            writeSequence(3);   
                        System.out.println();
            writeSequence(10);  
        System.out.println("e12q4");


    System.out.println(doubleDigits(348));   
    System.out.println(doubleDigits(0));     
    System.out.println(doubleDigits(-789));  
        System.out.println("e12q5");
    writeBinary(44);  
            System.out.println();
    System.out.println("e12q6");
    writeSquares(8);  
    writeSquares(1);  
    System.out.println();

System.out.println("e12q7");
  writeChars(1);  // *
      System.out.println();
    writeChars(2);  // **
    writeChars(3);  
    writeChars(4);  
    writeChars(5); 
    writeChars(6);  
    writeChars(7);  
    writeChars(8); 
    System.out.println();

System.out.println("e12q8");
   System.out.println(multiplyEvens(1));  
    System.out.println(multiplyEvens(4));  

System.out.println("e12q9");

    System.out.println(sumTo(2));  
    System.out.println(sumTo(0)); 
System.out.println("e12q10");

    System.out.println(digitMatch(1072503891, 62530841)); 
System.out.println("e12q11");
 System.out.println(repeat("hello", 3));  // hellohellohello
    System.out.println(repeat("ok", 1));     // ok
    System.out.println(repeat("bye", 0));    // (empty string)
System.out.println("e12q12");
    System.out.println(isReverse("hello", "eLLoH"));  // true
    System.out.println(isReverse("Hello", "hello"));  // false
    System.out.println(isReverse("A", "a"));  
System.out.println("e12q13");
System.out.println(indexOf("Barack Obama", "bam"));  // 8
System.out.println(indexOf("Hello", "World"));       // -1
System.out.println(indexOf("Hello", "lo"));          // 3
System.out.println("e12q14");
System.out.println(dedup("bookkkkkeeper"));  
System.out.println(dedup("aabccde"));      
System.out.println(dedup("a"));   

System.out.println("e12q15");

System.out.println(vowelsToEnd("beautifully"));
System.out.println("e12q16");
    System.out.println(evenDigits(8342116));  // Expected output: 8426
    System.out.println(evenDigits(-34512));   // Expected output: -42

System.out.println("e12q17");
      System.out.println(permut(7, 4));  // Expected output: 840
        System.out.println(permut(6, 3));  // Expected output: 120
 

System.out.println("e12q18");
int size = 243;
DrawingPanel panel = new DrawingPanel(size, size);
Graphics g = panel.getGraphics();
drawCarpet(g, 6, 0, 0, size);

System.out.println("e12q19");
int width = 729; 
int height = 200;
DrawingPanel panel2 = new DrawingPanel(width, height);
Graphics g2 = panel2.getGraphics();

drawCantorSet(g2, 0, 50, width, 20);

System.out.println("e12q20");
        waysToClimb(3);

System.out.println("e12q21");

countBinary(3);
        System.out.println("e12q22");
        List<String> list = new LinkedList<>();
        list.add("Janet");
        list.add("Robert");
        list.add("Morgan");
        list.add("Char");
        subsets(list, new LinkedList<String>(), 0);
    }

public static void subsets(List<String> original, LinkedList<String> current, int index) {
        if (index == original.size()) {
            System.out.println(current);
            return;
        }

        // Exclude the current element and proceed
        subsets(original, new LinkedList<>(current), index + 1);

        // Include the current element and proceed
        current.add(original.get(index));
        subsets(original, new LinkedList<>(current), index + 1);
    }
public static void countBinary(int n) {
    if (n == 0) {
        System.out.println();
        return;
}

    for (int i = 0; i < Math.pow(2, n); i++) {
        // Convert i to a binary string and pad with leading zeros
        String binary = String.format("%" + n + "s", Integer.toBinaryString(i)).replace(' ', '0');
        System.out.println(binary);
}
}

    public static void waysToClimb(int remainingStairs) {
        ArrayList<Integer> currentSteps= new ArrayList<Integer>();
        if (remainingStairs < 0) {
            return;
        }
        if (remainingStairs == 0) {
            System.out.println(currentSteps);
            return;
        }
        currentSteps.add(1);
        waysToClimb(remainingStairs - 1);
        currentSteps.remove(currentSteps.size() - 1); 

        currentSteps.add(2);
        waysToClimb(remainingStairs - 2);
        currentSteps.remove(currentSteps.size() - 1);
    }


public static void drawCantorSet(Graphics g, int x, int y, int width, int lineThickness) {
    if (width < 1) {
        return;
    }

    g.fillRect(x, y, width, lineThickness);

    int nextWidth = width / 3;
    int nextY = y + 2 * lineThickness;

    drawCantorSet(g, x, nextY, nextWidth, lineThickness);
    drawCantorSet(g, x + 2 * nextWidth, nextY, nextWidth, lineThickness);
}

public static void drawCarpet(Graphics g, int level, int x, int y, int size) {
    if (level == 0) return;

    int subSize = size / 3;

    // Clear the middle square
    g.clearRect(x + subSize, y + subSize, subSize, subSize);

    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            if (!(i == 1 && j == 1)) {
                drawCarpet(g, level - 1, x + i * subSize, y + j * subSize, subSize);
            }
        }
    }
}

  
    public static int permut(int n, int r) {
        // Base cases
        if (r == 0) {
            return 1;
        }
        if (n == 0) {
            return 0;
        }

        // Recursive calculation
        return n * permut(n - 1, r - 1);
    }

public static int evenDigits(int n) {
    if (n == 0) {
        return 0;
    }
    
    int lastDigit = n % 10;
    int restOfNumber = n / 10;
    
    if (lastDigit % 2 == 0) {
        // If the last digit is even, keep it and multiply the recursive result by 10 to 
        // "shift" it to the left.
        return evenDigits(restOfNumber) * 10 + lastDigit;
    } else {
        // If the last digit is odd, don't include it in the result.
        return evenDigits(restOfNumber);
    }
}

public static String vowelsToEnd(String s) {
    if (s.length() == 0) {
        return "";
    }

    char firstChar = s.charAt(0);
    char lowerCaseChar = Character.toLowerCase(firstChar);
  

    if (lowerCaseChar == 'a' || lowerCaseChar == 'e' || lowerCaseChar == 'i' || 
                      lowerCaseChar == 'o' || lowerCaseChar == 'u') {
        return vowelsToEnd(s.substring(1)) + firstChar;
    } else {
        return firstChar + vowelsToEnd(s.substring(1));
    }
}
 
public static String dedup(String s) {
    // Base cases
    if (s.length() <= 1) {
        return s;
    }

    // If the first character matches the second character, skip the second character
    if (s.charAt(0) == s.charAt(1)) {
        return dedup(s.substring(1));
    }

    // If the first character doesn't match the second, keep the first and dedup the rest
    return s.charAt(0) + dedup(s.substring(1));
}


public static int indexOf(String source, String target) {
// Base case: If 'source' is shorter than 'target', return -1.
if (source.length() < target.length()) {
    return -1;
}

// Check if the current segment of 'source' starts with 'target'.
if (source.substring(0, target.length()).equals(target)) {
    return 0;
}

// Recurse with one character removed from the beginning of 'source'.
int result = indexOf(source.substring(1), target);

// Adjust the result for the character that was removed.
return (result == -1) ? -1 : result + 1;
}



public static boolean isReverse(String s1, String s2) {
    // Base cases
    if (s1.length() == 0 && s2.length() == 0) {
        return true;
    }
    
    if (s1.length() == 0 || s2.length() == 0) {
        return false;
    }
    
    // Check the first character of s1 against the last character of s2
    if (Character.toLowerCase(s1.charAt(0)) == Character.toLowerCase(s2.charAt(s2.length() - 1))) {
        // Recursively check the rest of the strings
        return isReverse(s1.substring(1), s2.substring(0, s2.length() - 1));
    } else {
        return false;
    }
}


public static String repeat(String s, int n) {
    if (n <= 0) {
        return "";
    }

    if (n == 1) {
        return s;
    }

    // If n is even
    if (n % 2 == 0) {
        return repeat(s + s, n / 2);
    } else {
        // If n is odd
        return s + repeat(s + s, (n - 1) / 2);
    }
}

public static int digitMatch(int a, int b) {
    // Base case: if either number is 0 and the other one is not, no more matching digits can be found.
    if (a == 0 && b != 0 || b == 0 && a != 0) {
        return 0;
    }

    // Base case: if both numbers are 0, terminate the recursion.
    if (a == 0 && b == 0) {
        return 0;
    }

    // Check the last digit of each number.
    int lastDigitA = a % 10;
    int lastDigitB = b % 10;

    if (lastDigitA == lastDigitB) {
        return 1 + digitMatch(a / 10, b / 10);  // if they match, add 1 and recursively check the remaining digits.
    } else {
        return digitMatch(a / 10, b / 10);  // if they don't match, just recursively check the remaining digits.
    }
}

public static double sumTo(int n) {
    if (n < 0) {
        throw new IllegalArgumentException();
    }

    if (n == 0) {
        return 0.0;  
    }

    return (1.0 / n) + sumTo(n - 1);
}

public static int multiplyEvens(int n) {
    if (n <= 0) {
        throw new IllegalArgumentException();
    }

    if (n == 1) {
        return 2;
    }

    return 2 * n * multiplyEvens(n - 1);
}

public static void writeChars(int n) {
    if (n < 1) {
        throw new IllegalArgumentException();
    }

    if (n == 1) {
        System.out.print("*");
        return;
    } 
    
    if (n == 2) {
        System.out.print("**");
        return;
    }

    System.out.print("<");

    writeChars(n - 2);

    // Print the trailing '>'
    System.out.print(">");
    

}

public static void writeSquares(int n) {
    if (n < 1) {
        throw new IllegalArgumentException();
    }

    if (n == 1) {
        System.out.print("1");
        return;
    }
    if (n % 2 != 0) {
        System.out.print(n*n);
        if (n > 1) {
            System.out.print(", ");
        }
        writeSquares(n - 1);
    } 
    else {
        writeSquares(n - 1);
        System.out.print(", " + n*n);
    }
}

public static void writeBinary(int n) {
    if (n < 0) {
        System.out.print("-");
        writeBinary(-n);
    } else if (n <= 1) {
        System.out.print(n);
    } else {
        writeBinary(n / 2);
        System.out.print(n % 2);
    }
}

public static int doubleDigits(int n) {
    if (n < 0) {
        return -doubleDigits(-n);
    }
    if (n == 0) {
        return 0;
    }
    int lastDigit = n % 10;
    return doubleDigits(n / 10) * 100 + lastDigit * 10 + lastDigit;
}

   

    
        public static void writeSequence(int n) {
            if (n < 1) {
                throw new IllegalArgumentException();
            }
            
            if (n == 1) {
                System.out.print("1 ");
                return;
            } else if (n == 2) {
                System.out.print("1 1 ");
                return;
            }
            int value = (n + 1) / 2;
            System.out.print(value + " ");
            writeSequence(n - 2);
            System.out.print(value + " ");
        }
  

    public static void writeNums(int n) {
        if (n < 1) {
            throw new IllegalArgumentException();
        }

        for (int i = 1; i <= n; i++) {
            System.out.print(i);

            // Print a comma and space if it's not the last number
            if (i < n) {
                System.out.print(", ");
            }
    }}

    public static void starString(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Input cannot be less than 0.");
        }
        if (n == 0) {
            System.out.print("*");
        } else {
            starString(n - 1);
            starString(n - 1); 
        }
    }
}