package array;
/**
 * @file_name  : Array.java
 * @author     : dingo44kr@gmail.com
 * @date       : 2015. 9. 21.
 * @story      : ArrayEx1
 */

public class Array {
	public static void main(String[] args) {
		char[] arr = new char[4];
		
		// 배열 초기화
		arr [0] = 'j';
		arr [1] = 'a';
		arr [2] = 'v';
		arr [3] = 'a';
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			
			
		}
		
	}  
}
