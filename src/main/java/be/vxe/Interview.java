

class Example {

    public static int powersOf2(int n) {
        if (n < 1) {
            return 0;
        } else if (n == 1) {
            System.out.println(1);
            return 1;
        } else {
            int prev = powersOf2(n / 2);
            int curr = prev * 2;
            System.out.println(curr);
            return curr;
        }
    }
    public static void main(String[] args) {
        powersOf2(4);
    }
}

class Question {

    public static int numChars = 26;

    public static void printSortedStrings(int remaining) {
        printSortedStrings(remaining, "");
    }

    public static void printSortedStrings(int remaining, String prefix) {
        if (remaining == 0) {
            if (isInOrder(prefix)) {
                System.out.println(prefix);
            }
        } else {
            for (int i = 0; i < numChars; i++) {
                char c = ithLetter(i);
                printSortedStrings(remaining - 1, prefix + c);
            }
        }
    }

    public static boolean isInOrder(String s) {
        for (int i = 1; i < s.length(); i++) {
            int prev = ithLetter(s.charAt(i - 1));
            int curr = ithLetter(s.charAt(i));
            if (prev > curr) {
                return false;
            }
        }
        return true;
    }

    public static char ithLetter(int i) {
        return (char) (((int) 'a') + i);
    }

    public static void main(String[] args) {
        printSortedStrings(5);
    }

}

class Uniqueness {

    public static boolean isUniqueChars(String str) {
        if (str.length() > 128) {
            return false;
        }
        int checker = 0;
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i) - 'a';
            if ((checker & (1 << val)) > 0) return false;
            checker |= (1 << val);
        }
        return true;
    }

    public static boolean isUniqueChars2(String str) {
        if (str.length() > 128) {
            return false;
        }

        boolean[] char_set = new boolean[128];
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i);
            if (char_set[val]) return false;
            char_set[val] = true;
        }
        return true;
    }

    public static void main(String[] args) {
        String[] words = {"abcde", "hello", "apple", "kite", "padle"};
        for (String word : words) {
            System.out.println(word + ": " + isUniqueChars(word) + " " + isUniqueChars2(word));
        }
    }

class Permudations {}

class URL {}

class Palindrome {}

class Compression {}

class MatrixOperatons

class Matrix {}

class StringOperations {}

class LLOperations {
    // *** 1 remove-dups
    // *** 2 return-kth-to-last
    // *** 3 delete-middle-node
    // *** 4 partition
    // *** 5 sum-lists
    // *** 6 palindrome
    // *** 7 intersection
    // *** 8 loop-detection
}

class StackOperations{
       // *** implementation
       // *** 1 three-in-one
       // *** 2 stack-min
       // *** 3 stack-of-plates
       // *** 4 queue-via-stacks
       // *** 5 sort-stack
       // *** 6 animal-shelter
}

class Graph{}

class GraphOperations{
    // *** 2 route-between-nodes
    // *** 3 minimal-tree
    // *** 4 list-of-depths
    // *** 5 validate-bst
    // *** 6 successor
    // *** 7 build-order
    // *** 8 first-common-ancestor
    // *** 9 bst-sequences
    // *** 10 check-subtree
    // *** 11 random-node
    // *** 12 paths-with-sum
}

class NumberSwapper{}

class StringStats {}

class SetOperations{}

class TicTacWin {}

class FactorialZeros {}

class SmallestDifference {}

class NumberMax{}

class EnglishInt {}

class Operations{}

class LivingPeople{}

class DivingBoard {}

class Encoder {}

class BisectSquares {}

class BestLine {}

class MasterMind {}

class SubSort {}

class ContiguousSequence {}

class PatternMatcher {}

class PondSizes

class T9 {}

class SumSwap {}

class LangtonsAnt {}

class RandFrom

class PairtWithSum{}

class Cache {}

class Calculator

class Adder {}

class Shuffler {}

class RandomSet {}

class MissingNumber {}

class LettersAndNumber

class CountOf2s {}

class BabyNames {}

class CircusTower {}

class KthMultiple {}

class MajorityElement {}

class WordDistance {}

class BiNode {}

class ReSpace {}

