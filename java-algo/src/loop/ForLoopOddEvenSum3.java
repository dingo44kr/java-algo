package loop;

import java.util.Scanner;

/**
 * @file_name  : ForLoopOddEvenSum2.java
 * @author     : dingo44kr@gmail.com
 * @date       : 2015. 9. 21.
 * @story      : 등차수열 입력한 값과 값사이의 요소의 홀수합, 짝수합 따로 구하기
 */
public class ForLoopOddEvenSum3 {
	/**
	 * 입력받은 두개의 수 범위 값 중에서
	 * 짝수의 합, 홀수의 합을 따로 출력하세요.
	 */

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int better = 0, smaller = 0, a = 0, b = 0, result = 0;
		System.out.print("원하는 숫자까지의 합을 구하는 프로그램입니다.");
		System.out.print("원하는 첫번 째 숫자를 입력해주세요.");
		better = scanner.nextInt();
		System.out.println("원하는 두번 째 숫자를 입력해주세요.");
		smaller = scanner.nextInt();
				
		a = 0;
		b = 0;  
		result = 0;
		int evenSum = 0;
		int oddSum = 0;
		
		if (better>smaller) { a = better; b = smaller;
		}
		else { a = smaller; b = better;
		}
		// 숫자 사이의 서열을 정리한 것.
			
		for (int i = b; i <= a; i+=2) {
			if (i % 2 == 0) {// 짝수일 때
				evenSum += i;
			} else {// 홀수일 때
				oddSum += i;
			}
}
		
	}
}