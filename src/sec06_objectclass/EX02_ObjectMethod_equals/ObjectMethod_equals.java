package sec06_objectclass.EX02_ObjectMethod_equals;

class A {
	String name;
	A(String name) {
		this.name = name;
	}
}

class B {
	String name;
	B(String name){
		this.name = name;
	}
	@Override
	public boolean equals(Object obj) { // 매개변수로 obj 타입으로 받는다면, 여기서 보통 obj는 비교하려는 또 다른 객체를 의미
		if(obj instanceof B) { // 그 받은 obj 객체를 B로 캐스팅 가능하다면, 즉 B 또는 B의 자식 클래스라면
			if(this.name == ((B)obj).name) { // B 타입 객체에 대입된 String 타입의 name 값과 B 타입으로 캐스팅 된 비교 객체의 값 비교
				return true;
		}
	}
		return false;
	}
}

public class ObjectMethod_equals {

	public static void main(String[]args) {
		
		/* equals(Object obj) - 스택 메모리의 값 비교
		   
		   equals(Object obj)는 입력매개변수로 넘어온 객체와 자기 객체의 스택 메모리 변숫값을 비교해 그 결과를 true 또는 false로
		   리턴하는 메서드임. 기본 자료형이 아닌 객체의 스택 메모리값을 비교하므로 실제 데이터의 값이 아닌, 실제 데이터의 위치를 비교하는 것.
		   즉, 등가 비교 연산과 완벽하게 동일한 기능을 수행함.
		   가령 int[] a = {1, 2, 3}, int[] b = {1, 2, 3}이 있다고 가정해보자. 두 배열 객체의 내용은 동일하지만, 객체의 위치값은
		   서로 다름. 즉 a == b 의 값은 false가 됨. Object 클래스의 equals() 메서드 또한 동일하게 동작함. 이를 좀 더 자세하게
		   비교하기 위해 클래스 A를 통해 비교해보자.
		   
		 */
		
		A aa1 = new A("안녕");
		A aa2 = new A("안녕");
		
		System.out.println(aa1 == aa2); // false
		System.out.println(aa1.equals(aa2)); // false
		
		/* 객체 내부의 값은 동일하지만, 실제 객체는 서로 다른 곳에 위치하므로 위칫값을 포함해 동일함 여부를 판별하는 == 코드와 equals()
		   메서드는 둘 다 false를 출력함. 고로 실제 내용을 비교하고자 할 때는 equals() 메서드를 오버라이딩해서 사용해야 함. 클래스 B에선
		   다음과 같이 equals() 메서드를 오버라이딩함.
		   메서느 내부에서는 자신의 name 값과 입력받은 객체의 name 값을 비교해 동일하면 true, 동일하지 않으면 false를 리턴함. 이 과정에서
		   자신의 객체 타입을 일치시키기 위해 캐스팅이 가능한지 instanceof 키워드와 함께 다운 캐스팅을 사용함. 이렇게 되면 B의 equals()는
		   이제 위치값이 아니라 내용을 비교하게 됨. 따라서 다음과 같이 bb1 == bb2는 false가 나오더라도, bb1.equals(bb2)는 true를
		   리턴하게 됨.
		   
		 */
		
		B bb1 = new B("하이");
		B bb2 = new B("하이");
		
		System.out.println(bb1 == bb2); // false
		System.out.println(bb1.equals(bb2)); // false
		
	}
	
}
