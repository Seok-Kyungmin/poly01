package JavaClass;

public class Ex0407 {
	//1���� 100���� �߿��� 1�� �����(AND) 5�� ����� ���ڸ� ����Ͻÿ�
	public static void main(String[] args) {
		int i;
		for(i=1; i<=100;i++) {
			if(i%3==0 && i%5==0) {
				System.out.println("[3�� 5�� ���] "+i);
			}
		}
	}
}
