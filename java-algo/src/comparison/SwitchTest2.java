package comparison;

import java.util.Scanner;

/**
 * @file_name  : SwitchTest2.java
 * @author     : dingo44kr@gmail.com
 * @date       : 2015. 9. 18.
 * @story      : 
 */
public class SwitchTest2 {
	/**
	 * To. 이성한님
	 * 프로그램을 하나 개발해야 합니다.
	 * 오더는 다음과 같이 화면에 출력하라고 합니다.
	 * 교수는 학생과 국어, 영어, 수학점수만 입력하면
	 * 총점, 평균, 합격여부가 출력되는 프로그램입니다.
	 * 학생		국어		영어		수학		총점		평균		합격여부
	 * =======================================================
	 * 홍길동		90		90		90		270		90		(장학생)
	 * 합격여부는 다음과 같다고 합니다.
	 * 평균이 90점 이상이면 장학생
	 * 70점 이상 90점 미만이면 합격
	 * 70 미만이면 불합격이라고 하네요.
	 * 단) 평균에서 소수점이하는 절삭입니다.
	 */

	public static void main(String[] args) {
		/**
		 * String ssn = scanner.next();
		 * int ch = ssn.chartAt();
		 * ssn = ssn
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름을 입력하세요.");
		String name = scanner.next();
		System.out.println("국어: ");
		int kor = scanner.nextInt();
		System.out.println("영어: ");
		int eng = scanner.nextInt();
		System.out.println("수학: ");
		int math = scanner.nextInt();
		
		int all = kor+eng+math;
		
		int avg = all/3;
		
		int av = avg/10;
		
		String grade = null;
			
		switch (av) {
		case 7 :
		case 8 :
			grade = "합격"; break;
		
		case 9 :
		case 10 :
			grade = "장학생"; break;
			
		default:
			grade = "불합격";
		}
		
		
		System.out.println("학생"+"\t"+"국어"+"\t"+"영어"+"\t"+"수학"+"\t"+"총점"+"\t"+"평균"+"\t"+"합격여부");
		System.out.println("=====================================================");
		System.out.printf("%s\t%d\t%d\t%d\t%d\t%d\t%s",name,kor,eng,math,all,avg,grade);
				
		// c언어에서는 다음과 같이 코딩할 수 있다. (문자 = %s) (정수 = %d)
	}

}
