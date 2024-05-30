package sec02_staticmodifier.EX03_StaticMethod;

class A{
	void abc() { // 인스턴스 메서드
		System.out.println("instance 메서드");
	}
	static void bcd() { // 정적 메서드
		System.out.println("static 메서드");
	}
}

public class StaticMethod {
	
	public static void main(String[]args) {
		
		/* 9.2.2 인스턴스 메서드와 정적 메서드
		   
		   인스턴스 메서드와 정적 메서드에 대한 비교. 앞서 살펴본 필드와 마찬가지로 인스턴스 메서드는 반드시 객체를 생성한 후에 사용할 수 있지만,
		   정적 메서드는 클래스명으로도 바로 접근이 가능함. 또한 인스턴스 메서드처럼 객체로도 호출이 가능함. 다음 클래스 A는 인스턴스 메서드와
		   정적 메서드를 1개씩 포함하고 있는 클래스임.
		   
		   인스턴스 메서드와 정적 메서드를 1개씩 포함하고 있는 클래스의 예
		   
		   class A{
		      void abc() {
		         System.out.println("instance 메서드"); // 객체를 생성한 후에 사용 가능
		      }
		      static void bcd() {
		         System.out.println("static 메서드"); // 객체 생성 없이 사용 가능
		      }
		   }
		   
		   인스턴스 메서드의 활용 방법 // 인스턴스 메서드와 정적 메서드의 활용 방법은 인스턴스 필드와 정적 필드와 같음. 
		   
		   A a = new A();
		   a.abc(); // 인스턴스 메서드
		   
		   정적 메서드의 활용 방법1
		   A.bcd(); // 정적 메서드
		   
		   정적 메서드의 활용 방법2(권장하지 않음)
		   
		   A a = new A();
		   a.bcd(); // 정적 메서드
		   
		   인스턴스 필드와 정적 필드의 다른 점은 인스턴스 메서드와 정적 메서드는 모두 메모리의 첫 번째 영역에 위치한다는 것. 다만 인스턴스
		   메서드는 인스턴스 메서드 영역, 정적 메서드는 클래스 내부에 존재하는 것만 차이가 남.
		 */
		
		/* 인스턴스 메서드 활용 방법(객체를 생성한 후 사용 가능) */ System.out.println("인스턴스 메서드 활용 방법(객체를 생성한 후 사용 가능");
		A a1 = new A();
		a1.abc();
		System.out.println();
		
		/*정적 메서드 활용*/ System.out.println("정적 메서드 활용");
		/*1. 클래스명으로 바로 접근해 사용*/ System.out.println("1. 클래스명으로 바로 접근해 사용");
		A.bcd();
		System.out.println();
		
		/*2. 객체 생성 후 사용(권장하지 않음)*/ System.out.println("2. 객체 생성 후 사용(권장하지 않음)");
		A a2 = new A();
		a2.abc();
		System.out.println();
		
		/* 9.2.3 정적 메서드 안에서 사용할 수 있는 필드와 메서드
		   
		   정적 메서드 내에서는 정적 필드 또는 정적 메서드만 사용 가능함. 즉 인스턴스 필드나 인스턴스 메서드는 사용이 불가능함. 이유는 개념만
		   잘 이해하면 당연한 일임. 정적 멤버(정적 필드, 정적 메서드)는 객체의 생성 없이 실행될 수 있어야 함. 하지만 인스턴스 멤버(인스턴스
		   필드, 인스턴스 메서드)는 반드시 객체를 생성한 후에 사용할 수 있음. 만일 정적 메서드 내에서 인스턴스 멤버를 사용한다면 결국 정적
		   메서드 내부에 정적 멤버만 올 수 있는 이유임.
		   이를 프로그래밍 문법의 관점으로 설명하면, 정적 메서드 내부에서는 클래스 내부에서 자신의 객체를 가리키는 this 키워드를 사용할 수
		   없는 것을 의미함. 따라서 this.가 자동으로 붙어야 하는 인스턴스 멤버는 올 수 없는 것. 반대로 인스턴스 메서드 내에서는 인스턴스
		   멤버와 정적 멤버를 모두 사용할 수 있음.
		   
		 */
	}
}