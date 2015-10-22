package loop;

import java.util.Scanner;

/**
 * @file_name  : ForLoopTenSum2.java
 * @author     : dingo44kr@gmail.com
 * @date       : 2015. 9. 21.
 * @story      : 등차수열 입력한 값과 값사이의 요소의 합 구하기
 */
public class ForLoopSum {
	/**
	 * To. 개발자님
	 * 교수님이 원하는 숫자부터 원하는 숫자까지의 합을 구하는 프로그램이 필요하답니다.
	 * 그런데, 교수님이 까다로워서 큰 수를 먼저 입력하든
	 * 나중에 입력하든 두 수 사이의 정수들의 합을 나오게 해달랍니다.
	 * 5 부터 137까지의 합은 ????입니다.
	 * [결과]
	 * 
	 * 힌트 : 3 + 1 = 4
	 * 3 += 1;
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
		
		if (better>smaller) { a = better; b = smaller;
		} 
		else { a = smaller; b = better;
		}
		// 숫자 사이의 서열을 정리한 것.

		
		for (int i = b; i <= a; i++) {
			result += i;
			
		}
		
		System.out.println(b+"부터 "+a+"까지의 합"+" = "+result);
		
	}
}
