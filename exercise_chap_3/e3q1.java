public class e3q1 {
	public static void main(String[] args) {
		printNumbers(15);
		printNumbers(5);
	}

	public static void printNumbers(int num) {
		for (int i = 1; i <= num; i++) {
			System.out.print("[" + i + "] ");
		}
		System.out.println(); // Move to the next line after printing the numbers
	}
	}

