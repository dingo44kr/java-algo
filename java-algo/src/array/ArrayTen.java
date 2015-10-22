package array;

import java.util.Scanner;

/**
 * @file_name  : ArrayTen.java
 * @author     : dingo44kr@gmail.com
 * @date       : 2015. 9. 21.
 * @story      : int 타입 배열 요소의 합
 */
public class ArrayTen {
	public static void main(String[] args) {
		// int[] arr = { 1, 2, 3, 4, 5, 6....1000 };

		
		Scanner scanner = new Scanner(System.in);
		
		int[] arr = new int [3];
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("점수 입력");
			arr[i] = scanner.nextInt();
			}
		
	}
}
  