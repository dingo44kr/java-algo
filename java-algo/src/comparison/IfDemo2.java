package comparison;

import java.util.Scanner;

/**
 * @file_name  : IfDemo2.java
 * @author     : dingo44kr@gmail.com
 * @date       : 2015. 9. 17.
 * @story      : 단일 if문 예제2
 */

public class IfDemo2 {
	/**
	 * 변수명은 num
	 * 컨디션은 10 이상이면
	 * "입력한 수는 10 이상입니다."
	 * "입력한 수는 10 미만입니다." 
	 */	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자를 입력해 주세요");
		int num = scanner.nextInt();
		
		
		if(num>=10) {num = 10;
		System.out.println("입력한 수는 "+num+" 이상입니다.");}
		
		if(num<10) {num = 10;
		System.out.println("입력한 수는 "+num+" 미만입니다.");}
		
				
	}
}
