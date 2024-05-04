package sec01_basicsyntax.EX03_ConsoleOutput;

public class ConsoleOutput {

	public static void main(String[]args) {
		
		/* 콘솔 출력 메서드와 문자열 출력
		 
		 
		기본 자료형 표현하기
		기본 자료형은 숫자이며,  System.out.print() 메스드를 통해 다음과 같이 표현 할 수 있음. 
		*/
		System.out.print(3); // 그대로 숫자 3이 표현됨.
		System.out.println(); // 2번 줄바꿈 배운 이후에 추가된 부분
		System.out.print(3+5); // 연산 결과인 8이 표현됨.
		System.out.println(); // 2번 줄바꿈 배운 이후에 추가된 부분 
		 
		 /*
		 문자열 표현하기
		 문자열은 String 자료형으로 저장됨. 이 때 문자열은 반드시 큰따옴표(")안에 표기해야 함. 문자열과 문자열을
		 더하거나 문자열에 기본 자료형을 더하면 다시 문자열이 되며, 연산 결과는 문자열을 연결한 형태로 나타남.
		 */
		
		//1. System.out.print()
		System.out.print("첫번째 안녕하세요"); // 문자열은 반드시 " " 로 출력.
		System.out.print("두번째 안녕" + "하세요"); // 문자열끼리 결합에는 + 를 사용함.
		System.out.println(); // 2번 줄바꿈 배운 이후에 추가된 부분
		// 여기까지 진행한 결과 줄바꿈의 필요성이 나타남.
		
		//2. 줄바꿈의 2가지 방법
		// System.out.println()은 System.out.println() 메서드와 다르게 문자열을 출력한 뒤에 줄바꿈을 함.
		
		System.out.println(); // 2번 줄바꿈 배운 이후에 추가된 부분
		System.out.println("첫번째 줄 출력후 줄바꿈"); // 
		System.out.println("두번째 줄 출력후 줄바꿈"); //
		
		// \n을 출력하면 개행, 줄바꿈을 실행함
		
		System.out.print("세번째 줄 출력후 줄바꿈\n"); // print 메서드임에도 줄바꿈이 이루어짐.
		
		//3. 문자열과 기본 자료형의 혼합
		System.out.println(12 + "번째 대기열"); // 12번째 대기열로 출력. 결합하여 문자열이 됨.
		System.out.println(12 + 3 + "번째 대기열"); // 15번째 대기열로 출력. 연산을 한 후에 문자열로 출력.
		System.out.println("대기열 순서는" + 1 + 2); 
		//문자열이 먼저 온 뒤로는 문자열로 인식되기 때문에 연산이 일어나지 않고 결합이 일어남
				
	}
	
}
