package sec03_constructor.EX01_DefaultConstructor;

class A{
	int m;
	void work(){
		System.out.println("class A로 출력: " + m);
	}
	/*
	A(){
		// 생성자가 없으므로, 컴파일러가 기본 생성자를 이와 같은 형태로 추가해 줌.
	}
	 */
}
class B{
	int m;
	void work(){
		System.out.println("class B로 출력: " + m);
	}
	B(){ // 생성자를 직접 정의, 컴파일러가 기본 생성자를 추가하지 않음.
		
	}
}
class C{
	int m;
	void work(){
		System.out.println("class C로 출력: " + m);
	}
	C(int a){ // 생성자를 직접 정의, 컴파일러가 기본 생성자를 추가하지 않음.
		m = a;
	}
}
class D{
	int m;
	void work(){
		System.out.println("class C로 출력: " + m);
	}
	D(int a){ // 생성자를 직접 정의, 컴파일러가 기본 생성자를 추가하지 않음.
		m = 7;
	}
}

public class DefaultConstructor {

	public static void main(String[]args) {
		
		/* 7.3 생성자
		   7.3.1 생성자의 특징
		   
		   생성자constructor는 객체를 생성하는 역할을 지닌 클래스의 내부 구성요소임. 또한 객체 내에 포함되는 필드의 초기화 또한 주로
		   생성자 내에서 역할을 수행함. 생성자를 작성할 때 꼭 지켜야하는 문법적 규칙은 2가지로, 첫 번째는 반드시 클래스명과 동일한 이름으로
		   지어야 한다는 것. 클래스명과 다르면 더 이상 생성자가 아니게 됨. 두 번째는 메서드와 비슷한 구조를 지니고 있지만, 리턴 타입이 없음.
		   여기서 집중해야 할 것은 리턴 타입이 없다와 리턴하지 않는다(void)는 전혀 다른 이야기라는 것. 생성자는 아예 리턴 타입 자체가 없다는
		   이야기임. 이러한 2가지 특징을 반영한 생성자의 문법 구조는 다음과 같음..
		   
		   클래스명 (입력매개변수) { // 생성자명은 클래스명과 동일하게, 입력매개변수는 생략 가능
		   	  // ...
		   }
		   
		   class A {
		      A(){
		         // ...
		      }
		   }
		   
		   7.3.21 기본 생성자의 자동 추가
		   
		   이러한 기본 특징을 살펴본 뒤 생각해보면, A a = new A()와 같이 생성자를 호출해 객체를 만들었던 기억말고는, 생성자를 따로 만든
		   기억이 없음. 그러나 지금까지 생성자를 만들지 않아도 정상적으로 객체가 생성됐던 이유는 생성자를 포함하지 않는 클래스에게 컴파일러가
		   기본 생성자를 추가해줬기 때문임. 여기서 기본 생성자는 입력매개변수가 없는 생성자를 의미함.
		   앞서 클래스와 객체를 각각 붕어빵 기계와 붕어빵이라고 설명했다면, 생성자는 붕어빵을 찍어내는 기능 정도로 이해 가능함. 그런데 컴파일러가
		   코드를 살펴본 뒤 찍어내는 기능이 빠져 있다면, 꼭 필요한 기능을 자동으로 추가해줘서 정상적인 붕어빵을 얻게 만드는 것임. 이러한 기본
		   생성자가 들어간 모습은 다음 코드 2개의 비교로 파악해 볼 수 있음.
		   
		   class A{
		      int m;
		      void work(){ ...}
		   }
		   
		   class A{
		      int m;
		      void work(){ ...}
		      A(){
		         // 컴파일러가 아무 기능도 없는, 그러나 꼭 필요한 부품인 생성자를 자동으로 기본 생성자의 형태로 추가.
		      }
		   }
		   
		   생성자가 호출되는 것만으로 객체가 내부적으로 생성됨. 생성자의 실행문, 즉 생성자의 중괄호 안은 객체가 생성된 이후에 실행할 구문이
		   작성되는 부분임. 일반적으로 여기에서 필드를 초기화함. 고로 컴파일러가 추가해 주는 기본 생성자 안은 비어있게 됨. 그렇다면 이미 생성자가
		   있는 코드는 어떻게 될까? 클래스 A는 이미 있는 생성자를 이용해 객체를 생성할 수 있으므로 컴파일러는 기본 생성자를 생성하지 않음.
		   
		   class A{
		      int m;
		      void work(){ ...}
		      A(int k){
		         m = k;
		      }
		   }
		   
		 */
		
		
		/*- 실습 - 기본 생성자의 자동 추가*/ System.out.println("- 실습 - 기본 생성자의 자동 추가");
		
		// 예제에 제시된 외부 클래스들은 상단 참조
		
		// 클래스의 객체 생성
		
		A a = new A();
		B b = new B();
		// C c = new C(); // 기본 생성자 호출 불가능, 작성한 생성자를 써야하지만 int 자료형만 받을 수 있기 때문에 오류 발생
		C c = new C(3);
		D d = new D(11);
		
		/*메서드 호출*/ System.out.println("메서드 호출");
		
		a.work();
		b.work();
		c.work();
		d.work(); // 11을 넣어도 생성자에서 값을 고정했기 때문에 고정된 값으로 출력됨.
		
	}
	
}