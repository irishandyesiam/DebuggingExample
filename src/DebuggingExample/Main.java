package DebuggingExample;

public class Main {

	public static void main(String[] args) {
		
		int firstInt = 7;
		int secondInt = 8;
		
		int sum = add(firstInt, secondInt);
		
		System.out.println("The sum is: " + sum);

	}

	private static int add(int firstInt, int secondInt) {
		int sum = firstInt + secondInt;
		return sum;
	}

}