class SmallestK {}

class Masseuse {}

class MultiSearch {}

class ShortestSupersequence {}

class MissingTwo{}

class ContinuousMedian{}

class Histogram {}

class WordTransformer{}

class MaxBlockSquare{}

class MaxSubmatrix {}

class WordRectangle{}

class SparseSimilarity {}

public static int randomInt(int n) {
    return (int) (Math.random() * n);
}

public static int randomIntInRange(int min, int max) {
    return randomInt(max + 1 - min) + min;
}

public static boolean randomBoolean() {
    return randomIntInRange(0, 1) == 0;
}

public static boolean randomBoolean(int percentTrue) {
    return randomIntInRange(1, 100) <= percentTrue;
}

public static boolean[][] randomBooleanMatrix(int M, int N, int percentTrue) {
    boolean[][] matrix = new boolean[M][N];
    for (int i = 0; i < M; i++) {
        for (int j = 0; j < N; j++) {
            matrix[i][j] = randomBoolean(percentTrue);
        }
    }
    return matrix;
}

public static int[][] randomMatrix(int M, int N, int min, int max) {
    int[][] matrix = new int[M][N];
    for (int i = 0; i < M; i++) {
        for (int j = 0; j < N; j++) {
            matrix[i][j] = randomIntInRange(min, max);
        }
    }
    return matrix;
}

public static int[] randomArray(int N, int min, int max) {
    int[] array = new int[N];
    for (int j = 0; j < N; j++) {
        array[j] = randomIntInRange(min, max);
    }
    return array;
}

public static LinkedListNode randomLinkedList(int N, int min, int max) {
    LinkedListNode root = new LinkedListNode(randomIntInRange(min, max),
                                             null, null);
    LinkedListNode prev = root;
    for (int i = 1; i < N; i++) {
        int data = randomIntInRange(min, max);
        LinkedListNode next = new LinkedListNode(data, null, null);
        prev.setNext(next);
        prev = next;
    }
    return root;
}

public static LinkedListNode linkedListWithValue(int N, int value) {
    LinkedListNode root = new LinkedListNode(value, null, null);
    LinkedListNode prev = root;
    for (int i = 1; i < N; i++) {
        LinkedListNode next = new LinkedListNode(value, null, null);
        prev.setNext(next);
        prev = next;
    }
    return root;
}

public static LinkedListNode createLinkedListFromArray(int[] vals) {
    LinkedListNode head = new LinkedListNode(vals[0], null, null);
    LinkedListNode current = head;
    for (int i = 1; i < vals.length; i++) {
        current = new LinkedListNode(vals[i], null, current);
    }
    return head;
}

public static String arrayToString(int[] array) {
    if (array == null) return "";
    return arrayToString(array, 0, array.length - 1);
}

public static String arrayToString(int[] array, int start, int end) {
    StringBuilder sb = new StringBuilder();
    for (int i = start; i <= end; i++) {
        int v = array[i];
        sb.append(v + ", ");
    }
    return sb.toString();
}

public static String stringArrayToString(String[] array) {
    StringBuilder sb = new StringBuilder();
    for (String v : array) {
        sb.append(v + ", ");
    }
    return sb.toString();
}

public static String toFullBinaryString(int a) {
    String s = "";
    for (int i = 0; i < 32; i++) {
        Integer lsb = new Integer(a & 1);
        s = lsb.toString() + s;
        a = a >> 1;
    }
    return s;
}

public static String toBaseNString(int a, int base) {

    String s = "";
    while (true) {
        int lastdigit = a % base;
        s = lastdigit + s;
        a = a / base;
        if (a == 0)
            break;
    }

    return s;
}

public static void printMatrix(int[][] matrix) {
    for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix[i].length; j++) {
            if (matrix[i][j] < 10 && matrix[i][j] > -10) {
                System.out.print(" ");
            }
            if (matrix[i][j] < 100 && matrix[i][j] > -100) {
                System.out.print(" ");
            }
            if (matrix[i][j] >= 0) {
                System.out.print(" ");
            }
            System.out.print(" " + matrix[i][j]);
        }
        System.out.println();
    }
}

