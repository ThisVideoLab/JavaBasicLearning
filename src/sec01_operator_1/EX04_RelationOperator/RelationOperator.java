package sec01_operator_1.EX04_RelationOperator;

public class RelationOperator {

	public static void main(String[]args) {
		
		/* 3.2.4 비교 연산자
		 
		 비교 연산자는 크가 크기 비교와 등가 비교로 나눌 수 있음. 연산 결과는 불리언 자료형, 즉 true와 false 중에서 하나를 나타냄.
		 주의점으로는 = 등호가 항상 오른쪽에 오도록 표기해야 한다는 것. 그리고 등가 비교에는 등호가 2개(==) 있다는 것을 기억할 것.
		 
		 그렇다면 등가비교(==, !=)를 할 때 비교 대상은 무엇이냐는 질문이 발생함. 이는 스택 메모리의 값을 비교하는 것. 이것이 중요한 이유는
		 앞서 배운 것처럼 스택 메모리의 값이 기본 자료형일 때와 참조 자료형일 때가 서로 다르기 때문임. 기본 자료형의 실제 데이터 값은
		 스택 메모리, 참조 자료형의 실제 데이터 값은 힙 메모리에 저장되고, 스택 메모리에는 힙 메모리에 있는 해당 데이터의 실제 위치(번지)가
		 저장 되는 것임. 다시 말해 기본 자료형의 등가 비교 대상은 실제 데이터 값이 되고, 참조 자료형의 등가 비교 대상은 실제 데이터 값이
		 위치한 번지의 값 자체를 놓고 비교하는 것. 이는 추후 참조 자료형을 참고할 것.
		 
		 기본 자료형과 참조 자료형을 다 외우는 것이 베스트이며, 그 시작으로는 참조형이 소문자로 시작하면 기본형, 대문자로 시작하면 참조형이라는
		 포인트부터 인지한다면 좀 더 수월하게 학습 가능함.
		 
		 */
		
		/*-크기 비교-*/ System.out.println("-크기 비교-");System.out.println("");

		System.out.println(5<2);
		System.out.println(5>2);
		System.out.println(5<5);
		System.out.println(5<=5);
		System.out.println(5>=5);
		System.out.println();
		
		/*-등가 비교-*/ System.out.println("-등가 비교-");System.out.println("");
		/*@기본 자료형 등가 비교*/ System.out.println("@기본 자료형 등가 비교");System.out.println("");
		
		int a = 5;
		int b = 2;
		int c = 5;
		System.out.println(a==b); // 거짓
		System.out.println(a!=b); // 참
		System.out.println(a==c); // 참
		System.out.println(a!=c); // 거짓
		System.out.println();
		
		/*@참조 자료형 등가 비교*/ System.out.println("@참조 자료형 등가 비교");System.out.println("");
		
		String str1 = new String("안녕");
		String str2 = new String("안녕");
		
		System.out.println(str1==str2); // 거짓. 값은 같으나 비교 대상인 힙 메모리의 번지 위치가 다르기 때문에 같지 아니함.
		
		
	}
	
}
