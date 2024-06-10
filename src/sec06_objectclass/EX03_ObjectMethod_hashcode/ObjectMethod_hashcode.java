package sec06_objectclass.EX03_ObjectMethod_hashcode;

import java.util.HashMap;

class A{
	String name;
	A(String name){
		this.name = name;
	}
	@Override
	public boolean equals(Object obj) {
		if(this.name == ((A)obj).name) {
			return true;
		} else
			return false;
	}
	@Override
	public String toString() {
		return name;
	}
	
}

class B {
	String name;
	B(String name) {
		this.name = name;
	}
	@Override
	public boolean equals(Object obj) {
		if(this.name == ((B)obj).name) {
			return true;
		} else
		return false;
	}
	@Override
	public int hashCode() {
		return name.hashCode();
	}
	@Override
	public String toString() {
		return name;
	}
}

public class ObjectMethod_hashcode {

	public static void main(String[]args) {
		
		/* hashCode() - 객체의 위치와 연관된 값
		   
		   hashCode() 메서드는 객체의 위치와 관련된 값으로, 실제 위치를 나타내는 값은 아님. 객체의 위칫값을 기준으로 생성된 고윳값 정도로
		   생각하는 것이 적절함. 앞에서 두 객체의 내용을 비교하기 위해 equals() 메서드를 오버라이딩 했었음. 일반적으로 두 객체의 내용을
		   비교하기 위해서는 equals() 메서드를 오버라이딩하는 것만으로 충분함. 허나 hashtable, HashMap 등에서 동등 비교를 하고자 할 땐
		   hashCode()까지 오버라이딩해야 함.
		   HashMap 자료 구조는 데이터를 (Key, Value)의 쌍으로 저장하며, key 값은 중복되지 않음. 따라서 Key 값이 서로 같은지부터
		   확인해야 하는데 이 과정은 다음과 같이 2단계로 구성됨. 첫 번째 단계에서는 두 객체의 
		   
		   
		 */
		
	}
	
}
