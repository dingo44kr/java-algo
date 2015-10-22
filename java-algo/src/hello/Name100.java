package hello;

import java.util.Scanner;
/**
 * @file_name  : Name100.java
 * @author     : dingo44kr@gmail.com
 * @date       : 2015. 9. 15.
 * @story      : 인풋, 아웃풋 이벤트
 */
public class Name100 {
	public static void main(String[] args) {
		System.out.println("이름입력");
		Scanner scanner = new Scanner(System.in);
		String hong = scanner.next();
		System.out.println("반갑습니다. "+hong+" 님");
	}
}
