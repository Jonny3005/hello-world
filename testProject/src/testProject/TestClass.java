package testProject;

import java.util.Scanner;

public class TestClass {

	public static void main(String[] args) {

		System.out.println("Please say something :");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		if (!str.isEmpty()) {
			System.out.println("String");
		} else {
			System.out.println("Empty");
		}
		System.out.println("You said : "+str);
		sc.close();
	}

}
