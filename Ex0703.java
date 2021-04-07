package JavaClass;

import java.util.Scanner;

public class Ex0703 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a, b;
		
		while(true) { // 난 무한 루프이다.
			System.out.println("첫 번째 입력 값 : ");
			a=s.nextInt();
			System.out.println("두 번째 입력 값 : ");
			b=s.nextInt();
			
			System.out.println("합계 : " + (a+b));
			
			// 합계가 10보다 크면 나가기
			if ((a+b) >10) {
				break;
			}
		}
	}

}
