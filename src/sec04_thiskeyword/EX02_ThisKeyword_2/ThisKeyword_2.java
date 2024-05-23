package sec04_thiskeyword.EX02_ThisKeyword_2;

class A{
	int m;
	int n;
	void init(int a, int b) {
		m = m; // this를 달지 않았으므로 init() 메서드 내에서 지역 변수로만 쓰이고 값을 밖으로 넘겨주지 못함
		n = n; // this를 달지 않았으므로 init() 메서드 내에서 지역 변수로만 쓰이고 값을 밖으로 넘겨주지 못함
	}
}
class B{
	int m;
	int n;
	void init(int m, int n) {
		this.m = m; // this.m은 필드 m을 가리킴
		this.n = n; // this.n은 필드 n을 가리킴
	}
}

public class ThisKeyword_2 {

	public static void main(String[]args) {
		
		/* this를 생략해도 항상 컴파일러가 추가해주므로 굳이 신경쓸 필요가 없어 보이지만, 그렇지만은 아님. this.를 명시적으로 붙여줘야 하기도 함.
		   필드명은 m, n이며 init(int m, int n) 메서드에도 지역 변수 m과 n이 있음. init() 메서드에서는 입력받은 지역 변수 m과
		   n의 값을 필드 m과 n에 각각 대입하고자 함. 먼저 필드와 지역 변수의 사용범위를 알아보면, 필드 m, n은 클래스 내부에 선언되어
		   있으며 클래스 전체에서 사용할 수 있음. 반면 init 메서드에서 선언된 지역 변수 m, n은 init() 메서드 내부에서만 사용할 수 있음.
		   따라서 init() 메서드 내부에서는 필드 m, n과 지역 변수 m, n을 모두 사용할 수 있게 됨. 그렇다면 init()메서드 내부에서 
		   필드 m, n을 사용하면 이는 지역 변수일까? 필드일까? 
		   
		   지역 변수와 필드 모두를 사용할 수 있는 영역에서는 사용 범위가 좁은 변수, 즉 지역 변수로 인식함. (중요)
		   
		   따라서 init()메서드 안에서 m = n, n = n과 같이 작성하면 컴파일러는 이들 모두를 지역 변수로 인식하므로 this.는 당연히
		   추가되지 않음. 지역 변수에 지역 변숫값을 다시 대입하는 형태이므로 필드값은 전혀 변화가 없음. 따라서 다음과 같이 객체를 생성한 후
		   메서드를 호출하고 필드값을 확인하면 모두 값이 0으로 출력됨.
		
		*/
		
		A a = new A();
		a.init(3, 4);
		System.out.println(a.m);
		System.out.println(a.n);
		System.out.println();
		
		// 이러한 문제로 인해, 의도처럼 넘겨받은 지역 변수 m, n의 값을 필드 m, n에게 대입하기 위해서는 class C와 같이 this를 붙여야 함.
		
		B b = new B();
		b.init(3, 4);
		System.out.println(b.m);
		System.out.println(b.n);
		
		/*- 실습 - 명시적 this 키워드 자동 추가*/ System.out.println("- 실습 - 명시적 this 키워드 자동 추가");
		/*필드명과 지역 변수명이 같고, this 키워드를 사용하지 않음*/ 
		System.out.println("필드명과 지역 변수명이 같고, this 키워드를 사용하지 않음");
		
		A a1 = new A();
		a1.init(2, 3);
		System.out.println(a1.m);
		System.out.println(a1.n);
		System.out.println();
		
		/*필드명과 지역 변수명이 같고, this 키워드를 사용함*/ System.out.println("필드명과 지역 변수명이 같고, this 키워드를 사용함");
		
		B b1 = new B();
		b1.init(2, 3);
		
		System.out.println(b1.m);
		System.out.println(b1.n);
		
	}
	
}
