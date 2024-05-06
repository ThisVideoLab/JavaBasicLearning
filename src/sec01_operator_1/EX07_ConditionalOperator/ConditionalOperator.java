package sec01_operator_1.EX07_ConditionalOperator;

public class ConditionalOperator {

	public static void main(String[]args) {
		
		/* 3.2.7 삼항 연산자
		 
		 삼항 연산자는 자바 연산자 중 유일하게 3개의 피연산자가 있는 연산자. 구조는 다음과 같음.
		 (참 또는 거짓) ? 참일 때 연산 결과 : 거짓일 때 연산 결과
		 
		 즉 참인지, 거짓인지에 따라 값을 다르게 도출하는 것. 물음표 앞에는 불리언 자료형인 참true이나  거짓false만 올 수 있으며,
		 불리언 자료형이 직접 올수도 있지만 주로 연산 결과가 불리언 자료형인 논리 연산자와 비교 연산자가 위치 함.
		 이 값이 참일때는 콜론 앞쪽을, 거짓일 때는 뒤쪽이 연산 결과가 됨. */
		 
		/*-삼항 연산자-*/ System.out.println("-삼항 연산자-");System.out.println("");
		
		int value1 = (3>5) ? 6 : 9; // false
		System.out.println(value1); // flase이므로 후항의 9가 출력됨.
		System.out.println();
		
		int value2 = (5>3) ? 10: 20; // true
		System.out.println(value2); //  true이므로 전항의 10이 출력됨.
		System.out.println();
		
		int value3 = 3;
		System.out.println((value3 % 2 == 0) ? "짝수" : "홀수"); // false 이므로 홀수가 출력됨.
		System.out.println();
		
		/*cf. if-else 구문으로 변환*/ System.out.println("cf. if-else 구문으로 변환");System.out.println("");
		if(value3 % 2 == 0) {
			System.out.println("짝수");
		}else {
			System.out.println("홀수");
		}
		
	}
	
}
