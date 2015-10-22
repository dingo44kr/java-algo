package comparison;

import java.util.Scanner;

import javax.swing.Spring;

import org.omg.Messaging.SyncScopeHelper;

/**
 * @file_name : SwitchTest3.java
 * @author : dingo44kr@gmail.com
 * @date : 2015. 9. 18.
 * @story : 스태틱으로 사칙연산 계산기 만들기
 */

public class StaticCalcMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자 2개를 입력하세요 : ");
		
//		StaticCalc calc = new StaticCalc();
//		타입		인스턴스	= new 생성자
//		calc.plus(scanner.nextInt(), scanner.nextInt()); 인스턴스 방식으로 접근해서 경고메시지가 발생
		System.out.println(StaticCalc.plus(scanner.nextInt(), scanner.nextInt())); // StaticCalc는 위에서 객체로 선언이 안되었지만, 가져와서 사용이 가능하다.
	
		// ex) Collections.max(a); => Collections 라는 클래스 안의 max 라는 이름을 가진 함수를 가져와서 사용. static!!
		//	 	Math.random(); // 기본적으로 사용을 하게 되어있기 때문에 static 변수로 저장.
	}
}

class StaticCalc {
	static int result = 0; // 멤버변수 중에서 클래스 변수

	public static int plus(int a, int b) { // static 없으면 인스턴스(default) // 괄호안의 변수는 매개변수 = 파라미터 = 매변 이라 한다, 다만 파라미터는 초기화 할 필요가 없다.
		// int temp = 0; // 지역변수 = 로컬변수 > (매개변수는 지역변수에 속한다)
		return a + b;
	}

	public static int minus(int a, int b) {
		return a - b;
	}

	public static int multi(int a, int b) {
		return a * b;
	}

	public static int divide(int a, int b) {
		return a / b;
	}
}
