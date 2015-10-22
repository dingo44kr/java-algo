package comparison;

import java.util.Scanner;

public class SwitchTest4 {
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
		System.out.println("계산기 프로그램입니다. 수식을 입력해주세요.");
		System.out.println("첫번째 계산할 수를 입력해주세요.");
		int number1 = scanner.nextInt();
		System.out.println("사용 할 연산자를 입력 해주세요.");
		String opcode = scanner.next();
		System.out.println("계산 할 마지막 수를 입력해주세요.");
		int number2 = scanner.nextInt();
				
		
		
		int result = 0;
		int remainder = 0;
		
		switch (opcode) {
		case "+" :
			result = number1+number2;
			System.out.println(number1+"+"+number2+"="+result); 
			break;						
		case "-" :
			result = number1-number2; 
			System.out.println(number1+"-"+number2+"="+result); 
			break;
		case "*" :
			result = number1*number2;
			break;
			
		case "/" :
			result = number1/number2;
			remainder = number1%number2;
			break;
				
		default: System.out.println("연산자가 정확하지 않습니다. 다시 입력해주세요.");
			break;
		}			
				
				
				
	}
}
