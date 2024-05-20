package sec01_field.EX01_FieldComponent;

class A {
	int m = 3; // 상위 중괄호가 클래스 일때는 필드
	int n = 4; // 상위 중괄호가 클래스 일때는 필드
		void work1() {
			int k = 5; // 상위 중괄호가 메서드일 때는 지역 변수
			System.out.println("work1()으로부터 출력: " + k);
			work2(3);
		}
		void work2(int i) { // 상위 중괄호가 메서드일 때는 지역 변수
			int j =4 ; // 상위 중괄호가 메서드일 때는 지역 변수
			System.out.print("work2()로부터 출력: ");
			System.out.print(i+j);
		}
}

class B {
	int m = 3;
	int n = 4;
	void work1() {
		int k = 5;
		System.out.println("work1() 메서드 실행");
		System.out.print("work1() 메서드에서 출력: ");
		System.out.println(k);
		work2(3);
		System.out.println("work1() 메서드 종료");
	}
	void work2(int i) {
		int j = 4;
		System.out.println("work2() 메서드 실행");
		System.out.print("work2() 메서드에서 출력: ");
		System.out.println(i + j);
		System.out.println("work2() 메서드 종료");
	}
}

public class FieldComponent {

	public static void main(String[]args) {
		
		/* 7장 클래스 내부 구성 요소
		   7.1 필드와 지역 변수의 구분
		   
		   필드field는 클래스에 포함된 변수로, 객체의 속성값을 지정할 수 있음. 필드는 지역 변수local variable과 구분해야 함. 지역 변수는
		   메서드에 포함된 변수를 의미함. 즉 필드와 지역 변수는 어떤 중괄호 안에 선언됐는지에 따라 구분이 가능함. 클래스의 중괄호 안에 선언된
		   변수는 필드, 메서드의 중괄호 안에 선언된 변수를 지역변수라고 분류하면 됨.
		   필드와 지역변수의 가장 큰 차이점은 생성되는 메모리의 위치임. 필드는 힙 메모리의 객체 내부, 지역 변수는 스택메모리에 생성됨.
		   스택 메모리에 저장되는 변수는 때가 되면 자바 가상 머신이 자동으로 삭제하지만, 힙 메모리의 객체 안에 저장되는 필드는 객체가 사라지지
		   않는 한 절대로 삭제되지 않음.
		   스택 메모리의 변수가 자동으로 삭제 되는 시점은 자신이 선언된 메서드의 중괄호가 닫혀 메서드가 종료되면, 그 메서드 안에 선언된 모든
		   지역 변수가 메모리에서 통째로 삭제됨. 외부 클래스 A를 참고하면, 필드 m, n과 work1(), work2()가 있음. work1() 메서드
		   내부에 지역변수 k를 선언해 사용했고, work2()에서는 지역 변수 i와 j를 선언해 사용했음. 여기서 소괄호 안의 변수 i도 메서드의
		   중괄호 안에서 정의한 것으로 간주하면 됨. 이것을 염두한 상태에서 다음 코드를 살펴보자.
		   
		 */
		
		A a = new A(); // 참조 변수 a라는 이름으로 A 클래스 객체를 새로 생성함. 
		System.out.println(a.m); // a.m -> a 변수 내의 m 값을 포인트 연산자(.)로 가리킴
		System.out.println(a.n); // a.n -> a 변수 내의 n 값을 포인트 연산자(.)로 가리킴
		a.work1();
		System.out.println();
		System.out.println();
		
		/* 먼저 클래스 A로 객체를 생성하고, 참조 변수명을 a로 선언함. 그리고 참조 변수 a와 포인트 연산자를 이용해 a 변수 내의 필드값
		   m, n을 출력함. 마지막으로 포인트 연산자로 변수 a 내의 work1() 메서드를 호출함. work1() 내부에 문자열을 일차적으로 출력하고
		   마찬가지로 work1() 내부에 있던 work2() 메서드에 int i = 3을 넣어 work2() 메서드 내 지역변수 i + j의 값을 출력함.
		   이러한 연쇄 과정을 메모리 영역에서 살펴보자면, 먼저 힙 메모리에 참조 변수 a가 생성되면서 이와 함께 힙 메모리에 클래스 A가 생성되면,
		   이 객체 안에 클래스의 멤버인 필드 m, n과 메서드 work1(), work2()가 저장되고, 각 필드값으로는 3과 4가 저장됨.  
		   메서드 내 지역변수들의 값은 스택 메모리에 저장되고, 정의된 메서드의 중괄호 내부에 해당하는 프레임frame 부분은 해당 메서드의 실행이
		   종료되는대로 자바 가상 머신에 의해 통째로 삭제당함. 클래스 A에서는 wokr1() 메서드가 먼저 작동을 시작한 뒤에, work2()가 후행으로
		   함께 작동하고, 다시 work2()가 종료되면서 JVM에게 삭제 당한 뒤에, work1()도 종료되면서 JVM에 의해 삭제당함.
		   
		 */
		
		/*- 실습 - 필드와 지역 변수의 구분*/	System.out.println("- 실습 - 필드와 지역 변수의 구분");
		
		/*클래스로 객체 생성*/
		B b = new B();
		
		/*필드값 출력*/	System.out.println("필드값 출력");
		System.out.println(b.m);
		System.out.println();
		
		/*메서드 출력*/	System.out.println("메서드 출력");
		b.work1();
		
	}
	
}
