package loop;

import java.util.Collections;
import java.util.Scanner;

/**
 * @file_name : NumberNear.java
 * @author : dingo44kr@gmail.com
 * @date : 2015. 10. 5.
 * @story : 가까운 수 구하기
 */

public class NumberNear {
	/**
	 * [결과] 다음 배열이 있을 때 입력한 수와 가장 가까운 수를 구하시오. 단, 동일 갭이면 작은 수를 선택한다.
	 * 
	 * @return
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("수를 입력 해 주세요.");
		int[] arr = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
		int gap = 0, target = scanner.nextInt(), nearTemp = 0;
		String result = "";
		int min = Integer.MAX_VALUE;
		
		for (int i = 0; i < arr.length; i++) {
			gap = arr[i] - target;

			if (Math.abs(gap) == 0) {
				result = "가장 가까운 값은 입력하신" + target + "입니다. 값을 다시 입력 해 주세요.";
			}
			else if (Math.abs(gap) < min) {
				min = Math.abs(gap);
				nearTemp = arr[i];
				result = ("입력하신" + target + "값과 가장 가까운 값은" + nearTemp + "입니다.");
			}
			
		}
		System.out.println(result);
	}

}
