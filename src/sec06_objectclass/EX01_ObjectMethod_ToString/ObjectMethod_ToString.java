package sec06_objectclass.EX01_ObjectMethod_ToString;

class A {
	int a = 3;
	int b = 4;
}

public class ObjectMethod_ToString {

	public static void main(String[]args) {
		
		/* 10.6.1 Object 클래스의 주요 메서드
		   
		   앞서 이야기한 것처럼 Object 클래스는 자바의 최상위 부모 클래스임. 이는 자바의 모든 클래스가 Object 클래스의 메서드를 포함하고
		   있다는 의미기도 함. 그럼 Object 클래스의 대표적인 메서드를 알아보자.
		   
		   toString() 반환 타입 String : Object 객체의 정보 패키지.클래스명@해시코드, 일반적으로 오버라이딩해서 사용함
		   equals(Object obj) 반환 타입 boolean : 입력 매개변수 obj 객체와 stack 메모리값(번지) 비교
		   										등가 비교 연산자 == 와 동일한 결과값을 출력
		   hashCode() 반환 타입 int : 객채의 hashCode() 값을 리턴함. Hashtable, HashMap 등 동등 비교에 사용함
		   							위치값을 기반으로 생성된 고유값을 출력함.
		   							
		   toString() - 객체 정보를 문자열로 출력함
		   
		   Object 클래스의 toString() 메서드는 객체 정보를 문자열로 리턴하는 메서드임. 여기서 객체 정보는 패키지.클래스명@해시코드의 형태로
		   출력됨. 해시코드는 객체가 저장된 위치와 관련된 값임. 실제 객체의 정보를 표현하고 할 때는 대부분 클래스 명이나 숫자로 나열된 해시코드보다
		   객체에 포함돼 있는 필드값을 출력함. 따라서 이때 자식 클래스에서는 toString() 메서드를 오버라이딩해서 사용함. 다음과 같이 클래스 A가
		   정의됐을 때를 살펴보자.
		   
		   클래스 A는 아무것도 상속하지 않았으므로 컴파일러가 자동으로 extends Object를 삽입함. 따라서 내부에는 Object의 메서드가
		   포함돼 있을 것임. 이때 다음과 같이 A 객체를 생성한 후 hashCode() 메서드의 리턴값을 16진수로 출력하면 aa 객체의 위칫값과 관련되
		   고윳값이 출력됨. 이를 다르게 말하면 2개의 값이 설령 그 절대값이 같더라도 위치가 서로 다르면 다른 리턴값을 지닐 수 있다는 것.
		   
		 */
		
		A aa = new A();
		System.out.printf("%x\n", aa.hashCode()); // 70dea4e3
		System.out.println(aa); // 패지명.클래스명@해시코드, sec06_objectclass.EX01_ObjectMethod_ToString.A@75a1cd57
		
		/* 또한 println() 메서드는 객체를 출력하면 자동으로
		   
		 */

	}
	
}
