package sec04_overlapmember.EX03_OverlapStaticMethod;

class A {
	static void print() {
		System.out.println("A 클래스");
	}
}

class B extends A {
	static void print() {
		System.out.println("B 클래스");
	}
}

public class OverlapStaticMethod {

	public static void main(String[]args) {
		
		/* 10.4.3 정적 메서드의 중복
		   
		   인스턴스 메서드가 오버라이딩되었던 이유는 동일한 공간에 동일한 이름의 메서드를 저장했기 때문임. 하지만 정적 메서든느 정적 필드와 
		   마찬가지로 각자의 클래스 내부에 존재함. 즉 다른 공간에 저장되는 것. 부모 클래스의 정적 메서드는 부모 클래스 내부에, 자식 클래스의
		   정적 메서드는 자식 크래스 내부에 저장되고, 이 클래스들은 다시 스태틱 영억에 저장됨으로써 공간의 중복이 발생하지 않음. 반대로 인스턴스
		   메서드는 쓰이는 호출 과정에서 인스턴스 메서드 영역에 이름이 같은 메서드끼리 호출되는 과정에서 같은 공간을 공유하므로, 만약 이름이 같아
		   공간을 같이 쓴다면 중복되어 덮어쓰기가 발생함. 이를 메서드 오버라이딩이라고 함.
		   
		   다만 Java에서는 효율성을 높이기 위해 이러한 메서드의 호출과 적용을 그때그때 연산하지 않고 메서드 테이블을 미리 작성해놔서 바로바로
		   적용시키므로 반복되는 연산 과정을 줄여 효율성을 높이고 있음. 인스턴스 메서드는 호출 과정에서 메서드 영역에 저장된 메서드 테이블을
		   통해 호출됨. 이름과 시그니처가 같은 메서드는 자식 클래스의 메서드가 부모 클래스의 메서드를 덮어씌우며, 이를 메서드 오버라이딩이라고 함.
		   이 과정은 메서드 테이블을 통해 이루어짐. Java에서는 효율성을 높이기 위해 이러한 메서드의 호출과 적용을 그때그때 연산하지 않고,
		   메서드 테이블을 사용해 메서드 호출 시 즉시 올바른 메서드를 호출함으로써 반복되는 연산 과정을 줄여 효율성을 높이고 있음.
		   
		 */
		
		/*-실습- 정적 메서드의 중복*/ System.out.println("-실습- 정적 메서드의 중복");
		System.out.println();
		
		/*클래스명으로 바로 접근*/ System.out.println("클래스명으로 바로 접근");
		System.out.println();
		
		A.print();
		B.print();
		System.out.println();
		
		// 객체 생성
		
		A aa = new A();
		B bb = new B();
		A ab = new B();
		
		/*객체를 통한 메서드 호출*/ System.out.println("객체를 통한 메서드 호출");
		System.out.println();
		
		aa.print();
		bb.print();
		ab.print();
		
	}
	
}
