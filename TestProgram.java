import java.util.Scanner;

public class TestProgram {

	public static void main(String[] args) {
		System.out.print("Enter The String:");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		int length = input.length() ,midLength = length / 2 , k = 0;
		System.out.println("The Output Is:");
		for(int i = 0; i < input.length(); i++) {
			for(int j = i; j < input.length(); j++) {
				System.out.print("  ");
			}
			k = i + 1;
			while(k > 0) {
				if(midLength < length)
					System.out.print(input.charAt(midLength)+" ");
				else
					System.out.print(input.charAt(midLength - length)+" ");
				midLength++;
				k--;
			}
			midLength = length / 2;
			System.out.println();
		}
	}

}
