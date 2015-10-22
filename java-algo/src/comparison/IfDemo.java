package comparison;

import java.util.Scanner;

/**
 * @file_name  : IfDemo.java
 * @author     : dingo44kr@gmail.com
 * @date       : 2015. 9. 17.
 * @story      : 단일if문 예제
 */

public class IfDemo {
	public static void main(String[] args) {
		/**
		 * 변수명은 num
		 * 컨디션은 10 이상이면
		 * "입력한 수는 10 이상입니다."
		 * "입력한 수는 10 미만입니다." 
		 */
		/**
		 * 기타(3) : continue, break(스위치 문에서만 사용), return(스위치 문을 제외한 나머지 구문에서 end)
		 */
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("10 이상인지, 10 미만인지 판별해 주는 프로그램입니다. 숫자를 어서! 입력해주세요!");
		int num = scanner.nextInt();
		
		if(num>=10) {num=10;
		System.out.println("입력한 수는 "+num+"이상 입니다.");}
		
		else {num=10;
		System.out.println("입력한 수는 "+num+"미만 입니다.");}
		
				
			
		
	}
}
