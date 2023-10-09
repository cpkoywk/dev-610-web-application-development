// Simple binary tree class that includes methods to construct a
// tree of ints, to print the structure, and to print the data
// using a preorder, inorder or postorder traversal.  The trees
// built have nodes numbered starting with 1 and numbered
// sequentially level by level with no gaps in the tree.  The
// documentation refers to these as "sequential trees."

import java.util.*;

public class IntTree {
     private IntTreeNode overallRoot;

  // Nested IntTreeNode class
        private static class IntTreeNode {
            public int data;
            public IntTreeNode left;
            public IntTreeNode right;
            
            public IntTreeNode(int data) {
                this(data, null, null);
            }
    
            public IntTreeNode(int data, IntTreeNode left, IntTreeNode right) {
                this.data = data;
                this.left = left;
                this.right = right;
            }
        }
    public static void main(String[] args) {
        IntTree tree1 = new IntTree(7);  
        IntTree tree2 = new IntTree(9);  
        IntTree tree3 = new IntTree(3);  

    System.out.println("e17q1");
    System.out.println(tree1.countLeftNodes());
    System.out.println();

    System.out.println("e17q2");
    System.out.println("Actual: " + tree1.countEmpty());
    System.out.println();
    System.out.println("e17q3");
    System.out.println("Actual: " + tree1.depthSum());
    System.out.println();
    System.out.println("e17q4");
        System.out.println("Expected: 3");
        System.out.println("Actual: " + tree2.countEvenBranches());
        System.out.println();
    System.out.println("e17q5");

        // 5. printLevel test
        System.out.println("Values at level 3 of tree2:");
        tree2.printLevel(3);
        System.out.println();
    System.out.println("e17q6");

        // 6. printLeaves test
        System.out.println("Leaves of tree2 from right to left:");
        tree2.printLeaves();
        System.out.println();
    System.out.println("e17q7");

        // 7. isFull test
        System.out.println("Expected: false");
        System.out.println("Actual: " + tree1.isFull());
        System.out.println("Expected: true");
        System.out.println("Actual: " + tree3.isFull());
        System.out.println();
    System.out.println("e17q8");

        // 8. toString test
        System.out.println("Tree2 as string:");
        System.out.println(tree2.toString());
        System.out.println();
            System.out.println("e17q9");

IntTree tree4 = new IntTree(9);
System.out.println("Expected: true");
System.out.println("Actual: " + tree2.equals(tree4));
System.out.println();

    System.out.println("e17q10");
tree2.doublePositives();
tree2.printPreorder();
System.out.println();

    System.out.println("e17q11");
System.out.println("Expected: 9");
System.out.println("Actual: " + tree2.numberNodes());
System.out.println();

    System.out.println("e17q12");
tree1.removeLeaves();
tree1.printPreorder();
System.out.println();

    System.out.println("e17q13");
IntTree treeCopy = tree3.copy();
treeCopy.printPreorder();
System.out.println();

System.out.println("e17q14");
tree3.completeToLevel(5);
tree3.printSideways();
System.out.println();

System.out.println("e17q15");
IntTree treeForTrim = new IntTree(9);
System.out.println("Original tree (before trim): ");
treeForTrim.printSideways();
treeForTrim.trim(3, 7);
treeForTrim.printSideways();

System.out.println("e17q16");
IntTree treeForTighten = new IntTree(9);
treeForTighten.printSideways();
treeForTighten.tighten();

System.out.println("\nAfter tighten: ");
treeForTighten.printSideways();

System.out.println("e17q17");
IntTree t1 = new IntTree(5);
IntTree t2 = new IntTree(3);
IntTree combinedTree = t1.combineWith(t2);
System.out.println("\nCombined tree: ");
combinedTree.printSideways();

System.out.println("e17q18");
System.out.println( t1.inOrderList());

System.out.println("e17q19");
IntTree treeForEvenLevels = new IntTree(7);
System.out.println("\nOriginal tree (before evenLevels): ");
treeForEvenLevels.printSideways();
treeForEvenLevels.evenLevels();
System.out.println("\nAfter evenLevels: ");
treeForEvenLevels.printSideways();

System.out.println("e17q20");
IntTree treeForMakePerfect = new IntTree(3);
System.out.println("\nOriginal tree (before makePerfect): ");
treeForMakePerfect.printSideways();
treeForMakePerfect.makePerfect();
System.out.println("\nAfter makePerfect: ");
treeForMakePerfect.printSideways();

System.out.println("e17q21");
IntTree treeForMatches1 = new IntTree(5);
IntTree treeForMatches2 = new IntTree(5);
treeForMatches2.overallRoot.data = 99; // Just to make a difference
System.out.println("\nMatches between treeForMatches1 and treeForMatches2: " + treeForMatches1.matches(treeForMatches2));
}

