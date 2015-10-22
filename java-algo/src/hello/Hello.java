package hello;

import java.util.Scanner;

public class Hello {
	public static void main(String[] args) {
		String hello = "검색어를 입력해주세요";
		System.out.println(hello);
		Scanner scanner = new Scanner(System.in);
		String hi = scanner.next();
		System.out.println(hi);
	}
}
