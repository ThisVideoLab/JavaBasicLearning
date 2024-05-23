package sec04_thiskeyword.EX01_ThisKeyword_1;

// 클래스 내부에서 필드, 메서드에 앞에 붙는 자동으로 붙는 this 키워드

class A{
	int m;
	int n;
	void init(int a, int b) {
		int c = 3;
		this.m = a;
		this.n = b;
	}
	void work() {
		this.init(2, 3);
	}
}

public class ThisKeyword_1 {
	
	public static void main(String[]args) {
		
		/* 7.4 this 키워드와 this() 메서드
		   
		   클래스의 외부에서 멤버(필드, 메서드, 이너 클래스)를 호출하기 위해서는 객체를 먼저 생성한 후 '참조 변수명.멤버명'의 형태로 호출하지만,
		   클래스 내부에서는 개체의 생성 없이 필드와 메서드를 바로 사용할 수 있다고 학습함. 하지만 모든 사용할 수 있는 상태의 멤버는 항상
		   객체 속에만 존재함. 그렇다면 어떻게 클래스 내부에서는 객체를 생성하지 않고 바로 필드와 메서드를 계속 사용 할 수 있을까?
		   
		   7.4.1 내부 객체 참조 변수명인 this 키워드
		   
		   우리는 클래스 내부에서도 객체 안의 멤버를 사용해 옴. 즉, '참조변수명.멤버명'의 형태를 사용해 온 셈. 다만 객체를 직접 만들지 않은 것
		   뿐이지, 모든 메서드에는 자신이 포함된 클래스의 겍체를 가리키는 this라는 참조 변수가 존재함. 모든 멤버는 객체 속에 존재하는 것이므로
		   우리가 int m = 3이라는 필드를 클래스 내부에서 출력하고자 할 때도 System.out.println(this.m)과 같이 작성해야 함. 다만
		   this.를 생략하면 컴파일러가 자동으로 this.를 추가해주기 때문에 지금까지 클래스 내부에서 필드와 메서드를 그대로 사용할 수 있었음.
		   지역 변수는 멤버가 아니므로 this가 자동으로 붙지 않음.
		   
		 */
		
		/*묵시적 this 키워드 자동 추가*/ System.out.println("묵시적 this 키워드 자동 추가");
		
		// 클래스 객체 생성
		A a = new A();
		
		/*메서드 호출 / 필드값 활용*/ System.out.println("메서드 호출 / 필드값 활용");
		a.work();
		System.out.println(a.m);
		System.out.println(a.n);
		System.out.println();
		
		
	}

}

