package comparison;

import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

/**
 * 
 * @file_name : Iftest4.java
 * @author : dingo44kr@gmail.com
 * @date : 2015. 9. 17.
 * @story : 일등 구하기
 */

public class IfTest5 {
	/**
	 * 
	 * To. 이성한님
	 * 프로그램을 하나 개발해야 합니다.
	 * 교수는 학생평균을 입력하면 1등을 알려주는 기능을 추가해 달랍니다.
	 * 오더는 다음과 같이 화면에 출력하라고 합니다.
	 * 학생 이름 : 홍길동 (2)
	 * 학생 이름 : 김유신 (1)
	 * 학생 이름 : 강감찬 (3)
	 * 단) 학생은 총 3명입니다. 그리고 평균점수는 0 이상 100 이하입니다.
	 * 교수가 실수로 120점이라든지 하는 범위 밖 점수를 입력하면
	 * "다시 입력하세요"라고 알려주시길 바랍니다.
	 */
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("학생 3명의 이름과 평균을 입력해주세요.");
		String st1, st2, st3;
		int sc1, sc2, sc3;
		System.out.print("학생 1의 이름 : ");
		st1 = scanner.next();
		System.out.print("학생 1의 성적 : ");
		sc1 = scanner.nextInt();
		System.out.print("학생 2의 이름 : ");
		st2 = scanner.next();
		System.out.print("학생 2의 성적 : ");
		sc2 = scanner.nextInt();
		System.out.print("학생 3의 이름 : ");
		st3 = scanner.next();
		System.out.print("학생 3의 성적 : ");
		sc3 = scanner.nextInt();
		
		
		
		if(sc1 > 100 || sc1 < 0 || sc2 > 100 || sc2 < 0 || sc3 > 100 || sc3 < 0){
			System.out.println("다시 입력하세요.");
		}
		else if(sc1 > sc2 && sc1 > sc3){
			System.out.println("1등 : " +st1);
			if (sc2>sc3) {
				System.out.println("2등 : " +st2);
				System.out.println("3등 : " +st3);
				}
			else {System.out.println("2등 : " +st3);
			System.out.println("3등 : " +st2);}
		}
		
		else if (sc2 > sc1 && sc2 >sc3) {
			System.out.println("1등 : " +st2);
			if (sc1>sc3) {System.out.println("2등 : " +st1);
			System.out.println("3등 : " +st3);
			}
			else{
				System.out.println("2등 : " +st3);
				System.out.println("3등 : " +st1);
			}
		}		
		
		else if (sc3 > sc1 && sc3 > sc2) {
			System.out.println("1등 : "+st3);
			if (sc1>sc2) {
				System.out.println("2등 : "+st1);
				System.out.println("3등 : "+st2);
			}
			else {
				System.out.println("2등 : "+st2);
				System.out.println("3등: "+st1);
			}
		}

		
		
		
	}

}
		

