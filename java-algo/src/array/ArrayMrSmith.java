package array;
/**
 * @file_name  : ArrayMrSmith.java
 * @author     : dingo44kr@gmail.com
 * @date       : 2015. 9. 25.
 * @story      : 이중배열 예제
 */
public class ArrayMrSmith {
	public static void main(String[] args) {
		String[][] names = {
				{"Mr.", "Mrs.", "Ms."},
				{"Smith", "Jones", "Alex"},
				{"hello", "hi", "good-bye","사요나라"}
		}; // 이중배열
		//Mr.Smith
		System.out.println(names[0][0]+names[1][0]+names[2][2]);
		System.out.println(names[0][2]+names[1][0]+names[2][0]);
		//Ms.AlexHello
		System.out.println(names[0][2]+names[1][0]+names[2][3]);
		//[0][2] 0번째 배열에서 2번째글자// [1][0] 1번째 배열에서 1번째글자 =>다음과 같이 해석된다.

	}
}
