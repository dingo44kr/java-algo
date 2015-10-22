package array;

import java.util.Scanner;

/**
 * @file_name  : Money.java
 * @author     : dingo44kr@gmail.com
 * @date       : 2015. 9. 21.
 * @story      : 금액을 입력하면 화폐단위별로 분류시키는 문제.
 */
public class Money {
	/**
	 * 예를 들어서 134,530 이면
	 * 거스름돈을 화폐로 표시해 주면 5만원: 2, 1만원: 3, 1천원: 4 ...
	 * 표시하고 10원 미만은 절삭
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("금액을 입력하세요");
		int money = scanner.nextInt();
		
		int[] moneyUnit = { 50000, 10000, 5000, 1000, 500, 100, 50, 10 };

		// 211,000원을 분류하는 것을 가정으로 해보자
		int man5 = money / 50000;
		int man1 = money / 10000;
		int won5 = money / 5000;
		int won1 = money / 1000;
		int won500 = money / 500;
		int won100 = money / 100;
		int won50 = money / 50;
		int won10 = money / 10;
		
		int man50 = money % 50000; // 5만원권의 나머지 = 1만원 단위를 말함
		int man10 = (money%50000)/10000;// 1만원 권의 갯수를 말함
		int won501 = (man10%10000)/5000; // 5천원권의 갯수
		int won101 = (won501%5000)/1000; // 천원권의 갯수
		int wonn500 = money % 500; // 500원권의 나머지 = 100원 단위를 말하게됨
		int wonn100 = money % 100; // 100원권의 나머지 = 50원권의 단위를 말함.
		int wonn50 = money % 50; // 50원권의 나머지 = 10원권의 단위를 말함.
		int wonn10 = money % 10; // 10원권의 나머지 = 절삭 표시하지 않음.
		
		
		
		
		 
		
		System.out.println("5만원 권:"+man5+"매");
		System.out.println("1만원 권:"+man10+"매");
		System.out.println("5천원 권:"+won501+"매");
		System.out.println("1천원 권:"+won101+"매");
		System.out.println("500원:"+won101+"개");
		System.out.println("100원:"+wonn500+"개");
		System.out.println("50원:"+wonn100+"개");
		System.out.println("10원:"+wonn50+"개");
		
	}
}
