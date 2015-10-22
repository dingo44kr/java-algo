package variable;

import java.util.Scanner;

/**
 * @file_name  : TaxTest3.java
 * @author     : dingo44kr@gmail.com
 * @date       : 2015. 9. 16.
 * @story      :
 */
public class TaxTest3 {
	public static void main(String[] args) {
		// 지역변수 초기화 : 변수값의 그 타입에 맞는 기본값을 할당하는 것.
		// 단, 스캐너로 입력받을 시, 생략가능.
		// 
		
	final double TAX_RATE = 0.097;
	int salary;
	
	Scanner scanner = new Scanner(System.in);
	System.out.println("이름을 입력하세요");
	String me = scanner.next();
	System.out.println("연봉을 입력하세요");
	salary = scanner.nextInt();
	
	
	System.out.println("연봉 "+salary+" 만원을 받으시는 "+me+" 님께서 납부할 세금은 "+(int) (salary * TAX_RATE)+" 만원 입니다.");
	
 //한번에 수정하는 것은 전체 드래그 후 => Ctrl+F
	
	}
}
