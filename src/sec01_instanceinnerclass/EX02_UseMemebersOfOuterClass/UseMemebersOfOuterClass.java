package sec01_instanceinnerclass.EX02_UseMemebersOfOuterClass;

class A{
	int a = 3;
	int b = 4;
	void abc() {
		System.out.println("A 클래스 메서드");
	}
	
	// 인스턴스 이너 클래스 정의
	class B{
		int a = 5;
		int b = 6;
		void abc() {
			System.out.println("B 클래스 ");
		}
		
		void bcd() {
			// 이너 클래스의 멤버 호출 또는 사용 
			System.out.println(a);
			System.out.println(b);
			abc(); // 컴파일러가 자동으로 this를 추가하므로 "B 클래스"를 출력함.
			
			// 아우터 클래스의 멤버 호출 또는 사용
			System.out.println(A.this.a);
			System.out.println(A.this.b);
			A.this.abc();
		}
	}
}



public class UseMemebersOfOuterClass {

	public static void main(String[]args) {
		 
		
		/* 아우터 클래스의 객체 참조하기
		   
		   앞선 내용을 통해 인스턴스 이너 클래스에서는 아우터 클래스의 모든 멤버를 마치 자기 것처럼
		   사용할 수 있다고 했음. 그렇다면 아우터 클래스의 필드나 메서드와 동일한 이름을 이너 클래스 안에서
		   정의했을 때 이너 클래스의 내부에서는 누구의 필드 또는 메서드가 참조될까? 당연히 이너 클래스의
		   필드나 메서드가 참조됨. 참조 객체명을 생략할 때는 자기 자신의 객체를 가리키는 this 키워드를
		   컴파일러가 자동으로 추가하기 때문임. 이너 클래스 내부에서 this의 의미는 이너 클래스 자신이 됨.
		   
		   그렇다면 이너 클래스의 내부에서 아우터 클래스의 멤버를 참조하고 싶다면 어떻게 해야 할까? 이때는
		   '아우터 클래스명.this'를 명시적으로 붙여 사용함. 이 역시 조금은 특이한 형태이므로 기억해야 함.
		   다음 예를 통해 자세히 살펴보자. 클래스 B 내부의 메서드에서 a와 같이 참조 변수 없이 멤버를
		   사용하거나 this.a를 사용하면 B 클래스의 필드 A를 의미함. 반면 아우터 클래스의 필드 a를
		   참조하기 위해서는 A.this.a와 같이 사용해야 함. 메서드도 이와 비슷하게 동작함.
		  
		 */
		
		// 아우터 클래스 객체 생성
		
		A a = new A();
		
		// 이너 클래스 객체 생성
		
		A.B b = a.new B();
		b.bcd();
		
	}
	
}
