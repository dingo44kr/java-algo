package comparison;

import java.util.Scanner;

/**
 * @file_name  : IfTest.java
 * @author     : dingo44kr@gmail.com
 * @date       : 2015. 9. 17.
 * @story      : 성적표 프로그램
 */

public class IfTest3 {
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
	
	Scanner scanner = new Scanner(System.in);
	System.out.println("이름을 입력하세요.");
	String name = scanner.next();
	System.out.println("국어 점수를 입력하세요.");
	int ko = scanner.nextInt();
	System.out.println("영어 점수를 입력하세요.");
	int en = scanner.nextInt();
	System.out.println("수학 점수를 입력하세요.");
	int ma = scanner.nextInt();
	
	String re = null;
	
	int all = ko+en+ma;
	
	int average = all/3;
	
	if (average>=70&&average<90){re = "합격";}
	
	else if(average>=90){re = "장학생";}

	else{re = ("불합격");}
	
	System.out.println("학생이름"+"\t"+"국어"+"\t"+"영어"+"\t"+"수학"+"\t"+"총점"+"\t"+"평균"+"\t"+"합격여부");
	System.out.println("====================================================");
	System.out.println(name+"\t"+ko+"\t"+en+"\t"+ma+"\t"+all+"\t"+average+"\t"+re) ;
	}
	
}


