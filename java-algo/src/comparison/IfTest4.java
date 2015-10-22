package comparison;

import java.util.Scanner;

/**
 * 
 * @file_name  : Iftest4.java
 * @author     : dingo44kr@gmail.com
 * @date       : 2015. 9. 17.
 * @story      : 일등 구하기
 */

public class IfTest4 {
	/**
	 * 
	 * To. 이성한님
	 * 프로그램을 하나 개발해야 합니다.
	 * 교수는 학생평균을 입력하면 등수를 알려주는 기능을 추가해 달랍니다.
	 * 오더는 다음과 같이 화면에 출력하라고 합니다.
	 * 학생 이름 : 홍길동 (2)
	 * 학생 이름 : 김유신 (1)
	 * 학생 이름 : 강감찬 (3)
	 * 단) 학생은 총 3명입니다.
	 */
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름을 입력하세요.");
		String name = scanner.next();
		System.out.println("평균을 입력하세요");
		int aver = scanner.nextInt();
		System.out.println("이름을 입력하세요");
		String name2 = scanner.next();
		System.out.println("평균을 입력하세요");
		int aver2 = scanner.nextInt();
		System.out.println("이름을 입력하세요");
		String name3 = scanner.next();
		System.out.println("평균을 입력하세요");
		int aver3 = scanner.nextInt();
		
		
		
		String first = null;
		String re = null;		
	
		if (100<aver||100<aver2||100<aver3){ re = "다시 입력하세요";}
		
		else if(aver>aver2&&aver2>aver3&&aver>aver3){first = "홍길동 1등, 김유신2등, 강감찬 3등";}
		else if(aver2>aver&&aver2>aver3&&aver3>aver){first = "김유신 1등, 강감찬 2등, 홍길동 1등";}
		else if(aver3>aver&&aver3>aver2&&aver2>aver){first = "강감찬 1등 김유신2등, 홍길동 3등";}	
		else if(aver<aver2&&aver2>aver3&&aver3<aver){first = "김유신 1등, 홍길동 2등, 강감찬3등";}

			
		
		System.out.println(first);
				
				
		
	}
}
