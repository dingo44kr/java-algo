package loop;

import java.util.Scanner;

/**
 * @file_name  : WhileLoopTen.java
 * @author     : dingo44kr@gmail.com
 * @date       : 2015. 9. 24.
 * @story      : 1부터 10까지 While 문으로 코딩하기.
 */

public class WhileLoopTen {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	
		int i = 1, sum = 0, key = 0;
		
		while (true) { // 무한루프를 사용할 때는 WhileLoop을 사용한다.
			System.out.println("원하는 업무를 선택해주세요\n "
					+ "1: 통장개설 2: 잔액조회 3: 입금 4: 출금 5: 정지");
			key = scanner.nextInt();
			System.out.print(i+"\t");			
			
			switch (key) {
			case 1 : i++; break;
			case 2 : return;

			default:break;
			}

		}
		
//		System.out.println();
//		i = 1; // 이 부분을 생략하면 i에 이미 10이 할당 된 상태로 진행된다.
//		//아래 for문에 돌기 때문에 1부터 증감하는 컨디션을
//		for (; i < 11; i++) {
//			sum+=i;
//		}
//		
//		System.out.println("1부터 10 까지 합계: " +sum);
	}
	
}
