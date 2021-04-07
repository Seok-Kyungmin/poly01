package JavaClass;

public class Ex0407 {
	//1부터 100까지 중에서 1의 배수와(AND) 5의 배수인 숫자만 출력하시오
	public static void main(String[] args) {
		int i;
		for(i=1; i<=100;i++) {
			if(i%3==0 && i%5==0) {
				System.out.println("[3과 5의 배수] "+i);
			}
		}
	}
}
