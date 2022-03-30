import java.util.Scanner;
public class Animal {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Boolean loop= true;
		
		while (loop == true) {
			System.out.println("Would you like to look at a Dog or Cat?");
			String animals = scanner.nextLine();
			if (animals.equalsIgnoreCase("dog")) {
				System.out.println(" dog art here");
				loop = false;
				
			}
			else if(animals.equalsIgnoreCase("cat")) {
				System.out.println("cat art here");
				loop = false;
			}
			else {
				System.out.println("invalid option!");
			}
		}
	}
}
