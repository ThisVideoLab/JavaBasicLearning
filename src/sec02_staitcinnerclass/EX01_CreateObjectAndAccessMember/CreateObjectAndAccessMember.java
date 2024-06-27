package sec02_staitcinnerclass.EX01_CreateObjectAndAccessMember;

class A{
	static class B{
		void abc(){
			System.out.println("static 클래스 B의 abc() 메서드");
		}
	}
}

class A1{
	int a = 3;
	static int b = 4;
	void method1() {
		System.out.println("instance method");
	}
	static void method2() {
		System.out.println("static method");
	}
	
	// 정적 이너 클래스
	static class B1{
		void bcd() {
			
			// 필드 사용
			// System.out.println(a); // 정적 이너 클래스는 아우터 클래스의 정적 멤버만 사용 가능
			System.out.println(b);
			
			// 메서드 호출
			// method1(); // 정적 이너 클래스는 아우터 클래스의 정적 멤버만 사용 가능
			method2();
		}
	}
}

public class CreateObjectAndAccessMember {

	public static void main(String[]args) {
		
		/* 13.1.2 정적 멤버 이너 클래스
		   
		   정적 멤버 이너 클래스는 이너 클래스 앞에 static 키워드가 포함된 이너 클래스임. 정적 메서드와
		   동일하게 아우터 클래스의 정적 멤버에만 접근할 수 있는데, 이는 이너 클래스의 특싱어 아닌 정적
		   static 접근 지정자의 특성임. 즉 아우터 클래스의 객체를 생성하지 않아도 정적 이너 클래스의
		   객체를 생성해 사용할 수 있어야 하므로 아우터 클래스의 멤버 중 객체 생성 없이 바로 사용할 수 있는
		   정적 멤버만 정적 이너 클래스 내부에서 사용할 수 있는 것임.
		   
		   정적 이너 클래스 객체 생성하기
		   
		   컴파일 이후에는 '아우터 클래스.class', '아우터 클래스$이너 클래스.class'의 바이트 코드
		   파일이 인스턴스 멤버 클래스와 동일하게 생성이 됨. 반면 객체를 생성하는 방법은 다음과 같이 훨씬
		   간단함. 정적 이너 클래스도 말 그대로 정적 멤버이므로 클래스명으로 바로 접근할 수 있음.
		   
		   정적 멤버 이너 클래스의 객체 생성 방법
		   
		   아우터 클래스.이너 클래스 이너 클래스 참조 변수 = new 아우터 클래스.이너 클래스();
		   
		   A.B b = new A.B();
		   
		   class A{
		      static class B{
        		// 내용
	          }
		   }
		   
		 */
		
		A.B b = new A.B();
		b.abc();
		
		// - 실습 - 정적 이너 클래스에서의 외부 멤버 사용 및 객체 생성
		System.out.println(" - 실습 - 정적 이너 클래스에서의 외부 멤버 사용 및 객체 생성");
		
		A1.B1 b1 = new A1.B1();
		
		// 메서드 호출
		
		b1.bcd();
		
	}
	
}
