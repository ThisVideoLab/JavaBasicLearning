package sec05_superkeywordsupermethod.EX01_SuperKeyword_1;

class A {
	void abc() {
		System.out.println("A 클래스의 abc()");
	}
}

class B extends A {
	void abc() {
		System.out.println("B 클래스의 abc()");
	}
	void bcd() {
		System.out.print("이 클래스 내의 abc() 메서드를 호출합니다 :");
		abc(); // this.abc();
	}
}

public class SuperKeyword_1 {

	public static void main(String[]args) {
		
		/* 10.5 super 키워드와 super() 메서드
		   
		   this 키워드와 this() 메서드는 클래스 자신의 내부 구성 요소를 호출하는 문법 요소임. 복기를 위해 정리하자면 this는 자기 객체를
		   가리키는 참조 변수명으로 인스턴스 메서드 내부에서 필드를 사용하거나 메서드를 호출할 때 참조 변수명으로 사용함. 생략하더라도 컴파일러가
		   자동으로 추가해 줌. this() 메서드는 자신의 또 다른 생성자를 호출하고, 생성자 내에서만 사용할 수 있으며, 항상 첫 줄에 위치함.
		   이와 달리 super 키워드는 부모의 객체, super() 메서드는 부모의 생성자를 의미함. 이는 당연히 상속 관계에서만 사용 가능함.
		   
		   10.5.1 부모의 객체를 가리키는 super 키워드
		   
		   super 키워드는 부모의 객체를 가리키는 것으로, 필드명의 중복 또는 메서드 오버라이딩으로 가려진 부모의 필드 또는 메서드를 호출하기 위해
		   사용함. 다음 예를 살펴보자.
		   
		   class A {
				void abc() {
					System.out.println("A 클래스의 abc()");
				}
			}
			
			class B extends A {
				void abc() {
					System.out.println("B 클래스의 abc()");
				}
				void bcd() {
					abc(); // this.abc();
				}
			}
			
			클래스 A에는 abc() 메서드가 1개 있음. 이를 상속한 클래스 B에서는 abc() 메서드를 오버라이딩하고, 추가로 bcd() 메서드를 지님. 
			이 bcd() 메서드에서는 abc() 메서드를 다시 호출함. 여기서 호출된 abc() 메서드 코드에는 컴파일러가 자동으로 this를 추가하기
			때문에 클래스 B의 abc()를 호출함.
		   
		 */
		
		// 객체 생성
		B bb = new B();
		
		// 메서드 호출
		bb.abc();
		bb.bcd();
		
	}
	
}
