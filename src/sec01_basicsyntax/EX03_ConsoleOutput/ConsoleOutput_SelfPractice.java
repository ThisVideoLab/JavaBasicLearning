package sec01_basicsyntax.EX03_ConsoleOutput;

public class ConsoleOutput_SelfPractice {

	public static void main(String[]args) {
	
		// 본 클래스는 ConsoleOutput 클래스와 ConsoleOutput2 클래스 후의 자가 실습
		
		//1. System.out.println()
		System.out.println("안녕하세요");
		System.out.println("안녕"+"하세요");
		System.out.println(2+4);
		System.out.println(4.6);
		System.out.println("문자"+1);
		System.out.println("문자"+1+2); // 문자열이 오고 난 뒤라 문자열로 인식되어 연산이 아닌 결합 발생
		System.out.println(1+2+"문자"); // 기본 자료형이기 때문에 1+2의 연산이 일어난 뒤 문자열이 결합하여 문자열이 됨
		System.out.println();// 줄바꿈용
		
		
		//2. 변수의 사용
		int a= 5; 
		String b = "하세요";
		String c = "사용하지 않는 변수"; // 변수를 지정했음에도 사용하지 않으면 노란 밑줄이 생김.
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(a+b);
		System.out.println(2+b+a); // 기본 자료형에서 출발해 연산이 일어난 후 문자열과 결합
		System.out.println(b+a+1); // 문자열로 시작해 후속 값들이 문자열로써 결합됨
		
		//3. System.out.print()
		System.out.print("반갑");
		System.out.print("습니다");
		System.out.print("7");
		System.out.print("\n"); // System.out.println();과 완벽하게 같은 기능 
		
		//4. System.out.printf()
		
		System.out.printf("%d\n",40); // 
		System.out.printf("%o\n",40); //
		System.out.printf("%x\n",40); //
		System.out.printf("%s\n","열"); //
		System.out.printf("%f\n",1234.1234); // 소숫점 최대 자리까지 표기
		System.out.printf("%2.2f\n",1234.1234); // 설령 2자리 표기를 했더라도 숫자를 줄여 표기할 수는 없음
	}
	
}