   // q21
    public int matches(IntTree other) {
        return matches(this.overallRoot, other.overallRoot);
    }

    private int matches(IntTreeNode node1, IntTreeNode node2) {
        if (node1 == null || node2 == null) {
            return 0;
        }
        int match = (node1.data == node2.data) ? 1 : 0;
        return match + matches(node1.left, node2.left) + matches(node1.right, node2.right);
    }
        // q20
    public void makePerfect() {
        int desiredHeight = height(overallRoot);
        overallRoot = makePerfect(overallRoot, 1, desiredHeight);
    }

    private IntTreeNode makePerfect(IntTreeNode node, int currentLevel, int desiredHeight) {
        if (currentLevel <= desiredHeight) {
            if (node == null) {
                node = new IntTreeNode(0);
            }
            node.left = makePerfect(node.left, currentLevel + 1, desiredHeight);
            node.right = makePerfect(node.right, currentLevel + 1, desiredHeight);
        }
        return node;
    }

    private int height(IntTreeNode node) {
        if (node == null) {
            return 0;
        }
        return 1 + Math.max(height(node.left), height(node.right));
    }

        // q19
        public void evenLevels() {
            overallRoot = evenLevels(overallRoot, 1);
        }
    
        private IntTreeNode evenLevels(IntTreeNode node, int level) {
            if (node == null) return null;
    
            if (level % 2 != 0 && node.left == null && node.right == null) {
                return null;
            }
    
            node.left = evenLevels(node.left, level + 1);
            node.right = evenLevels(node.right, level + 1);
            return node;
        }
           // q18
        public List<Integer> inOrderList() {
            List<Integer> list = new ArrayList<>();
            inOrderList(overallRoot, list);
            return list;
        }
    
        private void inOrderList(IntTreeNode node, List<Integer> list) {
            if (node == null) return;
            inOrderList(node.left, list);
            list.add(node.data);
            inOrderList(node.right, list);
        }
         // q17
        public IntTree combineWith(IntTree other) {
            return new IntTree(combineWith(this.overallRoot, other.overallRoot));
        }
    
        private IntTreeNode combineWith(IntTreeNode t1, IntTreeNode t2) {
            if (t1 == null && t2 == null) return null;
            
            int value = (t1 != null ? 1 : 0) + (t2 != null ? 2 : 0);
            IntTreeNode newNode = new IntTreeNode(value);
            
            newNode.left = combineWith(t1 != null ? t1.left : null, t2 != null ? t2.left : null);
            newNode.right = combineWith(t1 != null ? t1.right : null, t2 != null ? t2.right : null);
            
            return newNode;
        }
    
        // 16. tighten
        public void tighten() {
            overallRoot = tighten(overallRoot);
        }
    
        private IntTreeNode tighten(IntTreeNode node) {
            if (node == null) return null;
            
            node.left = tighten(node.left);
            node.right = tighten(node.right);
            
            if (node.left == null && node.right != null) {
                return node.right;
            } else if (node.right == null && node.left != null) {
                return node.left;
            }
            return node;
        }
    
       
        // 15. trim
        public void trim(int min, int max) {
            overallRoot = trim(overallRoot, min, max);
        }
    
