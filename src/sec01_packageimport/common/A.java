package sec01_packageimport.common;

public class A { // 다른 패키지에서 클래스를 사용하려면 반드시 public class로 선언돼야 함.
	public int m = 3;
	public int n = 4;
	public void print() {
		System.out.println("이 문장은 sec01_packageimport.common 에서 임포트되었습니다.");
	}
	

}
