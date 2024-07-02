package sec04_anonymousclass.EX04_AnonymousClass_4;

interface A {
	public abstract void abc();
}

class C{
	void cde(A a) {
		a.abc();
	}
}

public class AnonymousClass_4 {

	public static void main(String[]args) {
		
		/* 클래스 미정 및 참조 변수명을 사용/ 미사용했을 때 입력매개변수 객체 전달
		   
		   자식 클래스를 별도로 정의하지 않고, 익명 이너 클래스를 사용해 메서드 입력매개변수로 객체를 전달하는
		   방법을 알아보자. 익명 이너 클래스 문법을 활용했다는 점을 제외하면 AnonymousClass_3 파일에서
		   다룬 방법 1,2와 같음. 
		   
		 */
		
		C c = new C();
		
		// 방법3. 클래스명 x + 참조 변수명 o
		
		A a = new A() { // 참조 변수 a 생성.
			public void abc() {
				System.out.println("방법3의 입력매개변수 전달");
			}
		};
		
		c.cde(a);
		
		/* 방법 3은 익명 이너 클래스를 사용해 객체를 생성하고, 객체를 참조하는 참조 변수(a)를 
		    cde() 메서드의 입력매개변수로 전달했음.
		    
		   
		 */
		
		// 방법4. 클래스명 x + 참조 변수명 x
		
		c.cde(new A() {
			public void abc() {
				System.out.println("방법4의 입력매개변수 전달");
			}
		});
		
		/* 방법4는 참조변수를 대입하지 않고 메서드 입력 매개변수 자리에서 곧바로 익명 이너 클래스 객체를
		   생성해 전달하는 방식임. 4가지 중 어떤 것을 사용해도 괜찮지만, 생성하는 객체의 개수, 객체의 사용
		   시점 등 상황에 따라 효율적인 방법이 다르므로 4가지 방법을 모두 알아둠이 좋음. 특히 방법4는
		   이벤트 처리 등에 가장 많이 사용되는 형식이므로 꼭 기억해둘 것.
		   
		   앞에서 추상 클래스의 객체 생성 때도 언급한 바가 있고, 이 예제에서 볼 수 있는 바와 같이
		   익명 이너 클래스를 사용하면 직접 클래스를 추가로 정의해야 하는 수고로움도 덜 수 있음.
		   다만 여러 개의 객체를 생성하고자 할때는 객체를 생성할때마다 추상 메서드를 구현해야 하므로
		   상황에 맞춰 직접 클래스를 작성할지, 익명 이너 클래스를 사용할지를 가늠함이 옳음.
		   
		 */
		
	}
	
}