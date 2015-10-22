package comparison;

import java.util.Scanner;

/**
 * @file_name  : IfDemo3.java
 * @author     : dingo44kr@gmail.com
 * @date       : 2015. 9. 17.
 * @story      :
 */

public class IfDemo3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("판별하려는 숫자를 입력하세요");
		int num = scanner.nextInt();
		System.out.println("기준값을 입력하세요");
		int gijun = scanner.nextInt();
		if(num>gijun){
			System.out.println(num+"은(는)"+gijun+"초과입니다.");}
		
		else if(num == gijun){
			System.out.println(num+"은(는)"+gijun+ "같습니다.");}

		else{System.out.println(num+"은(는)"+gijun+ "미만 입니다.");}

		
	}
}
