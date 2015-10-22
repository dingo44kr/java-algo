package hello;

import java.util.Scanner;

public class Name3 {
	public static void main(String[] args) {
		System.out.println("성함이 무엇이죠?");
		Scanner scanner = new Scanner(System.in);
		String hi = scanner.next();
		System.out.println(hi);
	}
}