        private IntTreeNode trim(IntTreeNode node, int min, int max) {
            if (node == null) return null;
            
            node.left = trim(node.left, min, max);
            node.right = trim(node.right, min, max);
            
            if (node.data < min || node.data > max) {
                if (node.left != null) {
                    return node.left;
                } else {
                    return node.right;
                }
            }
            return node;
        }
    
 
 
// 14. completeToLevel method
    public void completeToLevel(int level) {
        if (level < 1) {
            throw new IllegalArgumentException();
        }
        overallRoot = completeToLevel(overallRoot, level);
    }

    private IntTreeNode completeToLevel(IntTreeNode root, int level) {
        if (level <= 0) {
            return root;
        } else if (root == null) {
            root = new IntTreeNode(-1);
        }
        root.left = completeToLevel(root.left, level - 1);
        root.right = completeToLevel(root.right, level - 1);
        return root;
    }
    // 13. copy method
    private IntTree(IntTreeNode root) {
        this.overallRoot = root;
    }
    
    // The copy method
    public IntTree copy() {
        return new IntTree(copy(this.overallRoot));
    }
    
    // Helper method for copy
    private IntTreeNode copy(IntTreeNode root) {
        if (root == null) {
            return null;
        }
        return new IntTreeNode(root.data, copy(root.left), copy(root.right));
    }
    
       // 12. removeLeaves method
    public void removeLeaves() {
        overallRoot = removeLeaves(overallRoot);
    }

    private IntTreeNode removeLeaves(IntTreeNode root) {
        if (root == null || (root.left == null && root.right == null)) {
            return null;
        }
        root.left = removeLeaves(root.left);
        root.right = removeLeaves(root.right);
        return root;
    }
    
        // 11. numberNodes method
    public int numberNodes() {
        return numberNodes(overallRoot, 1);
    }

    private int numberNodes(IntTreeNode root, int start) {
        if (root == null) {
            return 0;
        }
        root.data = start;
        int leftNodes = numberNodes(root.left, start + 1);
        int rightNodes = numberNodes(root.right, start + leftNodes + 1);
        return 1 + leftNodes + rightNodes;
    }

      // 10. doublePositives method
    public void doublePositives() {
        doublePositives(overallRoot);
    }

    private void doublePositives(IntTreeNode root) {
        if (root != null) {
            if (root.data > 0) {
                root.data *= 2;
            }
            doublePositives(root.left);
            doublePositives(root.right);
        }
    }
// 9. equals method
    public boolean equals(IntTree other) {
        return equals(this.overallRoot, other.overallRoot);
    }

    private boolean equals(IntTreeNode root1, IntTreeNode root2) {
        if (root1 == null && root2 == null) {
            return true;
        } else if (root1 != null && root2 != null) {
            return root1.data == root2.data &&
                   equals(root1.left, root2.left) &&
                   equals(root1.right, root2.right);
        } else {
            return false;
        }
    }
// 8. toString
@Override
public String toString() {
    return toString(overallRoot);
}

private String toString(IntTreeNode root) {
    if (root == null) {
        return "empty";
    }
    if (root.left == null && root.right == null) {
        return String.valueOf(root.data);
    }
    return "(" + root.data + ", " + toString(root.left) + ", " + toString(root.right) + ")";
}
  // 7. isFull
public boolean isFull() {
    return isFull(overallRoot);
}

private boolean isFull(IntTreeNode root) {
    if (root == null) {
        return true;
    }
    if ((root.left == null && root.right != null) || (root.left != null && root.right == null)) {
        return false;
    }
    return isFull(root.left) && isFull(root.right);
}



// q6
public void printLeaves() {
    List<Integer> leaves = new ArrayList<>();
    getLeaves(overallRoot, leaves);
    System.out.print("leaves: ");
    for (int i = leaves.size() - 1; i >= 0; i--) {
        System.out.print(leaves.get(i) + " ");
    }
    System.out.println();
}

private void getLeaves(IntTreeNode root, List<Integer> leaves) {
    if (root != null) {
        if (root.left == null && root.right == null) {
            leaves.add(root.data);
        }
        getLeaves(root.left, leaves);
        getLeaves(root.right, leaves);
    }
}
// q5
public void printLevel(int level) {
    if (level < 1) {
        throw new IllegalArgumentException("Level should be 1 or greater.");
    }
    printLevel(overallRoot, level, 1);
}

private void printLevel(IntTreeNode root, int targetLevel, int currentLevel) {
    if (root != null) {
        if (currentLevel == targetLevel) {
            System.out.println(root.data);
        } else {
            printLevel(root.left, targetLevel, currentLevel + 1);
            printLevel(root.right, targetLevel, currentLevel + 1);
        }
    }
}

// q4. 
public int countEvenBranches() {
    return countEvenBranches(overallRoot);
}

private int countEvenBranches(IntTreeNode root) {
    if (root == null) {
        return 0;
    }
    int count = (root.data % 2 == 0 && (root.left != null || root.right != null)) ? 1 : 0;
    return count + countEvenBranches(root.left) + countEvenBranches(root.right);
}

 
// q3
public int depthSum() {
    return depthSum(overallRoot, 1);
}

private int depthSum(IntTreeNode root, int depth) {
    if (root == null) {
        return 0;
    }
    return depth * root.data + depthSum(root.left, depth + 1) + depthSum(root.right, depth + 1);
}
    
