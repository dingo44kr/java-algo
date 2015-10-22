package loop;

import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 * @file_name : NumberBingo.java
 * @author : dingo44kr@gmail.com
 * @date : 2015. 10. 5.
 * @story : 숫자 맞추기 게임
 */
public class NumberBingo {
	/**
	 * 1부터 10까지 랜덤 숫자를 컴퓨터가 생성하면 3회 안에 숫자를 맞추는데 플레이어가 입력한 숫자가 답보다 큰지 작은지 알려줌.
	 */
	public static void main(String[] args) {
		int com = 0, player = 0, count = 0;
		com = (int) (Math.random() * 10 + 1); // 랜덤 수 발생 (Math.random() * 999999 + 100000)
		
		while (true) {
			player = Integer.parseInt(JOptionPane.showInputDialog("1부터 10까지 숫자만 넣으세요."));
			
			try {
				count++;
				
				if (player == com) {
					System.out.println("정답입니다!");
					break;
				} else if (player < com) {
					System.out.println("답보다 작습니다. 숫자를 올려주세요.");
				} else {
					System.out.println("답보다 큽니다. 숫자를 내려주세요.");
				}

				System.out.println("\n");
				if (count == 3) {
					System.out.println("안타깝네요~ 게임의 총 회수는 3회입니다.");
					System.out.println("정답은" + com + "입니다.");
					return;
				}
			} catch (Exception e) {
				System.out.println("1부터 10사이 숫자만 입력하세요.");
				count--; // 범위 밖의 숫자를 입력했을 때에는 카운트에서 제외 해 준다.
			}

		}

	}
}
