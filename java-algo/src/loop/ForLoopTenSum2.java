package loop;

import java.util.Scanner;

/**
 * @file_name  : ForLoopTenSum2.java
 * @author     : dingo44kr@gmail.com
 * @date       : 2015. 9. 21.
 * @story      : 원하는수까지의 합을 구하는 프로그램 만들기.
 */
public class ForLoopTenSum2 {
	/**
	 * To. 개발자님
	 * 교수님이 1부터 원하는 숫자까지 합 구하는 프로그램이 필요하답니다.
	 * 힌트 : 3 + 1 = 4
	 * 3 += 1;
	 */  

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int want = 0, result = 0;
		System.out.print("원하는 숫자까지의 합을 구하는 프로그램입니다.");
		System.out.print("원하는 숫자를 입력해주세요.");
		want = scanner.nextInt();

		result = 0;

		for (int i = 1; i <= want; i++) {

			result += i;

		}

		System.out.println("1부터 " + want + "까지의 합" + " = " + result);
	}
}
