package loop;
/**
 * @file_name  : Continue3Multiple.java
 * @author     : dingo44kr@gmail.com
 * @date       : 2015. 9. 25.
 * @story      : 3의 배수를 제외한 1부터 10까지 정수 출력
 */
public class Continue3Multiple {
/**
 * [결과]
 * 1 2  4 5  7 8  10
 */
	
	public static void main(String[] args) {
		
		for (int i = 1; i <= 10; i++) {
			
		if (i%3==0) {
			continue; // 조건에 맞으면 아래로 진행하지 말고 구문 바깥에서 시작해라. 
//			if문의 조건만 빼고 계속 구문바깥을 자동으로 이행한다.
		}
		System.out.print(i+"\t");
		}
	}
}
