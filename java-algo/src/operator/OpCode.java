package operator;
/**
 * @file_name  : OpCode.java
 * @author     : dingo44kr@gmail.com
 * @date       : 2015. 9. 16.
 * @story      : 연산자 문법
 */

public class OpCode {
	public static void main(String[] args) {
		/**
		 * && : 둘 다 참일 때 실행
		 * || : 둘 중 하나만 참이어도 실행
		 * 
		 */
		
		int a, b, c; // 데어트 타입 = 타입 같다 / 타입이 동일한 변수를 선언할 때 묶음처리 가능
		
		
		a = b = 10;
		c = a + b;
		System.out.println("결과값 : "+c);
		
		
}
}
