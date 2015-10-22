package operator;
/**
 * @file_name  : UnaryTest2.java
 * @author     : dingo44kr@gmail.com
 * @date       : 2015. 9. 16.
 * @story      : 나눗셈 문법
 */
public class ArithmeticDemo {
	public static void main(String[] args) {
		
		int x = 9, y = 5, z = 0;
		z = x / y;
		System.out.println("몫만 취하는 x / y = "+z);
		// 프로그래밍에서 나눗셈은 두가지 결과값을 가진다
		// 하나는 몫만 취하는 것이고, 다른 하나는 나머지 값만 취한다.
		
		z = x % y;
		System.out.println("나머지 값만 취하는 x % y = "+z);

	}
}
