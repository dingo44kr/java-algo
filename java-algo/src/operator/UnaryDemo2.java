package operator;
/**
 * @file_name  : UnaryDemo2.java
 * @author     : dingo44kr@gmail.com
 * @date       : 2015. 9. 16.
 * @story      : 단항연산자 문법(후위)
 */
public class UnaryDemo2 {
	public static void main(String[] args) {
		/**
		 * i++ (후위 연산자)는 먼저 i값을 호출한 후 연산한다.
		 */
		
		int i=10,j=10;
		System.out.println("i++ 의 값 : "+(i++));
		System.out.println("j-- 의 값 : "+(j--));
		System.out.println("호출한 후 연산적용 결과");
		System.out.println("i++ 의 값 : "+(i++));
		System.out.println("j-- 의 값 : "+(j--));
	
	}
}
