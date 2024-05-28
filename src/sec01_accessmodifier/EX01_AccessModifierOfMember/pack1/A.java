package sec01_accessmodifier.EX01_AccessModifierOfMember.pack1;

public class A { // public부터 private까지 4가지의 접근 지정자를 포함하고 있는 필드 선언 
	public int a = 1;
	protected int b = 2;
	int c = 3;
	private int d = 4;
	
	public void print() {
		System.out.print(a + " "); // 같은 클래스 내의 멤버인 print() 메서드이므로 모든 접근 지정자에 접근 가능함.
		System.out.print(b + " ");
		System.out.print(c + " ");
		System.out.print(d);
		System.out.println();
	}
	

}
