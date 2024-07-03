package sec05_innerinterface.EX01_CreateObjectOfInnerInterface;

import sec05_innerinterface.EX01_CreateObjectOfInnerInterface.A.B;

class A {
	interface B { // static을 생략한다 하더라도 컴파일러가 자동으로 추가해줌.
		public abstract void bcd();
	}
}

class C implements A.B {
    public void bcd() {
    	System.out.println("이너 인터페이스 구현 클래스 생성");
    }
 }

public class CreateObjectOfInnerInterface {

	public static void main(String[]args) {
		
		/* 13.3 이너 인터페이스
		   
		   이제 마지막으로 이너 인터페이스 inner interface를 알아보자. 이너 클래스와 마찬가지로 인터페이스를
		   클래스 내부에 정의하는 것은 해당 클래스에 의존적인 기능을 수행할 때임. 예를 들어 버튼 클릭을 감지하는
		   인터페이스는 버튼 클래스 내부에 위치시키는 것이 바람직할 것임. 이러한 이유로 이너 인터페이스는 사용자 
		   인터페이스 user interface의 이벤트 처리에 가장 많이 사용함. 이때 일반적으로 사용자 인터페이스에서
		   이벤트를 감지하는 인터페이스를 '리스너'라고 칭함.
		   
		   13.3.1 이너 인터페이스의 정의와 특징
		   
		   이너 인터페이스의 중요한 특징 중 하나는 정적 이너 인터페이스만 존재할 수 있다는 것임. 만일 이너
		   인터페이스 앞에 static 제어자를 생략하면 컴파일러가 자동으로 추가를 해줌. 컴파일하면 이너 클래스와
		   같이 '아우터 클래스명$이너 인터페이스명.class' 형태로 바이트 코드인 .class 파일이 생성됨.
		   
		   이너 인터페이스도 인터페이스이므로 자체적으로는 객체 생성이 불가능함. 따라서 객체를 생성하기 위해선
		   해당 인터페이스를 상속한 자식 클래스를 생성한 후 생성자를 이용해 객체를 생성하거나 익명 이너 클래스를
		   활용해 객체를 생성해야 함. 즉 일반적인 엔터페이스 객체를 생성하는 방법과 동일하며, 유일한 차이점은
		   인터페이스가 클래스 내부에 존재하기 때문에 객체의 타입을 '아우터 클래스명$이너 인터페이스명'과 같이
		   사용해야 한다는 것.
		   
		   방법1 인터페이스 구현 클래스 생성 및 객체 생성
		   
		   class C implements A.B {
		      public void bcd() {}
		   }
		   
		 */
		
		C c1 = new C();
		c1.bcd();
		
		// 방법2 익명 이너 클래스 사용
		   
		A.B a = new A.B() { // static 이너 클래스일 때와 동일함
			@Override
			public void bcd() {
				
			}
		};
		
		// 객체 생성 방법1 - 자식 클래스 직접 생성
		
		A.B ab = new C();
		C c2 = new C();
		
		// 객체 생성 방법2 = 익명 이너 클래스 생성
		
		A.B b = new A.B() {
				public void bcd() {
					System.out.println("익명 이너 클래스로 객체 생성");
				}
		};
		b.bcd();
	}
	
}
