import java.util.Scanner;

public class Basics1 {

	public static void main(String[] args) {
		
		int num = 1;
		String name = "Sreekar";
		boolean decision = true;
		char letter = 'c';
		float salary = 30829.77f;
		
		int[] static_arr = {10, 11, 12, 13, 14};
		int[] dynamic_arr = new int[3];
		
		Scanner input = new Scanner(System.in);
		
		for(int i=0; i<static_arr.length; i++) {
			System.out.print(static_arr[i] + " ");
		}
		
		System.out.println();
		
		for(int i=0; i<3; i++) {
			System.out.print("Enter your value: ");
			dynamic_arr[i] = input.nextInt();
		}
		
		for(int i : dynamic_arr) {
			System.out.print(i + " ");
		}

	}

}
