package comparison;

import java.util.Scanner;

/**
 * @file_name  : SwitchTest.java
 * @author     : dingo44kr@gmail.com
 * @date       : 2015. 9. 18.
 * @story      :
 */

public class SwitchTest {
	/**
	 * 
	 * To. 이성한님
	 * 프로그램을 하나 개발해야 합니다.
	 * 교수는 주민번호를 입력하면 해당 학생이 남자인지, 여자인지, 외국인인지
	 * 자동으로 출력해 주는 프로그램을 만들어 달랍니다.
	 * 오더는 다음과 같이 화면에 출력하라고 합니다.
	 * 홍길동 : 800101-1234567 : 남
	 * 입력값은 이름과 주민번호이고 남, 여, 외국인은 자동으로 출력되는 값입니다.
	 * 현행법상 1, 3으로 시작되면 남자, 2, 4로 시작되면 여자, 5,6 이면 외국인
	 * 교수가 실수로 0,7,8,9로 시작되는 주민번호를 입력하면  
	 * "다시 입력하세요"라고 알려주시길 바랍니다.
	 */
	
	public static void main(String[] args) {
		/**
		 * String ssn = scanner.next();
		 * char ch = ssn.chartAt();
		 * ssn = ssn
		 */
				
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름을 입력해 주세요");
		String name = scanner.next();
		System.out.println("주민등록 번호를 입력해주세요! 어서! 피싱이 아닙니다.");
		String ssn = scanner.next();
		
		String gen = null;
		
		char ch = ssn.charAt(7);
		
		switch (ch) {
		case '1':
		case '3':
			gen = "남자"; break;
		
		case '2':
		case '4':
			gen = "여자"; break;
			
		case '5':
		case '6':
			gen = "외국인"; break;
			
		default:
			gen = "다시 입력하세요";
		}	
			
			
		System.out.println("이름"+"\t"+"주민등록번호"+"\t"+"성별");
		System.out.println("============================");
		System.out.println(name+"\t"+ssn+"\t"+gen);	
		
	}
}
