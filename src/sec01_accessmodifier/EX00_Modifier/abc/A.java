package sec01_accessmodifier.EX00_Modifier.abc;

public class A { // 여러 접근 지정자들을 한 클래스에 넣고 코드에 따라 다르게 나타나는 사용 가능 범위를 이해할 것.
	
	public int a; // 사실상 모두 사용 가능함 
	protected int b; // 동일 패키지 클래스 + 다른 패키지의 자식 클래스(상속을 받은 클래스)에서 사용 가능
	int c; // 동일 패키지의 모든 클래스에서 사용 가능
	private int d; // private는 가장 좁은 범위로, 동일 클래스 내 사용만이 가능함.
	
	void abc() {
		
		// 같은 클래스 내이므로 a, b, c, d 사용 가능
		
	}
	
	class B{
		// 같은 소스 코드 파일 내이므로 a, b, c 사용 가능. private는 동일 클래스가 아니므로 사용이 불가능함.
		
	}

}