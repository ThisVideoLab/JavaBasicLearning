package sec01_inheritanceplymorphism.EX01_InheritanceMemoryStructure;

class A{
	int m;
	void abc() {}
}
class B extends A{
	int n;
	void bcd() {};
}
class C {
	C(){}
}
class D extends C{
	D(){}
}

public class InheritanceMemoryStructure {

	public static void main(String[]args) {
		
		/* 10.1.4 상속할때의 메모리 구조
		   
		   상속받은 자식 클래스는 부모 클래스의 모든 멤버를 내려받는다고 배웠음. 이것이 가능한 이유는 상속받은 자식 클래스의 객체가 생성되는
		   메모리의 구조를 살펴보면 자연스럽게 이해가 가능함. 이 자바 파일에 부모 클래스 A와 자식 클래스 B를 생성하도록 함.
		 */
		
		B b = new B();
		
		/* 그 후에 자식 클래스 B읭 객체를 만들게 되면, JVM은 먼저 힙영역에 부모클래스의 객체를 생성함. 그 후 자식 클래스에서 독자적으로
		   추가한 멤버가 객체에 추가됨으로써 클래스 B의 전체 객체가 완성되게 됨. 즉 자식 클래스의 내부에는 부모 클래스 객체가 포함되어
		   있으므로 자식 클래스 객체에서 부모 클래스의 멤버를 사용할 수 있는 것.
		   
		   10.1.5 생성자의 상속 여부
		   
		   상속을 수행하면, 부모의 모든 멤버를 내려받는다고 익히 배움. 멤버는 클래스의 4가지 내부 고성 요소 중 생성자를 제외한 필드, 메서드
		   이너클래스를 의미함. 고로 생성자는 상속되지 않음. 더 정확히는 절대 상속돼선 안됨. 그 이유는 외부 클래스 C와 D에서 찾아볼 수 있음.
		   만약 자식 클래스 D가 부모 클래스 C의 생성자까지 내려 받는다면 class B의 내부 모양은 다음과 같을 것임.
		   
		   class D extends C{
		   C(){} 
		   D(){}
		   }
		   
		   앞서 학습한 내용을 보면 클래스 내부에는 필드, 메서드, 생성자, 이너 클래스만이 올 수 있음. 그렇다면 A(){}는 과연 어디에 해당해야
		   할까? 일단 중괄호와 소괄호가 있으므로 필드와 이너 클래스는 아님. 또한 생성자는 클래스의 이름과 같아야 하므로 생성자도 아님. 마지막으로
		   메서드라고 하기엔 리턴 타입이 없으므로 메서드도 아님. 결국 내부 구성 요소가 아닌 다른 것을 상속받는 셈이 되기 때문에 오류가 발생하게 됨.
		   이것이 바로 생성자가 상속되지 않는 이유임.
		   
		 */
	}
	
}
