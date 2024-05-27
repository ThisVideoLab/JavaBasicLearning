package sec02_externalclass.EX02_ExternalClass_2.pack1;

public class A { // 별도의 파일(A.java)로 분리해 A를 public 클래스로 선언하면 다른 패키지에서 임포트 가능
	int m = 3;
	int n = 4;
	public void print() {
		System.out.println(m + ", " + n);
	}
}
