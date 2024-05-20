package sec01_field.EX02_InitialValueOfFieldAndLocalVariable;

class A {
	boolean m1;
	int m2;
	double m3;
	String m4;
	void printFieldValue() {
		System.out.println("printFieldValue() 메서드 실행");
		System.out.println(m1); // 초기화 값 false 출력
		System.out.println(m2); // 초기화 값 0 출력
		System.out.println(m3); // 초기화 값 0.0 출력
		System.out.println(m4); // 초기화 값 null 출력
		System.out.println("printFieldValue() 메서드 종료");
		System.out.println();
	}
	void printLocalVariable() {
		int k;
		System.out.println("printLocalVariable() 메서드 실행");
		//System.out.println(k); // 지역 변수를 초기화하지 않아 오류 발생
		System.out.println("printLocalVariable() 메서드 종료");
	}
}

public class InitialValueOfFieldAndLocalVariable {

	public static void main(String[]args) {
		
		/* 7.1.2 필드와 지역 변수의 초깃값
		   
		   필드와 지역 변수의 또 다른 차이점은 초깃값임. 필드는 직접 초기화하지 않아도 강제로 초기화가 됨. 반면 지역 변수는 직접 초기화하지
		   않으면 저장 공간이 빈 공간 그대로 있어 값을 출력하려고 하면 오류가 발생함. 이는 사실 필드와 지역 변수의 차이가 아니라, 각각이
		   위치하는 메모리 영역의 특징임. 힙 메모리는 빈 공간을 저장할 수 없기 때문에, 강제로라도 초기화를 해줘야 함. 그러나 스택 메모리는
		   강제로 초기화 되지 않으므로 여기에 저장 되는 변수 또한 그 특징을 지니고 있게 됨.
		   5장에서 언급한 것처럼 강제 초기화 값은 필드으 ㅣ자료형에 따라 다름. 기본 자료형일 때 불리언 자료형은 false, 정수형은 0,
		   실수형은 0.0으로 초기화됨. 이외에 모든 참조 자료형은 어느 위치도 가리키고 있지 않다는 것을 나타내는 null 값으로 초기화됨.
		   
		 */
		
		/*- 실습 - 필드와 지역 변수의 초깃값*/	System.out.println("- 실습 - 필드와 지역 변수의 초깃값");
		/*클래스를 활용해 객체 생성*/	System.out.println("클래스를 활용해 객체 생성");
		System.out.println();
		
		A a = new A();
		a.printFieldValue();
		a.printLocalVariable();
		
	}
	
}
