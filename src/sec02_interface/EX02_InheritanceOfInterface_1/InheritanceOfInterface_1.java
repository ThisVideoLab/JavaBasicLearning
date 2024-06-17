package sec02_interface.EX02_InheritanceOfInterface_1;

interface A{}
interface B{}

class C implements A{ // 단일 인터페이스 상속 
}

class D implements A, B{ // 다중 인터페이스 상속
}

class E extends C implements A, B{ // 클래스와 인터페이스를 동시에 상속
}

public class InheritanceOfInterface_1 {

	public static void main(String[]args) {
		
		/* 12.2.2 인터페이스의 상속
		   
		   클래스가 클래스를 상속할 때 extends 키워드를 사용한 반면, 클래스가 인터페이스를 상속할 때는 implements 키워드를 사용함. 상속에
		   있어서 인터페이스의 가장 큰 특징언 다중 상속이 가능하다는 것. 다음은 클래스가 인터페이스를 상속할 때의 문법 구조를 나타내는데, 1개의
		   클래스가 여러 개의 인터페이스를 상속할 때 쉼표(,)로 구분해 나열함.
		   
		   그렇다면 클래스에선 불가능했던 다중 상속이 인터페이스에서는 어떻게 가능한 것일까? 클래스에서 다중 상속을 할 수 없는 이유는 두 부모 클래스에
		   동일한 이름의 필드 또는 메서드가 존재할 때 이를 내려 받으면 중복되는 멤버 중에 무엇을 골라야할지 혼동이 오는 amgbiguous error가
		   발생하기 때문임. 그러나 인터페이스에서는 충돌이 발생할 수 없음. 모든 필드가 public static final로 정의되어 있기 때문에 실제
		   데이터값은 각각의 인터페이스 내부에 존재(즉, 저장 공간이 분리)해 공간상 겹치지 않기 때문임. 또한 메서드도 모두 미완성이고 어차피
		   자식 클래스 내부에서 완성되므로 문제될 것이 없음. 만일 클래스와 인터페이스를 상속하는 경우는 어떨까?
		   
		   클래스와 인터페이스를 동시에 상속하는 구조
		   
		   클래스 extends 클래스명 implements 인터페이스명, ... 
		   인터페이스명 // 이때 extends가 먼저오고 implements가 뒤에 옴. 이때 순서를 절대 바꿀 수 없음.
		   
		 */
		
	}
	
}
