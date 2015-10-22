package variable;
/**
 * @file_name  : VariableDemo2.java
 * @author     : dingo44kr@gmail.com
 * @date       : 2015. 9. 15.
 * @story      : 변수 작성방법
 */
public class VariableDemo2 {
	/**
	 * 변수의 작성 규칙
	 * (1) 알파벳 대소문자, 숫자, _ (underscore), $만 사용가능
	 * (2) 첫문자가 숫자이면 안됨
	 * (3) 키워드(예약어)와 같으면 안됨 
	 * 
	 * 변수 사용방법
	 * - 데이터타입 + 변수명으로 선언(4바이트 메모리 생성)
	 */
	// 클래스 = 타입 = 데이터타입 = 객체
	public static void main(String[] args) {
		int x; //변수의 선언
		String hong; // 변수의 선언
		hong = "홍길동"; // 변수에 값을 할당
		System.out.println("hong"); // 변수의 값 출력
		
		String name = "새싹회원";
		System.out.println(name);
		name = "우수회원";
		System.out.println(name);
		
		System.out.println("홍길동"); // 상수처리하는 문법
	}
}