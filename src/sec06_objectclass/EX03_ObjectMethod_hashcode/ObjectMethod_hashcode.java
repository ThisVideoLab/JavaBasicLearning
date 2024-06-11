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
		   확인해야 하는데 이 과정은 다음과 같이 2단계로 구성됨. 첫 번째 단계에서는 두 객체의 hashCode() 값을 비교함. 일단 두 객체의
		   hashCode() 값이 동일할 때 equals() 메서드를 호출하며, 이 값이 true이면 같은 객체로 인식함. 이를 정리하면 HashMap 관점에서
		   두 객체가 동일하기 위해서는 hashCode() 값이 동일해야 하고, equals() 메서드가 true를 리턴해야 함.
		   
		   좀 더 제사히 살펴보면, HashMap은 (Key, Value)의 쌍으로 이뤄진 데이터를 저장하는 자료 구조임. 예를 들어 Key가 Integer 타입,
		   Value가 String 타입이면  (1, "안녕"), (2, "방가")와 같이 데이터들을 저장할 수 있음. 이때 HashMap은 두 쌍의 데이터를
		   포함하고 있음. 여기에 다음과 같이 동일한 Key 값을 가진 (1, "땡큐")의 데이터를 추가하면 새로운 데이터가 추가되는 것이 아니라
		   이미 있는 Key 값 위치의 데이터가 바뀌게 됨.
		   
		   hashCode() -- yes --->    equal()     -- yes --> 같은 객체
		   동일여부 확인			  true 여부 확인
		   
		   따라서 HashMap에서는 추가하고자 하는 데이터셋의 Key가 기존의 Key들과 동일한지를 확인하는 과정이 반드시 필요함. HashMap에서
		   사용되는 2개의 Key 값이 동일한지를 확인하는 과정은 2단계로 이뤄짐. 첫 번째 단계에서는 두 Key의 hashCode() 값이 동일한지를
		   (key1.hashCode() == key2.hashCode()) 코드를 통해 확인함. hashCode() 값이 일치하고, equals()의 반환값이
		   true라면 같은 Key 객체로 인식하므로 해당 데이터셋은 기존 데이터셋을 덮어쓰게 됨. 반면 둘 중 하나라도 만족하지 않으면 다른 객체로
		   인식하므로 새로운 데이터셋으로 추가됨.다음 예제를 살펴보자.
		   
		   클래스 A는 equals() 메서드만을 오버라이딩함. 이 메서드에서는 비교 대상의 객체와 name 필드값이 동일하면 true를 리턴함. 반면
		   클래스 B는 equals() 메서드와 더불어 hashCode() 메서드를 오버라이딩했음. 이 메서드 내부에서는 name.hashCode()를 실행했는데
		   String 클래스 내부의 hashCode() 메서드는 문자열마다 고유의 해시코드를 만들어 리턴해 주는 메서드임. 따라서 문자열 자체가 동일하면
		   동일한 해시 코드가 리턴됨. 여기서 HashMap 객체를 생성하는 모양이 조금 이상하나 추후 다르도록 함. 이제 HashMap 객체를 생성한 후
		   데이터를 추가하는 예를 살펴보자.
		   
		 */
		
		HashMap<Integer, String> hm1 = new HashMap<>();
		
		hm1.put(1, "데이터1");
		hm1.put(1, "데이터2"); // Key값 1의 위치에 이미 데이터가 있으므로, 덮어씌움
		hm1.put(2, "데이터3");
		
		System.out.println(hm1); // {1=데이터2, 2=데이터3}
		
		HashMap<A, String> hm2 = new HashMap<>();
		
		hm2.put(new A("첫 번째"), "데이터1");
		hm2.put(new A("첫 번째"), "데이터2"); // Key값 1의 위치에 이미 데이터가 있으므로, 덮어씌움
		hm2.put(new A("두 번째"), "데이터3");
		
		System.out.println(hm2); // {두 번째=데이터3, 첫 번째=데이터2, 첫 번째=데이터1}
		
		HashMap<B, String> hm3 = new HashMap<>();
		
		hm3.put(new B("첫 번째"), "데이터1");
		hm3.put(new B("첫 번째"), "데이터2"); // Key값 1의 위치에 이미 데이터가 있으므로, 덮어씌움
		hm3.put(new B("두 번째"), "데이터3");

		System.out.println(hm3); // {첫 번째=데이터2, 두 번째=데이터3}
		
		/* 첫번째로 만든 HashMap 객체는 <Key, Value>의 자료형이 <Integer, String> 타입임. Integer는 기본 자료형 int를
		   클래스로 만들어 놓은 것으로, 일단 여기서는 int라고 생각하자. 첫 번째에서는 3쌍의 데이터를 넣었는데, 동일한 Key값이 중복됐음.
		   따라서 최종적으로 저장된 데이터셋은 2개이고, key = 1일 때의 Value 값은 나중에 들어간 "데이터2"라는 것을 알 수 있음.
		   
		   이제 두 번째 생성 객체를 살펴보자. Key 값으로 A 객체가 들어갔음. 여기서의 관건은 처음 2개의 입력으로 사용된 Key 값
		   new A("첫 번째")와 new A("첫 번째")가 동일한지다. 이는 앞에서 설명한 2단계의 과정에 따라 결정됨. 첫번째 단계는 두 객체의
		   hashCode 값의 비교임. 그런데 클래스 A는 hashCode()는 Object의 hashCode()임. 앞에서 설명했던 것처럼 Object의
		   hashCode()는 객체의 위치에 따라 생성된 고윳값을 리턴함. 그런데 두 객체가 new 키워드를 통해 새로운 고유의 위치에 생성될 것이므로
		   두 객체의 hashCode() 값도 서로 다를 것임. 따라서 첫 번째 입력 Key(new A("첫 번째"))와 두 번째 입력된
		   Key(new A("첫 번째")는 다른 Key로 인식해서 각각 HashMap에 입력될 수 있음. 그 결과 3쌍의 데이터셋이 존재하게 됨.
		   
		   마지막 hashCode() 값과 equal() 메서드의 결과를 순차적으로 확인해 두 객체가 동일한지를 결정함. 클래스 B에서는 hashCode()를
		   오버라이딩했고, 여기에서는 name.hashCode()를 사용해 문자열에 따라 해시코드값을 리턴하게 코드를 작성했음. 그런데 두 객체의
		   name 값이 같으므로 두 값의 hashCode() 값도 같을 것임. 
		   첫 단계는 통과했으므로 이번엔 equal() 메서드의 리턴값을 확인해야함. 클래스 B는 equals() 메서드도 오버라이딩했고, 여기서
		   name 값이 동일할 때 true를 리턴하도록 함. 따라서 equal) 역시 true를 리턴함. 두 단계를 모두 통과했으므로 첫 번째 입력
		   Key(new B("첫 번째"))와 두 번째 입력 Key(new B("첫 번째"))는 동일한 Key 값이 되는 것임. 따라서 최족적으로 저장된
		   HashMap의 데이터는 2쌍의 데이터임.
		   
		   이후 다루게 될 제네릭, 컬렉션 등의 문법을 가져다 쓰는 바람에 다소 어려워보일 수 있음. 허나 여기서는 Object의 hashCode() 메서드는
		   객체의 위치에 따른 고윳값을 리턴한다는 것과 Hash *** 형태의 자료 구조에서는 동등 비교를 위해 hashCode() 결과값을 비교하므로
		   필요할때마다 equals() 메서드와 함께 추가로 오버라이딩이 필요하다는 사실만을 기억하자.
		   
		 */
		
		
		
	}
	
}
