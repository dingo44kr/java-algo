package comparison;

import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

/**
 * @file_name  : SwitchDemo.java
 * @author     : dingo44kr@gmail.com
 * @date       : 2015. 9. 17.
 * @story      : 스위치 문법
 */

public class SwitchDemo3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("해당 월을 입력하세요");
		int month = scanner.nextInt();		
		String res = null;
		// 필터링
		// 유효성 체크 => 본 값이 정당한 값인지 아닌지를 알고리즘이 걸러낸다는 의미 (validation)
		
		if (month>12||month<1){System.out.println("존재하지 않습니다.");
		}
			
		else {
		switch (month) 
		{case 1 : case 3 :case 5 :case 7 :case 8 :case 10 : case 12 :
		res = "31"; break;
			
		case 4 :
		case 6 :
		case 9 :
		case 11 :
			res = "30"; break;
			
			
		case 2 :
			res = "29"; break;
			
		default:
				System.out.println("에러발생");
			}
		
		System.out.println(month + "월은" + res + " 일 까지 입니다.");
		}

		

	}
}
