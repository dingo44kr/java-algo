package comparison;

import java.util.Scanner;

/**
 * @file_name  : TimeCalc.java
 * @author     : dingo44kr@gmail.com
 * @date       : 2015. 9. 21.
 * @story      : 입력된 시간(초)를 시간, 분, 초로 환산하기
 */
public class TimeCalc {
	/**
	 * To. 개발자님께
	 * 초단위로 알려주는 시험이 있는데
	 * 이 값을 몇시간 몇분 몇초인지 계속 계산해야 해서요.
	 * 혹시 초값을 입력받으면 자동으로 계산되는 프로그램을 만들어 줄 수 있을까요?
	 * 그러니까 500초 이면 몇시간 몇분 몇초라고 보여주면 좋겠죠.
	 */
	
	/**
	 * 집에 가서 현재 아래의 식을 간결하게 바꾸어보기.  
	 *
	 */
	
	public static void main(String[] args) {
		int hour=0, min=0, remainder=0, remainder2=0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("초를 입력해 주세요.");
		int sec = scanner.nextInt();

		remainder = sec % 60; // 남는 초
		min = sec / 60; //분// 500초일 경우 0시간 8분 20초가 나와야됨. // 3600초일경우 1시간이 나와야됨.
		remainder2 = min % 60; // 남는 분
		hour = min / 60; // 시간
		
		if (sec < 60) {
			System.out.println(sec + "초"); // 이 부분은 삭제해도 됨.
		} else {
			System.out.println(sec + "초 = " + hour + "시간 " + remainder2 + "분 " + remainder + "초");
		}

	}
}
