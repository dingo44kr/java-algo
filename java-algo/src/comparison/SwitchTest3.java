package comparison;

import java.util.Scanner;

import javax.swing.Spring;

import org.omg.Messaging.SyncScopeHelper;

/**
 * @file_name  : SwitchTest3.java
 * @author     : dingo44kr@gmail.com
 * @date       : 2015. 9. 18.
 * @story      : 사칙연산 계산기 만들기
 */
public class SwitchTest3 {
	/**
	 * To. 이성한님
	 * 프로그램을 하나 개발해야 합니다.
	 * 오더는 다음과 같이 화면에 출력하라고 합니다.
	 * 교수가 요청하기를 브라우저에서 사용할 계산기를 만들어 달랍니다.
	 * 복잡할 필요는 없고, 사친연산 가능하고 나눗셈은
	 * 몫과 나머지값으로 출력하면 된답니다.
	 * 출력 결과물은 예를 들어
	 * 5 + 5 = 10
	 * 2 - 7 = -5
	 * 이렇게 되고,
	 * 10 / 3 = 3 [나머지 = 1] 나눗셈은 이렇게 나오면 됩니다.
	 * 그러면 []값이 나머지인지는 교수가 이미 알고 있겠답니다. 
	 */
	public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	System.out.println("계산기 입니다.");
	System.out.println("계산할 첫번째 수를 입력해주세요.");
	int a = scanner.nextInt();
	System.out.println("연산자를 입력해주세요.");
	String opcode = scanner.next();
	System.out.println("계산 할 두번째 수를 입력해주세요.");
	int b = scanner.nextInt();
			
	
	
	int res = 0;
	int na = 0;
	
	switch (opcode) {
	case "+":
		res = a+b; break; 
	
	case "-":
		res = a-b; break;
		
	case "*":
		res = a*b; break;
	
	case "/":
		res = a/b; na = a%b;		
		System.out.println(a+opcode+b+"="+res+"["+na+"]");
		return;
		
	default: System.out.println("잘못된 연산자입니다. 연산자를 다시 입력해 주세요"); return;
	}
	
	System.out.println(a+opcode+b+"="+res);
		
	}

}
