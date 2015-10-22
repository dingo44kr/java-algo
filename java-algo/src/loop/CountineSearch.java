package loop;

import java.util.Scanner;

/**
 * @file_name  : CountineSearch.java
 * @author     : dingo44kr@gmail.com
 * @date       : 2015. 9. 25.
 * @story      : countinue 를 이용한 간단한 검색엔진 원리 이해
 */
public class CountineSearch {
	/**
	 * 검색어 [동해]가 존재하는지 여부 체크 
	 */
	
	public static void main(String[] args) {
		String dest = "동해물백두산";
//		char[] chars = {'동','해','물'}; // 예전에는 이런식으로 표현
		
		Scanner scanner = new Scanner(System.in);
		boolean isExist = false;
		int max = 0;
		while (true) {
			System.out.println("검색어를 입력하세요. 종료하려면 q을 입력하세요.");
			String search = scanner.next();
			if (search.equals("q")) { //==는 원시형 타입이라 char를 비교할 수 있다. 이퀄스는 배열을 비교할 수 있다.
				return;
			}
			
			isExist = false;
			max = dest.length() - search.length(); //검색어를 뺀 회전수는 의미없다.
			System.out.println(max);
			test: for (int i = 0; i < max; i++) { // : 문법용어로 "라벨"이라고 부르며, C언어의 GOTO 문에 태그값에 해당한다.
				int searchCount = search.length(); // 검색어 낱말의 개수 예) 6개
				int deststartPoint = i; // 검색을 마친 후 다음 검색대상 낱말의 위치
				int searchStartPoint = 0;
				//동해물백두산
				while (searchCount--!= 0) {
					if (dest.charAt(deststartPoint++) != search.charAt(searchStartPoint++)) {
						continue test;
					}
				}
				isExist = true;
				break test; // test로 goto 하게 된다, 이 test는 글자가 바뀌어도 상관이없다.
			}

			System.out.println(isExist ? "검색어 [" + search + "] 존재: " : "존재하지 않음"); // 삼항연산자(조건문) ? true : false ; => if-else
		}

	}
}

/**
 * 삼항연산자 예문
 * boolean flag = (true)?true :false;
 * String str = (true) ? "참" : "거짓";
 * int a = (true) ? 1 : 0;
 * 앞에 데이터타입을 정하고 사용하면 된다.
 *  
 */