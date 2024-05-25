package sec05_thismethod.EX02_ThisMethod_2;

class A{
	int m1, m2, m3, m4;
	A(){
		m1 = 1;
		m2 = 2;
		m3 = 3;
		m4 = 4;
	}
	A(int a){
		m1 = a; // 두 번째 생성자가 첫 번째 생성자와 다른 점, 직접 m1의 값을 입력함.
		m2 = 2;
		m3 = 3;
		m4 = 4;
	}
	A(int a, int b){
		m1 = a;
		m2 = b; // 세 번째 생성자가 두 번째 생성자와 다른 점, 직접 m2의 값을 입력함.
		m3 = 3;
		m4 = 4;
	}
	void print() {
		System.out.print(m1 + " ");
		System.out.print(m2 + " ");
		System.out.print(m3 + " ");
		System.out.print(m4);
		System.out.println();
	}
}
class B{
	int m1, m2, m3, m4;
	B(){
		m1 = 1;
		m2 = 2;
		m3 = 3;
		m4 = 4;
	}
	
	/* 이러한 생성자가 만일 100줄이라고 사정해보자. 만약 위의 클래스 A의 방식으로 진행한다면, 생성자들을 불러올 때마다 100줄의 코드를 불러야 함.
	   그런데 100줄 중에서 단 1개의 필드 값만 고치고 싶다면, 100줄을 모두 부르는 것은 낭비임. 이런 경우에는 B(int a) 생성자와 같이 this()
	   메서드를 활용해서 호출한 뒤에 필드 값 하나만을 고치면 생성자의 중복도 제거하고 코드의 간소화도 이룰 수 있게 됨.
	   
	 */
	
	B(int a){
		this();
		m1 = a;
	}
	B(int a, int b){
		this(a); // this(a) 대신 this (), m1 = a; 로도 동일하게 수정 가능함.
		m2 = b;
	}
	void print() {
		System.out.print(m1 + " ");
		System.out.print(m2 + " ");
		System.out.print(m3 + " ");
		System.out.print(m4);
		System.out.println();
	}
	
}

public class ThisMethod_2 {

	public static void main(String[]args) {
		
		/*- 실습 - this(생성자 입력매개변수) 활용*/ System.out.println("- 실습 - this(생성자 입력매개변수) 활용");
		
		/*3가지 객체 생성(this() 미사용)*/ System.out.println("3가지 객체 생성(this() 미사용)");
		A a1 = new A();
		A a2 = new A(10);
		A a3 = new A(10, 20);
		
		a1.print();
		a2.print();
		a3.print();
		System.out.println();
		
		/*3가지 객체 생성(this() 사용)*/ System.out.println("3가지 객체 생성(this() 사용)");
		
		B b1 = new B();
		B b2 = new B(10);
		B b3 = new B(10, 20);
		b1.print();
		b2.print();
		b3.print();
	}
}

