package sec01_abstractclass.EX00_AbstractClass_0;

public class AbstractClass_0 {

	public static void main(String[]args) {
		
		/* 추상 클래스와 인터페이스
		   
		   12. 추상 클래스와 인터페이스
		   12.1 추상 클래스
		   12.1.1 추상 클래스의 정의
		   
		   추상 메서드는 메서드의 본체가 완성되지 않은 미완성 메서드를 의미함. 메서드의 기능을 정의하는 중괄호 안이 비어 있다는 것이 아니라
		   중괄호 자체가 없으며, 중괄호가 없기 때문에 명령어의 끝을 알리는 세미콜론(;)으로 끝이 나야 함.
		   
		   추상 메서드
		   
		   abstract 리턴 타입 메서드명(입력매개변수);
		   
		   abstract void abc();
		   
		   추상 메서드를 1개 이상 포함하고 있는 클래스는 반드시 추상 클래스 abstract class로 정의돼야 함. 즉, 일반적으로 추상 클래스는
		   메서드의 기능이 정의돼 있지 않은 미완성 메서드(중괄호가 없는 메서드)가 1개 이상 있다는 의미임. 다만 일반적일 뿐 꼭 추상 메서드를
		   포함하진 않아도 됨. 추상 클래스의 경우는 메서드와 마찬가지로 abstract를 붙여주면 됨.
		   
		   추상 클래스
		   
		   abstract class 클래스명
		   
		   abstract class A{
		      abstract void abc(){}
		   }
		   
		   메서드의 완성/ 미완성의 기준
		   
		   그렇다면 완성/ 미완성에 대한 기준은 무엇일까? 그 구분 기준은 메서드의 기능을 정의하는 중괄호의 존재 여부임. 기능에 초점을 두다 보니
		   간혹 중괄호 안에 아무런 코드가 작성되지 않으면 미완성 메서드라고 생각하는 때가 있음. 다시 한번 말하자면, 완성과 미완성 메서드의 유일한
		   구분점은 중괄호임. 만일 중괄호 안에 아무런 코드가 없더라도 그 메서드는 '아무런 일도 하지 말라'는 기능이 명확한 완성된 메서드임.
		   
		   abstract class A{
		      abstract void abc(); // 중괄호가 없는 추상 메서드는 미완성 메서드임
		   }
		   
		   class B extends A{
		      void abc() { // 중괄호 안에 아무런 코드가 없더라도 완성된 메서드임
		      }
		   }
		   
		   12.1.2 추상 클래스의 특징
		   
		   이번에는 추상 클래스의 객체를 생성하고자 할 때를 살펴보자. 추상 클래스는 내부의 미완성 메서드 때문에 객체를 직접 생성할 수 없음.
		   힙 메모리에 생성되는 객체는 내부 요소가 미완성된 상태로 들어갈 수 없기 때문임. 문법적으로 이야기하면 추상 클래스일 때 A a = new A()와
		   같이 생성자의 호출 자체를 할 수 없다는 이야기임.
		   
		   그렇다면 객체도 만들지 못하는 클래스의 필요성은 무엇일까? 6장에서 클래스의 개념을 설명하기 위해 차용했던 붕어빵론으로 설명해보자면,
		   추상 클래스는 붕어빵 기계 부품에 해당함. 붕어빵 기계 부품으로는 붕어빵을 찍을 순 없지만, 붕어빵 기계는 붕어빵 기계 부품들이 합쳐진
		   복합체이며, 이러한 부품들로 인해 기계가 붕어빵을 찍을 수 있게 되는 것. 고로 이 추상 클래스를 상속한 자식 클래스를 통해 객체를 생성할 수
		   있는 것. 그리고 생성된 객체 내부에는 부모 클래스의 추상 메서드가 구현돼 있음. 이 독특한 절차를 일컬어 '구현한다' implements라고 부름.
		 */
		
	}
	
}
