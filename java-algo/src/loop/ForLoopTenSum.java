package loop;
/**
 * @file_name  : ForLoopTenSum.java
 * @author     : dingo44kr@gmail.com
 * @date       : 2015. 9. 21.
 * @story      : 등차수열 1-10 의 요소의 합 구하기
 */
public class ForLoopTenSum {
	/**
	 * To. 개발자님
	 * 등차수열 1 - 10 요소의 합 구하는 프로그램을 완성해 주세요.
	 * 힌트 : 3 + 1 = 4
	 * 3 += 1;
	 */   
	
	public static void main(String[] args) {
		
		int all = 0;
		
		for (int i = 1; i < 11; i++) {

			all += i; 
			
			// 기존 변수에 값을 누적시키는 연산자 += , 감소시키는 연산자 -=
			/**
			 * all = all + 1;
			 * all = all + 2;
			 * all = all + 3; ... 10바퀴를 돈다
			 * all = all + 10;
			 */
		}
		System.out.print(all);
		
		
	}
}
