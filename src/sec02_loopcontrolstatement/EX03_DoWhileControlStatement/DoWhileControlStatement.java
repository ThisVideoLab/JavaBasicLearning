package sec02_loopcontrolstatement.EX03_DoWhileControlStatement;

public class DoWhileControlStatement {

	public static void main(String[]args) {
		
		/* 4.1.6 do-while 반복 제어문
		 
		 do-while 문은 while 문과 매우 비슷한 반복 제어문이지만, 조건식의 검사와 반복 실행의 순서에 그 차이가 있음. 구조는 다음과 같음.
		 
		 초기식; // 필수는 아니지만 일반적으로 포함됨
		 do {
		 
		 	실행 구문; // 최초 1회 무조건 실행.
		 	증감식; // 필수는 아니지만 일반적으로 포함됨
		 } while(조건식); 문법 구조상 중괄호가 없으므로 세미 콜론(;)으로 끝남.
		 
		 일견 다른 제어문들과 달리 조건식이 마지막에 오며, 중괄호로 끝나지 않아 끝에 무조건 세미 콜론 (;)을 붙여야 함. 초기식과 증감식은
		 while 문에서 설명한 것처럼 생략이 가능함. 허나 for 문이나 while 문과의 상관 관계를 잘 이해할 수 있도록 포함시켜 익히는 것이 좋음.
		 실행 과정을 살펴보면 일단 do 구문을 실행한 이후 조건식을 검사함. 조건식이 참이면 다시 don 구문을 실행하고, 조건식이 거짓이면 제어문을
		 탈출함. 이상의 과정을 정리하면 다음과 같음.
		 
		 do{
		 	실행 구문;
		 }while (조건식);
		 
		 while 문은 조건식을 먼저 검사하므로 최소 반복 횟수는 0(처음부터 조건식이 false일 때)이지만, do-while 문은 일단 최초 실행한 후에
		 조건식을 검사하므로 최소 반복 횟수가 1회임. 이외는 while 문과 동일함.  */

		
		/*- while 문 예제*/System.out.println("- while 문 예제");
		int a;
		a = 0;
		while (a < 10) {
			System.out.print(a + " ");
			a++;
		}
		System.out.println();System.out.println();
		
		/*- do-while 예제*/System.out.println("- do-while 예제");
		
		a = 0;
		do {
			System.out.print(a + " "); // 0, 1, 2, ..., 9: 10회 실행
			a++;
		}while(a < 10);
		System.out.println();System.out.println();
		
		// 전체적인 모양새를 보면 조건 실행되는 do-while 문의 1회 이후로는 while 문과 do-while 문이 동일한 결과를 나타냄.
		// 간혹 do-while 문이 1회 더 실행된다는 오해를 하곤 하니 주의할 것
		
		/*- 실습 - do-while 문의 기본 문법 구조, do-while 문 vs while 문의 비교*/
		System.out.println("- 실습 - do-while 문의 기본 문법 구조, do-while 문 vs while 문의 비교");System.out.println();
		
		/*반복 횟수가 0일 때 do-while 문과 while 문의 비교*/
		System.out.println("반복 횟수가 0일 때 do-while 문과 while 문의 비교");
		
		a = 0; // 예제와 다르게 이미 int a가 정의된 관계로, 재정의하는 식으로 변경함
		while (a < 0) { // 실행 횟수 0 // 이미 a = 0이므로, 조건식이 false가 됨. 
			System.out.print(a + " ");
			a++;
		}
		
		a = 0;
		do { // 실행 횟수 1 // 위의 while 문과 마찬가지로 이미 a = 0이므로, 조건식이 false이지만, do-while 구조적 특징으로 인해
			System.out.print(a + " "); // 최초 1회는 실행되는 모습을 보임. 이것이 do-while 문의 특징.
			a++;
		}while(a < 0);
		System.out.println();System.out.println();
		
		/*반복 횟수가 1일 때 do-while 문과 while 문의 비교*/
		System.out.println("반복 횟수가 1일 때 do-while 문과 while 문의 비교");
		
		a = 0;
		while (a < 1) { // 실행 횟수 1번
			System.out.print(a + " ");
			a++;
		}
		System.out.println();
		
		a = 0;
		do {
			System.out.print(a + " ");
			a++;
		}while (a < 1);
		System.out.println();System.out.println();
		
		/*반복 횟수가 10일 때 do-while 문과 while 문의 비교*/
		System.out.println("반복 횟수가 10일 때 do-while 문과 while 문의 비교");
		
		a = 0;
		while (a < 10) {
			System.out.print(a + " ");
			a++;
		}
		System.out.println(); // 실행 횟수 10번 반복
		
		a = 0;
		do {
			System.out.print(a + " ");
			a++;
		}while(a < 10);
		System.out.println(); // 실행 횟수 10번 반복
		
	}
	
}