public static void printMatrix(boolean[][] matrix) {
    for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix[i].length; j++) {
            if (matrix[i][j]) {
                System.out.print("1");
            } else {
                System.out.print("0");
            }
        }
        System.out.println();
    }
}

public static void printIntArray(int[] array) {
    for (int i = 0; i < array.length; i++) {
        System.out.print(array[i] + " ");
    }
    System.out.println("");
}

public static String charArrayToString(char[] array) {
    StringBuilder buffer = new StringBuilder(array.length);
    for (char c : array) {
        if (c == 0) {
            break;
        }
        buffer.append(c);
    }
    return buffer.toString();
}

public static String listOfPointsToString(ArrayList<Point> list) {
    StringBuilder buffer = new StringBuilder();
    for (Point p : list) {
        buffer.append("(" + p.x + "," + p.y + ")");
    }
    return buffer.toString();
}

public static TreeNode randomBST(int N, int min, int max) {
    int d = randomIntInRange(min, max);
    TreeNode root = new TreeNode(d);
    for (int i = 1; i < N; i++) {
        root.insertInOrder(randomIntInRange(min, max));
    }
    return root;
}

public static TreeNode createTreeFromArray(int[] array) {
    if (array.length > 0) {
        TreeNode root = new TreeNode(array[0]);
        java.util.Queue<TreeNode> queue = new java.util.LinkedList<TreeNode>();
        queue.add(root);
        boolean done = false;
        int i = 1;
        while (!done) {
            TreeNode r = (TreeNode) queue.element();
            if (r.left == null) {
                r.left = new TreeNode(array[i]);
                i++;
                queue.add(r.left);
            } else if (r.right == null) {
                r.right = new TreeNode(array[i]);
                i++;
                queue.add(r.right);
            } else {
                queue.remove();
            }
            if (i == array.length) {
                done = true;
            }
        }
        return root;
    } else {
        return null;
    }
}

public static String getLongTextBlob() {
    String book = "As they rounded a bend in the path that ran beside the river, Lara recognized the silhouette of a fig tree atop a nearby hill. The weather was hot and the days were long. The fig tree was in full leaf, but not yet bearing fruit. "
                 + "Soon Lara spotted other landmarks�an outcropping of limestone beside the path that had a silhouette like a man�s face, a marshy spot beside the river where the waterfowl were easily startled, a tall tree that looked like a man with his arms upraised. They were drawing near to the place where there was an island in the river. The island was a good spot to make camp. They would sleep on the island tonight."
                 + "Lara had been back and forth along the river path many times in her short life. Her people had not created the path�it had always been there, like the river�but their deerskin-shod feet and the wooden wheels of their handcarts kept the path well worn. Lara�s people were salt traders, and their livelihood took them on a continual journey. ";
    String book_mod = book.replace('.', ' ').replace(',', ' ')
        .replace('-', ' ');
    return book_mod;
}

public static String[] getLongTextBlobAsStringList() {
    return getLongTextBlob().split(" ");
}

public static String[] getListOfWords() {
    return getLongTextBlob().split(" ");
}

// idk what getListofWords is so redefining it above
public static Trie getTrieDictionary() {
    return new Trie(getListOfWords());
}

public static HashSet<String> getWordListAsHashSet() {
    String[] wordList = getListOfWords();
    HashSet<String> wordSet = new HashSet<String>();
    for (String s : wordList) {
        wordSet.add(s);
    }
    return wordSet;
}

