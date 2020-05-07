package testProject;

import java.util.Scanner;

public class TestClass {

	public static void main(String[] args) {

		System.out.println("Please say something :");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println("You said : "+str);
		sc.close();
	}

}
