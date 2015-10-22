package comparison;

import java.util.Scanner;

/**
 * @author 이성한
 */
public class SwitchTest5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("계산기 프로그램입니다.");
		System.out.println("계산할 첫번 째 수를 입력해주세요.");
		int num1 = scanner.nextInt();
		System.out.println("연산자를 입력 해 주세요.");
		String opcode = scanner.next();
		System.out.println("마지막으로 계산 할 수를 입력하여 주세요.");
		int num2 = scanner.nextInt();
		
		int result = 0;
		int remainder = 0;
		
		switch (opcode) {
		case "+":
			result = num1+num2; break;
		case "-":
			result = num1-num2; break;
		case "*":
			result = num1*num2; break;
		case "/":
			result = num1/num2;
			remainder = num1%num2;
			System.out.println(num1+opcode+num2+"="+result+"["+remainder+"]");
			return;
	
		default: System.out.println("연산자를 잘못 입력하였습니다. 다시 입력해 주세요.");
			return;
		}

		System.out.println(num1+opcode+num2+"="+result);
		
		
	}
}