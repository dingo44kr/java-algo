package loop;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @file_name : NumberGolf.java
 * @author : dingo44kr@gmail.com
 * @date : 2015. 10. 5.
 * @story : 최단 횟수로 숫자 맞추기 게임
 */
public class NumberGolf {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int count = 0, player = 0;
		int com = (int) (Math.random() * 100 + 1);
		System.out.println("컴퓨터의 숫자는 정해졌다!");
		while (true) {
			System.out.println("지금부터 1부터 100사이의 정수를 입력해!");
			try {
				player = scanner.nextInt();
				if (player < 1 || player > 100) {
					System.out.println("1부터 100까지 정수만 입력해야 합니다.");
					continue;
				}

			} catch (InputMismatchException e) {
				System.out.println("문자는 안됩니다. 다시 시도해주세요.");
				return;
			} // 유효성 체크를 먼저 함
				// 로직은 완성 바랍니다.
			count++;
			System.out.println(count + "번째 입니다.");

			if (player == com) {
				System.out.println("정답입니다! 축하햏");
				return;
			} else if (player < com) {
				System.out.println("정답보다 작습니다.");
			} else {
				System.out.println("정답보다 큽니다.");
			}
		}
	}
}