    // 2. countEmpty
public int countEmpty() {
    return countEmpty(overallRoot);
}

private int countEmpty(IntTreeNode root) {
    if (root == null) {
        return 1;
    }
    if (root.left == null && root.right == null) {
        return 2;
    }
    return countEmpty(root.left) + countEmpty(root.right);
}
// q1
public int countLeftNodes() {
    return countLeftNodes(overallRoot);
}

private int countLeftNodes(IntTreeNode root) {
    if (root == null) {
        return 0;
    }
    int count = (root.left != null) ? 1 : 0;
    return count + countLeftNodes(root.left) + countLeftNodes(root.right);
}




      

    // pre : max > 0
    // post: constructs a sequential tree with given number of
    //       nodes
    public IntTree(int max) {
        if (max <= 0) {
            throw new IllegalArgumentException("max: " + max);
        }
        overallRoot = buildTree(1, max);
    }

    // post: returns a sequential tree with n as its root unless
    //       n is greater than max, in which case it returns an
    //       empty tree
    private IntTreeNode buildTree(int n, int max) {
        if (n > max) {
            return null;
        } else {
            return new IntTreeNode(n, buildTree(2 * n, max),
                                   buildTree(2 * n + 1, max));
        }
    }

    // post: prints the tree contents using a preorder traversal
    public void printPreorder() {
        System.out.print("preorder:");
        printPreorder(overallRoot);
        System.out.println();
    }

    // post: prints the tree contents using a preorder traversal
    // post: prints in preorder the tree with given root
    private void printPreorder(IntTreeNode root) {
        if (root != null) {
            System.out.print(" " + root.data);
            printPreorder(root.left);
            printPreorder(root.right);
        }
    }

    // post: prints the tree contents using a inorder traversal
    public void printInorder() {
        System.out.print("inorder:");
        printInorder(overallRoot);
        System.out.println();
    }

    // post: prints in inorder the tree with given root
    private void printInorder(IntTreeNode root) {
        if (root != null) {
            printInorder(root.left);
            System.out.print(" " + root.data);
            printInorder(root.right);
        }
    }

    // post: prints the tree contents using a postorder traversal
    public void printPostorder() {
        System.out.print("postorder:");
        printPostorder(overallRoot);
        System.out.println();
    }

    // post: prints in postorder the tree with given root
    private void printPostorder(IntTreeNode root) {
        if (root != null) {
            printPostorder(root.left);
            printPostorder(root.right);
            System.out.print(" " + root.data);
        }
    }

    // post: prints the tree contents, one per line, following an
    //       inorder traversal and using indentation to indicate
    //       node depth; prints right to left so that it looks
    //       correct when the output is rotated.
    public void printSideways() {
        printSideways(overallRoot, 0);
    }

    // post: prints in reversed preorder the tree with given
    //       root, indenting each line to the given level
    private void printSideways(IntTreeNode root, int level) {
        if (root != null) {
            printSideways(root.right, level + 1);
            for (int i = 0; i < level; i++) {
                System.out.print("    ");
            }
            System.out.println(root.data);
            printSideways(root.left, level + 1);
        }
    }
}