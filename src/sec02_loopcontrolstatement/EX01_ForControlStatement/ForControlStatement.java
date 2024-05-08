package sec02_loopcontrolstatement.EX01_ForControlStatement;

public class ForControlStatement {

	public static void main(String[]args) {
		
		/* 4.1.4 for 반복 제어문
		 
		   for 문은 실행 구문을 반복적으로 수행하는 반복 제어문으로, 일반적으로 반복 횟수가 정해질 때 주로 사용됨. 즉, for 문의 구문을
		   보면 몇번 반복하는지 유추 할 수 있어야 함. for 문의 기본적인 문법 구조는 다음과 같음.
		   
		   for (초기식; 조건식; 증감식) {
		       실행 구문; // 조건식이 true인 동안 실행됨
		   }
		   
		   for 다음의 소괄호() 안에는 3개의 항목이 있고, 각각은 새미콜론(;)으로 구분 됨. 나중에 다시 다루겠지만, 컴파일러는 문법적으로
		   for 문의 소괄호 안에 세미콜론이 2개 있는지 여부만 점검함.
		   초기식: for문이 시작될 때 딱 한번 실행되고 실행되지 않음. 따라서 for 문 안에서 사용할 변수는 주로 초기식에서 초기화함.
		   조건식: 실행 구문으로 들어가기 위한 유일한 출입구로, 이 조건식의 결과가 true가 나오는 동안은 실행 구문을 계속 반복함.
		         만일 조건식이 false가 나오면 더이상 반복하지 않고  for 문을 탈출함.
		   증감식: for 문의 실행 구문이 모두 수행된 후 닫힌 중괄호{}를 만나면 다음 번 반복을 위해 다시 이동하는 위치로 매화 반복이
		         수행될 때마다 호출되어 변수에 대한 증감을 실행함.
		 */
		
		/*-초기식에 포함된 변수의 선언 위치-*/ System.out.println("-초기식에 포함된 변수의 선언 위치-");System.out.println();

		// 초기식에 포함된 변수는 for 문 내외부에서 선언할 수 있음. 먼저 외부에서 변수를 선언하고 초기식만 초기화해도, for 종료 이후에도 존재함.
		
		int i;
		for(i = 1; i < 3; i++) {
			System.out.println(i+"번째 실행");
		}
		System.out.println("for 문 i의"+i+"번째 실행 후 종료"); // 3번째 실행 후 종료
		System.out.println();
		
		// 반면 for 문의 초기식 안에서 선언했을 때는 for 문 내부에서만 사용 가능함. 대부분 for 문의 반복 횟수를 지정하기 위한 용도로만
		// 변수를 사용하므로, 초기식 내부에서 변수를 선언하는 방식이 주로 이용 됨.
		
		
		for(int i1 = 1; i1 < 3; i1++) {
			System.out.println("for 문 i1의"+i1+"번째 실행");
		}
		// System.out.println(i1); // i1이 없기 때문에 오류 발생
		System.out.println();
		
		for(int i1 = 1; i1 < 3; i1++) {
			System.out.println(i1+"번째 실행");
		}
		
		// 또한 초기식과 증감식은 쉼표(,)로 구분해서 여러개를 동시에 표기할 수 있음. 다만 초기식의 변수는 앞에 선언한 변수와 뒤의 변수가
		// 같은 타입을 지녀야 함. 만약 후행 변수를 다른 타입으로 입력하면 오류가 발생함.
		
		for(double i1 = 1, i2 = 1; i1+i2 < 6; i1++, i2++) { 
			System.out.println(i1+"번째 실행");
		}
		System.out.println();
		
		/* for 문의 동작 순서
		 
		 위의 예제를 통해 알아본  for 문의 실행 순서는 다음과 같음.
		 for(초기식; 조건식; 증감식){
		 	실행 구문;
		 }
		 
		 단계A: 초기식 -> 조건식(참) -> 실행 구문
		 단계B: 중괄호 닫힘 -> 증감식 -> 조건식 (참) -> 실행 구문
		 ...
		 단계n: 중괄호 닫힘 -> 증감식 -> 조건식 (거짓) -> 실행 구문
		 
		 for 문에서 조건식의 생략
		 
		 컴파일러는 for 문의 소괄호 () 안에 2개의 세미콜론(;)이 있는지만 문법적으로 점검함. 즉 초기식, 조건식, 증감식 중 어느 하나 또는
		 모두를 생략하더라도 세미 콜론만 존재한다면 문법 오류가 발생하지 않음. 그 결과 몇가지 특수한 형태의 for 문이 가능함.
		 조건식 생략 컴파일러는 자동적으로 true를 삽입함. 즉 for 문의 입구를 항상 열어 놓는 것. 따라서 보통은 실행 구문에 탈출 코드를 넣음.
		 그 외 다른 식을 생략하더라도 대개 for 문 안에 그를 대체할 구문을 넣어서 작성하는 것이 보통임. 그러나 만약 적절한 구문이 없어서
		 무한 루프가 발생한다면, 이클립스에서는 자동적으로 오류를 출력함. 당연한 이야기지만, 조건식에 false를 넣으면 바로 오류가 발생함.
		 */
		
		/*-실습 for 문의 기본 문법 구조, 특수한 형태, 무한루프에서 탈출하기-*/
		System.out.println("-실습 for 문의 기본 문법 구조, 특수한 형태, 무한루프에서 탈출하기-");System.out.println();
		
		
		/*-for 문 기본 문법 구조*/System.out.println("-for 문 기본 문법 구조");
		
		int a;
		for(a = 0; a < 3; a++) {
			System.out.print(a + " ");
		}
		System.out.println();System.out.println();
		
		/*-변수를 초기식 내부에서 선언*/System.out.println("-변수를 초기식 내부에서 선언");
		
		for(int i2 = 0; i2 < 4; i2++) {
			System.out.print(i2 + " ");
		}
		// System.out.println(i2); // 오류 발생
		System.out.println();System.out.println();
		
		/*-높은 수에서 낮은 수로*/System.out.println("-높은 수에서 낮은 수로");
		
		for(int i2 = 4; i2 > 0; --i2) {
			System.out.print(i2 + " ");
		}
		// System.out.println(i2); // 오류 발생
		System.out.println();System.out.println();
		
		/*-여러 변수를 동시에 입력*/System.out.println("-여러 변수를 동시에 입력");
		
		for (int i2 = 0, i3 = 0; i2 < 5; i2++, i3++ ) {
			System.out.println(i2 + "와(과) " + i3 );
		}
		
		/* for 문의 특수한 형태(무한 루프)
		 
		for(int i = 0; ; i++){ // 조건식 생략
			System.out.println("무한 루프 탈출");
		}
		 
		 */
		 
		for(int i2 = 0; ;i2++){
			if(i2 > 10) { // 10이 되면 무한 루프 탈출
				break;
			}
			System.out.println("무한 루프 탈출");
		}
		
	}
	
}
