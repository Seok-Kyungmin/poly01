package JavaClass;

import java.util.Scanner;

public class Ex0703 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a, b;
		
		while(true) { // �� ���� �����̴�.
			System.out.println("ù ��° �Է� �� : ");
			a=s.nextInt();
			System.out.println("�� ��° �Է� �� : ");
			b=s.nextInt();
			
			System.out.println("�հ� : " + (a+b));
			
			// �հ谡 10���� ũ�� ������
			if ((a+b) >10) {
				break;
			}
		}
	}

}
