
public class Exam05 {
		public static void main(String[] args) {
			String str1= "IT CookBook 입니다.";
			String str2 = "10";
			String str3 = "20";
			
			str1 = "Java 입니다";
			
			System.out.printf("%s \n", str1);
			System.out.printf("%s \n",str2+str3);
			System.out.println("str1 : " + str1);
			System.out.println("더하기 결과 : " + str2 + str3);
			
			int num1 = Integer.parseInt(str2); 
			//Integer.parseInt : string 형태의 데이터를 숫자형으로 형변환 해줌
			int num2 = Integer.parseInt(str3);
			System.out.println("더하기 결과 : "+ (num1 + num2));
		}
		
}
