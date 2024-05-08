package sec02_loopcontrolstatement.EX02_WhileControlStatement;

public class WhileControlStatement {

	public static void main(String[]args) {
		
		/* 4.1.5 while 반복 제어문
		 
		 while 문도 중괄호 안의 실행 구문을 반복적으로 실행한느 반복 제어문으로, 소괄호 안의 조건식이 true인 동안 반복이 지속됨.
		 while 문의 기본 구조는 다음과 같음.
		 
		 초기식; // 필수는 아니지만 대부분 사용함, 다만 초기식은 반드시 while 문 실행 전에 정의 되어야 함.
		 while (조건식){ // 필수느
		 실행 구문;
		 증감식;
		 }
		 
		 여기서 초기식과 증감식은 불필요할 경우 생략 가능함. for 문과 비교하기 위해 기본 문법 구조에 포함시켜 놓음. 주의점으론 초기식은
		 while 문 실행 이전에 정의 되어야 한다는 점. 초기식을 중괄호 안에 넣으면 반복마다 초기화되어서 무한 루프에 빠질 수 있으니 주의할 것.
		 
		 int a = 0;
		 while(a < 0){
		 	a = 0; // 중괄호 내부 정의로 인한 무한 루프 발생
		 	System.out.println("A");
		 	a++;
		 }
		 
		 while 문의 실행 순서는 먼저 조건식을 검사한 후, 조건식이 true일 경우 중괄호 안의 실행 구문을 실행함. 이후 닫힌 중괄호를 마나면
		 다시 조건식을 검사하며, 이와 같은 과정을 조건식이 거짓이 될때까지 반복함. 조건식이 거짓이 되면 while 문을 탈출하므로 for 문과
		 마찬가지로 while 문의 종료 시점은 닫힌 중괄호가 아닌 조건식임.
		 
		 while(조건식){
		 	실행 구문; // 조건식이 true일 경우에만 실행
		 }
		 
		 단계A: 조건식(참) -> 실행 구문
		 단계B: 중괄호 닫힘 -> 조건식(참) -> 실행 구문
		       ...
         단계C: 중괄호 닫힘 -> 조건식(거짓) -> 종료, 가장 가까운 중괄호로 탈출
         
         일반적으로 while 문읜 반복 횟수를 정하지 않고 특정 조건까지 반복하고자 할 때 주로 사용함. 예를 들어, 자연수를 1부터 차례대로 더해서
         50까지 더했을 때 나오는 수를 계산할 때 while 문을 사용할 수 있음.
		 */
		
		/*-while 문의 일반적인 사용 예*/System.out.println("-while 문의 일반적인 사용 예");
		
		int num = 1, sum = 0; // 점증하며 더할 숫자 num과 합계에 해당하는 sum을 정의
		while (num <= 50) {
			sum += num;
			num++;
		}
		System.out.println("정수 1부터 " + num + "까지를 모두 합한 수의 값: " + sum);
		System.out.println();
		
		/* 물론 for 문과 같이 반복 횟수를 지정해 사용할 수도 있음. while 문도 무한 루프가 아닐 때 초기식, 조건식, 증감식을 모두 포함하고
		있어야 한정된 반복 횟수만큼 수행할 수 있으므로, while 문과 for 문은 언제든 상호 변환이 가능함. 차이점은 구조적 차이 정도. 다만
		for 문과 달리 while 문에선 조건식 생략이 불가능함.
		
		 for (초기식; 조건식; 증감식){ // 초기식 내외부 정의 가능
		  		실행 구문;
		   {
		  
		  초기식; // 초기식 반드시 외부 정의 
		  while(조건식){
		  		실행 구문;
		  		증감식;
		  } 
		*/
		
		/*-while 문과 for 문의 상호 변환*/System.out.println("-while 문과 for 문의 상호 변환");
		
		System.out.println("for 문 예시");
		for (int a = 0; a < 10; a++)  {
			System.out.print(a + " ");
		}
		System.out.println();System.out.println();
		
		System.out.println("while 문 예시");
		int a = 0;
		while (a < 10) {
			System.out.print(a + " ");
			a++;
		}
		System.out.println();System.out.println(); 
		
		/*- 실습 - while 문의 기본 문법 구조, for 문의로 변환, 특수한 형태, 무한루프 탈출*/
		System.out.println("- 실습 - while 문의 기본 문법 구조, for 문의로 변환, 특수한 형태, 무한루프 탈출");
		
		/*-while 문의 기본 문법 구조*/System.out.println("-while 문의 기본 문법 구조");
		
		a = 0; // 위에 이미 int a를 선언함
		while (a < 10) {
			System.out.print(a + " ");
			a++;
		}
		System.out.println();System.out.println(); 
		
		/*-위 while 문을 for 문으로 변환*/System.out.println("-위 while 문을 for 문으로 변환");
		for (a = 0; a < 10; a++) {
			System.out.print(a + " ");
		}
		System.out.println();System.out.println(); 
		
		/*-while 문으로 만든 무한 루프*/System.out.println("-while 문으로 만든 무한 루프");
		System.out.println("주석 참조");
		
		/* a = 0;
		   while (true){
		   		System.out.print(a + " ");
		   }
		*/
		System.out.println();
		
		/*-while 문으로 만든 위의 무한 루프 탈출*/System.out.println("--while 문으로 만든 위의 무한 루프 탈출");
		
		a = 0;
		while (true){
			
			if (a >= 10) { // 위의 for 문, while 문과 같은 수까지 반복되도록 조건식 설정
				break; 
			}
			System.out.print(a + " ");
			a++; // 증감식을 생략하면 무한루프
		}
	}
}