/* One node of a binary tree. The data element stored is a single 
 * character.
 */
 class TreeNode {
	public int data;      
	public TreeNode left;    
	public TreeNode right; 
	public TreeNode parent;
	public int size = 0;

	public TreeNode(int d) {
		data = d;
		size = 1;
	}
	
	public void setLeftChild(TreeNode left) {
		this.left = left;
		if (left != null) {
			left.parent = this;
		}
	}
	
	public void setRightChild(TreeNode right) {
		this.right = right;
		if (right != null) {
			right.parent = this;
		}
	}
	
	public void insertInOrder(int d) {
		if (d <= data) {
			if (left == null) {
				setLeftChild(new TreeNode(d));
			} else {
				left.insertInOrder(d);
			}
		} else {
			if (right == null) {
				setRightChild(new TreeNode(d));
			} else {
				right.insertInOrder(d);
			}
		}
		size++;
	}
	
	public int size() {
		return size;
	}
	
	public boolean isBST() {
		if (left != null) {
			if (data < left.data || !left.isBST()) {
				return false;
			}
		}
		
		if (right != null) {
			if (data >= right.data || !right.isBST()) {
				return false;
			}
		}		
		
		return true;
	}
	
	public int height() {
		int leftHeight = left != null ? left.height() : 0;
		int rightHeight = right != null ? right.height() : 0;
		return 1 + Math.max(leftHeight, rightHeight);
	}
	
	public TreeNode find(int d) {
		if (d == data) {
			return this;
		} else if (d <= data) {
			return left != null ? left.find(d) : null;
		} else if (d > data) {
			return right != null ? right.find(d) : null;
		}
		return null;
	}
	
	public static TreeNode createMinimalBST(int arr[], int start, int end){
		if (end < start) {
			return null;
		}
		int mid = (start + end) / 2;
		TreeNode n = new TreeNode(arr[mid]);
		n.setLeftChild(createMinimalBST(arr, start, mid - 1));
		n.setRightChild(createMinimalBST(arr, mid + 1, end));
		return n;
	}
	
	public static TreeNode createMinimalBST(int array[]) {
		return createMinimalBST(array, 0, array.length - 1);
	}
	
	public void print() {
		BTreePrinter.printNode(this);
	}
}

class BTreePrinter {

    public static <T extends Comparable<?>> void printNode(TreeNode root) {
        int maxLevel = BTreePrinter.maxLevel(root);

        printNodeInternal(Collections.singletonList(root), 1, maxLevel);
    }

    public static <T extends Comparable<?>> void printNodeInternal(List<TreeNode> nodes, int level, int maxLevel) {
        if (nodes.isEmpty() || BTreePrinter.isAllElementsNull(nodes))
            return;

        int floor = maxLevel - level;
        int endgeLines = (int) Math.pow(2, (Math.max(floor - 1, 0)));
        int firstSpaces = (int) Math.pow(2, (floor)) - 1;
        int betweenSpaces = (int) Math.pow(2, (floor + 1)) - 1;

        BTreePrinter.printWhitespaces(firstSpaces);

        List<TreeNode> newNodes = new ArrayList<TreeNode>();
        for (TreeNode node : nodes) {
            if (node != null) {
                System.out.print(node.data);
                newNodes.add(node.left);
                newNodes.add(node.right);
            } else {
                newNodes.add(null);
                newNodes.add(null);
                System.out.print(" ");
            }

            BTreePrinter.printWhitespaces(betweenSpaces);
        }
        System.out.println("");

        for (int i = 1; i <= endgeLines; i++) {
            for (int j = 0; j < nodes.size(); j++) {
                BTreePrinter.printWhitespaces(firstSpaces - i);
                if (nodes.get(j) == null) {
                    BTreePrinter.printWhitespaces(endgeLines + endgeLines + i + 1);
                    continue;
                }

                if (nodes.get(j).left != null)
                    System.out.print("/");
                else
                    BTreePrinter.printWhitespaces(1);

                BTreePrinter.printWhitespaces(i + i - 1);

                if (nodes.get(j).right != null)
                    System.out.print("\\");
                else
                    BTreePrinter.printWhitespaces(1);

                BTreePrinter.printWhitespaces(endgeLines + endgeLines - i);
            }

            System.out.println("");
        }

        printNodeInternal(newNodes, level + 1, maxLevel);
    }

    public static void printWhitespaces(int count) {
        for (int i = 0; i < count; i++)
            System.out.print(" ");
    }

    public static <T extends Comparable<?>> int maxLevel(TreeNode node) {
        if (node == null)
            return 0;

        return Math.max(BTreePrinter.maxLevel(node.left), BTreePrinter.maxLevel(node.right)) + 1;
    }

    public static <T> boolean isAllElementsNull(List<T> list) {
        for (Object object : list) {
            if (object != null)
                return false;
        }

        return true;
    }

}

}
